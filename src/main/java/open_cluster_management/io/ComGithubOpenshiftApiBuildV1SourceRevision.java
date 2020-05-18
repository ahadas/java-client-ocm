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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1GitSourceRevision;

/**
 * SourceRevision is the revision or commit information from the source for the build
 */
@ApiModel(description = "SourceRevision is the revision or commit information from the source for the build")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1SourceRevision {
  @SerializedName("git")
  private ComGithubOpenshiftApiBuildV1GitSourceRevision git = null;

  @SerializedName("type")
  private String type = null;

  public ComGithubOpenshiftApiBuildV1SourceRevision git(ComGithubOpenshiftApiBuildV1GitSourceRevision git) {
    this.git = git;
    return this;
  }

   /**
   * Git contains information about git-based build source
   * @return git
  **/
  @ApiModelProperty(value = "Git contains information about git-based build source")
  public ComGithubOpenshiftApiBuildV1GitSourceRevision getGit() {
    return git;
  }

  public void setGit(ComGithubOpenshiftApiBuildV1GitSourceRevision git) {
    this.git = git;
  }

  public ComGithubOpenshiftApiBuildV1SourceRevision type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of the build source, may be one of &#39;Source&#39;, &#39;Dockerfile&#39;, &#39;Binary&#39;, or &#39;Images&#39;
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type of the build source, may be one of 'Source', 'Dockerfile', 'Binary', or 'Images'")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1SourceRevision comGithubOpenshiftApiBuildV1SourceRevision = (ComGithubOpenshiftApiBuildV1SourceRevision) o;
    return Objects.equals(this.git, comGithubOpenshiftApiBuildV1SourceRevision.git) &&
        Objects.equals(this.type, comGithubOpenshiftApiBuildV1SourceRevision.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(git, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1SourceRevision {\n");
    
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

