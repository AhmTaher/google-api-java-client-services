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

package com.google.api.services.workloadmanager.v1.model;

/**
 * Message describing the system component.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Workload Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SapDiscoveryComponent extends com.google.api.client.json.GenericJson {

  /**
   * The component is a SAP application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String applicationType;

  /**
   * The component is a SAP database.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseType;

  /**
   * Pantheon Project in which the resources reside.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostProject;

  /**
   * The resources in a component.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SapDiscoveryResource> resources;

  /**
   * The sap identifier, used by the SAP software and helps differentiate systems for customers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sid;

  /**
   * The component is a SAP application.
   * @return value or {@code null} for none
   */
  public java.lang.String getApplicationType() {
    return applicationType;
  }

  /**
   * The component is a SAP application.
   * @param applicationType applicationType or {@code null} for none
   */
  public SapDiscoveryComponent setApplicationType(java.lang.String applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * The component is a SAP database.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseType() {
    return databaseType;
  }

  /**
   * The component is a SAP database.
   * @param databaseType databaseType or {@code null} for none
   */
  public SapDiscoveryComponent setDatabaseType(java.lang.String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

  /**
   * Pantheon Project in which the resources reside.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostProject() {
    return hostProject;
  }

  /**
   * Pantheon Project in which the resources reside.
   * @param hostProject hostProject or {@code null} for none
   */
  public SapDiscoveryComponent setHostProject(java.lang.String hostProject) {
    this.hostProject = hostProject;
    return this;
  }

  /**
   * The resources in a component.
   * @return value or {@code null} for none
   */
  public java.util.List<SapDiscoveryResource> getResources() {
    return resources;
  }

  /**
   * The resources in a component.
   * @param resources resources or {@code null} for none
   */
  public SapDiscoveryComponent setResources(java.util.List<SapDiscoveryResource> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * The sap identifier, used by the SAP software and helps differentiate systems for customers.
   * @return value or {@code null} for none
   */
  public java.lang.String getSid() {
    return sid;
  }

  /**
   * The sap identifier, used by the SAP software and helps differentiate systems for customers.
   * @param sid sid or {@code null} for none
   */
  public SapDiscoveryComponent setSid(java.lang.String sid) {
    this.sid = sid;
    return this;
  }

  @Override
  public SapDiscoveryComponent set(String fieldName, Object value) {
    return (SapDiscoveryComponent) super.set(fieldName, value);
  }

  @Override
  public SapDiscoveryComponent clone() {
    return (SapDiscoveryComponent) super.clone();
  }

}
