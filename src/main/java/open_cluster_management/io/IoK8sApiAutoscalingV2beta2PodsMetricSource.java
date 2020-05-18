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
import open_cluster_management.io.IoK8sApiAutoscalingV2beta2MetricIdentifier;
import open_cluster_management.io.IoK8sApiAutoscalingV2beta2MetricTarget;

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 */
@ApiModel(description = "PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta2PodsMetricSource {
  @SerializedName("metric")
  private IoK8sApiAutoscalingV2beta2MetricIdentifier metric = null;

  @SerializedName("target")
  private IoK8sApiAutoscalingV2beta2MetricTarget target = null;

  public IoK8sApiAutoscalingV2beta2PodsMetricSource metric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
    return this;
  }

   /**
   * metric identifies the target metric by name and selector
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "metric identifies the target metric by name and selector")
  public IoK8sApiAutoscalingV2beta2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(IoK8sApiAutoscalingV2beta2MetricIdentifier metric) {
    this.metric = metric;
  }

  public IoK8sApiAutoscalingV2beta2PodsMetricSource target(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
    return this;
  }

   /**
   * target specifies the target value for the given metric
   * @return target
  **/
  @ApiModelProperty(required = true, value = "target specifies the target value for the given metric")
  public IoK8sApiAutoscalingV2beta2MetricTarget getTarget() {
    return target;
  }

  public void setTarget(IoK8sApiAutoscalingV2beta2MetricTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta2PodsMetricSource ioK8sApiAutoscalingV2beta2PodsMetricSource = (IoK8sApiAutoscalingV2beta2PodsMetricSource) o;
    return Objects.equals(this.metric, ioK8sApiAutoscalingV2beta2PodsMetricSource.metric) &&
        Objects.equals(this.target, ioK8sApiAutoscalingV2beta2PodsMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2PodsMetricSource {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
