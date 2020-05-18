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
import open_cluster_management.io.ComGithubOpenshiftApiAppsV1DeploymentConfigSpec;
import open_cluster_management.io.ComGithubOpenshiftApiAppsV1DeploymentConfigStatus;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * Deployment Configs define the template for a pod and manages deploying new images or configuration changes. A single deployment configuration is usually analogous to a single micro-service. Can support many different deployment patterns, including full restart, customizable rolling updates, and  fully custom behaviors, as well as pre- and post- deployment hooks. Each individual deployment is represented as a replication controller.  A deployment is \&quot;triggered\&quot; when its configuration is changed or a tag in an Image Stream is changed. Triggers can be disabled to allow manual control over a deployment. The \&quot;strategy\&quot; determines how the deployment is carried out and may be changed at any time. The &#x60;latestVersion&#x60; field is updated when a new deployment is triggered by any means.
 */
@ApiModel(description = "Deployment Configs define the template for a pod and manages deploying new images or configuration changes. A single deployment configuration is usually analogous to a single micro-service. Can support many different deployment patterns, including full restart, customizable rolling updates, and  fully custom behaviors, as well as pre- and post- deployment hooks. Each individual deployment is represented as a replication controller.  A deployment is \"triggered\" when its configuration is changed or a tag in an Image Stream is changed. Triggers can be disabled to allow manual control over a deployment. The \"strategy\" determines how the deployment is carried out and may be changed at any time. The `latestVersion` field is updated when a new deployment is triggered by any means.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1DeploymentConfig {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("spec")
  private ComGithubOpenshiftApiAppsV1DeploymentConfigSpec spec = null;

  @SerializedName("status")
  private ComGithubOpenshiftApiAppsV1DeploymentConfigStatus status = null;

  public ComGithubOpenshiftApiAppsV1DeploymentConfig apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiAppsV1DeploymentConfig kind(String kind) {
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

  public ComGithubOpenshiftApiAppsV1DeploymentConfig metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfig spec(ComGithubOpenshiftApiAppsV1DeploymentConfigSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Spec represents a desired deployment state and how to deploy to it.
   * @return spec
  **/
  @ApiModelProperty(required = true, value = "Spec represents a desired deployment state and how to deploy to it.")
  public ComGithubOpenshiftApiAppsV1DeploymentConfigSpec getSpec() {
    return spec;
  }

  public void setSpec(ComGithubOpenshiftApiAppsV1DeploymentConfigSpec spec) {
    this.spec = spec;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfig status(ComGithubOpenshiftApiAppsV1DeploymentConfigStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status represents the current deployment state.
   * @return status
  **/
  @ApiModelProperty(value = "Status represents the current deployment state.")
  public ComGithubOpenshiftApiAppsV1DeploymentConfigStatus getStatus() {
    return status;
  }

  public void setStatus(ComGithubOpenshiftApiAppsV1DeploymentConfigStatus status) {
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
    ComGithubOpenshiftApiAppsV1DeploymentConfig comGithubOpenshiftApiAppsV1DeploymentConfig = (ComGithubOpenshiftApiAppsV1DeploymentConfig) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiAppsV1DeploymentConfig.apiVersion) &&
        Objects.equals(this.kind, comGithubOpenshiftApiAppsV1DeploymentConfig.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiAppsV1DeploymentConfig.metadata) &&
        Objects.equals(this.spec, comGithubOpenshiftApiAppsV1DeploymentConfig.spec) &&
        Objects.equals(this.status, comGithubOpenshiftApiAppsV1DeploymentConfig.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1DeploymentConfig {\n");
    
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

