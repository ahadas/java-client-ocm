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
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 */
@ApiModel(description = "PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta1PodsMetricStatus {
  @SerializedName("currentAverageValue")
  private String currentAverageValue = null;

  @SerializedName("metricName")
  private String metricName = null;

  @SerializedName("selector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus currentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
    return this;
  }

   /**
   * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
   * @return currentAverageValue
  **/
  @ApiModelProperty(required = true, value = "currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)")
  public String getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(String currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus metricName(String metricName) {
    this.metricName = metricName;
    return this;
  }

   /**
   * metricName is the name of the metric in question
   * @return metricName
  **/
  @ApiModelProperty(required = true, value = "metricName is the name of the metric in question")
  public String getMetricName() {
    return metricName;
  }

  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }

  public IoK8sApiAutoscalingV2beta1PodsMetricStatus selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
   * @return selector
  **/
  @ApiModelProperty(value = "selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta1PodsMetricStatus ioK8sApiAutoscalingV2beta1PodsMetricStatus = (IoK8sApiAutoscalingV2beta1PodsMetricStatus) o;
    return Objects.equals(this.currentAverageValue, ioK8sApiAutoscalingV2beta1PodsMetricStatus.currentAverageValue) &&
        Objects.equals(this.metricName, ioK8sApiAutoscalingV2beta1PodsMetricStatus.metricName) &&
        Objects.equals(this.selector, ioK8sApiAutoscalingV2beta1PodsMetricStatus.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAverageValue, metricName, selector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta1PodsMetricStatus {\n");
    
    sb.append("    currentAverageValue: ").append(toIndentedString(currentAverageValue)).append("\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

