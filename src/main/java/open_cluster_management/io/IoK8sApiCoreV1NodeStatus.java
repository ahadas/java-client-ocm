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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.IoK8sApiCoreV1AttachedVolume;
import open_cluster_management.io.IoK8sApiCoreV1ContainerImage;
import open_cluster_management.io.IoK8sApiCoreV1NodeAddress;
import open_cluster_management.io.IoK8sApiCoreV1NodeCondition;
import open_cluster_management.io.IoK8sApiCoreV1NodeConfigStatus;
import open_cluster_management.io.IoK8sApiCoreV1NodeDaemonEndpoints;
import open_cluster_management.io.IoK8sApiCoreV1NodeSystemInfo;

/**
 * NodeStatus is information about the current status of a node.
 */
@ApiModel(description = "NodeStatus is information about the current status of a node.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1NodeStatus {
  @SerializedName("addresses")
  private List<IoK8sApiCoreV1NodeAddress> addresses = null;

  @SerializedName("allocatable")
  private Map<String, String> allocatable = null;

  @SerializedName("capacity")
  private Map<String, String> capacity = null;

  @SerializedName("conditions")
  private List<IoK8sApiCoreV1NodeCondition> conditions = null;

  @SerializedName("config")
  private IoK8sApiCoreV1NodeConfigStatus config = null;

  @SerializedName("daemonEndpoints")
  private IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints = null;

  @SerializedName("images")
  private List<IoK8sApiCoreV1ContainerImage> images = null;

  @SerializedName("nodeInfo")
  private IoK8sApiCoreV1NodeSystemInfo nodeInfo = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("volumesAttached")
  private List<IoK8sApiCoreV1AttachedVolume> volumesAttached = null;

  @SerializedName("volumesInUse")
  private List<String> volumesInUse = null;

  public IoK8sApiCoreV1NodeStatus addresses(List<IoK8sApiCoreV1NodeAddress> addresses) {
    this.addresses = addresses;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addAddressesItem(IoK8sApiCoreV1NodeAddress addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.
   * @return addresses
  **/
  @ApiModelProperty(value = "List of addresses reachable to the node. Queried from cloud provider, if available. More info: https://kubernetes.io/docs/concepts/nodes/node/#addresses Note: This field is declared as mergeable, but the merge key is not sufficiently unique, which can cause data corruption when it is merged. Callers should instead use a full-replacement patch. See http://pr.k8s.io/79391 for an example.")
  public List<IoK8sApiCoreV1NodeAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<IoK8sApiCoreV1NodeAddress> addresses) {
    this.addresses = addresses;
  }

  public IoK8sApiCoreV1NodeStatus allocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus putAllocatableItem(String key, String allocatableItem) {
    if (this.allocatable == null) {
      this.allocatable = new HashMap<>();
    }
    this.allocatable.put(key, allocatableItem);
    return this;
  }

   /**
   * Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.
   * @return allocatable
  **/
  @ApiModelProperty(value = "Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity.")
  public Map<String, String> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
  }

  public IoK8sApiCoreV1NodeStatus capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus putCapacityItem(String key, String capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity represents the total resources of a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoK8sApiCoreV1NodeStatus conditions(List<IoK8sApiCoreV1NodeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addConditionsItem(IoK8sApiCoreV1NodeCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions is an array of current observed node conditions. More info: https://kubernetes.io/docs/concepts/nodes/node/#condition")
  public List<IoK8sApiCoreV1NodeCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoK8sApiCoreV1NodeCondition> conditions) {
    this.conditions = conditions;
  }

  public IoK8sApiCoreV1NodeStatus config(IoK8sApiCoreV1NodeConfigStatus config) {
    this.config = config;
    return this;
  }

   /**
   * Status of the config assigned to the node via the dynamic Kubelet config feature.
   * @return config
  **/
  @ApiModelProperty(value = "Status of the config assigned to the node via the dynamic Kubelet config feature.")
  public IoK8sApiCoreV1NodeConfigStatus getConfig() {
    return config;
  }

  public void setConfig(IoK8sApiCoreV1NodeConfigStatus config) {
    this.config = config;
  }

  public IoK8sApiCoreV1NodeStatus daemonEndpoints(IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
    return this;
  }

   /**
   * Endpoints of daemons running on the Node.
   * @return daemonEndpoints
  **/
  @ApiModelProperty(value = "Endpoints of daemons running on the Node.")
  public IoK8sApiCoreV1NodeDaemonEndpoints getDaemonEndpoints() {
    return daemonEndpoints;
  }

  public void setDaemonEndpoints(IoK8sApiCoreV1NodeDaemonEndpoints daemonEndpoints) {
    this.daemonEndpoints = daemonEndpoints;
  }

  public IoK8sApiCoreV1NodeStatus images(List<IoK8sApiCoreV1ContainerImage> images) {
    this.images = images;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addImagesItem(IoK8sApiCoreV1ContainerImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * List of container images on this node
   * @return images
  **/
  @ApiModelProperty(value = "List of container images on this node")
  public List<IoK8sApiCoreV1ContainerImage> getImages() {
    return images;
  }

  public void setImages(List<IoK8sApiCoreV1ContainerImage> images) {
    this.images = images;
  }

  public IoK8sApiCoreV1NodeStatus nodeInfo(IoK8sApiCoreV1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

   /**
   * Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info
   * @return nodeInfo
  **/
  @ApiModelProperty(value = "Set of ids/uuids to uniquely identify the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#info")
  public IoK8sApiCoreV1NodeSystemInfo getNodeInfo() {
    return nodeInfo;
  }

  public void setNodeInfo(IoK8sApiCoreV1NodeSystemInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }

  public IoK8sApiCoreV1NodeStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.
   * @return phase
  **/
  @ApiModelProperty(value = "NodePhase is the recently observed lifecycle phase of the node. More info: https://kubernetes.io/docs/concepts/nodes/node/#phase The field is never populated, and now is deprecated.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public IoK8sApiCoreV1NodeStatus volumesAttached(List<IoK8sApiCoreV1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addVolumesAttachedItem(IoK8sApiCoreV1AttachedVolume volumesAttachedItem) {
    if (this.volumesAttached == null) {
      this.volumesAttached = new ArrayList<>();
    }
    this.volumesAttached.add(volumesAttachedItem);
    return this;
  }

   /**
   * List of volumes that are attached to the node.
   * @return volumesAttached
  **/
  @ApiModelProperty(value = "List of volumes that are attached to the node.")
  public List<IoK8sApiCoreV1AttachedVolume> getVolumesAttached() {
    return volumesAttached;
  }

  public void setVolumesAttached(List<IoK8sApiCoreV1AttachedVolume> volumesAttached) {
    this.volumesAttached = volumesAttached;
  }

  public IoK8sApiCoreV1NodeStatus volumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
    return this;
  }

  public IoK8sApiCoreV1NodeStatus addVolumesInUseItem(String volumesInUseItem) {
    if (this.volumesInUse == null) {
      this.volumesInUse = new ArrayList<>();
    }
    this.volumesInUse.add(volumesInUseItem);
    return this;
  }

   /**
   * List of attachable volumes in use (mounted) by the node.
   * @return volumesInUse
  **/
  @ApiModelProperty(value = "List of attachable volumes in use (mounted) by the node.")
  public List<String> getVolumesInUse() {
    return volumesInUse;
  }

  public void setVolumesInUse(List<String> volumesInUse) {
    this.volumesInUse = volumesInUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeStatus ioK8sApiCoreV1NodeStatus = (IoK8sApiCoreV1NodeStatus) o;
    return Objects.equals(this.addresses, ioK8sApiCoreV1NodeStatus.addresses) &&
        Objects.equals(this.allocatable, ioK8sApiCoreV1NodeStatus.allocatable) &&
        Objects.equals(this.capacity, ioK8sApiCoreV1NodeStatus.capacity) &&
        Objects.equals(this.conditions, ioK8sApiCoreV1NodeStatus.conditions) &&
        Objects.equals(this.config, ioK8sApiCoreV1NodeStatus.config) &&
        Objects.equals(this.daemonEndpoints, ioK8sApiCoreV1NodeStatus.daemonEndpoints) &&
        Objects.equals(this.images, ioK8sApiCoreV1NodeStatus.images) &&
        Objects.equals(this.nodeInfo, ioK8sApiCoreV1NodeStatus.nodeInfo) &&
        Objects.equals(this.phase, ioK8sApiCoreV1NodeStatus.phase) &&
        Objects.equals(this.volumesAttached, ioK8sApiCoreV1NodeStatus.volumesAttached) &&
        Objects.equals(this.volumesInUse, ioK8sApiCoreV1NodeStatus.volumesInUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, allocatable, capacity, conditions, config, daemonEndpoints, images, nodeInfo, phase, volumesAttached, volumesInUse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeStatus {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    daemonEndpoints: ").append(toIndentedString(daemonEndpoints)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    volumesAttached: ").append(toIndentedString(volumesAttached)).append("\n");
    sb.append("    volumesInUse: ").append(toIndentedString(volumesInUse)).append("\n");
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

