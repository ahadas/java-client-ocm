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
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter;
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1LabelSelector;

/**
 * ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec {
  @SerializedName("clusterConditions")
  private List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter> clusterConditions = null;

  @SerializedName("clusterLabels")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector clusterLabels = null;

  @SerializedName("clusterNames")
  private List<String> clusterNames = null;

  @SerializedName("clusterReplicas")
  private Integer clusterReplicas = null;

  @SerializedName("clusterSelector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector clusterSelector = null;

  @SerializedName("compliances")
  private List<String> compliances = null;

  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("resourceHint")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceHint = null;

  @SerializedName("resourceSelector")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceSelector = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec clusterConditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter> clusterConditions) {
    this.clusterConditions = clusterConditions;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec addClusterConditionsItem(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter clusterConditionsItem) {
    if (this.clusterConditions == null) {
      this.clusterConditions = new ArrayList<>();
    }
    this.clusterConditions.add(clusterConditionsItem);
    return this;
  }

   /**
   * Get clusterConditions
   * @return clusterConditions
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter> getClusterConditions() {
    return clusterConditions;
  }

  public void setClusterConditions(List<ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ClusterConditionFilter> clusterConditions) {
    this.clusterConditions = clusterConditions;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec clusterLabels(IoK8sApimachineryPkgApisMetaV1LabelSelector clusterLabels) {
    this.clusterLabels = clusterLabels;
    return this;
  }

   /**
   * Target Cluster is a selector of cluster
   * @return clusterLabels
  **/
  @ApiModelProperty(value = "Target Cluster is a selector of cluster")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getClusterLabels() {
    return clusterLabels;
  }

  public void setClusterLabels(IoK8sApimachineryPkgApisMetaV1LabelSelector clusterLabels) {
    this.clusterLabels = clusterLabels;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec clusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec addClusterNamesItem(String clusterNamesItem) {
    if (this.clusterNames == null) {
      this.clusterNames = new ArrayList<>();
    }
    this.clusterNames.add(clusterNamesItem);
    return this;
  }

   /**
   * Target Clusters
   * @return clusterNames
  **/
  @ApiModelProperty(value = "Target Clusters")
  public List<String> getClusterNames() {
    return clusterNames;
  }

  public void setClusterNames(List<String> clusterNames) {
    this.clusterNames = clusterNames;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec clusterReplicas(Integer clusterReplicas) {
    this.clusterReplicas = clusterReplicas;
    return this;
  }

   /**
   * ////////////////////////////////////////////////////////////////////////// number of replicas Application wants to
   * @return clusterReplicas
  **/
  @ApiModelProperty(value = "////////////////////////////////////////////////////////////////////////// number of replicas Application wants to")
  public Integer getClusterReplicas() {
    return clusterReplicas;
  }

  public void setClusterReplicas(Integer clusterReplicas) {
    this.clusterReplicas = clusterReplicas;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec clusterSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector clusterSelector) {
    this.clusterSelector = clusterSelector;
    return this;
  }

   /**
   * Deprecated since 3.1.2: replaced by resource hint
   * @return clusterSelector
  **/
  @ApiModelProperty(value = "Deprecated since 3.1.2: replaced by resource hint")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getClusterSelector() {
    return clusterSelector;
  }

  public void setClusterSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector clusterSelector) {
    this.clusterSelector = clusterSelector;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec compliances(List<String> compliances) {
    this.compliances = compliances;
    return this;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec addCompliancesItem(String compliancesItem) {
    if (this.compliances == null) {
      this.compliances = new ArrayList<>();
    }
    this.compliances.add(compliancesItem);
    return this;
  }

   /**
   * Set ComplianceFilters
   * @return compliances
  **/
  @ApiModelProperty(value = "Set ComplianceFilters")
  public List<String> getCompliances() {
    return compliances;
  }

  public void setCompliances(List<String> compliances) {
    this.compliances = compliances;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Deprecated since 3.1.2: replaced by ClusterReplicas
   * @return replicas
  **/
  @ApiModelProperty(value = "Deprecated since 3.1.2: replaced by ClusterReplicas")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec resourceHint(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceHint) {
    this.resourceHint = resourceHint;
    return this;
  }

   /**
   * Select Resource
   * @return resourceHint
  **/
  @ApiModelProperty(value = "Select Resource")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint getResourceHint() {
    return resourceHint;
  }

  public void setResourceHint(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceHint) {
    this.resourceHint = resourceHint;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec resourceSelector(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceSelector) {
    this.resourceSelector = resourceSelector;
    return this;
  }

   /**
   * Deprecated since 3.1.2: replaced by resource hint
   * @return resourceSelector
  **/
  @ApiModelProperty(value = "Deprecated since 3.1.2: replaced by resource hint")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint getResourceSelector() {
    return resourceSelector;
  }

  public void setResourceSelector(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceHint resourceSelector) {
    this.resourceSelector = resourceSelector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec) o;
    return Objects.equals(this.clusterConditions, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.clusterConditions) &&
        Objects.equals(this.clusterLabels, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.clusterLabels) &&
        Objects.equals(this.clusterNames, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.clusterNames) &&
        Objects.equals(this.clusterReplicas, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.clusterReplicas) &&
        Objects.equals(this.clusterSelector, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.clusterSelector) &&
        Objects.equals(this.compliances, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.compliances) &&
        Objects.equals(this.replicas, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.replicas) &&
        Objects.equals(this.resourceHint, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.resourceHint) &&
        Objects.equals(this.resourceSelector, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec.resourceSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterConditions, clusterLabels, clusterNames, clusterReplicas, clusterSelector, compliances, replicas, resourceHint, resourceSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1PlacementPolicySpec {\n");
    
    sb.append("    clusterConditions: ").append(toIndentedString(clusterConditions)).append("\n");
    sb.append("    clusterLabels: ").append(toIndentedString(clusterLabels)).append("\n");
    sb.append("    clusterNames: ").append(toIndentedString(clusterNames)).append("\n");
    sb.append("    clusterReplicas: ").append(toIndentedString(clusterReplicas)).append("\n");
    sb.append("    clusterSelector: ").append(toIndentedString(clusterSelector)).append("\n");
    sb.append("    compliances: ").append(toIndentedString(compliances)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    resourceHint: ").append(toIndentedString(resourceHint)).append("\n");
    sb.append("    resourceSelector: ").append(toIndentedString(resourceSelector)).append("\n");
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
