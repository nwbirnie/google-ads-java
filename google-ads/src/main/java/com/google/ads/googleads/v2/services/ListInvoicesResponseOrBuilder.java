// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/services/invoice_service.proto

package com.google.ads.googleads.v2.services;

public interface ListInvoicesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.services.ListInvoicesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.Invoice invoices = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v2.resources.Invoice> 
      getInvoicesList();
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.Invoice invoices = 1;</code>
   */
  com.google.ads.googleads.v2.resources.Invoice getInvoices(int index);
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.Invoice invoices = 1;</code>
   */
  int getInvoicesCount();
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.Invoice invoices = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v2.resources.InvoiceOrBuilder> 
      getInvoicesOrBuilderList();
  /**
   * <pre>
   * The list of invoices that match the billing setup and time period.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v2.resources.Invoice invoices = 1;</code>
   */
  com.google.ads.googleads.v2.resources.InvoiceOrBuilder getInvoicesOrBuilder(
      int index);
}
