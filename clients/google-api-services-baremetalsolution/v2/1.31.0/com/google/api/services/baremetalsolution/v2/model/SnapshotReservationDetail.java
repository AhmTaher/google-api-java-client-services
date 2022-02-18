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

package com.google.api.services.baremetalsolution.v2.model;

/**
 * Details about snapshot space reservation and usage on the storage volume.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SnapshotReservationDetail extends com.google.api.client.json.GenericJson {

  /**
   * The space on this storage volume reserved for snapshots, shown in GiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reservedSpaceGib;

  /**
   * The amount, in GiB, of available space in this storage volume's reserved snapshot space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reservedSpaceRemainingGib;

  /**
   * The percent of snapshot space on this storage volume actually being used by the snapshot
   * copies. This value might be higher than 100% if the snapshot copies have overflowed into the
   * data portion of the storage volume.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer reservedSpaceUsedPercent;

  /**
   * The space on this storage volume reserved for snapshots, shown in GiB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReservedSpaceGib() {
    return reservedSpaceGib;
  }

  /**
   * The space on this storage volume reserved for snapshots, shown in GiB.
   * @param reservedSpaceGib reservedSpaceGib or {@code null} for none
   */
  public SnapshotReservationDetail setReservedSpaceGib(java.lang.Long reservedSpaceGib) {
    this.reservedSpaceGib = reservedSpaceGib;
    return this;
  }

  /**
   * The amount, in GiB, of available space in this storage volume's reserved snapshot space.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReservedSpaceRemainingGib() {
    return reservedSpaceRemainingGib;
  }

  /**
   * The amount, in GiB, of available space in this storage volume's reserved snapshot space.
   * @param reservedSpaceRemainingGib reservedSpaceRemainingGib or {@code null} for none
   */
  public SnapshotReservationDetail setReservedSpaceRemainingGib(java.lang.Long reservedSpaceRemainingGib) {
    this.reservedSpaceRemainingGib = reservedSpaceRemainingGib;
    return this;
  }

  /**
   * The percent of snapshot space on this storage volume actually being used by the snapshot
   * copies. This value might be higher than 100% if the snapshot copies have overflowed into the
   * data portion of the storage volume.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReservedSpaceUsedPercent() {
    return reservedSpaceUsedPercent;
  }

  /**
   * The percent of snapshot space on this storage volume actually being used by the snapshot
   * copies. This value might be higher than 100% if the snapshot copies have overflowed into the
   * data portion of the storage volume.
   * @param reservedSpaceUsedPercent reservedSpaceUsedPercent or {@code null} for none
   */
  public SnapshotReservationDetail setReservedSpaceUsedPercent(java.lang.Integer reservedSpaceUsedPercent) {
    this.reservedSpaceUsedPercent = reservedSpaceUsedPercent;
    return this;
  }

  @Override
  public SnapshotReservationDetail set(String fieldName, Object value) {
    return (SnapshotReservationDetail) super.set(fieldName, value);
  }

  @Override
  public SnapshotReservationDetail clone() {
    return (SnapshotReservationDetail) super.clone();
  }

}