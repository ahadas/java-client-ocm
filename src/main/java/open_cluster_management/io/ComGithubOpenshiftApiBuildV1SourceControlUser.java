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
 * SourceControlUser defines the identity of a user of source control
 */
@ApiModel(description = "SourceControlUser defines the identity of a user of source control")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1SourceControlUser {
  @SerializedName("email")
  private String email = null;

  @SerializedName("name")
  private String name = null;

  public ComGithubOpenshiftApiBuildV1SourceControlUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * email of the source control user
   * @return email
  **/
  @ApiModelProperty(value = "email of the source control user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ComGithubOpenshiftApiBuildV1SourceControlUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of the source control user
   * @return name
  **/
  @ApiModelProperty(value = "name of the source control user")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1SourceControlUser comGithubOpenshiftApiBuildV1SourceControlUser = (ComGithubOpenshiftApiBuildV1SourceControlUser) o;
    return Objects.equals(this.email, comGithubOpenshiftApiBuildV1SourceControlUser.email) &&
        Objects.equals(this.name, comGithubOpenshiftApiBuildV1SourceControlUser.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1SourceControlUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

