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
 * IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition {
  @SerializedName("lastUpdateTime")
  private String lastUpdateTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * timestamp for the last update to this condition
   * @return lastUpdateTime
  **/
  @ApiModelProperty(value = "timestamp for the last update to this condition")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition message(String message) {
    this.message = message;
    return this;
  }

   /**
   * human readable message with details about the request state
   * @return message
  **/
  @ApiModelProperty(value = "human readable message with details about the request state")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * brief reason for the request state
   * @return reason
  **/
  @ApiModelProperty(value = "brief reason for the request state")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * request approval state, currently Approved or Denied.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "request approval state, currently Approved or Denied.")
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
    IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition ioK8sApiCertificatesV1beta1CertificateSigningRequestCondition = (IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition) o;
    return Objects.equals(this.lastUpdateTime, ioK8sApiCertificatesV1beta1CertificateSigningRequestCondition.lastUpdateTime) &&
        Objects.equals(this.message, ioK8sApiCertificatesV1beta1CertificateSigningRequestCondition.message) &&
        Objects.equals(this.reason, ioK8sApiCertificatesV1beta1CertificateSigningRequestCondition.reason) &&
        Objects.equals(this.type, ioK8sApiCertificatesV1beta1CertificateSigningRequestCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, message, reason, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCertificatesV1beta1CertificateSigningRequestCondition {\n");
    
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

