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

package com.google.api.services.digitalassetlinks.v1.model;

/**
 * Message used to check for the existence of multiple digital asset links within a single RPC.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Digital Asset Links API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BulkCheckRequest extends com.google.api.client.json.GenericJson {

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowGoogleInternalDataSources;

  /**
   * If specified, will be used in any given template statement that doesn’t specify a relation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultRelation;

  /**
   * If specified, will be used in any given template statement that doesn’t specify a source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Asset defaultSource;

  /**
   * If specified, will be used in any given template statement that doesn’t specify a target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Asset defaultTarget;

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean skipCacheLookup;

  /**
   * List of statements to check. For each statement, you can omit a field if the corresponding
   * default_* field below was supplied. Minimum 1 statement; maximum 1,000 statements. Any
   * additional statements will be ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StatementTemplate> statements;

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowGoogleInternalDataSources() {
    return allowGoogleInternalDataSources;
  }

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * @param allowGoogleInternalDataSources allowGoogleInternalDataSources or {@code null} for none
   */
  public BulkCheckRequest setAllowGoogleInternalDataSources(java.lang.Boolean allowGoogleInternalDataSources) {
    this.allowGoogleInternalDataSources = allowGoogleInternalDataSources;
    return this;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a relation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultRelation() {
    return defaultRelation;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a relation.
   * @param defaultRelation defaultRelation or {@code null} for none
   */
  public BulkCheckRequest setDefaultRelation(java.lang.String defaultRelation) {
    this.defaultRelation = defaultRelation;
    return this;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a source.
   * @return value or {@code null} for none
   */
  public Asset getDefaultSource() {
    return defaultSource;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a source.
   * @param defaultSource defaultSource or {@code null} for none
   */
  public BulkCheckRequest setDefaultSource(Asset defaultSource) {
    this.defaultSource = defaultSource;
    return this;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a target.
   * @return value or {@code null} for none
   */
  public Asset getDefaultTarget() {
    return defaultTarget;
  }

  /**
   * If specified, will be used in any given template statement that doesn’t specify a target.
   * @param defaultTarget defaultTarget or {@code null} for none
   */
  public BulkCheckRequest setDefaultTarget(Asset defaultTarget) {
    this.defaultTarget = defaultTarget;
    return this;
  }

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSkipCacheLookup() {
    return skipCacheLookup;
  }

  /**
   * Same configuration as in Check request, all statements checks will use same configurations.
   * @param skipCacheLookup skipCacheLookup or {@code null} for none
   */
  public BulkCheckRequest setSkipCacheLookup(java.lang.Boolean skipCacheLookup) {
    this.skipCacheLookup = skipCacheLookup;
    return this;
  }

  /**
   * List of statements to check. For each statement, you can omit a field if the corresponding
   * default_* field below was supplied. Minimum 1 statement; maximum 1,000 statements. Any
   * additional statements will be ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<StatementTemplate> getStatements() {
    return statements;
  }

  /**
   * List of statements to check. For each statement, you can omit a field if the corresponding
   * default_* field below was supplied. Minimum 1 statement; maximum 1,000 statements. Any
   * additional statements will be ignored.
   * @param statements statements or {@code null} for none
   */
  public BulkCheckRequest setStatements(java.util.List<StatementTemplate> statements) {
    this.statements = statements;
    return this;
  }

  @Override
  public BulkCheckRequest set(String fieldName, Object value) {
    return (BulkCheckRequest) super.set(fieldName, value);
  }

  @Override
  public BulkCheckRequest clone() {
    return (BulkCheckRequest) super.clone();
  }

}