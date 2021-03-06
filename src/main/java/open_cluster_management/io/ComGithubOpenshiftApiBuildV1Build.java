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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BuildSpec;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BuildStatus;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * Build encapsulates the inputs needed to produce a new deployable image, as well as the status of the execution and a reference to the Pod which executed the build.
 */
@ApiModel(description = "Build encapsulates the inputs needed to produce a new deployable image, as well as the status of the execution and a reference to the Pod which executed the build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1Build {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("spec")
  private ComGithubOpenshiftApiBuildV1BuildSpec spec = null;

  @SerializedName("status")
  private ComGithubOpenshiftApiBuildV1BuildStatus status = null;

  public ComGithubOpenshiftApiBuildV1Build apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiBuildV1Build kind(String kind) {
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

  public ComGithubOpenshiftApiBuildV1Build metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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

  public ComGithubOpenshiftApiBuildV1Build spec(ComGithubOpenshiftApiBuildV1BuildSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * spec is all the inputs used to execute the build.
   * @return spec
  **/
  @ApiModelProperty(value = "spec is all the inputs used to execute the build.")
  public ComGithubOpenshiftApiBuildV1BuildSpec getSpec() {
    return spec;
  }

  public void setSpec(ComGithubOpenshiftApiBuildV1BuildSpec spec) {
    this.spec = spec;
  }

  public ComGithubOpenshiftApiBuildV1Build status(ComGithubOpenshiftApiBuildV1BuildStatus status) {
    this.status = status;
    return this;
  }

   /**
   * status is the current status of the build.
   * @return status
  **/
  @ApiModelProperty(value = "status is the current status of the build.")
  public ComGithubOpenshiftApiBuildV1BuildStatus getStatus() {
    return status;
  }

  public void setStatus(ComGithubOpenshiftApiBuildV1BuildStatus status) {
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
    ComGithubOpenshiftApiBuildV1Build comGithubOpenshiftApiBuildV1Build = (ComGithubOpenshiftApiBuildV1Build) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiBuildV1Build.apiVersion) &&
        Objects.equals(this.kind, comGithubOpenshiftApiBuildV1Build.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiBuildV1Build.metadata) &&
        Objects.equals(this.spec, comGithubOpenshiftApiBuildV1Build.spec) &&
        Objects.equals(this.status, comGithubOpenshiftApiBuildV1Build.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1Build {\n");
    
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

