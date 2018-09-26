// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/change_status.proto

package com.google.ads.googleads.v0.resources;

public final class ChangeStatusProto {
  private ChangeStatusProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_ChangeStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_ChangeStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v0/resources/chan" +
      "ge_status.proto\022!google.ads.googleads.v0" +
      ".resources\032;google/ads/googleads/v0/enum" +
      "s/change_status_operation.proto\0321google/" +
      "ads/googleads/v0/enums/resource_type.pro" +
      "to\032\036google/protobuf/wrappers.proto\"\247\004\n\014C" +
      "hangeStatus\022\025\n\rresource_name\030\001 \001(\t\022;\n\025la" +
      "st_change_date_time\030\003 \001(\0132\034.google.proto" +
      "buf.StringValue\022S\n\rresource_type\030\004 \001(\0162<" +
      ".google.ads.googleads.v0.enums.ResourceT" +
      "ypeEnum.ResourceType\022.\n\010campaign\030\005 \001(\0132\034" +
      ".google.protobuf.StringValue\022.\n\010ad_group" +
      "\030\006 \001(\0132\034.google.protobuf.StringValue\022g\n\017" +
      "resource_status\030\010 \001(\0162N.google.ads.googl" +
      "eads.v0.enums.ChangeStatusOperationEnum." +
      "ChangeStatusOperation\0221\n\013ad_group_ad\030\t \001" +
      "(\0132\034.google.protobuf.StringValue\0228\n\022ad_g" +
      "roup_criterion\030\n \001(\0132\034.google.protobuf.S" +
      "tringValue\0228\n\022campaign_criterion\030\013 \001(\0132\034" +
      ".google.protobuf.StringValueB\326\001\n%com.goo" +
      "gle.ads.googleads.v0.resourcesB\021ChangeSt" +
      "atusProtoP\001ZJgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v0/resources;re" +
      "sources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0." +
      "Resources\312\002!Google\\Ads\\GoogleAds\\V0\\Reso" +
      "urcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.enums.ChangeStatusOperationProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.ResourceTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_ChangeStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_ChangeStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_ChangeStatus_descriptor,
        new java.lang.String[] { "ResourceName", "LastChangeDateTime", "ResourceType", "Campaign", "AdGroup", "ResourceStatus", "AdGroupAd", "AdGroupCriterion", "CampaignCriterion", });
    com.google.ads.googleads.v0.enums.ChangeStatusOperationProto.getDescriptor();
    com.google.ads.googleads.v0.enums.ResourceTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
