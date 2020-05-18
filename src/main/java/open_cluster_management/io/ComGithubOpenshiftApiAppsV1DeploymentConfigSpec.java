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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComGithubOpenshiftApiAppsV1DeploymentStrategy;
import open_cluster_management.io.ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy;
import open_cluster_management.io.IoK8sApiCoreV1PodTemplateSpec;

/**
 * DeploymentConfigSpec represents the desired state of the deployment.
 */
@ApiModel(description = "DeploymentConfigSpec represents the desired state of the deployment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1DeploymentConfigSpec {
  @SerializedName("minReadySeconds")
  private Integer minReadySeconds = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private Map<String, String> selector = null;

  @SerializedName("strategy")
  private ComGithubOpenshiftApiAppsV1DeploymentStrategy strategy = null;

  @SerializedName("template")
  private IoK8sApiCoreV1PodTemplateSpec template = null;

  @SerializedName("test")
  private Boolean test = null;

  @SerializedName("triggers")
  private List<ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy> triggers = null;

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec minReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
    return this;
  }

   /**
   * MinReadySeconds is the minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
   * @return minReadySeconds
  **/
  @ApiModelProperty(value = "MinReadySeconds is the minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)")
  public Integer getMinReadySeconds() {
    return minReadySeconds;
  }

  public void setMinReadySeconds(Integer minReadySeconds) {
    this.minReadySeconds = minReadySeconds;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Paused indicates that the deployment config is paused resulting in no new deployments on template changes or changes in the template caused by other triggers.
   * @return paused
  **/
  @ApiModelProperty(value = "Paused indicates that the deployment config is paused resulting in no new deployments on template changes or changes in the template caused by other triggers.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the number of desired replicas.
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the number of desired replicas.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * RevisionHistoryLimit is the number of old ReplicationControllers to retain to allow for rollbacks. This field is a pointer to allow for differentiation between an explicit zero and not specified. Defaults to 10. (This only applies to DeploymentConfigs created via the new group API resource, not the legacy resource.)
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "RevisionHistoryLimit is the number of old ReplicationControllers to retain to allow for rollbacks. This field is a pointer to allow for differentiation between an explicit zero and not specified. Defaults to 10. (This only applies to DeploymentConfigs created via the new group API resource, not the legacy resource.)")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec putSelectorItem(String key, String selectorItem) {
    if (this.selector == null) {
      this.selector = new HashMap<>();
    }
    this.selector.put(key, selectorItem);
    return this;
  }

   /**
   * Selector is a label query over pods that should match the Replicas count.
   * @return selector
  **/
  @ApiModelProperty(value = "Selector is a label query over pods that should match the Replicas count.")
  public Map<String, String> getSelector() {
    return selector;
  }

  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec strategy(ComGithubOpenshiftApiAppsV1DeploymentStrategy strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Strategy describes how a deployment is executed.
   * @return strategy
  **/
  @ApiModelProperty(value = "Strategy describes how a deployment is executed.")
  public ComGithubOpenshiftApiAppsV1DeploymentStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(ComGithubOpenshiftApiAppsV1DeploymentStrategy strategy) {
    this.strategy = strategy;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec template(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
    return this;
  }

   /**
   * Template is the object that describes the pod that will be created if insufficient replicas are detected.
   * @return template
  **/
  @ApiModelProperty(value = "Template is the object that describes the pod that will be created if insufficient replicas are detected.")
  public IoK8sApiCoreV1PodTemplateSpec getTemplate() {
    return template;
  }

  public void setTemplate(IoK8sApiCoreV1PodTemplateSpec template) {
    this.template = template;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec test(Boolean test) {
    this.test = test;
    return this;
  }

   /**
   * Test ensures that this deployment config will have zero replicas except while a deployment is running. This allows the deployment config to be used as a continuous deployment test - triggering on images, running the deployment, and then succeeding or failing. Post strategy hooks and After actions can be used to integrate successful deployment with an action.
   * @return test
  **/
  @ApiModelProperty(value = "Test ensures that this deployment config will have zero replicas except while a deployment is running. This allows the deployment config to be used as a continuous deployment test - triggering on images, running the deployment, and then succeeding or failing. Post strategy hooks and After actions can be used to integrate successful deployment with an action.")
  public Boolean isTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec triggers(List<ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy> triggers) {
    this.triggers = triggers;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec addTriggersItem(ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy triggersItem) {
    if (this.triggers == null) {
      this.triggers = new ArrayList<>();
    }
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * Triggers determine how updates to a DeploymentConfig result in new deployments. If no triggers are defined, a new deployment can only occur as a result of an explicit client update to the DeploymentConfig with a new LatestVersion. If null, defaults to having a config change trigger.
   * @return triggers
  **/
  @ApiModelProperty(value = "Triggers determine how updates to a DeploymentConfig result in new deployments. If no triggers are defined, a new deployment can only occur as a result of an explicit client update to the DeploymentConfig with a new LatestVersion. If null, defaults to having a config change trigger.")
  public List<ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<ComGithubOpenshiftApiAppsV1DeploymentTriggerPolicy> triggers) {
    this.triggers = triggers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1DeploymentConfigSpec comGithubOpenshiftApiAppsV1DeploymentConfigSpec = (ComGithubOpenshiftApiAppsV1DeploymentConfigSpec) o;
    return Objects.equals(this.minReadySeconds, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.minReadySeconds) &&
        Objects.equals(this.paused, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.paused) &&
        Objects.equals(this.replicas, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.selector) &&
        Objects.equals(this.strategy, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.strategy) &&
        Objects.equals(this.template, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.template) &&
        Objects.equals(this.test, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.test) &&
        Objects.equals(this.triggers, comGithubOpenshiftApiAppsV1DeploymentConfigSpec.triggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minReadySeconds, paused, replicas, revisionHistoryLimit, selector, strategy, template, test, triggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1DeploymentConfigSpec {\n");
    
    sb.append("    minReadySeconds: ").append(toIndentedString(minReadySeconds)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

