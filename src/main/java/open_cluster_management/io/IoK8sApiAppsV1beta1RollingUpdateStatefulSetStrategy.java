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
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 */
@ApiModel(description = "RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy {
  @SerializedName("partition")
  private Integer partition = null;

  public IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy partition(Integer partition) {
    this.partition = partition;
    return this;
  }

   /**
   * Partition indicates the ordinal at which the StatefulSet should be partitioned.
   * @return partition
  **/
  @ApiModelProperty(value = "Partition indicates the ordinal at which the StatefulSet should be partitioned.")
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy ioK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy = (IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy) o;
    return Objects.equals(this.partition, ioK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy.partition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1beta1RollingUpdateStatefulSetStrategy {\n");
    
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
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
