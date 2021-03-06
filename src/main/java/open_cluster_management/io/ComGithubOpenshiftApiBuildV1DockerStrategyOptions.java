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
import open_cluster_management.io.IoK8sApiCoreV1EnvVar;

/**
 * DockerStrategyOptions contains extra strategy options for container image builds
 */
@ApiModel(description = "DockerStrategyOptions contains extra strategy options for container image builds")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1DockerStrategyOptions {
  @SerializedName("buildArgs")
  private List<IoK8sApiCoreV1EnvVar> buildArgs = null;

  @SerializedName("noCache")
  private Boolean noCache = null;

  public ComGithubOpenshiftApiBuildV1DockerStrategyOptions buildArgs(List<IoK8sApiCoreV1EnvVar> buildArgs) {
    this.buildArgs = buildArgs;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1DockerStrategyOptions addBuildArgsItem(IoK8sApiCoreV1EnvVar buildArgsItem) {
    if (this.buildArgs == null) {
      this.buildArgs = new ArrayList<>();
    }
    this.buildArgs.add(buildArgsItem);
    return this;
  }

   /**
   * Args contains any build arguments that are to be passed to Docker.  See https://docs.docker.com/engine/reference/builder/#/arg for more details
   * @return buildArgs
  **/
  @ApiModelProperty(value = "Args contains any build arguments that are to be passed to Docker.  See https://docs.docker.com/engine/reference/builder/#/arg for more details")
  public List<IoK8sApiCoreV1EnvVar> getBuildArgs() {
    return buildArgs;
  }

  public void setBuildArgs(List<IoK8sApiCoreV1EnvVar> buildArgs) {
    this.buildArgs = buildArgs;
  }

  public ComGithubOpenshiftApiBuildV1DockerStrategyOptions noCache(Boolean noCache) {
    this.noCache = noCache;
    return this;
  }

   /**
   * noCache overrides the docker-strategy noCache option in the build config
   * @return noCache
  **/
  @ApiModelProperty(value = "noCache overrides the docker-strategy noCache option in the build config")
  public Boolean isNoCache() {
    return noCache;
  }

  public void setNoCache(Boolean noCache) {
    this.noCache = noCache;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1DockerStrategyOptions comGithubOpenshiftApiBuildV1DockerStrategyOptions = (ComGithubOpenshiftApiBuildV1DockerStrategyOptions) o;
    return Objects.equals(this.buildArgs, comGithubOpenshiftApiBuildV1DockerStrategyOptions.buildArgs) &&
        Objects.equals(this.noCache, comGithubOpenshiftApiBuildV1DockerStrategyOptions.noCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildArgs, noCache);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1DockerStrategyOptions {\n");
    
    sb.append("    buildArgs: ").append(toIndentedString(buildArgs)).append("\n");
    sb.append("    noCache: ").append(toIndentedString(noCache)).append("\n");
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

