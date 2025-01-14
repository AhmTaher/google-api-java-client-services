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

package com.google.api.services.chromemanagement.v1.model;

/**
 * `TelemetryUsbPeripheralsEvent` is triggered USB devices are either added or removed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromeManagementV1TelemetryUsbPeripheralsEvent extends com.google.api.client.json.GenericJson {

  /**
   * List of usb devices that were either added or removed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromeManagementV1UsbPeripheralReport> usbPeripheralReport;

  /**
   * List of usb devices that were either added or removed.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromeManagementV1UsbPeripheralReport> getUsbPeripheralReport() {
    return usbPeripheralReport;
  }

  /**
   * List of usb devices that were either added or removed.
   * @param usbPeripheralReport usbPeripheralReport or {@code null} for none
   */
  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent setUsbPeripheralReport(java.util.List<GoogleChromeManagementV1UsbPeripheralReport> usbPeripheralReport) {
    this.usbPeripheralReport = usbPeripheralReport;
    return this;
  }

  @Override
  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent set(String fieldName, Object value) {
    return (GoogleChromeManagementV1TelemetryUsbPeripheralsEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleChromeManagementV1TelemetryUsbPeripheralsEvent clone() {
    return (GoogleChromeManagementV1TelemetryUsbPeripheralsEvent) super.clone();
  }

}
