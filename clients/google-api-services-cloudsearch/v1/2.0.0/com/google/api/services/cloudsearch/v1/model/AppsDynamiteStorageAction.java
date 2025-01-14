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
 * An action that describes the behavior when the form is submitted. For example, an Apps Script can
 * be invoked to handle the form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteStorageAction extends com.google.api.client.json.GenericJson {

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interaction;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String loadIndicator;

  /**
   * List of action parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsDynamiteStorageActionActionParameter> parameters;

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * Apps Script function to invoke when the containing element is clicked/activated.
   * @param function function or {@code null} for none
   */
  public AppsDynamiteStorageAction setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInteraction() {
    return interaction;
  }

  /**
   * @param interaction interaction or {@code null} for none
   */
  public AppsDynamiteStorageAction setInteraction(java.lang.String interaction) {
    this.interaction = interaction;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLoadIndicator() {
    return loadIndicator;
  }

  /**
   * @param loadIndicator loadIndicator or {@code null} for none
   */
  public AppsDynamiteStorageAction setLoadIndicator(java.lang.String loadIndicator) {
    this.loadIndicator = loadIndicator;
    return this;
  }

  /**
   * List of action parameters.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsDynamiteStorageActionActionParameter> getParameters() {
    return parameters;
  }

  /**
   * List of action parameters.
   * @param parameters parameters or {@code null} for none
   */
  public AppsDynamiteStorageAction setParameters(java.util.List<AppsDynamiteStorageActionActionParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public AppsDynamiteStorageAction set(String fieldName, Object value) {
    return (AppsDynamiteStorageAction) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteStorageAction clone() {
    return (AppsDynamiteStorageAction) super.clone();
  }

}
