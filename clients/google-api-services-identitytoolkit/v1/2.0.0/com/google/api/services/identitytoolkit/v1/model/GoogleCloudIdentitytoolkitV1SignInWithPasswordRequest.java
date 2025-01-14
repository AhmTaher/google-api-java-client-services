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

package com.google.api.services.identitytoolkit.v1.model;

/**
 * Request message for SignInWithPassword.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity Toolkit API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String captchaChallenge;

  /**
   * The reCAPTCHA token provided by the reCAPTCHA client-side integration. reCAPTCHA Enterprise
   * uses it for risk assessment. Required when reCAPTCHA Enterprise is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String captchaResponse;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long delegatedProjectNumber;

  /**
   * Required. The email the user is signing in with. The length of email should be less than 256
   * characters and in the format of `name@domain.tld`. The email should also match the [RFC
   * 822](https://tools.ietf.org/html/rfc822) addr-spec production.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String idToken;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceId;

  /**
   * Required. The password the user provides to sign in to the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String password;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pendingIdToken;

  /**
   * Should always be true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnSecureToken;

  /**
   * The ID of the Identity Platform tenant the user is signing in to. If not set, the user will
   * sign in to the default Identity Platform instance in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCaptchaChallenge() {
    return captchaChallenge;
  }

  /**
   * @param captchaChallenge captchaChallenge or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setCaptchaChallenge(java.lang.String captchaChallenge) {
    this.captchaChallenge = captchaChallenge;
    return this;
  }

  /**
   * The reCAPTCHA token provided by the reCAPTCHA client-side integration. reCAPTCHA Enterprise
   * uses it for risk assessment. Required when reCAPTCHA Enterprise is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getCaptchaResponse() {
    return captchaResponse;
  }

  /**
   * The reCAPTCHA token provided by the reCAPTCHA client-side integration. reCAPTCHA Enterprise
   * uses it for risk assessment. Required when reCAPTCHA Enterprise is enabled.
   * @param captchaResponse captchaResponse or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setCaptchaResponse(java.lang.String captchaResponse) {
    this.captchaResponse = captchaResponse;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getDelegatedProjectNumber() {
    return delegatedProjectNumber;
  }

  /**
   * @param delegatedProjectNumber delegatedProjectNumber or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setDelegatedProjectNumber(java.lang.Long delegatedProjectNumber) {
    this.delegatedProjectNumber = delegatedProjectNumber;
    return this;
  }

  /**
   * Required. The email the user is signing in with. The length of email should be less than 256
   * characters and in the format of `name@domain.tld`. The email should also match the [RFC
   * 822](https://tools.ietf.org/html/rfc822) addr-spec production.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Required. The email the user is signing in with. The length of email should be less than 256
   * characters and in the format of `name@domain.tld`. The email should also match the [RFC
   * 822](https://tools.ietf.org/html/rfc822) addr-spec production.
   * @param email email or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIdToken() {
    return idToken;
  }

  /**
   * @param idToken idToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setIdToken(java.lang.String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceId() {
    return instanceId;
  }

  /**
   * @param instanceId instanceId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setInstanceId(java.lang.String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

  /**
   * Required. The password the user provides to sign in to the account.
   * @return value or {@code null} for none
   */
  public java.lang.String getPassword() {
    return password;
  }

  /**
   * Required. The password the user provides to sign in to the account.
   * @param password password or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setPassword(java.lang.String password) {
    this.password = password;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPendingIdToken() {
    return pendingIdToken;
  }

  /**
   * @param pendingIdToken pendingIdToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setPendingIdToken(java.lang.String pendingIdToken) {
    this.pendingIdToken = pendingIdToken;
    return this;
  }

  /**
   * Should always be true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnSecureToken() {
    return returnSecureToken;
  }

  /**
   * Should always be true.
   * @param returnSecureToken returnSecureToken or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setReturnSecureToken(java.lang.Boolean returnSecureToken) {
    this.returnSecureToken = returnSecureToken;
    return this;
  }

  /**
   * The ID of the Identity Platform tenant the user is signing in to. If not set, the user will
   * sign in to the default Identity Platform instance in the project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantId() {
    return tenantId;
  }

  /**
   * The ID of the Identity Platform tenant the user is signing in to. If not set, the user will
   * sign in to the default Identity Platform instance in the project.
   * @param tenantId tenantId or {@code null} for none
   */
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest setTenantId(java.lang.String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  @Override
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest set(String fieldName, Object value) {
    return (GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest clone() {
    return (GoogleCloudIdentitytoolkitV1SignInWithPasswordRequest) super.clone();
  }

}
