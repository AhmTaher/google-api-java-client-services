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

package com.google.api.services.dataplex.v1.model;

/**
 * The payload associated with Discovery data processing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DiscoveryEvent extends com.google.api.client.json.GenericJson {

  /**
   * Details about the action associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1DiscoveryEventActionDetails action;

  /**
   * The id of the associated asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetId;

  /**
   * Details about discovery configuration in effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1DiscoveryEventConfigDetails config;

  /**
   * The data location associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataLocation;

  /**
   * Details about the entity associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1DiscoveryEventEntityDetails entity;

  /**
   * The id of the associated lake.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lakeId;

  /**
   * The log message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Details about the partition associated with the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDataplexV1DiscoveryEventPartitionDetails partition;

  /**
   * The type of the event being logged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The id of the associated zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zoneId;

  /**
   * Details about the action associated with the event.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventActionDetails getAction() {
    return action;
  }

  /**
   * Details about the action associated with the event.
   * @param action action or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setAction(GoogleCloudDataplexV1DiscoveryEventActionDetails action) {
    this.action = action;
    return this;
  }

  /**
   * The id of the associated asset.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetId() {
    return assetId;
  }

  /**
   * The id of the associated asset.
   * @param assetId assetId or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setAssetId(java.lang.String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Details about discovery configuration in effect.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventConfigDetails getConfig() {
    return config;
  }

  /**
   * Details about discovery configuration in effect.
   * @param config config or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setConfig(GoogleCloudDataplexV1DiscoveryEventConfigDetails config) {
    this.config = config;
    return this;
  }

  /**
   * The data location associated with the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataLocation() {
    return dataLocation;
  }

  /**
   * The data location associated with the event.
   * @param dataLocation dataLocation or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setDataLocation(java.lang.String dataLocation) {
    this.dataLocation = dataLocation;
    return this;
  }

  /**
   * Details about the entity associated with the event.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventEntityDetails getEntity() {
    return entity;
  }

  /**
   * Details about the entity associated with the event.
   * @param entity entity or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setEntity(GoogleCloudDataplexV1DiscoveryEventEntityDetails entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The id of the associated lake.
   * @return value or {@code null} for none
   */
  public java.lang.String getLakeId() {
    return lakeId;
  }

  /**
   * The id of the associated lake.
   * @param lakeId lakeId or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setLakeId(java.lang.String lakeId) {
    this.lakeId = lakeId;
    return this;
  }

  /**
   * The log message.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * The log message.
   * @param message message or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Details about the partition associated with the event.
   * @return value or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEventPartitionDetails getPartition() {
    return partition;
  }

  /**
   * Details about the partition associated with the event.
   * @param partition partition or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setPartition(GoogleCloudDataplexV1DiscoveryEventPartitionDetails partition) {
    this.partition = partition;
    return this;
  }

  /**
   * The type of the event being logged.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the event being logged.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The id of the associated zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getZoneId() {
    return zoneId;
  }

  /**
   * The id of the associated zone.
   * @param zoneId zoneId or {@code null} for none
   */
  public GoogleCloudDataplexV1DiscoveryEvent setZoneId(java.lang.String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DiscoveryEvent set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DiscoveryEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DiscoveryEvent clone() {
    return (GoogleCloudDataplexV1DiscoveryEvent) super.clone();
  }

}