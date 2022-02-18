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

package com.google.api.services.certificatemanager.v1.model;

/**
 * The structure describing the DNS Resource Record that needs to be added to DNS configuration for
 * the authorization to be usable by certificate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DnsResourceRecord extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Data of the DNS Resource Record.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * Output only. Fully qualified name of the DNS Resource Record. e.g. "_acme-
   * challenge.example.com."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Type of the DNS Resource Record. Currently always set to "CNAME".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. Data of the DNS Resource Record.
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * Output only. Data of the DNS Resource Record.
   * @param data data or {@code null} for none
   */
  public DnsResourceRecord setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * Output only. Fully qualified name of the DNS Resource Record. e.g. "_acme-
   * challenge.example.com."
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Fully qualified name of the DNS Resource Record. e.g. "_acme-
   * challenge.example.com."
   * @param name name or {@code null} for none
   */
  public DnsResourceRecord setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Type of the DNS Resource Record. Currently always set to "CNAME".
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. Type of the DNS Resource Record. Currently always set to "CNAME".
   * @param type type or {@code null} for none
   */
  public DnsResourceRecord setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DnsResourceRecord set(String fieldName, Object value) {
    return (DnsResourceRecord) super.set(fieldName, value);
  }

  @Override
  public DnsResourceRecord clone() {
    return (DnsResourceRecord) super.clone();
  }

}