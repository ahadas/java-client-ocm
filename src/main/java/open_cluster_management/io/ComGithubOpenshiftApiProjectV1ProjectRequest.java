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
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * ProjecRequest is the set of options necessary to fully qualify a project request
 */
@ApiModel(description = "ProjecRequest is the set of options necessary to fully qualify a project request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiProjectV1ProjectRequest {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  public ComGithubOpenshiftApiProjectV1ProjectRequest apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiProjectV1ProjectRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description is the description to apply to a project
   * @return description
  **/
  @ApiModelProperty(value = "Description is the description to apply to a project")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComGithubOpenshiftApiProjectV1ProjectRequest displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * DisplayName is the display name to apply to a project
   * @return displayName
  **/
  @ApiModelProperty(value = "DisplayName is the display name to apply to a project")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ComGithubOpenshiftApiProjectV1ProjectRequest kind(String kind) {
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

  public ComGithubOpenshiftApiProjectV1ProjectRequest metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiProjectV1ProjectRequest comGithubOpenshiftApiProjectV1ProjectRequest = (ComGithubOpenshiftApiProjectV1ProjectRequest) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiProjectV1ProjectRequest.apiVersion) &&
        Objects.equals(this.description, comGithubOpenshiftApiProjectV1ProjectRequest.description) &&
        Objects.equals(this.displayName, comGithubOpenshiftApiProjectV1ProjectRequest.displayName) &&
        Objects.equals(this.kind, comGithubOpenshiftApiProjectV1ProjectRequest.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiProjectV1ProjectRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, description, displayName, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiProjectV1ProjectRequest {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

