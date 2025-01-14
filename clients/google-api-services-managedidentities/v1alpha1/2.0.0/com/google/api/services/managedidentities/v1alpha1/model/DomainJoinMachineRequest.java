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

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * DomainJoinMachineRequest is the request message for DomainJoinMachine method
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainJoinMachineRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. OU name where the VM needs to be domain joined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ouName;

  /**
   * Required. Full instance id token of compute engine VM to verify instance identity. More about
   * this: https://cloud.google.com/compute/docs/instances/verifying-instance-
   * identity#request_signature
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String vmIdToken;

  /**
   * Optional. OU name where the VM needs to be domain joined
   * @return value or {@code null} for none
   */
  public java.lang.String getOuName() {
    return ouName;
  }

  /**
   * Optional. OU name where the VM needs to be domain joined
   * @param ouName ouName or {@code null} for none
   */
  public DomainJoinMachineRequest setOuName(java.lang.String ouName) {
    this.ouName = ouName;
    return this;
  }

  /**
   * Required. Full instance id token of compute engine VM to verify instance identity. More about
   * this: https://cloud.google.com/compute/docs/instances/verifying-instance-
   * identity#request_signature
   * @return value or {@code null} for none
   */
  public java.lang.String getVmIdToken() {
    return vmIdToken;
  }

  /**
   * Required. Full instance id token of compute engine VM to verify instance identity. More about
   * this: https://cloud.google.com/compute/docs/instances/verifying-instance-
   * identity#request_signature
   * @param vmIdToken vmIdToken or {@code null} for none
   */
  public DomainJoinMachineRequest setVmIdToken(java.lang.String vmIdToken) {
    this.vmIdToken = vmIdToken;
    return this;
  }

  @Override
  public DomainJoinMachineRequest set(String fieldName, Object value) {
    return (DomainJoinMachineRequest) super.set(fieldName, value);
  }

  @Override
  public DomainJoinMachineRequest clone() {
    return (DomainJoinMachineRequest) super.clone();
  }

}
