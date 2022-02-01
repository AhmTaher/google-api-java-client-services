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

package com.google.api.services.datastore.v1beta1.model;

/**
 * An event signifying the start of a new step in a [migration from Cloud Datastore to Cloud
 * Firestore in Datastore mode](https://cloud.google.com/datastore/docs/upgrade-to-firestore).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1MigrationProgressEvent extends com.google.api.client.json.GenericJson {

  /**
   * Details for the `PREPARE` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1PrepareStepDetails prepareStepDetails;

  /**
   * Details for the `REDIRECT_WRITES` step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDatastoreAdminV1RedirectWritesStepDetails redirectWritesStepDetails;

  /**
   * The step that is starting. An event with step set to `START` indicates that the migration has
   * been reverted back to the initial pre-migration state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String step;

  /**
   * Details for the `PREPARE` step.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1PrepareStepDetails getPrepareStepDetails() {
    return prepareStepDetails;
  }

  /**
   * Details for the `PREPARE` step.
   * @param prepareStepDetails prepareStepDetails or {@code null} for none
   */
  public GoogleDatastoreAdminV1MigrationProgressEvent setPrepareStepDetails(GoogleDatastoreAdminV1PrepareStepDetails prepareStepDetails) {
    this.prepareStepDetails = prepareStepDetails;
    return this;
  }

  /**
   * Details for the `REDIRECT_WRITES` step.
   * @return value or {@code null} for none
   */
  public GoogleDatastoreAdminV1RedirectWritesStepDetails getRedirectWritesStepDetails() {
    return redirectWritesStepDetails;
  }

  /**
   * Details for the `REDIRECT_WRITES` step.
   * @param redirectWritesStepDetails redirectWritesStepDetails or {@code null} for none
   */
  public GoogleDatastoreAdminV1MigrationProgressEvent setRedirectWritesStepDetails(GoogleDatastoreAdminV1RedirectWritesStepDetails redirectWritesStepDetails) {
    this.redirectWritesStepDetails = redirectWritesStepDetails;
    return this;
  }

  /**
   * The step that is starting. An event with step set to `START` indicates that the migration has
   * been reverted back to the initial pre-migration state.
   * @return value or {@code null} for none
   */
  public java.lang.String getStep() {
    return step;
  }

  /**
   * The step that is starting. An event with step set to `START` indicates that the migration has
   * been reverted back to the initial pre-migration state.
   * @param step step or {@code null} for none
   */
  public GoogleDatastoreAdminV1MigrationProgressEvent setStep(java.lang.String step) {
    this.step = step;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1MigrationProgressEvent set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1MigrationProgressEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1MigrationProgressEvent clone() {
    return (GoogleDatastoreAdminV1MigrationProgressEvent) super.clone();
  }

}