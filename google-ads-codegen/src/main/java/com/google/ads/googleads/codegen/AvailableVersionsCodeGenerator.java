// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.codegen;

import com.google.ads.googleads.lib.stubs.annotations.VersionDescriptor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class AvailableVersionsCodeGenerator {

  public static void main(String[] args) {
    if (args.length != 1) {
      throw new RuntimeException("Specify 1 argument, the directory for the generated code");
    }
    AvailableVersionsCodeGenerator generator = new AvailableVersionsCodeGenerator();
    generator.writeAllToDir(new File(args[0]));
  }

  private static Map<VersionDescriptor, Class<?>> extractVersionDescriptors(
      Set<Class<?>> versionDescriptorTypes) {
    return versionDescriptorTypes.stream()
        .collect(Collectors.toMap(c -> c.getAnnotation(VersionDescriptor.class), c -> c));
  }

  private static Set<Class<?>> loadAnnotatedClasses() {
    Reflections reflections =
        new Reflections(
            new ConfigurationBuilder()
                .addUrls(ClasspathHelper.forPackage("com.google.ads.googleads"))
                .addScanners(new TypeAnnotationsScanner(), new SubTypesScanner()));
    return reflections.getTypesAnnotatedWith(VersionDescriptor.class);
  }

  private final ImmutableMap<VersionDescriptor, Class<?>> descriptors;

  public AvailableVersionsCodeGenerator() {
    this(extractVersionDescriptors(loadAnnotatedClasses()));
  }

  public AvailableVersionsCodeGenerator(
      Map<VersionDescriptor, Class<?>> extractVersionDescriptors) {
    this.descriptors = ImmutableMap.copyOf(extractVersionDescriptors);
  }

  private Set<Integer> getApiMajorVersions() {
    return descriptors.keySet().stream()
        .map(d -> Integer.valueOf(d.versionName().substring(1)))
        .collect(Collectors.toSet());
  }

  private int getLatestVersion() {
    int latestVersion = 0;
    for (int version : getApiMajorVersions()) {
      if (version != 999) {
        latestVersion = Math.max(latestVersion, version);
      }
    }
    return latestVersion;
  }

  private void writeAllToDir(File targetDirectory) {
    if (!targetDirectory.exists()) {
      targetDirectory.mkdirs();
    } else if (!targetDirectory.isDirectory()) {
      throw new RuntimeException(
          "Target directory exists and is not a directory: " + targetDirectory);
    }
    for (Generator generator : loadGenerators(targetDirectory)) {
      generator.generate();
    }
  }

  private List<Generator> loadGenerators(File targetDirectory) {
    Set<Integer> versions = getApiMajorVersions();
    int latestVersion = getLatestVersion();
    return ImmutableList.of(
        new GeneratedCatalogCodeGenerator(versions, latestVersion, descriptors, targetDirectory),
        new VersionCatalogCodeGenerator(versions, targetDirectory),
        new AbstractGoogleAdsClientCodeGenerator(versions, latestVersion, targetDirectory),
        new GoogleAdsAllVersionsCodeGenerator(versions, latestVersion, targetDirectory));
  }
}
