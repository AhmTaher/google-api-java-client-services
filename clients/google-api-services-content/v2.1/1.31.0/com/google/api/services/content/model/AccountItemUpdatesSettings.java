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

package com.google.api.services.content.model;

/**
 * Settings for the Automatic Item Updates.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountItemUpdatesSettings extends com.google.api.client.json.GenericJson {

  /**
   * If availability updates are enabled, any previous availability values get overwritten if Google
   * finds an out-of-stock annotation on the offer's page. If additionally
   * `allow_availability_updates` field is set to true, values get overwritten if Google finds an
   * in-stock annotation on the offer’s page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowAvailabilityUpdates;

  /**
   * If price updates are enabled, Google always updates the active price with the crawled
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowPriceUpdates;

  /**
   * If allow_availability_updates is enabled, items are automatically updated in all your Shopping
   * target countries. By default, availability updates will only be applied to items that are 'out
   * of stock' on your website but 'in stock' on Shopping. Set this to true to also update items
   * that are 'in stock' on your website, but 'out of stock' on Google Shopping. In order for this
   * field to have an effect, you must also allow availability updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowStrictAvailabilityUpdates;

  /**
   * If availability updates are enabled, any previous availability values get overwritten if Google
   * finds an out-of-stock annotation on the offer's page. If additionally
   * `allow_availability_updates` field is set to true, values get overwritten if Google finds an
   * in-stock annotation on the offer’s page.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowAvailabilityUpdates() {
    return allowAvailabilityUpdates;
  }

  /**
   * If availability updates are enabled, any previous availability values get overwritten if Google
   * finds an out-of-stock annotation on the offer's page. If additionally
   * `allow_availability_updates` field is set to true, values get overwritten if Google finds an
   * in-stock annotation on the offer’s page.
   * @param allowAvailabilityUpdates allowAvailabilityUpdates or {@code null} for none
   */
  public AccountItemUpdatesSettings setAllowAvailabilityUpdates(java.lang.Boolean allowAvailabilityUpdates) {
    this.allowAvailabilityUpdates = allowAvailabilityUpdates;
    return this;
  }

  /**
   * If price updates are enabled, Google always updates the active price with the crawled
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowPriceUpdates() {
    return allowPriceUpdates;
  }

  /**
   * If price updates are enabled, Google always updates the active price with the crawled
   * information.
   * @param allowPriceUpdates allowPriceUpdates or {@code null} for none
   */
  public AccountItemUpdatesSettings setAllowPriceUpdates(java.lang.Boolean allowPriceUpdates) {
    this.allowPriceUpdates = allowPriceUpdates;
    return this;
  }

  /**
   * If allow_availability_updates is enabled, items are automatically updated in all your Shopping
   * target countries. By default, availability updates will only be applied to items that are 'out
   * of stock' on your website but 'in stock' on Shopping. Set this to true to also update items
   * that are 'in stock' on your website, but 'out of stock' on Google Shopping. In order for this
   * field to have an effect, you must also allow availability updates.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowStrictAvailabilityUpdates() {
    return allowStrictAvailabilityUpdates;
  }

  /**
   * If allow_availability_updates is enabled, items are automatically updated in all your Shopping
   * target countries. By default, availability updates will only be applied to items that are 'out
   * of stock' on your website but 'in stock' on Shopping. Set this to true to also update items
   * that are 'in stock' on your website, but 'out of stock' on Google Shopping. In order for this
   * field to have an effect, you must also allow availability updates.
   * @param allowStrictAvailabilityUpdates allowStrictAvailabilityUpdates or {@code null} for none
   */
  public AccountItemUpdatesSettings setAllowStrictAvailabilityUpdates(java.lang.Boolean allowStrictAvailabilityUpdates) {
    this.allowStrictAvailabilityUpdates = allowStrictAvailabilityUpdates;
    return this;
  }

  @Override
  public AccountItemUpdatesSettings set(String fieldName, Object value) {
    return (AccountItemUpdatesSettings) super.set(fieldName, value);
  }

  @Override
  public AccountItemUpdatesSettings clone() {
    return (AccountItemUpdatesSettings) super.clone();
  }

}