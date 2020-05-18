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
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequestSpec;
import open_cluster_management.io.ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinStatus;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

/**
 * ClusterJoinRequest is the request from klusterlet to join Manager
 */
@ApiModel(description = "ClusterJoinRequest is the request from klusterlet to join Manager")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("spec")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequestSpec spec = null;

  @SerializedName("status")
  private ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinStatus status = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest spec(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequestSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec defines the request to join hcm
   * @return spec
  **/
  @ApiModelProperty(value = "Spec defines the request to join hcm")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequestSpec getSpec() {
    return spec;
  }

  public void setSpec(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequestSpec spec) {
    this.spec = spec;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest status(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status defins the join status
   * @return status
  **/
  @ApiModelProperty(value = "Status defins the join status")
  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinStatus getStatus() {
    return status;
  }

  public void setStatus(ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest) o;
    return Objects.equals(this.apiVersion, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest.apiVersion) &&
        Objects.equals(this.kind, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest.kind) &&
        Objects.equals(this.metadata, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest.metadata) &&
        Objects.equals(this.spec, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest.spec) &&
        Objects.equals(this.status, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1beta1ClusterJoinRequest {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

