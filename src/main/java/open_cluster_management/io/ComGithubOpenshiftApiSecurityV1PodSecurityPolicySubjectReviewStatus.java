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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApiCoreV1PodTemplateSpec;

/**
 * PodSecurityPolicySubjectReviewStatus contains information/status for PodSecurityPolicySubjectReview.
 */
@ApiModel(description = "PodSecurityPolicySubjectReviewStatus contains information/status for PodSecurityPolicySubjectReview.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus {
  @SerializedName("allowedBy")
  private IoK8sApiCoreV1ObjectReference allowedBy = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("template")
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  public ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus allowedBy(IoK8sApiCoreV1ObjectReference allowedBy) {
    this.allowedBy = allowedBy;
    return this;
  }

   /**
   * allowedBy is a reference to the rule that allows the PodTemplateSpec. A rule can be a SecurityContextConstraint or a PodSecurityPolicy A &#x60;nil&#x60;, indicates that it was denied.
   * @return allowedBy
  **/
  @ApiModelProperty(value = "allowedBy is a reference to the rule that allows the PodTemplateSpec. A rule can be a SecurityContextConstraint or a PodSecurityPolicy A `nil`, indicates that it was denied.")
  public IoK8sApiCoreV1ObjectReference getAllowedBy() {
    return allowedBy;
  }

  public void setAllowedBy(IoK8sApiCoreV1ObjectReference allowedBy) {
    this.allowedBy = allowedBy;
  }

  public ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * A machine-readable description of why this operation is in the \&quot;Failure\&quot; status. If this value is empty there is no information available.
   * @return reason
  **/
  @ApiModelProperty(value = "A machine-readable description of why this operation is in the \"Failure\" status. If this value is empty there is no information available.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * template is the PodTemplateSpec after the defaulting is applied.
   * @return template
  **/
  @ApiModelProperty(value = "template is the PodTemplateSpec after the defaulting is applied.")
  public IoK8sApiCoreV1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus comGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus = (ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus) o;
    return Objects.equals(this.allowedBy, comGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus.allowedBy) &&
        Objects.equals(this.reason, comGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus.reason) &&
        Objects.equals(this.template, comGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedBy, reason, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiSecurityV1PodSecurityPolicySubjectReviewStatus {\n");
    
    sb.append("    allowedBy: ").append(toIndentedString(allowedBy)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

