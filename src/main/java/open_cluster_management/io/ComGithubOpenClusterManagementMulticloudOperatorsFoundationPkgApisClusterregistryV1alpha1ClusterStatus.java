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
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition;

/**
 * ClusterStatus contains the status of a cluster.
 */
@ApiModel(description = "ClusterStatus contains the status of a cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus {
  @SerializedName("conditions")
  private List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition> conditions = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus conditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus addConditionsItem(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions contains the different condition statuses for this cluster.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions contains the different condition statuses for this cluster.")
  public List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus) o;
    return Objects.equals(this.conditions, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisClusterregistryV1alpha1ClusterStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

