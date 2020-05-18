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
import open_cluster_management.io.IoK8sApiAuthorizationV1beta1NonResourceRule;
import open_cluster_management.io.IoK8sApiAuthorizationV1beta1ResourceRule;

/**
 * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it&#39;s safe to assume the subject has that permission, even if that list is incomplete.
 */
@ApiModel(description = "SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus {
  @SerializedName("evaluationError")
  private String evaluationError = null;

  @SerializedName("incomplete")
  private Boolean incomplete = null;

  @SerializedName("nonResourceRules")
  private List<IoK8sApiAuthorizationV1beta1NonResourceRule> nonResourceRules = new ArrayList<>();

  @SerializedName("resourceRules")
  private List<IoK8sApiAuthorizationV1beta1ResourceRule> resourceRules = new ArrayList<>();

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus evaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
    return this;
  }

   /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
   * @return evaluationError
  **/
  @ApiModelProperty(value = "EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.")
  public String getEvaluationError() {
    return evaluationError;
  }

  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus incomplete(Boolean incomplete) {
    this.incomplete = incomplete;
    return this;
  }

   /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
   * @return incomplete
  **/
  @ApiModelProperty(required = true, value = "Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.")
  public Boolean isIncomplete() {
    return incomplete;
  }

  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus nonResourceRules(List<IoK8sApiAuthorizationV1beta1NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus addNonResourceRulesItem(IoK8sApiAuthorizationV1beta1NonResourceRule nonResourceRulesItem) {
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

   /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return nonResourceRules
  **/
  @ApiModelProperty(required = true, value = "NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
  public List<IoK8sApiAuthorizationV1beta1NonResourceRule> getNonResourceRules() {
    return nonResourceRules;
  }

  public void setNonResourceRules(List<IoK8sApiAuthorizationV1beta1NonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus resourceRules(List<IoK8sApiAuthorizationV1beta1ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
    return this;
  }

  public IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus addResourceRulesItem(IoK8sApiAuthorizationV1beta1ResourceRule resourceRulesItem) {
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

   /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return resourceRules
  **/
  @ApiModelProperty(required = true, value = "ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")
  public List<IoK8sApiAuthorizationV1beta1ResourceRule> getResourceRules() {
    return resourceRules;
  }

  public void setResourceRules(List<IoK8sApiAuthorizationV1beta1ResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus ioK8sApiAuthorizationV1beta1SubjectRulesReviewStatus = (IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus) o;
    return Objects.equals(this.evaluationError, ioK8sApiAuthorizationV1beta1SubjectRulesReviewStatus.evaluationError) &&
        Objects.equals(this.incomplete, ioK8sApiAuthorizationV1beta1SubjectRulesReviewStatus.incomplete) &&
        Objects.equals(this.nonResourceRules, ioK8sApiAuthorizationV1beta1SubjectRulesReviewStatus.nonResourceRules) &&
        Objects.equals(this.resourceRules, ioK8sApiAuthorizationV1beta1SubjectRulesReviewStatus.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationError, incomplete, nonResourceRules, resourceRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAuthorizationV1beta1SubjectRulesReviewStatus {\n");
    
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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

