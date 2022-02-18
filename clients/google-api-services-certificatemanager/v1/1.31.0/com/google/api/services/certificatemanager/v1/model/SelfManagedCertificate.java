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
 * Certificate data for a SelfManaged Certificate. SelfManaged Certificates are uploaded by the
 * user. Updating such certificates before they expire remains the user's responsibility.
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
public final class SelfManagedCertificate extends com.google.api.client.json.GenericJson {

  /**
   * Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by
   * intermediate ones if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pemCertificate;

  /**
   * Input only. The PEM-encoded private key of the leaf certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pemPrivateKey;

  /**
   * Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by
   * intermediate ones if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getPemCertificate() {
    return pemCertificate;
  }

  /**
   * Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by
   * intermediate ones if any.
   * @param pemCertificate pemCertificate or {@code null} for none
   */
  public SelfManagedCertificate setPemCertificate(java.lang.String pemCertificate) {
    this.pemCertificate = pemCertificate;
    return this;
  }

  /**
   * Input only. The PEM-encoded private key of the leaf certificate.
   * @return value or {@code null} for none
   */
  public java.lang.String getPemPrivateKey() {
    return pemPrivateKey;
  }

  /**
   * Input only. The PEM-encoded private key of the leaf certificate.
   * @param pemPrivateKey pemPrivateKey or {@code null} for none
   */
  public SelfManagedCertificate setPemPrivateKey(java.lang.String pemPrivateKey) {
    this.pemPrivateKey = pemPrivateKey;
    return this;
  }

  @Override
  public SelfManagedCertificate set(String fieldName, Object value) {
    return (SelfManagedCertificate) super.set(fieldName, value);
  }

  @Override
  public SelfManagedCertificate clone() {
    return (SelfManagedCertificate) super.clone();
  }

}