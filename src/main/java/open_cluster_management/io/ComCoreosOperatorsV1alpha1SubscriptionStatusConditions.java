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
 * SubscriptionCondition represents the latest available observations of a Subscription&#39;s state.
 */
@ApiModel(description = "SubscriptionCondition represents the latest available observations of a Subscription's state.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1SubscriptionStatusConditions {
  @SerializedName("lastHeartbeatTime")
  private OffsetDateTime lastHeartbeatTime = null;

  @SerializedName("lastTransitionTime")
  private OffsetDateTime lastTransitionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("type")
  private String type = null;

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions lastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
    return this;
  }

   /**
   * LastHeartbeatTime is the last time we got an update on a given condition
   * @return lastHeartbeatTime
  **/
  @ApiModelProperty(value = "LastHeartbeatTime is the last time we got an update on a given condition")
  public OffsetDateTime getLastHeartbeatTime() {
    return lastHeartbeatTime;
  }

  public void setLastHeartbeatTime(OffsetDateTime lastHeartbeatTime) {
    this.lastHeartbeatTime = lastHeartbeatTime;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions lastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * LastTransitionTime is the last time the condition transit from one status to another
   * @return lastTransitionTime
  **/
  @ApiModelProperty(value = "LastTransitionTime is the last time the condition transit from one status to another")
  public OffsetDateTime getLastTransitionTime() {
    return lastTransitionTime;
  }

  public void setLastTransitionTime(OffsetDateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message is a human-readable message indicating details about last transition.
   * @return message
  **/
  @ApiModelProperty(value = "Message is a human-readable message indicating details about last transition.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason is a one-word CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/
  @ApiModelProperty(value = "Reason is a one-word CamelCase reason for the condition's last transition.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status is the status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status is the status of the condition, one of True, False, Unknown.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusConditions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type is the type of Subscription condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type is the type of Subscription condition.")
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
    ComCoreosOperatorsV1alpha1SubscriptionStatusConditions comCoreosOperatorsV1alpha1SubscriptionStatusConditions = (ComCoreosOperatorsV1alpha1SubscriptionStatusConditions) o;
    return Objects.equals(this.lastHeartbeatTime, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.lastHeartbeatTime) &&
        Objects.equals(this.lastTransitionTime, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.lastTransitionTime) &&
        Objects.equals(this.message, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.message) &&
        Objects.equals(this.reason, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.reason) &&
        Objects.equals(this.status, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.status) &&
        Objects.equals(this.type, comCoreosOperatorsV1alpha1SubscriptionStatusConditions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastHeartbeatTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1SubscriptionStatusConditions {\n");
    
    sb.append("    lastHeartbeatTime: ").append(toIndentedString(lastHeartbeatTime)).append("\n");
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

