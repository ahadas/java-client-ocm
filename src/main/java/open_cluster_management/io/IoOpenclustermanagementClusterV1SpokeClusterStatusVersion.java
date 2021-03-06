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
 * Version represents the kubernetes version of the spoke cluster.
 */
@ApiModel(description = "Version represents the kubernetes version of the spoke cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenclustermanagementClusterV1SpokeClusterStatusVersion {
  @SerializedName("kubernetes")
  private String kubernetes = null;

  public IoOpenclustermanagementClusterV1SpokeClusterStatusVersion kubernetes(String kubernetes) {
    this.kubernetes = kubernetes;
    return this;
  }

   /**
   * Kubernetes is the kubernetes version of spoke cluster
   * @return kubernetes
  **/
  @ApiModelProperty(value = "Kubernetes is the kubernetes version of spoke cluster")
  public String getKubernetes() {
    return kubernetes;
  }

  public void setKubernetes(String kubernetes) {
    this.kubernetes = kubernetes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenclustermanagementClusterV1SpokeClusterStatusVersion ioOpenclustermanagementClusterV1SpokeClusterStatusVersion = (IoOpenclustermanagementClusterV1SpokeClusterStatusVersion) o;
    return Objects.equals(this.kubernetes, ioOpenclustermanagementClusterV1SpokeClusterStatusVersion.kubernetes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kubernetes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenclustermanagementClusterV1SpokeClusterStatusVersion {\n");
    
    sb.append("    kubernetes: ").append(toIndentedString(kubernetes)).append("\n");
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

