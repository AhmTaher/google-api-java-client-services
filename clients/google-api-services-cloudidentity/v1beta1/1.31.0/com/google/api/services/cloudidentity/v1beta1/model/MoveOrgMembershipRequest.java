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

package com.google.api.services.cloudidentity.v1beta1.model;

/**
 * The request message for OrgMembershipsService.MoveOrgMembership.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MoveOrgMembershipRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Immutable. Customer on whose membership change is made. All authorization will happen
   * on the role assignments of this customer. Format: customers/{$customerId} where `$customerId`
   * is the `id` from the [Admin SDK `Customer` resource](https://developers.google.com/admin-
   * sdk/directory/reference/rest/v1/customers). You may also use `customers/my_customer` to specify
   * your own organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customer;

  /**
   * Required. Immutable. OrgUnit where the membership will be moved to. Format:
   * orgUnits/{$orgUnitId} where `$orgUnitId` is the `orgUnitId` from the [Admin SDK `OrgUnit`
   * resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/orgunits).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationOrgUnit;

  /**
   * Required. Immutable. Customer on whose membership change is made. All authorization will happen
   * on the role assignments of this customer. Format: customers/{$customerId} where `$customerId`
   * is the `id` from the [Admin SDK `Customer` resource](https://developers.google.com/admin-
   * sdk/directory/reference/rest/v1/customers). You may also use `customers/my_customer` to specify
   * your own organization.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomer() {
    return customer;
  }

  /**
   * Required. Immutable. Customer on whose membership change is made. All authorization will happen
   * on the role assignments of this customer. Format: customers/{$customerId} where `$customerId`
   * is the `id` from the [Admin SDK `Customer` resource](https://developers.google.com/admin-
   * sdk/directory/reference/rest/v1/customers). You may also use `customers/my_customer` to specify
   * your own organization.
   * @param customer customer or {@code null} for none
   */
  public MoveOrgMembershipRequest setCustomer(java.lang.String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Required. Immutable. OrgUnit where the membership will be moved to. Format:
   * orgUnits/{$orgUnitId} where `$orgUnitId` is the `orgUnitId` from the [Admin SDK `OrgUnit`
   * resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/orgunits).
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationOrgUnit() {
    return destinationOrgUnit;
  }

  /**
   * Required. Immutable. OrgUnit where the membership will be moved to. Format:
   * orgUnits/{$orgUnitId} where `$orgUnitId` is the `orgUnitId` from the [Admin SDK `OrgUnit`
   * resource](https://developers.google.com/admin-sdk/directory/reference/rest/v1/orgunits).
   * @param destinationOrgUnit destinationOrgUnit or {@code null} for none
   */
  public MoveOrgMembershipRequest setDestinationOrgUnit(java.lang.String destinationOrgUnit) {
    this.destinationOrgUnit = destinationOrgUnit;
    return this;
  }

  @Override
  public MoveOrgMembershipRequest set(String fieldName, Object value) {
    return (MoveOrgMembershipRequest) super.set(fieldName, value);
  }

  @Override
  public MoveOrgMembershipRequest clone() {
    return (MoveOrgMembershipRequest) super.clone();
  }

}