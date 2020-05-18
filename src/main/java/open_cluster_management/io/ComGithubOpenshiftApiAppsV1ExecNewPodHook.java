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
import open_cluster_management.io.IoK8sApiCoreV1EnvVar;

/**
 * ExecNewPodHook is a hook implementation which runs a command in a new pod based on the specified container which is assumed to be part of the deployment template.
 */
@ApiModel(description = "ExecNewPodHook is a hook implementation which runs a command in a new pod based on the specified container which is assumed to be part of the deployment template.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1ExecNewPodHook {
  @SerializedName("command")
  private List<String> command = new ArrayList<>();

  @SerializedName("containerName")
  private String containerName = null;

  @SerializedName("env")
  private List<IoK8sApiCoreV1EnvVar> env = null;

  @SerializedName("volumes")
  private List<String> volumes = null;

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook command(List<String> command) {
    this.command = command;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook addCommandItem(String commandItem) {
    this.command.add(commandItem);
    return this;
  }

   /**
   * Command is the action command and its arguments.
   * @return command
  **/
  @ApiModelProperty(required = true, value = "Command is the action command and its arguments.")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * ContainerName is the name of a container in the deployment pod template whose container image will be used for the hook pod&#39;s container.
   * @return containerName
  **/
  @ApiModelProperty(required = true, value = "ContainerName is the name of a container in the deployment pod template whose container image will be used for the hook pod's container.")
  public String getContainerName() {
    return containerName;
  }

  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook addEnvItem(IoK8sApiCoreV1EnvVar envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Env is a set of environment variables to supply to the hook pod&#39;s container.
   * @return env
  **/
  @ApiModelProperty(value = "Env is a set of environment variables to supply to the hook pod's container.")
  public List<IoK8sApiCoreV1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook volumes(List<String> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ComGithubOpenshiftApiAppsV1ExecNewPodHook addVolumesItem(String volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes is a list of named volumes from the pod template which should be copied to the hook pod. Volumes names not found in pod spec are ignored. An empty list means no volumes will be copied.
   * @return volumes
  **/
  @ApiModelProperty(value = "Volumes is a list of named volumes from the pod template which should be copied to the hook pod. Volumes names not found in pod spec are ignored. An empty list means no volumes will be copied.")
  public List<String> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<String> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1ExecNewPodHook comGithubOpenshiftApiAppsV1ExecNewPodHook = (ComGithubOpenshiftApiAppsV1ExecNewPodHook) o;
    return Objects.equals(this.command, comGithubOpenshiftApiAppsV1ExecNewPodHook.command) &&
        Objects.equals(this.containerName, comGithubOpenshiftApiAppsV1ExecNewPodHook.containerName) &&
        Objects.equals(this.env, comGithubOpenshiftApiAppsV1ExecNewPodHook.env) &&
        Objects.equals(this.volumes, comGithubOpenshiftApiAppsV1ExecNewPodHook.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, containerName, env, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1ExecNewPodHook {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
