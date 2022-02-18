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

package com.google.api.services.baremetalsolution.v2.model;

/**
 * A storage volume logical unit number (LUN).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Lun extends com.google.api.client.json.GenericJson {

  /**
   * Display if this LUN is a boot LUN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bootLun;

  /**
   * An identifier for the LUN, generated by the backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The LUN multiprotocol type ensures the characteristics of the LUN are optimized for each
   * operating system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String multiprotocolType;

  /**
   * Output only. The name of the LUN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Display if this LUN can be shared between multiple physical servers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean shareable;

  /**
   * The size of this LUN, in gigabytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeGb;

  /**
   * The state of this storage volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The storage type for this LUN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageType;

  /**
   * Display the storage volume for this LUN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storageVolume;

  /**
   * The WWID for this LUN.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String wwid;

  /**
   * Display if this LUN is a boot LUN.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBootLun() {
    return bootLun;
  }

  /**
   * Display if this LUN is a boot LUN.
   * @param bootLun bootLun or {@code null} for none
   */
  public Lun setBootLun(java.lang.Boolean bootLun) {
    this.bootLun = bootLun;
    return this;
  }

  /**
   * An identifier for the LUN, generated by the backend.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An identifier for the LUN, generated by the backend.
   * @param id id or {@code null} for none
   */
  public Lun setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The LUN multiprotocol type ensures the characteristics of the LUN are optimized for each
   * operating system.
   * @return value or {@code null} for none
   */
  public java.lang.String getMultiprotocolType() {
    return multiprotocolType;
  }

  /**
   * The LUN multiprotocol type ensures the characteristics of the LUN are optimized for each
   * operating system.
   * @param multiprotocolType multiprotocolType or {@code null} for none
   */
  public Lun setMultiprotocolType(java.lang.String multiprotocolType) {
    this.multiprotocolType = multiprotocolType;
    return this;
  }

  /**
   * Output only. The name of the LUN.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of the LUN.
   * @param name name or {@code null} for none
   */
  public Lun setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Display if this LUN can be shared between multiple physical servers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getShareable() {
    return shareable;
  }

  /**
   * Display if this LUN can be shared between multiple physical servers.
   * @param shareable shareable or {@code null} for none
   */
  public Lun setShareable(java.lang.Boolean shareable) {
    this.shareable = shareable;
    return this;
  }

  /**
   * The size of this LUN, in gigabytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeGb() {
    return sizeGb;
  }

  /**
   * The size of this LUN, in gigabytes.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public Lun setSizeGb(java.lang.Long sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * The state of this storage volume.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of this storage volume.
   * @param state state or {@code null} for none
   */
  public Lun setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The storage type for this LUN.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageType() {
    return storageType;
  }

  /**
   * The storage type for this LUN.
   * @param storageType storageType or {@code null} for none
   */
  public Lun setStorageType(java.lang.String storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * Display the storage volume for this LUN.
   * @return value or {@code null} for none
   */
  public java.lang.String getStorageVolume() {
    return storageVolume;
  }

  /**
   * Display the storage volume for this LUN.
   * @param storageVolume storageVolume or {@code null} for none
   */
  public Lun setStorageVolume(java.lang.String storageVolume) {
    this.storageVolume = storageVolume;
    return this;
  }

  /**
   * The WWID for this LUN.
   * @return value or {@code null} for none
   */
  public java.lang.String getWwid() {
    return wwid;
  }

  /**
   * The WWID for this LUN.
   * @param wwid wwid or {@code null} for none
   */
  public Lun setWwid(java.lang.String wwid) {
    this.wwid = wwid;
    return this;
  }

  @Override
  public Lun set(String fieldName, Object value) {
    return (Lun) super.set(fieldName, value);
  }

  @Override
  public Lun clone() {
    return (Lun) super.clone();
  }

}