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
 * DependentStatus is the status for a dependent requirement (to prevent infinite nesting)
 */
@ApiModel(description = "DependentStatus is the status for a dependent requirement (to prevent infinite nesting)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents {
  @SerializedName("group")
  private String group = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("uuid")
  private String uuid = null;

  @SerializedName("version")
  private String version = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents status(String status) {
    this.status = status;
    return this;
  }

   /**
   * StatusReason is a camelcased reason for the status of a RequirementStatus or DependentStatus
   * @return status
  **/
  @ApiModelProperty(required = true, value = "StatusReason is a camelcased reason for the status of a RequirementStatus or DependentStatus")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents = (ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents) o;
    return Objects.equals(this.group, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.group) &&
        Objects.equals(this.kind, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.kind) &&
        Objects.equals(this.message, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.message) &&
        Objects.equals(this.status, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.status) &&
        Objects.equals(this.uuid, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.uuid) &&
        Objects.equals(this.version, comCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, message, status, uuid, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionStatusDependents {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

