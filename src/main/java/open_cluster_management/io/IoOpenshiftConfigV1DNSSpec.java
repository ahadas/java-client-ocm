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
import open_cluster_management.io.IoOpenshiftConfigV1DNSSpecPrivateZone;
import open_cluster_management.io.IoOpenshiftConfigV1DNSSpecPublicZone;

/**
 * spec holds user settable values for configuration
 */
@ApiModel(description = "spec holds user settable values for configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1DNSSpec {
  @SerializedName("baseDomain")
  private String baseDomain = null;

  @SerializedName("privateZone")
  private IoOpenshiftConfigV1DNSSpecPrivateZone privateZone = null;

  @SerializedName("publicZone")
  private IoOpenshiftConfigV1DNSSpecPublicZone publicZone = null;

  public IoOpenshiftConfigV1DNSSpec baseDomain(String baseDomain) {
    this.baseDomain = baseDomain;
    return this;
  }

   /**
   * baseDomain is the base domain of the cluster. All managed DNS records will be sub-domains of this base.   For example, given the base domain &#x60;openshift.example.com&#x60;, an API server DNS record may be created for &#x60;cluster-api.openshift.example.com&#x60;.   Once set, this field cannot be changed.
   * @return baseDomain
  **/
  @ApiModelProperty(value = "baseDomain is the base domain of the cluster. All managed DNS records will be sub-domains of this base.   For example, given the base domain `openshift.example.com`, an API server DNS record may be created for `cluster-api.openshift.example.com`.   Once set, this field cannot be changed.")
  public String getBaseDomain() {
    return baseDomain;
  }

  public void setBaseDomain(String baseDomain) {
    this.baseDomain = baseDomain;
  }

  public IoOpenshiftConfigV1DNSSpec privateZone(IoOpenshiftConfigV1DNSSpecPrivateZone privateZone) {
    this.privateZone = privateZone;
    return this;
  }

   /**
   * Get privateZone
   * @return privateZone
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1DNSSpecPrivateZone getPrivateZone() {
    return privateZone;
  }

  public void setPrivateZone(IoOpenshiftConfigV1DNSSpecPrivateZone privateZone) {
    this.privateZone = privateZone;
  }

  public IoOpenshiftConfigV1DNSSpec publicZone(IoOpenshiftConfigV1DNSSpecPublicZone publicZone) {
    this.publicZone = publicZone;
    return this;
  }

   /**
   * Get publicZone
   * @return publicZone
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1DNSSpecPublicZone getPublicZone() {
    return publicZone;
  }

  public void setPublicZone(IoOpenshiftConfigV1DNSSpecPublicZone publicZone) {
    this.publicZone = publicZone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1DNSSpec ioOpenshiftConfigV1DNSSpec = (IoOpenshiftConfigV1DNSSpec) o;
    return Objects.equals(this.baseDomain, ioOpenshiftConfigV1DNSSpec.baseDomain) &&
        Objects.equals(this.privateZone, ioOpenshiftConfigV1DNSSpec.privateZone) &&
        Objects.equals(this.publicZone, ioOpenshiftConfigV1DNSSpec.publicZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseDomain, privateZone, publicZone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1DNSSpec {\n");
    
    sb.append("    baseDomain: ").append(toIndentedString(baseDomain)).append("\n");
    sb.append("    privateZone: ").append(toIndentedString(privateZone)).append("\n");
    sb.append("    publicZone: ").append(toIndentedString(publicZone)).append("\n");
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
