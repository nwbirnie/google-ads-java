/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v7.services.stub;

import com.google.ads.googleads.v7.resources.LanguageConstant;
import com.google.ads.googleads.v7.services.GetLanguageConstantRequest;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the LanguageConstantService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcLanguageConstantServiceStub extends LanguageConstantServiceStub {
  private static final MethodDescriptor<GetLanguageConstantRequest, LanguageConstant>
      getLanguageConstantMethodDescriptor =
          MethodDescriptor.<GetLanguageConstantRequest, LanguageConstant>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.ads.googleads.v7.services.LanguageConstantService/GetLanguageConstant")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetLanguageConstantRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(LanguageConstant.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetLanguageConstantRequest, LanguageConstant>
      getLanguageConstantCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcLanguageConstantServiceStub create(
      LanguageConstantServiceStubSettings settings) throws IOException {
    return new GrpcLanguageConstantServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLanguageConstantServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLanguageConstantServiceStub(
        LanguageConstantServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcLanguageConstantServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcLanguageConstantServiceStub(
        LanguageConstantServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcLanguageConstantServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLanguageConstantServiceStub(
      LanguageConstantServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcLanguageConstantServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcLanguageConstantServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcLanguageConstantServiceStub(
      LanguageConstantServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetLanguageConstantRequest, LanguageConstant>
        getLanguageConstantTransportSettings =
            GrpcCallSettings.<GetLanguageConstantRequest, LanguageConstant>newBuilder()
                .setMethodDescriptor(getLanguageConstantMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("resource_name", String.valueOf(request.getResourceName()));
                      return params.build();
                    })
                .build();

    this.getLanguageConstantCallable =
        callableFactory.createUnaryCallable(
            getLanguageConstantTransportSettings,
            settings.getLanguageConstantSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetLanguageConstantRequest, LanguageConstant> getLanguageConstantCallable() {
    return getLanguageConstantCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
