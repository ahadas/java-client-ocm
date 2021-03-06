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
 * RollingDeploymentStrategyParams are the input to the Rolling deployment strategy.
 */
@ApiModel(description = "RollingDeploymentStrategyParams are the input to the Rolling deployment strategy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams {
  @SerializedName("intervalSeconds")
  private Long intervalSeconds = null;

  @SerializedName("maxSurge")
  private String maxSurge = null;

  @SerializedName("maxUnavailable")
  private String maxUnavailable = null;

  @SerializedName("post")
  private ComGithubOpenshiftApiAppsV1LifecycleHook post = null;

  @SerializedName("pre")
  private ComGithubOpenshiftApiAppsV1LifecycleHook pre = null;

  @SerializedName("timeoutSeconds")
  private Long timeoutSeconds = null;

  @SerializedName("updatePeriodSeconds")
  private Long updatePeriodSeconds = null;

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams intervalSeconds(Long intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
    return this;
  }

   /**
   * IntervalSeconds is the time to wait between polling deployment status after update. If the value is nil, a default will be used.
   * @return intervalSeconds
  **/
  @ApiModelProperty(value = "IntervalSeconds is the time to wait between polling deployment status after update. If the value is nil, a default will be used.")
  public Long getIntervalSeconds() {
    return intervalSeconds;
  }

  public void setIntervalSeconds(Long intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams maxSurge(String maxSurge) {
    this.maxSurge = maxSurge;
    return this;
  }

   /**
   * MaxSurge is the maximum number of pods that can be scheduled above the original number of pods. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up.  This cannot be 0 if MaxUnavailable is 0. By default, 25% is used.  Example: when this is set to 30%, the new RC can be scaled up by 30% immediately when the rolling update starts. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is atmost 130% of original pods.
   * @return maxSurge
  **/
  @ApiModelProperty(value = "MaxSurge is the maximum number of pods that can be scheduled above the original number of pods. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up.  This cannot be 0 if MaxUnavailable is 0. By default, 25% is used.  Example: when this is set to 30%, the new RC can be scaled up by 30% immediately when the rolling update starts. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is atmost 130% of original pods.")
  public String getMaxSurge() {
    return maxSurge;
  }

  public void setMaxSurge(String maxSurge) {
    this.maxSurge = maxSurge;
  }

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams maxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
    return this;
  }

   /**
   * MaxUnavailable is the maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of update (ex: 10%). Absolute number is calculated from percentage by rounding down.  This cannot be 0 if MaxSurge is 0. By default, 25% is used.  Example: when this is set to 30%, the old RC can be scaled down by 30% immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that at least 70% of original number of pods are available at all times during the update.
   * @return maxUnavailable
  **/
  @ApiModelProperty(value = "MaxUnavailable is the maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of update (ex: 10%). Absolute number is calculated from percentage by rounding down.  This cannot be 0 if MaxSurge is 0. By default, 25% is used.  Example: when this is set to 30%, the old RC can be scaled down by 30% immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that at least 70% of original number of pods are available at all times during the update.")
  public String getMaxUnavailable() {
    return maxUnavailable;
  }

  public void setMaxUnavailable(String maxUnavailable) {
    this.maxUnavailable = maxUnavailable;
  }

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams post(ComGithubOpenshiftApiAppsV1LifecycleHook post) {
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

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams pre(ComGithubOpenshiftApiAppsV1LifecycleHook pre) {
    this.pre = pre;
    return this;
  }

   /**
   * Pre is a lifecycle hook which is executed before the deployment process begins. All LifecycleHookFailurePolicy values are supported.
   * @return pre
  **/
  @ApiModelProperty(value = "Pre is a lifecycle hook which is executed before the deployment process begins. All LifecycleHookFailurePolicy values are supported.")
  public ComGithubOpenshiftApiAppsV1LifecycleHook getPre() {
    return pre;
  }

  public void setPre(ComGithubOpenshiftApiAppsV1LifecycleHook pre) {
    this.pre = pre;
  }

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams timeoutSeconds(Long timeoutSeconds) {
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

  public ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams updatePeriodSeconds(Long updatePeriodSeconds) {
    this.updatePeriodSeconds = updatePeriodSeconds;
    return this;
  }

   /**
   * UpdatePeriodSeconds is the time to wait between individual pod updates. If the value is nil, a default will be used.
   * @return updatePeriodSeconds
  **/
  @ApiModelProperty(value = "UpdatePeriodSeconds is the time to wait between individual pod updates. If the value is nil, a default will be used.")
  public Long getUpdatePeriodSeconds() {
    return updatePeriodSeconds;
  }

  public void setUpdatePeriodSeconds(Long updatePeriodSeconds) {
    this.updatePeriodSeconds = updatePeriodSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams = (ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams) o;
    return Objects.equals(this.intervalSeconds, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.intervalSeconds) &&
        Objects.equals(this.maxSurge, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.maxSurge) &&
        Objects.equals(this.maxUnavailable, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.maxUnavailable) &&
        Objects.equals(this.post, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.post) &&
        Objects.equals(this.pre, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.pre) &&
        Objects.equals(this.timeoutSeconds, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.timeoutSeconds) &&
        Objects.equals(this.updatePeriodSeconds, comGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams.updatePeriodSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalSeconds, maxSurge, maxUnavailable, post, pre, timeoutSeconds, updatePeriodSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1RollingDeploymentStrategyParams {\n");
    
    sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
    sb.append("    maxSurge: ").append(toIndentedString(maxSurge)).append("\n");
    sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    pre: ").append(toIndentedString(pre)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
    sb.append("    updatePeriodSeconds: ").append(toIndentedString(updatePeriodSeconds)).append("\n");
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

