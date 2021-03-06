/*
 * Copyright (c) 2019 Mastercard
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
    http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 * 
 * Loyalty Wifi API
 * The Loyalty Boingo Wifi API offers cardholders, via their issuers, the ability to search and connect to Mastercard Global Wifi hotspots around the world through this digital channel. These APIs can be used to build a rich, interactive wifi experience within the issuer's existing mobile or web application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: loyalty-benefits-support@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_wifi_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Hotspot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-07T11:17:22.737-06:00[America/Chicago]")
public class Hotspot {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_SSID = "ssid";
  @SerializedName(SERIALIZED_NAME_SSID)
  private String ssid;

  public Hotspot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Wifi hotspot name
   * @return name
  **/
  @ApiModelProperty(example = "Regional Hotspot #345", value = "Wifi hotspot name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Hotspot addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Wifi hotspot address
   * @return addressLine1
  **/
  @ApiModelProperty(example = "Rua Francisco Pereira da Silva 1480", value = "Wifi hotspot address")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Hotspot city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "Guarulhos", value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Hotspot state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @ApiModelProperty(example = "Sao Paulo", value = "State")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Hotspot country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @ApiModelProperty(example = "United States", value = "Country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Hotspot postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @ApiModelProperty(example = "71000", value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Hotspot latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Wifi hotspot location latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "37.81974", value = "Wifi hotspot location latitude")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Hotspot longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Wifi hotspot location longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "-122.478268", value = "Wifi hotspot location longitude")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Hotspot ssid(String ssid) {
    this.ssid = ssid;
    return this;
  }

   /**
   * Wifi hotspot SSID
   * @return ssid
  **/
  @ApiModelProperty(example = "Regional Hotspot #345", value = "Wifi hotspot SSID")
  public String getSsid() {
    return ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hotspot hotspot = (Hotspot) o;
    return Objects.equals(this.name, hotspot.name) &&
        Objects.equals(this.addressLine1, hotspot.addressLine1) &&
        Objects.equals(this.city, hotspot.city) &&
        Objects.equals(this.state, hotspot.state) &&
        Objects.equals(this.country, hotspot.country) &&
        Objects.equals(this.postalCode, hotspot.postalCode) &&
        Objects.equals(this.latitude, hotspot.latitude) &&
        Objects.equals(this.longitude, hotspot.longitude) &&
        Objects.equals(this.ssid, hotspot.ssid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, addressLine1, city, state, country, postalCode, latitude, longitude, ssid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hotspot {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    ssid: ").append(toIndentedString(ssid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

