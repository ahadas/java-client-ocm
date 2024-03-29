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
import open_cluster_management.io.IoK8sApiCoreV1LocalObjectReference;

/**
 * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1CinderVolumeSource {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretRef")
  private IoK8sApiCoreV1LocalObjectReference secretRef = null;

  @SerializedName("volumeID")
  private String volumeID = null;

  public IoK8sApiCoreV1CinderVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public IoK8sApiCoreV1CinderVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return readOnly
  **/
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1CinderVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Optional: points to a secret object containing parameters used to connect to OpenStack.
   * @return secretRef
  **/
  @ApiModelProperty(value = "Optional: points to a secret object containing parameters used to connect to OpenStack.")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  public IoK8sApiCoreV1CinderVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

   /**
   * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
   * @return volumeID
  **/
  @ApiModelProperty(required = true, value = "volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
  public String getVolumeID() {
    return volumeID;
  }

  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1CinderVolumeSource ioK8sApiCoreV1CinderVolumeSource = (IoK8sApiCoreV1CinderVolumeSource) o;
    return Objects.equals(this.fsType, ioK8sApiCoreV1CinderVolumeSource.fsType) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1CinderVolumeSource.readOnly) &&
        Objects.equals(this.secretRef, ioK8sApiCoreV1CinderVolumeSource.secretRef) &&
        Objects.equals(this.volumeID, ioK8sApiCoreV1CinderVolumeSource.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1CinderVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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

