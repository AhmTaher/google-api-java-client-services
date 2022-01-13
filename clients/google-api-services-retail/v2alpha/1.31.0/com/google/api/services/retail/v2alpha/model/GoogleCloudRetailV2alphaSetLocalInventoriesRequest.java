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

package com.google.api.services.retail.v2alpha.model;

/**
 * Request message for SetLocalInventories method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaSetLocalInventoriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, and the Product is not found, the local inventory will still be processed and
   * retained for at most 1 day and processed once the Product is created. If set to false, a
   * NOT_FOUND error is returned if the Product is not found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMissing;

  /**
   * A list of inventory information at difference places. Each place is identified by its place ID.
   * For example, if `place1` and `place2` are stored, and this list is `[place1, place3]` with a
   * fresher set timestamp, then the stored places will become `place1` and `place3`. An empty list
   * removes all existing places with staler fields. At most 3000 inventories are allowed per
   * request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaLocalInventory> localInventories;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2alphaLocalInventory used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2alphaLocalInventory.class);
  }

  /**
   * The time when the inventory updates are issued. Used to prevent out-of-order updates on local
   * inventory fields. If not provided, the internal system time will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String setTime;

  /**
   * If set to true, and the Product is not found, the local inventory will still be processed and
   * retained for at most 1 day and processed once the Product is created. If set to false, a
   * NOT_FOUND error is returned if the Product is not found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMissing() {
    return allowMissing;
  }

  /**
   * If set to true, and the Product is not found, the local inventory will still be processed and
   * retained for at most 1 day and processed once the Product is created. If set to false, a
   * NOT_FOUND error is returned if the Product is not found.
   * @param allowMissing allowMissing or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSetLocalInventoriesRequest setAllowMissing(java.lang.Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  /**
   * A list of inventory information at difference places. Each place is identified by its place ID.
   * For example, if `place1` and `place2` are stored, and this list is `[place1, place3]` with a
   * fresher set timestamp, then the stored places will become `place1` and `place3`. An empty list
   * removes all existing places with staler fields. At most 3000 inventories are allowed per
   * request.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaLocalInventory> getLocalInventories() {
    return localInventories;
  }

  /**
   * A list of inventory information at difference places. Each place is identified by its place ID.
   * For example, if `place1` and `place2` are stored, and this list is `[place1, place3]` with a
   * fresher set timestamp, then the stored places will become `place1` and `place3`. An empty list
   * removes all existing places with staler fields. At most 3000 inventories are allowed per
   * request.
   * @param localInventories localInventories or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSetLocalInventoriesRequest setLocalInventories(java.util.List<GoogleCloudRetailV2alphaLocalInventory> localInventories) {
    this.localInventories = localInventories;
    return this;
  }

  /**
   * The time when the inventory updates are issued. Used to prevent out-of-order updates on local
   * inventory fields. If not provided, the internal system time will be used.
   * @return value or {@code null} for none
   */
  public String getSetTime() {
    return setTime;
  }

  /**
   * The time when the inventory updates are issued. Used to prevent out-of-order updates on local
   * inventory fields. If not provided, the internal system time will be used.
   * @param setTime setTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSetLocalInventoriesRequest setSetTime(String setTime) {
    this.setTime = setTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaSetLocalInventoriesRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaSetLocalInventoriesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaSetLocalInventoriesRequest clone() {
    return (GoogleCloudRetailV2alphaSetLocalInventoriesRequest) super.clone();
  }

}