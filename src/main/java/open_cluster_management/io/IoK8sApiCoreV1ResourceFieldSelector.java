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

/**
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 */
@ApiModel(description = "ResourceFieldSelector represents container resources (cpu, memory) and their output format")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1ResourceFieldSelector {
  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("divisor")
  private String divisor = null;

  @SerializedName("resource")
  private String resource = null;

  public IoK8sApiCoreV1ResourceFieldSelector containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Container name: required for volumes, optional for env vars
   * @return containerName
  **/
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public IoK8sApiCoreV1ResourceFieldSelector divisor(String divisor) {
    this.divisor = divisor;
    return this;
  }

   /**
   * Specifies the output format of the exposed resources, defaults to \&quot;1\&quot;
   * @return divisor
  **/
  @ApiModelProperty(value = "Specifies the output format of the exposed resources, defaults to \"1\"")
  public String getDivisor() {
    return divisor;
  }

  public void setDivisor(String divisor) {
    this.divisor = divisor;
  }

  public IoK8sApiCoreV1ResourceFieldSelector resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Required: resource to select
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "Required: resource to select")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ResourceFieldSelector ioK8sApiCoreV1ResourceFieldSelector = (IoK8sApiCoreV1ResourceFieldSelector) o;
    return Objects.equals(this.containerName, ioK8sApiCoreV1ResourceFieldSelector.containerName) &&
        Objects.equals(this.divisor, ioK8sApiCoreV1ResourceFieldSelector.divisor) &&
        Objects.equals(this.resource, ioK8sApiCoreV1ResourceFieldSelector.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceFieldSelector {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

