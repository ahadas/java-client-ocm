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
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec;
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec;
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter;
import open_cluster_management.io.IoK8sApiCoreV1LocalObjectReference;

/**
 * WorkSpec defines the work to be processes on a set of clusters
 */
@ApiModel(description = "WorkSpec defines the work to be processes on a set of clusters")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec {
  @SerializedName("actionType")
  private String actionType = null;

  @SerializedName("cluster")
  private IoK8sApiCoreV1LocalObjectReference cluster = null;

  @SerializedName("helm")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec helm = null;

  @SerializedName("kube")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec kube = null;

  @SerializedName("scope")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter scope = null;

  @SerializedName("type")
  private String type = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * ActionType is the type of the action
   * @return actionType
  **/
  @ApiModelProperty(value = "ActionType is the type of the action")
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec cluster(IoK8sApiCoreV1LocalObjectReference cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Cluster is a selector of cluster
   * @return cluster
  **/
  @ApiModelProperty(value = "Cluster is a selector of cluster")
  public IoK8sApiCoreV1LocalObjectReference getCluster() {
    return cluster;
  }

  public void setCluster(IoK8sApiCoreV1LocalObjectReference cluster) {
    this.cluster = cluster;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec helm(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec helm) {
    this.helm = helm;
    return this;
  }

   /**
   * HelmWork is the work to process helm operation
   * @return helm
  **/
  @ApiModelProperty(value = "HelmWork is the work to process helm operation")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec getHelm() {
    return helm;
  }

  public void setHelm(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec helm) {
    this.helm = helm;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec kube(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec kube) {
    this.kube = kube;
    return this;
  }

   /**
   * KubeWorkSpec is the work to process kubernetes operation
   * @return kube
  **/
  @ApiModelProperty(value = "KubeWorkSpec is the work to process kubernetes operation")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec getKube() {
    return kube;
  }

  public void setKube(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1KubeWorkSpec kube) {
    this.kube = kube;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec scope(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Scope is the scope of the work to be apply to in a cluster
   * @return scope
  **/
  @ApiModelProperty(value = "Scope is the scope of the work to be apply to in a cluster")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter getScope() {
    return scope;
  }

  public void setScope(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1ResourceFilter scope) {
    this.scope = scope;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type defins the type of the woke to be done
   * @return type
  **/
  @ApiModelProperty(value = "Type defins the type of the woke to be done")
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
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec) o;
    return Objects.equals(this.actionType, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.actionType) &&
        Objects.equals(this.cluster, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.cluster) &&
        Objects.equals(this.helm, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.helm) &&
        Objects.equals(this.kube, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.kube) &&
        Objects.equals(this.scope, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.scope) &&
        Objects.equals(this.type, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, cluster, helm, kube, scope, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1WorkSpec {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    helm: ").append(toIndentedString(helm)).append("\n");
    sb.append("    kube: ").append(toIndentedString(kube)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

