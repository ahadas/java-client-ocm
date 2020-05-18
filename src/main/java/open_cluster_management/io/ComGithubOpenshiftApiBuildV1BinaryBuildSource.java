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

/**
 * BinaryBuildSource describes a binary file to be used for the Docker and Source build strategies, where the file will be extracted and used as the build source.
 */
@ApiModel(description = "BinaryBuildSource describes a binary file to be used for the Docker and Source build strategies, where the file will be extracted and used as the build source.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BinaryBuildSource {
  @SerializedName("asFile")
  private String asFile = null;

  public ComGithubOpenshiftApiBuildV1BinaryBuildSource asFile(String asFile) {
    this.asFile = asFile;
    return this;
  }

   /**
   * asFile indicates that the provided binary input should be considered a single file within the build input. For example, specifying \&quot;webapp.war\&quot; would place the provided binary as &#x60;/webapp.war&#x60; for the builder. If left empty, the Docker and Source build strategies assume this file is a zip, tar, or tar.gz file and extract it as the source. The custom strategy receives this binary as standard input. This filename may not contain slashes or be &#39;..&#39; or &#39;.&#39;.
   * @return asFile
  **/
  @ApiModelProperty(value = "asFile indicates that the provided binary input should be considered a single file within the build input. For example, specifying \"webapp.war\" would place the provided binary as `/webapp.war` for the builder. If left empty, the Docker and Source build strategies assume this file is a zip, tar, or tar.gz file and extract it as the source. The custom strategy receives this binary as standard input. This filename may not contain slashes or be '..' or '.'.")
  public String getAsFile() {
    return asFile;
  }

  public void setAsFile(String asFile) {
    this.asFile = asFile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BinaryBuildSource comGithubOpenshiftApiBuildV1BinaryBuildSource = (ComGithubOpenshiftApiBuildV1BinaryBuildSource) o;
    return Objects.equals(this.asFile, comGithubOpenshiftApiBuildV1BinaryBuildSource.asFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asFile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BinaryBuildSource {\n");
    
    sb.append("    asFile: ").append(toIndentedString(asFile)).append("\n");
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

