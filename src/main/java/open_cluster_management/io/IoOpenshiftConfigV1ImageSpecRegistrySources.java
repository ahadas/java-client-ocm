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
import java.util.ArrayList;
import java.util.List;

/**
 * registrySources contains configuration that determines how the container runtime should treat individual registries when accessing images for builds+pods. (e.g. whether or not to allow insecure access).  It does not contain configuration for the internal cluster registry.
 */
@ApiModel(description = "registrySources contains configuration that determines how the container runtime should treat individual registries when accessing images for builds+pods. (e.g. whether or not to allow insecure access).  It does not contain configuration for the internal cluster registry.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1ImageSpecRegistrySources {
  @SerializedName("allowedRegistries")
  private List<String> allowedRegistries = null;

  @SerializedName("blockedRegistries")
  private List<String> blockedRegistries = null;

  @SerializedName("insecureRegistries")
  private List<String> insecureRegistries = null;

  public IoOpenshiftConfigV1ImageSpecRegistrySources allowedRegistries(List<String> allowedRegistries) {
    this.allowedRegistries = allowedRegistries;
    return this;
  }

  public IoOpenshiftConfigV1ImageSpecRegistrySources addAllowedRegistriesItem(String allowedRegistriesItem) {
    if (this.allowedRegistries == null) {
      this.allowedRegistries = new ArrayList<>();
    }
    this.allowedRegistries.add(allowedRegistriesItem);
    return this;
  }

   /**
   * allowedRegistries are whitelisted for image pull/push. All other registries are blocked.   Only one of BlockedRegistries or AllowedRegistries may be set.
   * @return allowedRegistries
  **/
  @ApiModelProperty(value = "allowedRegistries are whitelisted for image pull/push. All other registries are blocked.   Only one of BlockedRegistries or AllowedRegistries may be set.")
  public List<String> getAllowedRegistries() {
    return allowedRegistries;
  }

  public void setAllowedRegistries(List<String> allowedRegistries) {
    this.allowedRegistries = allowedRegistries;
  }

  public IoOpenshiftConfigV1ImageSpecRegistrySources blockedRegistries(List<String> blockedRegistries) {
    this.blockedRegistries = blockedRegistries;
    return this;
  }

  public IoOpenshiftConfigV1ImageSpecRegistrySources addBlockedRegistriesItem(String blockedRegistriesItem) {
    if (this.blockedRegistries == null) {
      this.blockedRegistries = new ArrayList<>();
    }
    this.blockedRegistries.add(blockedRegistriesItem);
    return this;
  }

   /**
   * blockedRegistries are blacklisted from image pull/push. All other registries are allowed.   Only one of BlockedRegistries or AllowedRegistries may be set.
   * @return blockedRegistries
  **/
  @ApiModelProperty(value = "blockedRegistries are blacklisted from image pull/push. All other registries are allowed.   Only one of BlockedRegistries or AllowedRegistries may be set.")
  public List<String> getBlockedRegistries() {
    return blockedRegistries;
  }

  public void setBlockedRegistries(List<String> blockedRegistries) {
    this.blockedRegistries = blockedRegistries;
  }

  public IoOpenshiftConfigV1ImageSpecRegistrySources insecureRegistries(List<String> insecureRegistries) {
    this.insecureRegistries = insecureRegistries;
    return this;
  }

  public IoOpenshiftConfigV1ImageSpecRegistrySources addInsecureRegistriesItem(String insecureRegistriesItem) {
    if (this.insecureRegistries == null) {
      this.insecureRegistries = new ArrayList<>();
    }
    this.insecureRegistries.add(insecureRegistriesItem);
    return this;
  }

   /**
   * insecureRegistries are registries which do not have a valid TLS certificates or only support HTTP connections.
   * @return insecureRegistries
  **/
  @ApiModelProperty(value = "insecureRegistries are registries which do not have a valid TLS certificates or only support HTTP connections.")
  public List<String> getInsecureRegistries() {
    return insecureRegistries;
  }

  public void setInsecureRegistries(List<String> insecureRegistries) {
    this.insecureRegistries = insecureRegistries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1ImageSpecRegistrySources ioOpenshiftConfigV1ImageSpecRegistrySources = (IoOpenshiftConfigV1ImageSpecRegistrySources) o;
    return Objects.equals(this.allowedRegistries, ioOpenshiftConfigV1ImageSpecRegistrySources.allowedRegistries) &&
        Objects.equals(this.blockedRegistries, ioOpenshiftConfigV1ImageSpecRegistrySources.blockedRegistries) &&
        Objects.equals(this.insecureRegistries, ioOpenshiftConfigV1ImageSpecRegistrySources.insecureRegistries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRegistries, blockedRegistries, insecureRegistries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1ImageSpecRegistrySources {\n");
    
    sb.append("    allowedRegistries: ").append(toIndentedString(allowedRegistries)).append("\n");
    sb.append("    blockedRegistries: ").append(toIndentedString(blockedRegistries)).append("\n");
    sb.append("    insecureRegistries: ").append(toIndentedString(insecureRegistries)).append("\n");
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
