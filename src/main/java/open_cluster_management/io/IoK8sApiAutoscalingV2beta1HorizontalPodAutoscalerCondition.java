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
 * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.
 */
@ApiModel(description = "HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a certain point.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition {
  @SerializedName("lastTransitionTime")
  private String lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * lastTransitionTime is the last time the condition transitioned from one status to another
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "lastTransitionTime is the last time the condition transitioned from one status to another")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message is a human-readable explanation containing details about the transition
   * @return message
  **/
  @ApiModelProperty(value = "message is a human-readable explanation containing details about the transition")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * reason is the reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "reason is the reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status is the status of the condition (True, False, Unknown)
   * @return status
  **/
  @ApiModelProperty(required = true, value = "status is the status of the condition (True, False, Unknown)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type describes the current condition
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type describes the current condition")
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
    IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition = (IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition) o;
    return Objects.equals(this.lastTransitionTime, ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition.lastTransitionTime) &&
        Objects.equals(this.message, ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition.message) &&
        Objects.equals(this.reason, ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition.reason) &&
        Objects.equals(this.status, ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition.status) &&
        Objects.equals(this.type, ioK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1HorizontalPodAutoscalerCondition {\n");
    
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
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

