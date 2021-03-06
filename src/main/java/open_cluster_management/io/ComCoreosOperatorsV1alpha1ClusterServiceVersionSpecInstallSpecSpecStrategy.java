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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategyRollingUpdate;

/**
 * The deployment strategy to use to replace existing pods with new ones.
 */
@ApiModel(description = "The deployment strategy to use to replace existing pods with new ones.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy {
  @SerializedName("rollingUpdate")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategyRollingUpdate rollingUpdate = null;

  @SerializedName("type")
  private String type = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy rollingUpdate(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategyRollingUpdate rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Get rollingUpdate
   * @return rollingUpdate
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategyRollingUpdate getRollingUpdate() {
    return rollingUpdate;
  }

  public void setRollingUpdate(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategyRollingUpdate rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of deployment. Can be \&quot;Recreate\&quot; or \&quot;RollingUpdate\&quot;. Default is RollingUpdate.
   * @return type
  **/
  @ApiModelProperty(value = "Type of deployment. Can be \"Recreate\" or \"RollingUpdate\". Default is RollingUpdate.")
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
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy) o;
    return Objects.equals(this.rollingUpdate, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy.rollingUpdate) &&
        Objects.equals(this.type, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollingUpdate, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecStrategy {\n");
    
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

