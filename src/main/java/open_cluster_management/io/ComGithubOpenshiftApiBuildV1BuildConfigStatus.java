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
 * BuildConfigStatus contains current state of the build config object.
 */
@ApiModel(description = "BuildConfigStatus contains current state of the build config object.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BuildConfigStatus {
  @SerializedName("lastVersion")
  private Long lastVersion = null;

  public ComGithubOpenshiftApiBuildV1BuildConfigStatus lastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
    return this;
  }

   /**
   * lastVersion is used to inform about number of last triggered build.
   * @return lastVersion
  **/
  @ApiModelProperty(required = true, value = "lastVersion is used to inform about number of last triggered build.")
  public Long getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BuildConfigStatus comGithubOpenshiftApiBuildV1BuildConfigStatus = (ComGithubOpenshiftApiBuildV1BuildConfigStatus) o;
    return Objects.equals(this.lastVersion, comGithubOpenshiftApiBuildV1BuildConfigStatus.lastVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BuildConfigStatus {\n");
    
    sb.append("    lastVersion: ").append(toIndentedString(lastVersion)).append("\n");
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

