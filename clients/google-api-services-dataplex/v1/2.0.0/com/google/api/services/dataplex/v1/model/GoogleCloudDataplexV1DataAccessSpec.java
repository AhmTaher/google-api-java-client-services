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

package com.google.api.services.dataplex.v1.model;

/**
 * DataAccessSpec holds the access control configuration to be enforced on data stored within
 * resources (eg: rows, columns in BigQuery Tables). When associated with data,the data is only
 * accessible to principals explicitly granted access through the DataAttribute. Principals with
 * access to the containing resource are not implicitly granted access.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1DataAccessSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The format of strings follows the pattern followed by IAM in the bindings.
   * user:{email}, serviceAccount:{email} group:{email}. The set of principals to be granted reader
   * role on data stored within resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> readers;

  /**
   * Optional. The format of strings follows the pattern followed by IAM in the bindings.
   * user:{email}, serviceAccount:{email} group:{email}. The set of principals to be granted reader
   * role on data stored within resources.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReaders() {
    return readers;
  }

  /**
   * Optional. The format of strings follows the pattern followed by IAM in the bindings.
   * user:{email}, serviceAccount:{email} group:{email}. The set of principals to be granted reader
   * role on data stored within resources.
   * @param readers readers or {@code null} for none
   */
  public GoogleCloudDataplexV1DataAccessSpec setReaders(java.util.List<java.lang.String> readers) {
    this.readers = readers;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1DataAccessSpec set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1DataAccessSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1DataAccessSpec clone() {
    return (GoogleCloudDataplexV1DataAccessSpec) super.clone();
  }

}
