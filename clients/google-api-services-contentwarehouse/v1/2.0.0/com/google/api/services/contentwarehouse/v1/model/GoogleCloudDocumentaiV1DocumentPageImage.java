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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Rendered image contents for this page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1DocumentPageImage extends com.google.api.client.json.GenericJson {

  /**
   * Raw byte content of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Height of the image in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * Encoding mime type for the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * Width of the image in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Raw byte content of the image.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Raw byte content of the image.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * Raw byte content of the image.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageImage setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Raw byte content of the image.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GoogleCloudDocumentaiV1DocumentPageImage encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * Height of the image in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Height of the image in pixels.
   * @param height height or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageImage setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Encoding mime type for the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * Encoding mime type for the image.
   * @param mimeType mimeType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageImage setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Width of the image in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Width of the image in pixels.
   * @param width width or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageImage setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageImage set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentPageImage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageImage clone() {
    return (GoogleCloudDocumentaiV1DocumentPageImage) super.clone();
  }

}
