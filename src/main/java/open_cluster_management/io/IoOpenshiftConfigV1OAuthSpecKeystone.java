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
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecBasicAuthCa;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientCert;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientKey;

/**
 * keystone enables user authentication using keystone password credentials
 */
@ApiModel(description = "keystone enables user authentication using keystone password credentials")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1OAuthSpecKeystone {
  @SerializedName("ca")
  private IoOpenshiftConfigV1OAuthSpecBasicAuthCa ca = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("tlsClientCert")
  private IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientCert tlsClientCert = null;

  @SerializedName("tlsClientKey")
  private IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientKey tlsClientKey = null;

  @SerializedName("url")
  private String url = null;

  public IoOpenshiftConfigV1OAuthSpecKeystone ca(IoOpenshiftConfigV1OAuthSpecBasicAuthCa ca) {
    this.ca = ca;
    return this;
  }

   /**
   * Get ca
   * @return ca
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecBasicAuthCa getCa() {
    return ca;
  }

  public void setCa(IoOpenshiftConfigV1OAuthSpecBasicAuthCa ca) {
    this.ca = ca;
  }

  public IoOpenshiftConfigV1OAuthSpecKeystone domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * domainName is required for keystone v3
   * @return domainName
  **/
  @ApiModelProperty(value = "domainName is required for keystone v3")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public IoOpenshiftConfigV1OAuthSpecKeystone tlsClientCert(IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientCert tlsClientCert) {
    this.tlsClientCert = tlsClientCert;
    return this;
  }

   /**
   * Get tlsClientCert
   * @return tlsClientCert
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientCert getTlsClientCert() {
    return tlsClientCert;
  }

  public void setTlsClientCert(IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientCert tlsClientCert) {
    this.tlsClientCert = tlsClientCert;
  }

  public IoOpenshiftConfigV1OAuthSpecKeystone tlsClientKey(IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientKey tlsClientKey) {
    this.tlsClientKey = tlsClientKey;
    return this;
  }

   /**
   * Get tlsClientKey
   * @return tlsClientKey
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientKey getTlsClientKey() {
    return tlsClientKey;
  }

  public void setTlsClientKey(IoOpenshiftConfigV1OAuthSpecBasicAuthTlsClientKey tlsClientKey) {
    this.tlsClientKey = tlsClientKey;
  }

  public IoOpenshiftConfigV1OAuthSpecKeystone url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url is the remote URL to connect to
   * @return url
  **/
  @ApiModelProperty(value = "url is the remote URL to connect to")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1OAuthSpecKeystone ioOpenshiftConfigV1OAuthSpecKeystone = (IoOpenshiftConfigV1OAuthSpecKeystone) o;
    return Objects.equals(this.ca, ioOpenshiftConfigV1OAuthSpecKeystone.ca) &&
        Objects.equals(this.domainName, ioOpenshiftConfigV1OAuthSpecKeystone.domainName) &&
        Objects.equals(this.tlsClientCert, ioOpenshiftConfigV1OAuthSpecKeystone.tlsClientCert) &&
        Objects.equals(this.tlsClientKey, ioOpenshiftConfigV1OAuthSpecKeystone.tlsClientKey) &&
        Objects.equals(this.url, ioOpenshiftConfigV1OAuthSpecKeystone.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ca, domainName, tlsClientCert, tlsClientKey, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1OAuthSpecKeystone {\n");
    
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    tlsClientCert: ").append(toIndentedString(tlsClientCert)).append("\n");
    sb.append("    tlsClientKey: ").append(toIndentedString(tlsClientKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
