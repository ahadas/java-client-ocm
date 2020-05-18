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
import java.util.ArrayList;
import java.util.List;
import open_cluster_management.io.IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA;

/**
 * DefaultProxy contains the default proxy settings for all build operations, including image pull/push and source download.   Values can be overrode by setting the &#x60;HTTP_PROXY&#x60;, &#x60;HTTPS_PROXY&#x60;, and &#x60;NO_PROXY&#x60; environment variables in the build config&#39;s strategy.
 */
@ApiModel(description = "DefaultProxy contains the default proxy settings for all build operations, including image pull/push and source download.   Values can be overrode by setting the `HTTP_PROXY`, `HTTPS_PROXY`, and `NO_PROXY` environment variables in the build config's strategy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy {
  @SerializedName("httpProxy")
  private String httpProxy = null;

  @SerializedName("httpsProxy")
  private String httpsProxy = null;

  @SerializedName("noProxy")
  private String noProxy = null;

  @SerializedName("readinessEndpoints")
  private List<String> readinessEndpoints = null;

  @SerializedName("trustedCA")
  private IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA trustedCA = null;

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

   /**
   * httpProxy is the URL of the proxy for HTTP requests.  Empty means unset and will not result in an env var.
   * @return httpProxy
  **/
  @ApiModelProperty(value = "httpProxy is the URL of the proxy for HTTP requests.  Empty means unset and will not result in an env var.")
  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

   /**
   * httpsProxy is the URL of the proxy for HTTPS requests.  Empty means unset and will not result in an env var.
   * @return httpsProxy
  **/
  @ApiModelProperty(value = "httpsProxy is the URL of the proxy for HTTPS requests.  Empty means unset and will not result in an env var.")
  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

   /**
   * noProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in an env var.
   * @return noProxy
  **/
  @ApiModelProperty(value = "noProxy is a comma-separated list of hostnames and/or CIDRs for which the proxy should not be used. Empty means unset and will not result in an env var.")
  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy readinessEndpoints(List<String> readinessEndpoints) {
    this.readinessEndpoints = readinessEndpoints;
    return this;
  }

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy addReadinessEndpointsItem(String readinessEndpointsItem) {
    if (this.readinessEndpoints == null) {
      this.readinessEndpoints = new ArrayList<>();
    }
    this.readinessEndpoints.add(readinessEndpointsItem);
    return this;
  }

   /**
   * readinessEndpoints is a list of endpoints used to verify readiness of the proxy.
   * @return readinessEndpoints
  **/
  @ApiModelProperty(value = "readinessEndpoints is a list of endpoints used to verify readiness of the proxy.")
  public List<String> getReadinessEndpoints() {
    return readinessEndpoints;
  }

  public void setReadinessEndpoints(List<String> readinessEndpoints) {
    this.readinessEndpoints = readinessEndpoints;
  }

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy trustedCA(IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA trustedCA) {
    this.trustedCA = trustedCA;
    return this;
  }

   /**
   * Get trustedCA
   * @return trustedCA
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA getTrustedCA() {
    return trustedCA;
  }

  public void setTrustedCA(IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA trustedCA) {
    this.trustedCA = trustedCA;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy = (IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy) o;
    return Objects.equals(this.httpProxy, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.httpProxy) &&
        Objects.equals(this.httpsProxy, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.httpsProxy) &&
        Objects.equals(this.noProxy, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.noProxy) &&
        Objects.equals(this.readinessEndpoints, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.readinessEndpoints) &&
        Objects.equals(this.trustedCA, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy.trustedCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpProxy, httpsProxy, noProxy, readinessEndpoints, trustedCA);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxy {\n");
    
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpsProxy: ").append(toIndentedString(httpsProxy)).append("\n");
    sb.append("    noProxy: ").append(toIndentedString(noProxy)).append("\n");
    sb.append("    readinessEndpoints: ").append(toIndentedString(readinessEndpoints)).append("\n");
    sb.append("    trustedCA: ").append(toIndentedString(trustedCA)).append("\n");
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
