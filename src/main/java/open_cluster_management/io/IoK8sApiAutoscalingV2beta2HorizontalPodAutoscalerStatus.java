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
import open_cluster_management.io.IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition;
import open_cluster_management.io.IoK8sApiAutoscalingV2beta2MetricStatus;

/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 */
@ApiModel(description = "HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus {
  @SerializedName("conditions")
  private List<IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition> conditions = new ArrayList<>();

  @SerializedName("currentMetrics")
  private List<IoK8sApiAutoscalingV2beta2MetricStatus> currentMetrics = null;

  @SerializedName("currentReplicas")
  private Integer currentReplicas = null;

  @SerializedName("desiredReplicas")
  private Integer desiredReplicas = null;

  @SerializedName("lastScaleTime")
  private String lastScaleTime = null;

  @SerializedName("observedGeneration")
  private Long observedGeneration = null;

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus conditions(List<IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus addConditionsItem(IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.")
  public List<IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus currentMetrics(List<IoK8sApiAutoscalingV2beta2MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
    return this;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus addCurrentMetricsItem(IoK8sApiAutoscalingV2beta2MetricStatus currentMetricsItem) {
    if (this.currentMetrics == null) {
      this.currentMetrics = new ArrayList<>();
    }
    this.currentMetrics.add(currentMetricsItem);
    return this;
  }

   /**
   * currentMetrics is the last read state of the metrics used by this autoscaler.
   * @return currentMetrics
  **/
  @ApiModelProperty(value = "currentMetrics is the last read state of the metrics used by this autoscaler.")
  public List<IoK8sApiAutoscalingV2beta2MetricStatus> getCurrentMetrics() {
    return currentMetrics;
  }

  public void setCurrentMetrics(List<IoK8sApiAutoscalingV2beta2MetricStatus> currentMetrics) {
    this.currentMetrics = currentMetrics;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus currentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
    return this;
  }

   /**
   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
   * @return currentReplicas
  **/
  @ApiModelProperty(required = true, value = "currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.")
  public Integer getCurrentReplicas() {
    return currentReplicas;
  }

  public void setCurrentReplicas(Integer currentReplicas) {
    this.currentReplicas = currentReplicas;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus desiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
    return this;
  }

   /**
   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
   * @return desiredReplicas
  **/
  @ApiModelProperty(required = true, value = "desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.")
  public Integer getDesiredReplicas() {
    return desiredReplicas;
  }

  public void setDesiredReplicas(Integer desiredReplicas) {
    this.desiredReplicas = desiredReplicas;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus lastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
    return this;
  }

   /**
   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
   * @return lastScaleTime
  **/
  @ApiModelProperty(value = "lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.")
  public String getLastScaleTime() {
    return lastScaleTime;
  }

  public void setLastScaleTime(String lastScaleTime) {
    this.lastScaleTime = lastScaleTime;
  }

  public IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus observedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

   /**
   * observedGeneration is the most recent generation observed by this autoscaler.
   * @return observedGeneration
  **/
  @ApiModelProperty(value = "observedGeneration is the most recent generation observed by this autoscaler.")
  public Long getObservedGeneration() {
    return observedGeneration;
  }

  public void setObservedGeneration(Long observedGeneration) {
    this.observedGeneration = observedGeneration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus = (IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus) o;
    return Objects.equals(this.conditions, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.conditions) &&
        Objects.equals(this.currentMetrics, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.currentMetrics) &&
        Objects.equals(this.currentReplicas, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.currentReplicas) &&
        Objects.equals(this.desiredReplicas, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.desiredReplicas) &&
        Objects.equals(this.lastScaleTime, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.lastScaleTime) &&
        Objects.equals(this.observedGeneration, ioK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus.observedGeneration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2HorizontalPodAutoscalerStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    currentMetrics: ").append(toIndentedString(currentMetrics)).append("\n");
    sb.append("    currentReplicas: ").append(toIndentedString(currentReplicas)).append("\n");
    sb.append("    desiredReplicas: ").append(toIndentedString(desiredReplicas)).append("\n");
    sb.append("    lastScaleTime: ").append(toIndentedString(lastScaleTime)).append("\n");
    sb.append("    observedGeneration: ").append(toIndentedString(observedGeneration)).append("\n");
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

