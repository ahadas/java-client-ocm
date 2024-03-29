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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
@ApiModel(description = "EndpointAddress is a tuple that describes single IP address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1EndpointAddress {
  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("nodeName")
  private String nodeName = null;

  @SerializedName("targetRef")
  private IoK8sApiCoreV1ObjectReference targetRef = null;

  public IoK8sApiCoreV1EndpointAddress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * The Hostname of this endpoint
   * @return hostname
  **/
  @ApiModelProperty(value = "The Hostname of this endpoint")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public IoK8sApiCoreV1EndpointAddress ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public IoK8sApiCoreV1EndpointAddress nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
   * @return nodeName
  **/
  @ApiModelProperty(value = "Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.")
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public IoK8sApiCoreV1EndpointAddress targetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
    return this;
  }

   /**
   * Reference to object providing the endpoint.
   * @return targetRef
  **/
  @ApiModelProperty(value = "Reference to object providing the endpoint.")
  public IoK8sApiCoreV1ObjectReference getTargetRef() {
    return targetRef;
  }

  public void setTargetRef(IoK8sApiCoreV1ObjectReference targetRef) {
    this.targetRef = targetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EndpointAddress ioK8sApiCoreV1EndpointAddress = (IoK8sApiCoreV1EndpointAddress) o;
    return Objects.equals(this.hostname, ioK8sApiCoreV1EndpointAddress.hostname) &&
        Objects.equals(this.ip, ioK8sApiCoreV1EndpointAddress.ip) &&
        Objects.equals(this.nodeName, ioK8sApiCoreV1EndpointAddress.nodeName) &&
        Objects.equals(this.targetRef, ioK8sApiCoreV1EndpointAddress.targetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip, nodeName, targetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EndpointAddress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    targetRef: ").append(toIndentedString(targetRef)).append("\n");
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

