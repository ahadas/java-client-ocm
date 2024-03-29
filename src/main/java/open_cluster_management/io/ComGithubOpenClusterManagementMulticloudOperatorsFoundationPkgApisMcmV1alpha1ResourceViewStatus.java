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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition;
import open_cluster_management.io.IoK8sApimachineryPkgRuntimeRawExtension;

/**
 * ResourceViewStatus describes the status of view
 */
@ApiModel(description = "ResourceViewStatus describes the status of view")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus {
  @SerializedName("conditions")
  private List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition> conditions = null;

  @SerializedName("results")
  private Map<String, IoK8sApimachineryPkgRuntimeRawExtension> results = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus conditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus addConditionsItem(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ViewCondition> conditions) {
    this.conditions = conditions;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus results(Map<String, IoK8sApimachineryPkgRuntimeRawExtension> results) {
    this.results = results;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus putResultsItem(String key, IoK8sApimachineryPkgRuntimeRawExtension resultsItem) {
    if (this.results == null) {
      this.results = new HashMap<>();
    }
    this.results.put(key, resultsItem);
    return this;
  }

   /**
   * Works point to the related work result on each cluster
   * @return results
  **/
  @ApiModelProperty(value = "Works point to the related work result on each cluster")
  public Map<String, IoK8sApimachineryPkgRuntimeRawExtension> getResults() {
    return results;
  }

  public void setResults(Map<String, IoK8sApimachineryPkgRuntimeRawExtension> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus) o;
    return Objects.equals(this.conditions, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus.conditions) &&
        Objects.equals(this.results, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceViewStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

