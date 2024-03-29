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
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 */
@ApiModel(description = "Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1Probe {
  @SerializedName("exec")
  private IoK8sApiCoreV1ExecAction exec = null;

  @SerializedName("failureThreshold")
  private Integer failureThreshold = null;

  @SerializedName("httpGet")
  private IoK8sApiCoreV1HTTPGetAction httpGet = null;

  @SerializedName("initialDelaySeconds")
  private Integer initialDelaySeconds = null;

  @SerializedName("periodSeconds")
  private Integer periodSeconds = null;

  @SerializedName("successThreshold")
  private Integer successThreshold = null;

  @SerializedName("tcpSocket")
  private IoK8sApiCoreV1TCPSocketAction tcpSocket = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  public IoK8sApiCoreV1Probe exec(IoK8sApiCoreV1ExecAction exec) {
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

  public IoK8sApiCoreV1Probe failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * @return failureThreshold
  **/
  @ApiModelProperty(value = "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public IoK8sApiCoreV1Probe httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
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

  public IoK8sApiCoreV1Probe initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return initialDelaySeconds
  **/
  @ApiModelProperty(value = "Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public IoK8sApiCoreV1Probe periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   * @return periodSeconds
  **/
  @ApiModelProperty(value = "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public IoK8sApiCoreV1Probe successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.
   * @return successThreshold
  **/
  @ApiModelProperty(value = "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1.")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public IoK8sApiCoreV1Probe tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
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

  public IoK8sApiCoreV1Probe timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return timeoutSeconds
  **/
  @ApiModelProperty(value = "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Probe ioK8sApiCoreV1Probe = (IoK8sApiCoreV1Probe) o;
    return Objects.equals(this.exec, ioK8sApiCoreV1Probe.exec) &&
        Objects.equals(this.failureThreshold, ioK8sApiCoreV1Probe.failureThreshold) &&
        Objects.equals(this.httpGet, ioK8sApiCoreV1Probe.httpGet) &&
        Objects.equals(this.initialDelaySeconds, ioK8sApiCoreV1Probe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, ioK8sApiCoreV1Probe.periodSeconds) &&
        Objects.equals(this.successThreshold, ioK8sApiCoreV1Probe.successThreshold) &&
        Objects.equals(this.tcpSocket, ioK8sApiCoreV1Probe.tcpSocket) &&
        Objects.equals(this.timeoutSeconds, ioK8sApiCoreV1Probe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Probe {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

