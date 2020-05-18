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
import open_cluster_management.io.IoK8sApiCoreV1PodTemplateSpec;
import open_cluster_management.io.IoK8sApiExtensionsV1beta1DeploymentStrategy;
import open_cluster_management.io.IoK8sApiExtensionsV1beta1RollbackConfig;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1LabelSelector;

/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 */
@ApiModel(description = "DeploymentSpec is the specification of the desired behavior of the Deployment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiExtensionsV1beta1DeploymentSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("progressDeadlineSeconds")
  private Integer progressDeadlineSeconds = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("rollbackTo")
  private IoK8sApiExtensionsV1beta1RollbackConfig rollbackTo = null;

  @SerializedName("selector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @SerializedName("strategy")
  private IoK8sApiExtensionsV1beta1DeploymentStrategy strategy = null;

  @SerializedName("template")
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  public IoK8sApiExtensionsV1beta1DeploymentSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Indicates that the deployment is paused and will not be processed by the deployment controller.
   * @return paused
  **/
  @ApiModelProperty(value = "Indicates that the deployment is paused and will not be processed by the deployment controller.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec progressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
    return this;
  }

   /**
   * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means \&quot;no deadline\&quot;.
   * @return progressDeadlineSeconds
  **/
  @ApiModelProperty(value = "The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. This is set to the max value of int32 (i.e. 2147483647) by default, which means \"no deadline\".")
  public Integer getProgressDeadlineSeconds() {
    return progressDeadlineSeconds;
  }

  public void setProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
    this.progressDeadlineSeconds = progressDeadlineSeconds;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means \&quot;retaining all old RelicaSets\&quot;.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. This is set to the max value of int32 (i.e. 2147483647) by default, which means \"retaining all old RelicaSets\".")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec rollbackTo(IoK8sApiExtensionsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
    return this;
  }

   /**
   * DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.
   * @return rollbackTo
  **/
  @ApiModelProperty(value = "DEPRECATED. The config this deployment is rolling back to. Will be cleared after rollback is done.")
  public IoK8sApiExtensionsV1beta1RollbackConfig getRollbackTo() {
    return rollbackTo;
  }

  public void setRollbackTo(IoK8sApiExtensionsV1beta1RollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.
   * @return selector
  **/
  @ApiModelProperty(value = "Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec strategy(IoK8sApiExtensionsV1beta1DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * The deployment strategy to use to replace existing pods with new ones.
   * @return strategy
  **/
  @ApiModelProperty(value = "The deployment strategy to use to replace existing pods with new ones.")
  public IoK8sApiExtensionsV1beta1DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(IoK8sApiExtensionsV1beta1DeploymentStrategy strategy) {
    this.strategy = strategy;
  }

  public IoK8sApiExtensionsV1beta1DeploymentSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the pods that will be created.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template describes the pods that will be created.")
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
    IoK8sApiExtensionsV1beta1DeploymentSpec ioK8sApiExtensionsV1beta1DeploymentSpec = (IoK8sApiExtensionsV1beta1DeploymentSpec) o;
    return Objects.equals(this.minReadySeconds, ioK8sApiExtensionsV1beta1DeploymentSpec.minReadySeconds) &&
        Objects.equals(this.paused, ioK8sApiExtensionsV1beta1DeploymentSpec.paused) &&
        Objects.equals(this.progressDeadlineSeconds, ioK8sApiExtensionsV1beta1DeploymentSpec.progressDeadlineSeconds) &&
        Objects.equals(this.replicas, ioK8sApiExtensionsV1beta1DeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, ioK8sApiExtensionsV1beta1DeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.rollbackTo, ioK8sApiExtensionsV1beta1DeploymentSpec.rollbackTo) &&
        Objects.equals(this.selector, ioK8sApiExtensionsV1beta1DeploymentSpec.selector) &&
        Objects.equals(this.strategy, ioK8sApiExtensionsV1beta1DeploymentSpec.strategy) &&
        Objects.equals(this.template, ioK8sApiExtensionsV1beta1DeploymentSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, rollbackTo, selector, strategy, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1DeploymentSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    progressDeadlineSeconds: ").append(toIndentedString(progressDeadlineSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    rollbackTo: ").append(toIndentedString(rollbackTo)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

