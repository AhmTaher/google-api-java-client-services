/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * The error payload that is populated on LRO import APIs. Including:
 * "google.cloud.discoveryengine.v1alpha.DocumentService.ImportDocuments"
 * "google.cloud.discoveryengine.v1alpha.UserEventService.ImportUserEvents"
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineLoggingImportErrorContext extends com.google.api.client.json.GenericJson {

  /**
   * The detailed content which caused the error on importing a document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * Google Cloud Storage file path of the import source. Can be set for batch operation error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsPath;

  /**
   * Line number of the content in file. Should be empty for permission or batch operation error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineNumber;

  /**
   * The operation resource name of the LRO.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operation;

  /**
   * The detailed content which caused the error on importing a user event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEvent;

  /**
   * The detailed content which caused the error on importing a document.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * The detailed content which caused the error on importing a document.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingImportErrorContext setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * Google Cloud Storage file path of the import source. Can be set for batch operation error.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsPath() {
    return gcsPath;
  }

  /**
   * Google Cloud Storage file path of the import source. Can be set for batch operation error.
   * @param gcsPath gcsPath or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingImportErrorContext setGcsPath(java.lang.String gcsPath) {
    this.gcsPath = gcsPath;
    return this;
  }

  /**
   * Line number of the content in file. Should be empty for permission or batch operation error.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineNumber() {
    return lineNumber;
  }

  /**
   * Line number of the content in file. Should be empty for permission or batch operation error.
   * @param lineNumber lineNumber or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingImportErrorContext setLineNumber(java.lang.String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * The operation resource name of the LRO.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperation() {
    return operation;
  }

  /**
   * The operation resource name of the LRO.
   * @param operation operation or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingImportErrorContext setOperation(java.lang.String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The detailed content which caused the error on importing a user event.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEvent() {
    return userEvent;
  }

  /**
   * The detailed content which caused the error on importing a user event.
   * @param userEvent userEvent or {@code null} for none
   */
  public GoogleCloudDiscoveryengineLoggingImportErrorContext setUserEvent(java.lang.String userEvent) {
    this.userEvent = userEvent;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingImportErrorContext set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineLoggingImportErrorContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineLoggingImportErrorContext clone() {
    return (GoogleCloudDiscoveryengineLoggingImportErrorContext) super.clone();
  }

}
