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

/**
 * Describe a container image
 */
@ApiModel(description = "Describe a container image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1ContainerImage {
  @SerializedName("names")
  private List<String> names = new ArrayList<>();

  @SerializedName("sizeBytes")
  private Long sizeBytes = null;

  public IoK8sApiCoreV1ContainerImage names(List<String> names) {
    this.names = names;
    return this;
  }

  public IoK8sApiCoreV1ContainerImage addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Names by which this image is known. e.g. [\&quot;k8s.gcr.io/hyperkube:v1.0.7\&quot;, \&quot;dockerhub.io/google_containers/hyperkube:v1.0.7\&quot;]
   * @return names
  **/
  @ApiModelProperty(required = true, value = "Names by which this image is known. e.g. [\"k8s.gcr.io/hyperkube:v1.0.7\", \"dockerhub.io/google_containers/hyperkube:v1.0.7\"]")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public IoK8sApiCoreV1ContainerImage sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

   /**
   * The size of the image in bytes.
   * @return sizeBytes
  **/
  @ApiModelProperty(value = "The size of the image in bytes.")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerImage ioK8sApiCoreV1ContainerImage = (IoK8sApiCoreV1ContainerImage) o;
    return Objects.equals(this.names, ioK8sApiCoreV1ContainerImage.names) &&
        Objects.equals(this.sizeBytes, ioK8sApiCoreV1ContainerImage.sizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, sizeBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerImage {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
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

