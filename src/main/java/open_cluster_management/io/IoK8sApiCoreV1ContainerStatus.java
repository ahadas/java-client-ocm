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
import open_cluster_management.io.IoK8sApiCoreV1ContainerState;

/**
 * ContainerStatus contains details for the current status of this container.
 */
@ApiModel(description = "ContainerStatus contains details for the current status of this container.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1ContainerStatus {
  @SerializedName("containerID")
  private String containerID = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageID")
  private String imageID = null;

  @SerializedName("lastState")
  private IoK8sApiCoreV1ContainerState lastState = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ready")
  private Boolean ready = null;

  @SerializedName("restartCount")
  private Integer restartCount = null;

  @SerializedName("started")
  private Boolean started = null;

  @SerializedName("state")
  private IoK8sApiCoreV1ContainerState state = null;

  public IoK8sApiCoreV1ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

   /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
   * @return containerID
  **/
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'.")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public IoK8sApiCoreV1ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
   * @return image
  **/
  @ApiModelProperty(required = true, value = "The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public IoK8sApiCoreV1ContainerStatus imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

   /**
   * ImageID of the container&#39;s image.
   * @return imageID
  **/
  @ApiModelProperty(required = true, value = "ImageID of the container's image.")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public IoK8sApiCoreV1ContainerStatus lastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
    return this;
  }

   /**
   * Details about the container&#39;s last termination condition.
   * @return lastState
  **/
  @ApiModelProperty(value = "Details about the container's last termination condition.")
  public IoK8sApiCoreV1ContainerState getLastState() {
    return lastState;
  }

  public void setLastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
  }

  public IoK8sApiCoreV1ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiCoreV1ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Specifies whether the container has passed its readiness probe.
   * @return ready
  **/
  @ApiModelProperty(required = true, value = "Specifies whether the container has passed its readiness probe.")
  public Boolean isReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public IoK8sApiCoreV1ContainerStatus restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

   /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
   * @return restartCount
  **/
  @ApiModelProperty(required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.")
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  public IoK8sApiCoreV1ContainerStatus started(Boolean started) {
    this.started = started;
    return this;
  }

   /**
   * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
   * @return started
  **/
  @ApiModelProperty(value = "Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.")
  public Boolean isStarted() {
    return started;
  }

  public void setStarted(Boolean started) {
    this.started = started;
  }

  public IoK8sApiCoreV1ContainerStatus state(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
    return this;
  }

   /**
   * Details about the container&#39;s current condition.
   * @return state
  **/
  @ApiModelProperty(value = "Details about the container's current condition.")
  public IoK8sApiCoreV1ContainerState getState() {
    return state;
  }

  public void setState(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerStatus ioK8sApiCoreV1ContainerStatus = (IoK8sApiCoreV1ContainerStatus) o;
    return Objects.equals(this.containerID, ioK8sApiCoreV1ContainerStatus.containerID) &&
        Objects.equals(this.image, ioK8sApiCoreV1ContainerStatus.image) &&
        Objects.equals(this.imageID, ioK8sApiCoreV1ContainerStatus.imageID) &&
        Objects.equals(this.lastState, ioK8sApiCoreV1ContainerStatus.lastState) &&
        Objects.equals(this.name, ioK8sApiCoreV1ContainerStatus.name) &&
        Objects.equals(this.ready, ioK8sApiCoreV1ContainerStatus.ready) &&
        Objects.equals(this.restartCount, ioK8sApiCoreV1ContainerStatus.restartCount) &&
        Objects.equals(this.started, ioK8sApiCoreV1ContainerStatus.started) &&
        Objects.equals(this.state, ioK8sApiCoreV1ContainerStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, image, imageID, lastState, name, ready, restartCount, started, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

