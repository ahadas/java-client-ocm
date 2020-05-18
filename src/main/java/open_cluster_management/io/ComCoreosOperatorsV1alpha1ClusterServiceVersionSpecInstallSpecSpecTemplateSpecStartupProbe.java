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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartExec;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartHttpGet;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartTcpSocket;

/**
 * StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod&#39;s lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is an alpha feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
 */
@ApiModel(description = "StartupProbe indicates that the Pod has successfully initialized. If specified, no other probes are executed until this completes successfully. If this probe fails, the Pod will be restarted, just as if the livenessProbe failed. This can be used to provide different probe parameters at the beginning of a Pod's lifecycle, when it might take a long time to load data or warm a cache, than during steady-state operation. This cannot be updated. This is an alpha feature enabled by the StartupProbe feature flag. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe {
  @SerializedName("exec")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartExec exec = null;

  @SerializedName("failureThreshold")
  private Integer failureThreshold = null;

  @SerializedName("httpGet")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartHttpGet httpGet = null;

  @SerializedName("initialDelaySeconds")
  private Integer initialDelaySeconds = null;

  @SerializedName("periodSeconds")
  private Integer periodSeconds = null;

  @SerializedName("successThreshold")
  private Integer successThreshold = null;

  @SerializedName("tcpSocket")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe exec(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartExec exec) {
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartExec getExec() {
    return exec;
  }

  public void setExec(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartExec exec) {
    this.exec = exec;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe failureThreshold(Integer failureThreshold) {
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

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe httpGet(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * Get httpGet
   * @return httpGet
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartHttpGet getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartHttpGet httpGet) {
    this.httpGet = httpGet;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe initialDelaySeconds(Integer initialDelaySeconds) {
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

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe periodSeconds(Integer periodSeconds) {
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

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe successThreshold(Integer successThreshold) {
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

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe tcpSocket(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Get tcpSocket
   * @return tcpSocket
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartTcpSocket getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecLifecyclePostStartTcpSocket tcpSocket) {
    this.tcpSocket = tcpSocket;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe timeoutSeconds(Integer timeoutSeconds) {
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
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe) o;
    return Objects.equals(this.exec, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.exec) &&
        Objects.equals(this.failureThreshold, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.failureThreshold) &&
        Objects.equals(this.httpGet, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.httpGet) &&
        Objects.equals(this.initialDelaySeconds, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.periodSeconds) &&
        Objects.equals(this.successThreshold, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.successThreshold) &&
        Objects.equals(this.tcpSocket, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.tcpSocket) &&
        Objects.equals(this.timeoutSeconds, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecStartupProbe {\n");
    
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

