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
import open_cluster_management.io.IoK8sApimachineryPkgRuntimeRawExtension;

/**
 * WorkStatus returns the status of the work
 */
@ApiModel(description = "WorkStatus returns the status of the work")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus {
  @SerializedName("lastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("result")
  private IoK8sApimachineryPkgRuntimeRawExtension result = null;

  @SerializedName("type")
  private String type = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * LastUpdateTime is the last status update time
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "LastUpdateTime is the last status update time")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason is the reason of the current status
   * @return reason
  **/
  @ApiModelProperty(value = "Reason is the reason of the current status")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus result(IoK8sApimachineryPkgRuntimeRawExtension result) {
    this.result = result;
    return this;
  }

   /**
   * WorkResult references the related result of the work
   * @return result
  **/
  @ApiModelProperty(value = "WorkResult references the related result of the work")
  public IoK8sApimachineryPkgRuntimeRawExtension getResult() {
    return result;
  }

  public void setResult(IoK8sApimachineryPkgRuntimeRawExtension result) {
    this.result = result;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Status is the status of the work result
   * @return type
  **/
  @ApiModelProperty(value = "Status is the status of the work result")
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
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus) o;
    return Objects.equals(this.lastUpdateTime, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus.lastUpdateTime) &&
        Objects.equals(this.reason, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus.reason) &&
        Objects.equals(this.result, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus.result) &&
        Objects.equals(this.type, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, reason, result, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1WorkStatus {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

