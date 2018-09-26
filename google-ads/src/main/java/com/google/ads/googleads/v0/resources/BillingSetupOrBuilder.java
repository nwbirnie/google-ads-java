// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/billing_setup.proto

package com.google.ads.googleads.v0.resources;

public interface BillingSetupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.BillingSetup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the billing setup.
   * BillingSetup resource names have the form:
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <pre>
   * The status of the billing setup.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.BillingSetupStatusEnum.BillingSetupStatus status = 3;</code>
   */
  com.google.ads.googleads.v0.enums.BillingSetupStatusEnum.BillingSetupStatus getStatus();

  /**
   * <pre>
   * A 16 digit id used to identify the Payments account associated with the
   * billing setup.
   * This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_id = 4;</code>
   */
  boolean hasPaymentsAccountId();
  /**
   * <pre>
   * A 16 digit id used to identify the Payments account associated with the
   * billing setup.
   * This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_id = 4;</code>
   */
  com.google.protobuf.StringValue getPaymentsAccountId();
  /**
   * <pre>
   * A 16 digit id used to identify the Payments account associated with the
   * billing setup.
   * This must be passed as a string with dashes, e.g. "1234-5678-9012-3456".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_id = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsAccountIdOrBuilder();

  /**
   * <pre>
   * The name of the Payments account associated with the billing setup.
   * This enables the user to specify a meaningful name for a Payments account
   * to aid in reconciling monthly invoices.
   * This name will be printed in the monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_name = 5;</code>
   */
  boolean hasPaymentsAccountName();
  /**
   * <pre>
   * The name of the Payments account associated with the billing setup.
   * This enables the user to specify a meaningful name for a Payments account
   * to aid in reconciling monthly invoices.
   * This name will be printed in the monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_name = 5;</code>
   */
  com.google.protobuf.StringValue getPaymentsAccountName();
  /**
   * <pre>
   * The name of the Payments account associated with the billing setup.
   * This enables the user to specify a meaningful name for a Payments account
   * to aid in reconciling monthly invoices.
   * This name will be printed in the monthly invoices.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_account_name = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsAccountNameOrBuilder();

  /**
   * <pre>
   * A 12 digit id used to identify the Payments profile associated with the
   * billing setup.
   * This must be passed in as a string with dashes, e.g. "1234-5678-9012".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_id = 6;</code>
   */
  boolean hasPaymentsProfileId();
  /**
   * <pre>
   * A 12 digit id used to identify the Payments profile associated with the
   * billing setup.
   * This must be passed in as a string with dashes, e.g. "1234-5678-9012".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_id = 6;</code>
   */
  com.google.protobuf.StringValue getPaymentsProfileId();
  /**
   * <pre>
   * A 12 digit id used to identify the Payments profile associated with the
   * billing setup.
   * This must be passed in as a string with dashes, e.g. "1234-5678-9012".
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_id = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsProfileIdOrBuilder();

  /**
   * <pre>
   * The name of the Payments profile associated with the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_name = 7;</code>
   */
  boolean hasPaymentsProfileName();
  /**
   * <pre>
   * The name of the Payments profile associated with the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_name = 7;</code>
   */
  com.google.protobuf.StringValue getPaymentsProfileName();
  /**
   * <pre>
   * The name of the Payments profile associated with the billing setup.
   * </pre>
   *
   * <code>.google.protobuf.StringValue payments_profile_name = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPaymentsProfileNameOrBuilder();

  /**
   * <pre>
   * A secondary payments profile id present in uncommon situations, e.g.
   * when a sequential liability agreement has been arranged.
   * </pre>
   *
   * <code>.google.protobuf.StringValue secondary_payments_profile_id = 8;</code>
   */
  boolean hasSecondaryPaymentsProfileId();
  /**
   * <pre>
   * A secondary payments profile id present in uncommon situations, e.g.
   * when a sequential liability agreement has been arranged.
   * </pre>
   *
   * <code>.google.protobuf.StringValue secondary_payments_profile_id = 8;</code>
   */
  com.google.protobuf.StringValue getSecondaryPaymentsProfileId();
  /**
   * <pre>
   * A secondary payments profile id present in uncommon situations, e.g.
   * when a sequential liability agreement has been arranged.
   * </pre>
   *
   * <code>.google.protobuf.StringValue secondary_payments_profile_id = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSecondaryPaymentsProfileIdOrBuilder();
}
