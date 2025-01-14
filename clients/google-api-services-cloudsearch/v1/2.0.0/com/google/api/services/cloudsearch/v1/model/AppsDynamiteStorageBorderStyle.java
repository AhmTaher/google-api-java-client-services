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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents the complete border style applied to widgets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteStorageBorderStyle extends com.google.api.client.json.GenericJson {

  /**
   * The corner radius for the border.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cornerRadius;

  /**
   * The colors to use when the type is `BORDER_TYPE_STROKE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color strokeColor;

  /**
   * The border type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The corner radius for the border.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCornerRadius() {
    return cornerRadius;
  }

  /**
   * The corner radius for the border.
   * @param cornerRadius cornerRadius or {@code null} for none
   */
  public AppsDynamiteStorageBorderStyle setCornerRadius(java.lang.Integer cornerRadius) {
    this.cornerRadius = cornerRadius;
    return this;
  }

  /**
   * The colors to use when the type is `BORDER_TYPE_STROKE`.
   * @return value or {@code null} for none
   */
  public Color getStrokeColor() {
    return strokeColor;
  }

  /**
   * The colors to use when the type is `BORDER_TYPE_STROKE`.
   * @param strokeColor strokeColor or {@code null} for none
   */
  public AppsDynamiteStorageBorderStyle setStrokeColor(Color strokeColor) {
    this.strokeColor = strokeColor;
    return this;
  }

  /**
   * The border type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The border type.
   * @param type type or {@code null} for none
   */
  public AppsDynamiteStorageBorderStyle setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AppsDynamiteStorageBorderStyle set(String fieldName, Object value) {
    return (AppsDynamiteStorageBorderStyle) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteStorageBorderStyle clone() {
    return (AppsDynamiteStorageBorderStyle) super.clone();
  }

}
