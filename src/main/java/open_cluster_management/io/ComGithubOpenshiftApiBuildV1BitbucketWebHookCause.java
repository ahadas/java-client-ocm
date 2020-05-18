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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1SourceRevision;

/**
 * BitbucketWebHookCause has information about a Bitbucket webhook that triggered a build.
 */
@ApiModel(description = "BitbucketWebHookCause has information about a Bitbucket webhook that triggered a build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BitbucketWebHookCause {
  @SerializedName("revision")
  private ComGithubOpenshiftApiBuildV1SourceRevision revision = null;

  @SerializedName("secret")
  private String secret = null;

  public ComGithubOpenshiftApiBuildV1BitbucketWebHookCause revision(ComGithubOpenshiftApiBuildV1SourceRevision revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision is the git source revision information of the trigger.
   * @return revision
  **/
  @ApiModelProperty(value = "Revision is the git source revision information of the trigger.")
  public ComGithubOpenshiftApiBuildV1SourceRevision getRevision() {
    return revision;
  }

  public void setRevision(ComGithubOpenshiftApiBuildV1SourceRevision revision) {
    this.revision = revision;
  }

  public ComGithubOpenshiftApiBuildV1BitbucketWebHookCause secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret is the obfuscated webhook secret that triggered a build.
   * @return secret
  **/
  @ApiModelProperty(value = "Secret is the obfuscated webhook secret that triggered a build.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BitbucketWebHookCause comGithubOpenshiftApiBuildV1BitbucketWebHookCause = (ComGithubOpenshiftApiBuildV1BitbucketWebHookCause) o;
    return Objects.equals(this.revision, comGithubOpenshiftApiBuildV1BitbucketWebHookCause.revision) &&
        Objects.equals(this.secret, comGithubOpenshiftApiBuildV1BitbucketWebHookCause.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BitbucketWebHookCause {\n");
    
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
