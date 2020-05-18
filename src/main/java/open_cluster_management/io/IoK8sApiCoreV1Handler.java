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
import open_cluster_management.io.IoK8sApiCoreV1ExecAction;
import open_cluster_management.io.IoK8sApiCoreV1HTTPGetAction;
import open_cluster_management.io.IoK8sApiCoreV1TCPSocketAction;

/**
 * Handler defines a specific action that should be taken
 */
@ApiModel(description = "Handler defines a specific action that should be taken")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1Handler {
  @SerializedName("exec")
  private IoK8sApiCoreV1ExecAction exec = null;

  @SerializedName("httpGet")
  private IoK8sApiCoreV1HTTPGetAction httpGet = null;

  @SerializedName("tcpSocket")
  private IoK8sApiCoreV1TCPSocketAction tcpSocket = null;

  public IoK8sApiCoreV1Handler exec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

   /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   * @return exec
  **/
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  public IoK8sApiCoreV1ExecAction getExec() {
    return exec;
  }

  public void setExec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
  }

  public IoK8sApiCoreV1Handler httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * HTTPGet specifies the http request to perform.
   * @return httpGet
  **/
  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  public IoK8sApiCoreV1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public IoK8sApiCoreV1Handler tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
   * @return tcpSocket
  **/
  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported")
  public IoK8sApiCoreV1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Handler ioK8sApiCoreV1Handler = (IoK8sApiCoreV1Handler) o;
    return Objects.equals(this.exec, ioK8sApiCoreV1Handler.exec) &&
        Objects.equals(this.httpGet, ioK8sApiCoreV1Handler.httpGet) &&
        Objects.equals(this.tcpSocket, ioK8sApiCoreV1Handler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Handler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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
