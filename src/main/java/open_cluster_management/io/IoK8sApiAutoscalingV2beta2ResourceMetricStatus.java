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
import open_cluster_management.io.IoK8sApiAutoscalingV2beta2MetricValueStatus;

/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \&quot;pods\&quot; source.
 */
@ApiModel(description = "ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAutoscalingV2beta2ResourceMetricStatus {
  @SerializedName("current")
  private IoK8sApiAutoscalingV2beta2MetricValueStatus current = null;

  @SerializedName("name")
  private String name = null;

  public IoK8sApiAutoscalingV2beta2ResourceMetricStatus current(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
    return this;
  }

   /**
   * current contains the current value for the given metric
   * @return current
  **/
  @ApiModelProperty(required = true, value = "current contains the current value for the given metric")
  public IoK8sApiAutoscalingV2beta2MetricValueStatus getCurrent() {
    return current;
  }

  public void setCurrent(IoK8sApiAutoscalingV2beta2MetricValueStatus current) {
    this.current = current;
  }

  public IoK8sApiAutoscalingV2beta2ResourceMetricStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the resource in question.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAutoscalingV2beta2ResourceMetricStatus ioK8sApiAutoscalingV2beta2ResourceMetricStatus = (IoK8sApiAutoscalingV2beta2ResourceMetricStatus) o;
    return Objects.equals(this.current, ioK8sApiAutoscalingV2beta2ResourceMetricStatus.current) &&
        Objects.equals(this.name, ioK8sApiAutoscalingV2beta2ResourceMetricStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAutoscalingV2beta2ResourceMetricStatus {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

