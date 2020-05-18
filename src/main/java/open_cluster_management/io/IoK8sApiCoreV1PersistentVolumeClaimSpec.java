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
import open_cluster_management.io.IoK8sApiCoreV1ResourceRequirements;
import open_cluster_management.io.IoK8sApiCoreV1TypedLocalObjectReference;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1LabelSelector;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@ApiModel(description = "PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1PersistentVolumeClaimSpec {
  @SerializedName("accessModes")
  private List<String> accessModes = null;

  @SerializedName("dataSource")
  private IoK8sApiCoreV1TypedLocalObjectReference dataSource = null;

  @SerializedName("resources")
  private IoK8sApiCoreV1ResourceRequirements resources = null;

  @SerializedName("selector")
  private IoK8sApimachineryPkgApisMetaV1LabelSelector selector = null;

  @SerializedName("storageClassName")
  private String storageClassName = null;

  @SerializedName("volumeMode")
  private String volumeMode = null;

  @SerializedName("volumeName")
  private String volumeName = null;

  public IoK8sApiCoreV1PersistentVolumeClaimSpec accessModes(List<String> accessModes) {
    this.accessModes = accessModes;
    return this;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/
  @ApiModelProperty(value = "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
  public List<String> getAccessModes() {
    return accessModes;
  }

  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec dataSource(IoK8sApiCoreV1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
    return this;
  }

   /**
   * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
   * @return dataSource
  **/
  @ApiModelProperty(value = "This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and currently VolumeSnapshot is the only supported data source. If the provisioner can support VolumeSnapshot data source, it will create a new volume and data will be restored to the volume at the same time. If the provisioner does not support VolumeSnapshot data source, volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.")
  public IoK8sApiCoreV1TypedLocalObjectReference getDataSource() {
    return dataSource;
  }

  public void setDataSource(IoK8sApiCoreV1TypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec resources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   * @return resources
  **/
  @ApiModelProperty(value = "Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
  public IoK8sApiCoreV1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec selector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * A label query over volumes to consider for binding.
   * @return selector
  **/
  @ApiModelProperty(value = "A label query over volumes to consider for binding.")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector selector) {
    this.selector = selector;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec storageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/
  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
  public String getStorageClassName() {
    return storageClassName;
  }

  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec volumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.
   * @return volumeMode
  **/
  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.")
  public String getVolumeMode() {
    return volumeMode;
  }

  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }

  public IoK8sApiCoreV1PersistentVolumeClaimSpec volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

   /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
  **/
  @ApiModelProperty(value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")
  public String getVolumeName() {
    return volumeName;
  }

  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PersistentVolumeClaimSpec ioK8sApiCoreV1PersistentVolumeClaimSpec = (IoK8sApiCoreV1PersistentVolumeClaimSpec) o;
    return Objects.equals(this.accessModes, ioK8sApiCoreV1PersistentVolumeClaimSpec.accessModes) &&
        Objects.equals(this.dataSource, ioK8sApiCoreV1PersistentVolumeClaimSpec.dataSource) &&
        Objects.equals(this.resources, ioK8sApiCoreV1PersistentVolumeClaimSpec.resources) &&
        Objects.equals(this.selector, ioK8sApiCoreV1PersistentVolumeClaimSpec.selector) &&
        Objects.equals(this.storageClassName, ioK8sApiCoreV1PersistentVolumeClaimSpec.storageClassName) &&
        Objects.equals(this.volumeMode, ioK8sApiCoreV1PersistentVolumeClaimSpec.volumeMode) &&
        Objects.equals(this.volumeName, ioK8sApiCoreV1PersistentVolumeClaimSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, resources, selector, storageClassName, volumeMode, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimSpec {\n");
    
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

