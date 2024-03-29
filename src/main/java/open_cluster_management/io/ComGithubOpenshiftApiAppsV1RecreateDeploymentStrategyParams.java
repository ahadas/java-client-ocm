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
import open_cluster_management.io.ComGithubOpenshiftApiAppsV1LifecycleHook;

/**
 * RecreateDeploymentStrategyParams are the input to the Recreate deployment strategy.
 */
@ApiModel(description = "RecreateDeploymentStrategyParams are the input to the Recreate deployment strategy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams {
  @SerializedName("mid")
  private ComGithubOpenshiftApiAppsV1LifecycleHook mid = null;

  @SerializedName("post")
  private ComGithubOpenshiftApiAppsV1LifecycleHook post = null;

  @SerializedName("pre")
  private ComGithubOpenshiftApiAppsV1LifecycleHook pre = null;

  @SerializedName("timeoutSeconds")
  private Long timeoutSeconds = null;

  public ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams mid(ComGithubOpenshiftApiAppsV1LifecycleHook mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Mid is a lifecycle hook which is executed while the deployment is scaled down to zero before the first new pod is created. All LifecycleHookFailurePolicy values are supported.
   * @return mid
  **/
  @ApiModelProperty(value = "Mid is a lifecycle hook which is executed while the deployment is scaled down to zero before the first new pod is created. All LifecycleHookFailurePolicy values are supported.")
  public ComGithubOpenshiftApiAppsV1LifecycleHook getMid() {
    return mid;
  }

  public void setMid(ComGithubOpenshiftApiAppsV1LifecycleHook mid) {
    this.mid = mid;
  }

  public ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams post(ComGithubOpenshiftApiAppsV1LifecycleHook post) {
    this.post = post;
    return this;
  }

   /**
   * Post is a lifecycle hook which is executed after the strategy has finished all deployment logic. All LifecycleHookFailurePolicy values are supported.
   * @return post
  **/
  @ApiModelProperty(value = "Post is a lifecycle hook which is executed after the strategy has finished all deployment logic. All LifecycleHookFailurePolicy values are supported.")
  public ComGithubOpenshiftApiAppsV1LifecycleHook getPost() {
    return post;
  }

  public void setPost(ComGithubOpenshiftApiAppsV1LifecycleHook post) {
    this.post = post;
  }

  public ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams pre(ComGithubOpenshiftApiAppsV1LifecycleHook pre) {
    this.pre = pre;
    return this;
  }

   /**
   * Pre is a lifecycle hook which is executed before the strategy manipulates the deployment. All LifecycleHookFailurePolicy values are supported.
   * @return pre
  **/
  @ApiModelProperty(value = "Pre is a lifecycle hook which is executed before the strategy manipulates the deployment. All LifecycleHookFailurePolicy values are supported.")
  public ComGithubOpenshiftApiAppsV1LifecycleHook getPre() {
    return pre;
  }

  public void setPre(ComGithubOpenshiftApiAppsV1LifecycleHook pre) {
    this.pre = pre;
  }

  public ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds is the time to wait for updates before giving up. If the value is nil, a default will be used.
   * @return timeoutSeconds
  **/
  @ApiModelProperty(value = "TimeoutSeconds is the time to wait for updates before giving up. If the value is nil, a default will be used.")
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams comGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams = (ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams) o;
    return Objects.equals(this.mid, comGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams.mid) &&
        Objects.equals(this.post, comGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams.post) &&
        Objects.equals(this.pre, comGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams.pre) &&
        Objects.equals(this.timeoutSeconds, comGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid, post, pre, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1RecreateDeploymentStrategyParams {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    pre: ").append(toIndentedString(pre)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

