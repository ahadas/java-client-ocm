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
 * GitBuildSource defines the parameters of a Git SCM
 */
@ApiModel(description = "GitBuildSource defines the parameters of a Git SCM")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1GitBuildSource {
  @SerializedName("httpProxy")
  private String httpProxy = null;

  @SerializedName("httpsProxy")
  private String httpsProxy = null;

  @SerializedName("noProxy")
  private String noProxy = null;

  @SerializedName("ref")
  private String ref = null;

  @SerializedName("uri")
  private String uri = null;

  public ComGithubOpenshiftApiBuildV1GitBuildSource httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

   /**
   * httpProxy is a proxy used to reach the git repository over http
   * @return httpProxy
  **/
  @ApiModelProperty(value = "httpProxy is a proxy used to reach the git repository over http")
  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }

  public ComGithubOpenshiftApiBuildV1GitBuildSource httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

   /**
   * httpsProxy is a proxy used to reach the git repository over https
   * @return httpsProxy
  **/
  @ApiModelProperty(value = "httpsProxy is a proxy used to reach the git repository over https")
  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }

  public ComGithubOpenshiftApiBuildV1GitBuildSource noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

   /**
   * noProxy is the list of domains for which the proxy should not be used
   * @return noProxy
  **/
  @ApiModelProperty(value = "noProxy is the list of domains for which the proxy should not be used")
  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }

  public ComGithubOpenshiftApiBuildV1GitBuildSource ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * ref is the branch/tag/ref to build.
   * @return ref
  **/
  @ApiModelProperty(value = "ref is the branch/tag/ref to build.")
  public String getRef() {
    return ref;
  }

  public void setRef(String ref) {
    this.ref = ref;
  }

  public ComGithubOpenshiftApiBuildV1GitBuildSource uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * uri points to the source that will be built. The structure of the source will depend on the type of build to run
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "uri points to the source that will be built. The structure of the source will depend on the type of build to run")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1GitBuildSource comGithubOpenshiftApiBuildV1GitBuildSource = (ComGithubOpenshiftApiBuildV1GitBuildSource) o;
    return Objects.equals(this.httpProxy, comGithubOpenshiftApiBuildV1GitBuildSource.httpProxy) &&
        Objects.equals(this.httpsProxy, comGithubOpenshiftApiBuildV1GitBuildSource.httpsProxy) &&
        Objects.equals(this.noProxy, comGithubOpenshiftApiBuildV1GitBuildSource.noProxy) &&
        Objects.equals(this.ref, comGithubOpenshiftApiBuildV1GitBuildSource.ref) &&
        Objects.equals(this.uri, comGithubOpenshiftApiBuildV1GitBuildSource.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpProxy, httpsProxy, noProxy, ref, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1GitBuildSource {\n");
    
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpsProxy: ").append(toIndentedString(httpsProxy)).append("\n");
    sb.append("    noProxy: ").append(toIndentedString(noProxy)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

