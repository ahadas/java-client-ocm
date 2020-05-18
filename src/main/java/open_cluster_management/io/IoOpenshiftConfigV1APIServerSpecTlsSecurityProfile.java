/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package open_cluster_management.io;

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
 * tlsSecurityProfile specifies settings for TLS connections for externally exposed servers.   If unset, a default (which may change between releases) is chosen. Note that only Old and Intermediate profiles are currently supported, and the maximum available MinTLSVersions is VersionTLS12.
 */
@ApiModel(description = "tlsSecurityProfile specifies settings for TLS connections for externally exposed servers.   If unset, a default (which may change between releases) is chosen. Note that only Old and Intermediate profiles are currently supported, and the maximum available MinTLSVersions is VersionTLS12.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile {
  @SerializedName("custom")
  private Object custom = null;

  @SerializedName("intermediate")
  private Object intermediate = null;

  @SerializedName("modern")
  private Object modern = null;

  @SerializedName("old")
  private Object old = null;

  @SerializedName("type")
  private String type = null;

  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile custom(Object custom) {
    this.custom = custom;
    return this;
  }

   /**
   * custom is a user-defined TLS security profile. Be extremely careful using a custom profile as invalid configurations can be catastrophic. An example custom profile looks like this:     ciphers:     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256   minTLSVersion: TLSv1.1
   * @return custom
  **/
  @ApiModelProperty(value = "custom is a user-defined TLS security profile. Be extremely careful using a custom profile as invalid configurations can be catastrophic. An example custom profile looks like this:     ciphers:     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256   minTLSVersion: TLSv1.1")
  public Object getCustom() {
    return custom;
  }

  public void setCustom(Object custom) {
    this.custom = custom;
  }

  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile intermediate(Object intermediate) {
    this.intermediate = intermediate;
    return this;
  }

   /**
   * intermediate is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Intermediate_compatibility_.28recommended.29   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES256-GCM-SHA384     - ECDHE-RSA-AES256-GCM-SHA384     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - DHE-RSA-AES128-GCM-SHA256     - DHE-RSA-AES256-GCM-SHA384   minTLSVersion: TLSv1.2
   * @return intermediate
  **/
  @ApiModelProperty(value = "intermediate is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Intermediate_compatibility_.28recommended.29   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES256-GCM-SHA384     - ECDHE-RSA-AES256-GCM-SHA384     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - DHE-RSA-AES128-GCM-SHA256     - DHE-RSA-AES256-GCM-SHA384   minTLSVersion: TLSv1.2")
  public Object getIntermediate() {
    return intermediate;
  }

  public void setIntermediate(Object intermediate) {
    this.intermediate = intermediate;
  }

  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile modern(Object modern) {
    this.modern = modern;
    return this;
  }

   /**
   * modern is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Modern_compatibility   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256   minTLSVersion: TLSv1.3   NOTE: Currently unsupported.
   * @return modern
  **/
  @ApiModelProperty(value = "modern is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Modern_compatibility   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256   minTLSVersion: TLSv1.3   NOTE: Currently unsupported.")
  public Object getModern() {
    return modern;
  }

  public void setModern(Object modern) {
    this.modern = modern;
  }

  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile old(Object old) {
    this.old = old;
    return this;
  }

   /**
   * old is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Old_backward_compatibility   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES256-GCM-SHA384     - ECDHE-RSA-AES256-GCM-SHA384     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - DHE-RSA-AES128-GCM-SHA256     - DHE-RSA-AES256-GCM-SHA384     - DHE-RSA-CHACHA20-POLY1305     - ECDHE-ECDSA-AES128-SHA256     - ECDHE-RSA-AES128-SHA256     - ECDHE-ECDSA-AES128-SHA     - ECDHE-RSA-AES128-SHA     - ECDHE-ECDSA-AES256-SHA384     - ECDHE-RSA-AES256-SHA384     - ECDHE-ECDSA-AES256-SHA     - ECDHE-RSA-AES256-SHA     - DHE-RSA-AES128-SHA256     - DHE-RSA-AES256-SHA256     - AES128-GCM-SHA256     - AES256-GCM-SHA384     - AES128-SHA256     - AES256-SHA256     - AES128-SHA     - AES256-SHA     - DES-CBC3-SHA   minTLSVersion: TLSv1.0
   * @return old
  **/
  @ApiModelProperty(value = "old is a TLS security profile based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Old_backward_compatibility   and looks like this (yaml):     ciphers:     - TLS_AES_128_GCM_SHA256     - TLS_AES_256_GCM_SHA384     - TLS_CHACHA20_POLY1305_SHA256     - ECDHE-ECDSA-AES128-GCM-SHA256     - ECDHE-RSA-AES128-GCM-SHA256     - ECDHE-ECDSA-AES256-GCM-SHA384     - ECDHE-RSA-AES256-GCM-SHA384     - ECDHE-ECDSA-CHACHA20-POLY1305     - ECDHE-RSA-CHACHA20-POLY1305     - DHE-RSA-AES128-GCM-SHA256     - DHE-RSA-AES256-GCM-SHA384     - DHE-RSA-CHACHA20-POLY1305     - ECDHE-ECDSA-AES128-SHA256     - ECDHE-RSA-AES128-SHA256     - ECDHE-ECDSA-AES128-SHA     - ECDHE-RSA-AES128-SHA     - ECDHE-ECDSA-AES256-SHA384     - ECDHE-RSA-AES256-SHA384     - ECDHE-ECDSA-AES256-SHA     - ECDHE-RSA-AES256-SHA     - DHE-RSA-AES128-SHA256     - DHE-RSA-AES256-SHA256     - AES128-GCM-SHA256     - AES256-GCM-SHA384     - AES128-SHA256     - AES256-SHA256     - AES128-SHA     - AES256-SHA     - DES-CBC3-SHA   minTLSVersion: TLSv1.0")
  public Object getOld() {
    return old;
  }

  public void setOld(Object old) {
    this.old = old;
  }

  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type is one of Old, Intermediate, Modern or Custom. Custom provides the ability to specify individual TLS security profile parameters. Old, Intermediate and Modern are TLS security profiles based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Recommended_configurations   The profiles are intent based, so they may change over time as new ciphers are developed and existing ciphers are found to be insecure.  Depending on precisely which ciphers are available to a process, the list may be reduced.   Note that the Modern profile is currently not supported because it is not yet well adopted by common software libraries.
   * @return type
  **/
  @ApiModelProperty(value = "type is one of Old, Intermediate, Modern or Custom. Custom provides the ability to specify individual TLS security profile parameters. Old, Intermediate and Modern are TLS security profiles based on:   https://wiki.mozilla.org/Security/Server_Side_TLS#Recommended_configurations   The profiles are intent based, so they may change over time as new ciphers are developed and existing ciphers are found to be insecure.  Depending on precisely which ciphers are available to a process, the list may be reduced.   Note that the Modern profile is currently not supported because it is not yet well adopted by common software libraries.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile = (IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile) o;
    return Objects.equals(this.custom, ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile.custom) &&
        Objects.equals(this.intermediate, ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile.intermediate) &&
        Objects.equals(this.modern, ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile.modern) &&
        Objects.equals(this.old, ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile.old) &&
        Objects.equals(this.type, ioOpenshiftConfigV1APIServerSpecTlsSecurityProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, intermediate, modern, old, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile {\n");
    
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    intermediate: ").append(toIndentedString(intermediate)).append("\n");
    sb.append("    modern: ").append(toIndentedString(modern)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

