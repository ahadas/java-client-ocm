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

/**
 * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
 */
@ApiModel(description = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume {
  @SerializedName("fsType")
  private String fsType = null;

  @SerializedName("storagePolicyID")
  private String storagePolicyID = null;

  @SerializedName("storagePolicyName")
  private String storagePolicyName = null;

  @SerializedName("volumePath")
  private String volumePath = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  public String getFsType() {
    return fsType;
  }

  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume storagePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   * @return storagePolicyID
  **/
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }

  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

   /**
   * Storage Policy Based Management (SPBM) profile name.
   * @return storagePolicyName
  **/
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }

  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

   /**
   * Path that identifies vSphere volume vmdk
   * @return volumePath
  **/
  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")
  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume) o;
    return Objects.equals(this.fsType, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume.fsType) &&
        Objects.equals(this.storagePolicyID, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume.storagePolicyID) &&
        Objects.equals(this.storagePolicyName, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume.storagePolicyName) &&
        Objects.equals(this.volumePath, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecVsphereVolume {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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

