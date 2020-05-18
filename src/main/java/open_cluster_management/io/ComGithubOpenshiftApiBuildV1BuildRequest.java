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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BinaryBuildSource;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BuildTriggerCause;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1DockerStrategyOptions;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1SourceRevision;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1SourceStrategyOptions;
import open_cluster_management.io.IoK8sApiCoreV1EnvVar;
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * BuildRequest is the resource used to pass parameters to build generator
 */
@ApiModel(description = "BuildRequest is the resource used to pass parameters to build generator")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BuildRequest {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("binary")
  private ComGithubOpenshiftApiBuildV1BinaryBuildSource binary = null;

  @SerializedName("dockerStrategyOptions")
  private ComGithubOpenshiftApiBuildV1DockerStrategyOptions dockerStrategyOptions = null;

  @SerializedName("env")
  private List<IoK8sApiCoreV1EnvVar> env = null;

  @SerializedName("from")
  private IoK8sApiCoreV1ObjectReference from = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("lastVersion")
  private Long lastVersion = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("revision")
  private ComGithubOpenshiftApiBuildV1SourceRevision revision = null;

  @SerializedName("sourceStrategyOptions")
  private ComGithubOpenshiftApiBuildV1SourceStrategyOptions sourceStrategyOptions = null;

  @SerializedName("triggeredBy")
  private List<ComGithubOpenshiftApiBuildV1BuildTriggerCause> triggeredBy = new ArrayList<>();

  @SerializedName("triggeredByImage")
  private IoK8sApiCoreV1ObjectReference triggeredByImage = null;

  public ComGithubOpenshiftApiBuildV1BuildRequest apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiBuildV1BuildRequest binary(ComGithubOpenshiftApiBuildV1BinaryBuildSource binary) {
    this.binary = binary;
    return this;
  }

   /**
   * binary indicates a request to build from a binary provided to the builder
   * @return binary
  **/
  @ApiModelProperty(value = "binary indicates a request to build from a binary provided to the builder")
  public ComGithubOpenshiftApiBuildV1BinaryBuildSource getBinary() {
    return binary;
  }

  public void setBinary(ComGithubOpenshiftApiBuildV1BinaryBuildSource binary) {
    this.binary = binary;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest dockerStrategyOptions(ComGithubOpenshiftApiBuildV1DockerStrategyOptions dockerStrategyOptions) {
    this.dockerStrategyOptions = dockerStrategyOptions;
    return this;
  }

   /**
   * DockerStrategyOptions contains additional docker-strategy specific options for the build
   * @return dockerStrategyOptions
  **/
  @ApiModelProperty(value = "DockerStrategyOptions contains additional docker-strategy specific options for the build")
  public ComGithubOpenshiftApiBuildV1DockerStrategyOptions getDockerStrategyOptions() {
    return dockerStrategyOptions;
  }

  public void setDockerStrategyOptions(ComGithubOpenshiftApiBuildV1DockerStrategyOptions dockerStrategyOptions) {
    this.dockerStrategyOptions = dockerStrategyOptions;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest addEnvItem(IoK8sApiCoreV1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * env contains additional environment variables you want to pass into a builder container.
   * @return env
  **/
  @ApiModelProperty(value = "env contains additional environment variables you want to pass into a builder container.")
  public List<IoK8sApiCoreV1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest from(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
    return this;
  }

   /**
   * from is the reference to the ImageStreamTag that triggered the build.
   * @return from
  **/
  @ApiModelProperty(value = "from is the reference to the ImageStreamTag that triggered the build.")
  public IoK8sApiCoreV1ObjectReference getFrom() {
    return from;
  }

  public void setFrom(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest kind(String kind) {
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

  public ComGithubOpenshiftApiBuildV1BuildRequest lastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * lastVersion (optional) is the LastVersion of the BuildConfig that was used to generate the build. If the BuildConfig in the generator doesn&#39;t match, a build will not be generated.
   * @return lastVersion
  **/
  @ApiModelProperty(value = "lastVersion (optional) is the LastVersion of the BuildConfig that was used to generate the build. If the BuildConfig in the generator doesn't match, a build will not be generated.")
  public Long getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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

  public ComGithubOpenshiftApiBuildV1BuildRequest revision(ComGithubOpenshiftApiBuildV1SourceRevision revision) {
    this.revision = revision;
    return this;
  }

   /**
   * revision is the information from the source for a specific repo snapshot.
   * @return revision
  **/
  @ApiModelProperty(value = "revision is the information from the source for a specific repo snapshot.")
  public ComGithubOpenshiftApiBuildV1SourceRevision getRevision() {
    return revision;
  }

  public void setRevision(ComGithubOpenshiftApiBuildV1SourceRevision revision) {
    this.revision = revision;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest sourceStrategyOptions(ComGithubOpenshiftApiBuildV1SourceStrategyOptions sourceStrategyOptions) {
    this.sourceStrategyOptions = sourceStrategyOptions;
    return this;
  }

   /**
   * SourceStrategyOptions contains additional source-strategy specific options for the build
   * @return sourceStrategyOptions
  **/
  @ApiModelProperty(value = "SourceStrategyOptions contains additional source-strategy specific options for the build")
  public ComGithubOpenshiftApiBuildV1SourceStrategyOptions getSourceStrategyOptions() {
    return sourceStrategyOptions;
  }

  public void setSourceStrategyOptions(ComGithubOpenshiftApiBuildV1SourceStrategyOptions sourceStrategyOptions) {
    this.sourceStrategyOptions = sourceStrategyOptions;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest triggeredBy(List<ComGithubOpenshiftApiBuildV1BuildTriggerCause> triggeredBy) {
    this.triggeredBy = triggeredBy;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest addTriggeredByItem(ComGithubOpenshiftApiBuildV1BuildTriggerCause triggeredByItem) {
    this.triggeredBy.add(triggeredByItem);
    return this;
  }

   /**
   * triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers.
   * @return triggeredBy
  **/
  @ApiModelProperty(required = true, value = "triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers.")
  public List<ComGithubOpenshiftApiBuildV1BuildTriggerCause> getTriggeredBy() {
    return triggeredBy;
  }

  public void setTriggeredBy(List<ComGithubOpenshiftApiBuildV1BuildTriggerCause> triggeredBy) {
    this.triggeredBy = triggeredBy;
  }

  public ComGithubOpenshiftApiBuildV1BuildRequest triggeredByImage(IoK8sApiCoreV1ObjectReference triggeredByImage) {
    this.triggeredByImage = triggeredByImage;
    return this;
  }

   /**
   * triggeredByImage is the Image that triggered this build.
   * @return triggeredByImage
  **/
  @ApiModelProperty(value = "triggeredByImage is the Image that triggered this build.")
  public IoK8sApiCoreV1ObjectReference getTriggeredByImage() {
    return triggeredByImage;
  }

  public void setTriggeredByImage(IoK8sApiCoreV1ObjectReference triggeredByImage) {
    this.triggeredByImage = triggeredByImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BuildRequest comGithubOpenshiftApiBuildV1BuildRequest = (ComGithubOpenshiftApiBuildV1BuildRequest) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiBuildV1BuildRequest.apiVersion) &&
        Objects.equals(this.binary, comGithubOpenshiftApiBuildV1BuildRequest.binary) &&
        Objects.equals(this.dockerStrategyOptions, comGithubOpenshiftApiBuildV1BuildRequest.dockerStrategyOptions) &&
        Objects.equals(this.env, comGithubOpenshiftApiBuildV1BuildRequest.env) &&
        Objects.equals(this.from, comGithubOpenshiftApiBuildV1BuildRequest.from) &&
        Objects.equals(this.kind, comGithubOpenshiftApiBuildV1BuildRequest.kind) &&
        Objects.equals(this.lastVersion, comGithubOpenshiftApiBuildV1BuildRequest.lastVersion) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiBuildV1BuildRequest.metadata) &&
        Objects.equals(this.revision, comGithubOpenshiftApiBuildV1BuildRequest.revision) &&
        Objects.equals(this.sourceStrategyOptions, comGithubOpenshiftApiBuildV1BuildRequest.sourceStrategyOptions) &&
        Objects.equals(this.triggeredBy, comGithubOpenshiftApiBuildV1BuildRequest.triggeredBy) &&
        Objects.equals(this.triggeredByImage, comGithubOpenshiftApiBuildV1BuildRequest.triggeredByImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, binary, dockerStrategyOptions, env, from, kind, lastVersion, metadata, revision, sourceStrategyOptions, triggeredBy, triggeredByImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BuildRequest {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    dockerStrategyOptions: ").append(toIndentedString(dockerStrategyOptions)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    sourceStrategyOptions: ").append(toIndentedString(sourceStrategyOptions)).append("\n");
    sb.append("    triggeredBy: ").append(toIndentedString(triggeredBy)).append("\n");
    sb.append("    triggeredByImage: ").append(toIndentedString(triggeredByImage)).append("\n");
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
