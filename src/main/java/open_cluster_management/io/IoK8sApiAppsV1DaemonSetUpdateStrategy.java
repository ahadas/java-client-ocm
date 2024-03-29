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
import open_cluster_management.io.IoK8sApiAppsV1RollingUpdateDaemonSet;

/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 */
@ApiModel(description = "DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiAppsV1DaemonSetUpdateStrategy {
  @SerializedName("rollingUpdate")
  private IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiAppsV1DaemonSetUpdateStrategy rollingUpdate(IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Rolling update config params. Present only if type &#x3D; \&quot;RollingUpdate\&quot;.
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "Rolling update config params. Present only if type = \"RollingUpdate\".")
  public IoK8sApiAppsV1RollingUpdateDaemonSet getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(IoK8sApiAppsV1RollingUpdateDaemonSet rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public IoK8sApiAppsV1DaemonSetUpdateStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of daemon set update. Can be \&quot;RollingUpdate\&quot; or \&quot;OnDelete\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @ApiModelProperty(value = "Type of daemon set update. Can be \"RollingUpdate\" or \"OnDelete\". Default is RollingUpdate.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiAppsV1DaemonSetUpdateStrategy ioK8sApiAppsV1DaemonSetUpdateStrategy = (IoK8sApiAppsV1DaemonSetUpdateStrategy) o;
    return Objects.equals(this.rollingUpdate, ioK8sApiAppsV1DaemonSetUpdateStrategy.rollingUpdate) &&
        Objects.equals(this.type, ioK8sApiAppsV1DaemonSetUpdateStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiAppsV1DaemonSetUpdateStrategy {\n");
    
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

