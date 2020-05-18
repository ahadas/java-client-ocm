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
import open_cluster_management.io.IoK8sApiExtensionsV1beta1HTTPIngressRuleValue;

/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 */
@ApiModel(description = "IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiExtensionsV1beta1IngressRule {
  @SerializedName("host")
  private String host = null;

  @SerializedName("http")
  private IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http = null;

  public IoK8sApiExtensionsV1beta1IngressRule host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \&quot;host\&quot; part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the    IP in the Spec of the parent Ingress. 2. The &#x60;:&#x60; delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
   * @return host
  **/
  @ApiModelProperty(value = "Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the \"host\" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the    IP in the Spec of the parent Ingress. 2. The `:` delimiter is not respected because ports are not allowed.    Currently the port of an Ingress is implicitly :80 for http and    :443 for https. Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public IoK8sApiExtensionsV1beta1IngressRule http(IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http) {
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @ApiModelProperty(value = "")
  public IoK8sApiExtensionsV1beta1HTTPIngressRuleValue getHttp() {
    return http;
  }

  public void setHttp(IoK8sApiExtensionsV1beta1HTTPIngressRuleValue http) {
    this.http = http;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiExtensionsV1beta1IngressRule ioK8sApiExtensionsV1beta1IngressRule = (IoK8sApiExtensionsV1beta1IngressRule) o;
    return Objects.equals(this.host, ioK8sApiExtensionsV1beta1IngressRule.host) &&
        Objects.equals(this.http, ioK8sApiExtensionsV1beta1IngressRule.http);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, http);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiExtensionsV1beta1IngressRule {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
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

