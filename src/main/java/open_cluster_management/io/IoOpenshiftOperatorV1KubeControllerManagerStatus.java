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
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigStatusConditions;
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations;
import open_cluster_management.io.IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses;

/**
 * status is the most recently observed status of the Kubernetes Controller Manager
 */
@ApiModel(description = "status is the most recently observed status of the Kubernetes Controller Manager")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorV1KubeControllerManagerStatus {
  @SerializedName("conditions")
  private List<IoOpenshiftOperatorImageregistryV1ConfigStatusConditions> conditions = null;

  @SerializedName("generations")
  private List<IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations> generations = null;

  @SerializedName("latestAvailableRevision")
  private Integer latestAvailableRevision = null;

  @SerializedName("latestAvailableRevisionReason")
  private String latestAvailableRevisionReason = null;

  @SerializedName("nodeStatuses")
  private List<IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses> nodeStatuses = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  @SerializedName("readyReplicas")
  private Integer readyReplicas = null;

  @SerializedName("version")
  private String version = null;

  public IoOpenshiftOperatorV1KubeControllerManagerStatus conditions(List<IoOpenshiftOperatorImageregistryV1ConfigStatusConditions> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus addConditionsItem(IoOpenshiftOperatorImageregistryV1ConfigStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions is a list of conditions and their status
   * @return conditions
  **/
  @ApiModelProperty(value = "conditions is a list of conditions and their status")
  public List<IoOpenshiftOperatorImageregistryV1ConfigStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoOpenshiftOperatorImageregistryV1ConfigStatusConditions> conditions) {
    this.conditions = conditions;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus generations(List<IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations> generations) {
    this.generations = generations;
    return this;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus addGenerationsItem(IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations generationsItem) {
    if (this.generations == null) {
      this.generations = new ArrayList<>();
    }
    this.generations.add(generationsItem);
    return this;
  }

   /**
   * generations are used to determine when an item needs to be reconciled or has changed in a way that needs a reaction.
   * @return generations
  **/
  @ApiModelProperty(value = "generations are used to determine when an item needs to be reconciled or has changed in a way that needs a reaction.")
  public List<IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations> getGenerations() {
    return generations;
  }

  public void setGenerations(List<IoOpenshiftOperatorImageregistryV1ConfigStatusGenerations> generations) {
    this.generations = generations;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus latestAvailableRevision(Integer latestAvailableRevision) {
    this.latestAvailableRevision = latestAvailableRevision;
    return this;
  }

   /**
   * latestAvailableRevision is the deploymentID of the most recent deployment
   * @return latestAvailableRevision
  **/
  @ApiModelProperty(value = "latestAvailableRevision is the deploymentID of the most recent deployment")
  public Integer getLatestAvailableRevision() {
    return latestAvailableRevision;
  }

  public void setLatestAvailableRevision(Integer latestAvailableRevision) {
    this.latestAvailableRevision = latestAvailableRevision;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus latestAvailableRevisionReason(String latestAvailableRevisionReason) {
    this.latestAvailableRevisionReason = latestAvailableRevisionReason;
    return this;
  }

   /**
   * latestAvailableRevisionReason describe the detailed reason for the most recent deployment
   * @return latestAvailableRevisionReason
  **/
  @ApiModelProperty(value = "latestAvailableRevisionReason describe the detailed reason for the most recent deployment")
  public String getLatestAvailableRevisionReason() {
    return latestAvailableRevisionReason;
  }

  public void setLatestAvailableRevisionReason(String latestAvailableRevisionReason) {
    this.latestAvailableRevisionReason = latestAvailableRevisionReason;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus nodeStatuses(List<IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses> nodeStatuses) {
    this.nodeStatuses = nodeStatuses;
    return this;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus addNodeStatusesItem(IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses nodeStatusesItem) {
    if (this.nodeStatuses == null) {
      this.nodeStatuses = new ArrayList<>();
    }
    this.nodeStatuses.add(nodeStatusesItem);
    return this;
  }

   /**
   * nodeStatuses track the deployment values and errors across individual nodes
   * @return nodeStatuses
  **/
  @ApiModelProperty(value = "nodeStatuses track the deployment values and errors across individual nodes")
  public List<IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses> getNodeStatuses() {
    return nodeStatuses;
  }

  public void setNodeStatuses(List<IoOpenshiftOperatorV1KubeAPIServerStatusNodeStatuses> nodeStatuses) {
    this.nodeStatuses = nodeStatuses;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the last generation change you&#39;ve dealt with
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "observedGeneration is the last generation change you've dealt with")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus readyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
    return this;
  }

   /**
   * readyReplicas indicates how many replicas are ready and at the desired state
   * @return readyReplicas
  **/
  @ApiModelProperty(value = "readyReplicas indicates how many replicas are ready and at the desired state")
  public Integer getReadyReplicas() {
    return readyReplicas;
  }

  public void setReadyReplicas(Integer readyReplicas) {
    this.readyReplicas = readyReplicas;
  }

  public IoOpenshiftOperatorV1KubeControllerManagerStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * version is the level this availability applies to
   * @return version
  **/
  @ApiModelProperty(value = "version is the level this availability applies to")
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
    IoOpenshiftOperatorV1KubeControllerManagerStatus ioOpenshiftOperatorV1KubeControllerManagerStatus = (IoOpenshiftOperatorV1KubeControllerManagerStatus) o;
    return Objects.equals(this.conditions, ioOpenshiftOperatorV1KubeControllerManagerStatus.conditions) &&
        Objects.equals(this.generations, ioOpenshiftOperatorV1KubeControllerManagerStatus.generations) &&
        Objects.equals(this.latestAvailableRevision, ioOpenshiftOperatorV1KubeControllerManagerStatus.latestAvailableRevision) &&
        Objects.equals(this.latestAvailableRevisionReason, ioOpenshiftOperatorV1KubeControllerManagerStatus.latestAvailableRevisionReason) &&
        Objects.equals(this.nodeStatuses, ioOpenshiftOperatorV1KubeControllerManagerStatus.nodeStatuses) &&
        Objects.equals(this.observedGeneration, ioOpenshiftOperatorV1KubeControllerManagerStatus.observedGeneration) &&
        Objects.equals(this.readyReplicas, ioOpenshiftOperatorV1KubeControllerManagerStatus.readyReplicas) &&
        Objects.equals(this.version, ioOpenshiftOperatorV1KubeControllerManagerStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, generations, latestAvailableRevision, latestAvailableRevisionReason, nodeStatuses, observedGeneration, readyReplicas, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorV1KubeControllerManagerStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    generations: ").append(toIndentedString(generations)).append("\n");
    sb.append("    latestAvailableRevision: ").append(toIndentedString(latestAvailableRevision)).append("\n");
    sb.append("    latestAvailableRevisionReason: ").append(toIndentedString(latestAvailableRevisionReason)).append("\n");
    sb.append("    nodeStatuses: ").append(toIndentedString(nodeStatuses)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
    sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
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

