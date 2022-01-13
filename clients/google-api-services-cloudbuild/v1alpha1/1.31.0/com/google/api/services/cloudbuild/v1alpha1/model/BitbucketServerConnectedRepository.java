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

package com.google.api.services.cloudbuild.v1alpha1.model;

/**
 * / BitbucketServerConnectedRepository represents a connected Bitbucket Server / repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BitbucketServerConnectedRepository extends com.google.api.client.json.GenericJson {

  /**
   * The name of the `BitbucketServerConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * The Bitbucket Server repositories to connect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BitbucketServerRepositoryId repo;

  /**
   * Output only. The status of the repo connection request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The name of the `BitbucketServerConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}`
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * The name of the `BitbucketServerConfig` that added connected repository. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{config}`
   * @param parent parent or {@code null} for none
   */
  public BitbucketServerConnectedRepository setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The Bitbucket Server repositories to connect.
   * @return value or {@code null} for none
   */
  public BitbucketServerRepositoryId getRepo() {
    return repo;
  }

  /**
   * The Bitbucket Server repositories to connect.
   * @param repo repo or {@code null} for none
   */
  public BitbucketServerConnectedRepository setRepo(BitbucketServerRepositoryId repo) {
    this.repo = repo;
    return this;
  }

  /**
   * Output only. The status of the repo connection request.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Output only. The status of the repo connection request.
   * @param status status or {@code null} for none
   */
  public BitbucketServerConnectedRepository setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public BitbucketServerConnectedRepository set(String fieldName, Object value) {
    return (BitbucketServerConnectedRepository) super.set(fieldName, value);
  }

  @Override
  public BitbucketServerConnectedRepository clone() {
    return (BitbucketServerConnectedRepository) super.clone();
  }

}