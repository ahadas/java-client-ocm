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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BitbucketWebHookCause;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1GenericWebHookCause;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1GitHubWebHookCause;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1GitLabWebHookCause;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1ImageChangeCause;

/**
 * BuildTriggerCause holds information about a triggered build. It is used for displaying build trigger data for each build and build configuration in oc describe. It is also used to describe which triggers led to the most recent update in the build configuration.
 */
@ApiModel(description = "BuildTriggerCause holds information about a triggered build. It is used for displaying build trigger data for each build and build configuration in oc describe. It is also used to describe which triggers led to the most recent update in the build configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BuildTriggerCause {
  @SerializedName("bitbucketWebHook")
  private ComGithubOpenshiftApiBuildV1BitbucketWebHookCause bitbucketWebHook = null;

  @SerializedName("genericWebHook")
  private ComGithubOpenshiftApiBuildV1GenericWebHookCause genericWebHook = null;

  @SerializedName("githubWebHook")
  private ComGithubOpenshiftApiBuildV1GitHubWebHookCause githubWebHook = null;

  @SerializedName("gitlabWebHook")
  private ComGithubOpenshiftApiBuildV1GitLabWebHookCause gitlabWebHook = null;

  @SerializedName("imageChangeBuild")
  private ComGithubOpenshiftApiBuildV1ImageChangeCause imageChangeBuild = null;

  @SerializedName("message")
  private String message = null;

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause bitbucketWebHook(ComGithubOpenshiftApiBuildV1BitbucketWebHookCause bitbucketWebHook) {
    this.bitbucketWebHook = bitbucketWebHook;
    return this;
  }

   /**
   * BitbucketWebHook represents data for a Bitbucket webhook that fired a specific build.
   * @return bitbucketWebHook
  **/
  @ApiModelProperty(value = "BitbucketWebHook represents data for a Bitbucket webhook that fired a specific build.")
  public ComGithubOpenshiftApiBuildV1BitbucketWebHookCause getBitbucketWebHook() {
    return bitbucketWebHook;
  }

  public void setBitbucketWebHook(ComGithubOpenshiftApiBuildV1BitbucketWebHookCause bitbucketWebHook) {
    this.bitbucketWebHook = bitbucketWebHook;
  }

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause genericWebHook(ComGithubOpenshiftApiBuildV1GenericWebHookCause genericWebHook) {
    this.genericWebHook = genericWebHook;
    return this;
  }

   /**
   * genericWebHook holds data about a builds generic webhook trigger.
   * @return genericWebHook
  **/
  @ApiModelProperty(value = "genericWebHook holds data about a builds generic webhook trigger.")
  public ComGithubOpenshiftApiBuildV1GenericWebHookCause getGenericWebHook() {
    return genericWebHook;
  }

  public void setGenericWebHook(ComGithubOpenshiftApiBuildV1GenericWebHookCause genericWebHook) {
    this.genericWebHook = genericWebHook;
  }

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause githubWebHook(ComGithubOpenshiftApiBuildV1GitHubWebHookCause githubWebHook) {
    this.githubWebHook = githubWebHook;
    return this;
  }

   /**
   * gitHubWebHook represents data for a GitHub webhook that fired a specific build.
   * @return githubWebHook
  **/
  @ApiModelProperty(value = "gitHubWebHook represents data for a GitHub webhook that fired a specific build.")
  public ComGithubOpenshiftApiBuildV1GitHubWebHookCause getGithubWebHook() {
    return githubWebHook;
  }

  public void setGithubWebHook(ComGithubOpenshiftApiBuildV1GitHubWebHookCause githubWebHook) {
    this.githubWebHook = githubWebHook;
  }

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause gitlabWebHook(ComGithubOpenshiftApiBuildV1GitLabWebHookCause gitlabWebHook) {
    this.gitlabWebHook = gitlabWebHook;
    return this;
  }

   /**
   * GitLabWebHook represents data for a GitLab webhook that fired a specific build.
   * @return gitlabWebHook
  **/
  @ApiModelProperty(value = "GitLabWebHook represents data for a GitLab webhook that fired a specific build.")
  public ComGithubOpenshiftApiBuildV1GitLabWebHookCause getGitlabWebHook() {
    return gitlabWebHook;
  }

  public void setGitlabWebHook(ComGithubOpenshiftApiBuildV1GitLabWebHookCause gitlabWebHook) {
    this.gitlabWebHook = gitlabWebHook;
  }

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause imageChangeBuild(ComGithubOpenshiftApiBuildV1ImageChangeCause imageChangeBuild) {
    this.imageChangeBuild = imageChangeBuild;
    return this;
  }

   /**
   * imageChangeBuild stores information about an imagechange event that triggered a new build.
   * @return imageChangeBuild
  **/
  @ApiModelProperty(value = "imageChangeBuild stores information about an imagechange event that triggered a new build.")
  public ComGithubOpenshiftApiBuildV1ImageChangeCause getImageChangeBuild() {
    return imageChangeBuild;
  }

  public void setImageChangeBuild(ComGithubOpenshiftApiBuildV1ImageChangeCause imageChangeBuild) {
    this.imageChangeBuild = imageChangeBuild;
  }

  public ComGithubOpenshiftApiBuildV1BuildTriggerCause message(String message) {
    this.message = message;
    return this;
  }

   /**
   * message is used to store a human readable message for why the build was triggered. E.g.: \&quot;Manually triggered by user\&quot;, \&quot;Configuration change\&quot;,etc.
   * @return message
  **/
  @ApiModelProperty(value = "message is used to store a human readable message for why the build was triggered. E.g.: \"Manually triggered by user\", \"Configuration change\",etc.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BuildTriggerCause comGithubOpenshiftApiBuildV1BuildTriggerCause = (ComGithubOpenshiftApiBuildV1BuildTriggerCause) o;
    return Objects.equals(this.bitbucketWebHook, comGithubOpenshiftApiBuildV1BuildTriggerCause.bitbucketWebHook) &&
        Objects.equals(this.genericWebHook, comGithubOpenshiftApiBuildV1BuildTriggerCause.genericWebHook) &&
        Objects.equals(this.githubWebHook, comGithubOpenshiftApiBuildV1BuildTriggerCause.githubWebHook) &&
        Objects.equals(this.gitlabWebHook, comGithubOpenshiftApiBuildV1BuildTriggerCause.gitlabWebHook) &&
        Objects.equals(this.imageChangeBuild, comGithubOpenshiftApiBuildV1BuildTriggerCause.imageChangeBuild) &&
        Objects.equals(this.message, comGithubOpenshiftApiBuildV1BuildTriggerCause.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitbucketWebHook, genericWebHook, githubWebHook, gitlabWebHook, imageChangeBuild, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BuildTriggerCause {\n");
    
    sb.append("    bitbucketWebHook: ").append(toIndentedString(bitbucketWebHook)).append("\n");
    sb.append("    genericWebHook: ").append(toIndentedString(genericWebHook)).append("\n");
    sb.append("    githubWebHook: ").append(toIndentedString(githubWebHook)).append("\n");
    sb.append("    gitlabWebHook: ").append(toIndentedString(gitlabWebHook)).append("\n");
    sb.append("    imageChangeBuild: ").append(toIndentedString(imageChangeBuild)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

