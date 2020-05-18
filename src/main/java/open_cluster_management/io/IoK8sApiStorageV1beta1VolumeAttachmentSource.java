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
import open_cluster_management.io.IoK8sApiCoreV1PersistentVolumeSpec;

/**
 * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
 */
@ApiModel(description = "VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiStorageV1beta1VolumeAttachmentSource {
  @SerializedName("inlineVolumeSpec")
  private IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec = null;

  @SerializedName("persistentVolumeName")
  private String persistentVolumeName = null;

  public IoK8sApiStorageV1beta1VolumeAttachmentSource inlineVolumeSpec(IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
    return this;
  }

   /**
   * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod&#39;s inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod&#39;s inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
   * @return inlineVolumeSpec
  **/
  @ApiModelProperty(value = "inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.")
  public IoK8sApiCoreV1PersistentVolumeSpec getInlineVolumeSpec() {
    return inlineVolumeSpec;
  }

  public void setInlineVolumeSpec(IoK8sApiCoreV1PersistentVolumeSpec inlineVolumeSpec) {
    this.inlineVolumeSpec = inlineVolumeSpec;
  }

  public IoK8sApiStorageV1beta1VolumeAttachmentSource persistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
    return this;
  }

   /**
   * Name of the persistent volume to attach.
   * @return persistentVolumeName
  **/
  @ApiModelProperty(value = "Name of the persistent volume to attach.")
  public String getPersistentVolumeName() {
    return persistentVolumeName;
  }

  public void setPersistentVolumeName(String persistentVolumeName) {
    this.persistentVolumeName = persistentVolumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiStorageV1beta1VolumeAttachmentSource ioK8sApiStorageV1beta1VolumeAttachmentSource = (IoK8sApiStorageV1beta1VolumeAttachmentSource) o;
    return Objects.equals(this.inlineVolumeSpec, ioK8sApiStorageV1beta1VolumeAttachmentSource.inlineVolumeSpec) &&
        Objects.equals(this.persistentVolumeName, ioK8sApiStorageV1beta1VolumeAttachmentSource.persistentVolumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineVolumeSpec, persistentVolumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiStorageV1beta1VolumeAttachmentSource {\n");
    
    sb.append("    inlineVolumeSpec: ").append(toIndentedString(inlineVolumeSpec)).append("\n");
    sb.append("    persistentVolumeName: ").append(toIndentedString(persistentVolumeName)).append("\n");
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

