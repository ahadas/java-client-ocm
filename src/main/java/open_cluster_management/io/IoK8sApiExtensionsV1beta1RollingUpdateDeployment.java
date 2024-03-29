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
 * Spec to control the desired behavior of rolling update.
 */
@ApiModel(description = "Spec to control the desired behavior of rolling update.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiExtensionsV1beta1RollingUpdateDeployment {
  @SerializedName("maxSurge")
  private String maxSurge = null;

  @SerializedName("maxUnavailable")
  private String maxUnavailable = null;

  public IoK8sApiExtensionsV1beta1RollingUpdateDeployment maxSurge(String maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

   /**
   * The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.
   * @return maxSurge
  **/
  @ApiModelProperty(value = "The maximum number of pods that can be scheduled above the desired number of pods. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0. Absolute number is calculated from percentage by rounding up. By default, a value of 1 is used. Example: when this is set to 30%, the new RC can be scaled up immediately when the rolling update starts, such that the total number of old and new pods do not exceed 130% of desired pods. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is at most 130% of desired pods.")
  public String getMaxSurge() {
    return maxSurge;
  }

  public void setMaxSurge(String maxSurge) {
    this.maxSurge = maxSurge;
  }

  public IoK8sApiExtensionsV1beta1RollingUpdateDeployment maxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.
   * @return maxUnavailable
  **/
  @ApiModelProperty(value = "The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. This can not be 0 if MaxSurge is 0. By default, a fixed value of 1 is used. Example: when this is set to 30%, the old RC can be scaled down to 70% of desired pods immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that the total number of pods available at all times during the update is at least 70% of desired pods.")
  public String getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiExtensionsV1beta1RollingUpdateDeployment ioK8sApiExtensionsV1beta1RollingUpdateDeployment = (IoK8sApiExtensionsV1beta1RollingUpdateDeployment) o;
    return Objects.equals(this.maxSurge, ioK8sApiExtensionsV1beta1RollingUpdateDeployment.maxSurge) &&
        Objects.equals(this.maxUnavailable, ioK8sApiExtensionsV1beta1RollingUpdateDeployment.maxUnavailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSurge, maxUnavailable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1RollingUpdateDeployment {\n");
    
    sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
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

