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
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1LabelSelector;

/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \&quot;target\&quot; type should be set.
 */
@ApiModel(description = "ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster). Exactly one \"target\" type should be set.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta1ExternalMetricSource {
  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("metricSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector = null;

  @SerializedName("targetAverageValue")
  private String targetAverageValue = null;

  @SerializedName("targetValue")
  private String targetValue = null;

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question.
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question.")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource metricSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
    return this;
  }

   /**
   * metricSelector is used to identify a specific time series within a given metric.
   * @return metricSelector
  **/
  @ApiModelProperty(value = "metricSelector is used to identify a specific time series within a given metric.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getMetricSelector() {
    return metricSelector;
  }

  public void setMetricSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector metricSelector) {
    this.metricSelector = metricSelector;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource targetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
    return this;
  }

   /**
   * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.
   * @return targetAverageValue
  **/
  @ApiModelProperty(value = "targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually exclusive with TargetValue.")
  public String getTargetAverageValue() {
    return targetAverageValue;
  }

  public void setTargetAverageValue(String targetAverageValue) {
    this.targetAverageValue = targetAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1ExternalMetricSource targetValue(String targetValue) {
    this.targetValue = targetValue;
    return this;
  }

   /**
   * targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.
   * @return targetValue
  **/
  @ApiModelProperty(value = "targetValue is the target value of the metric (as a quantity). Mutually exclusive with TargetAverageValue.")
  public String getTargetValue() {
    return targetValue;
  }

  public void setTargetValue(String targetValue) {
    this.targetValue = targetValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta1ExternalMetricSource ioK8sApiAutoscalingV2beta1ExternalMetricSource = (IoK8sApiAutoscalingV2beta1ExternalMetricSource) o;
    return Objects.equals(this.metricName, ioK8sApiAutoscalingV2beta1ExternalMetricSource.metricName) &&
        Objects.equals(this.metricSelector, ioK8sApiAutoscalingV2beta1ExternalMetricSource.metricSelector) &&
        Objects.equals(this.targetAverageValue, ioK8sApiAutoscalingV2beta1ExternalMetricSource.targetAverageValue) &&
        Objects.equals(this.targetValue, ioK8sApiAutoscalingV2beta1ExternalMetricSource.targetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, metricSelector, targetAverageValue, targetValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1ExternalMetricSource {\n");
    
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricSelector: ").append(toIndentedString(metricSelector)).append("\n");
    sb.append("    targetAverageValue: ").append(toIndentedString(targetAverageValue)).append("\n");
    sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
