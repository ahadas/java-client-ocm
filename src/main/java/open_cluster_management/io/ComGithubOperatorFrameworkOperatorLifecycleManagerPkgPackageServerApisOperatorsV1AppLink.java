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
 * AppLink defines a link to an application
 */
@ApiModel(description = "AppLink defines a link to an application")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink {
  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink = (ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink) o;
    return Objects.equals(this.name, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink.name) &&
        Objects.equals(this.url, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisOperatorsV1AppLink {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

