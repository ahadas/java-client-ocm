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
import java.time.OffsetDateTime;

/**
 * ConfigCondition captures various conditions of the Config as entries are processed.
 */
@ApiModel(description = "ConfigCondition captures various conditions of the Config as entries are processed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorSamplesV1ConfigStatusConditions {
  @SerializedName("lastTransitionTime")
  private OffsetDateTime lastTransitionTime = null;

  @SerializedName("lastUpdateTime")
  private OffsetDateTime lastUpdateTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions lastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * lastTransitionTime is the last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "lastTransitionTime is the last time the condition transitioned from one status to another.")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions lastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * lastUpdateTime is the last time this condition was updated.
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "lastUpdateTime is the last time this condition was updated.")
  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message is a human readable message indicating details about the transition.
   * @return message
  **/
  @ApiModelProperty(value = "message is a human readable message indicating details about the transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * reason is what caused the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "reason is what caused the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoOpenshiftOperatorSamplesV1ConfigStatusConditions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type of condition.")
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
    IoOpenshiftOperatorSamplesV1ConfigStatusConditions ioOpenshiftOperatorSamplesV1ConfigStatusConditions = (IoOpenshiftOperatorSamplesV1ConfigStatusConditions) o;
    return Objects.equals(this.lastTransitionTime, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.lastTransitionTime) &&
        Objects.equals(this.lastUpdateTime, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.lastUpdateTime) &&
        Objects.equals(this.message, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.message) &&
        Objects.equals(this.reason, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.reason) &&
        Objects.equals(this.status, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.status) &&
        Objects.equals(this.type, ioOpenshiftOperatorSamplesV1ConfigStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, lastUpdateTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorSamplesV1ConfigStatusConditions {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

