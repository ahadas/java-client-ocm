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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfsSecretRef;

/**
 * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
 */
@ApiModel(description = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs {
  @SerializedName("monitors")
  private List<String> monitors = new ArrayList<>();

  @SerializedName("path")
  private String path = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretFile")
  private String secretFile = null;

  @SerializedName("secretRef")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfsSecretRef secretRef = null;

  @SerializedName("user")
  private String user = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs addMonitorsItem(String monitorsItem) {
    this.monitors.add(monitorsItem);
    return this;
  }

   /**
   * Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return monitors
  **/
  @ApiModelProperty(required = true, value = "Required: Monitors is a collection of Ceph monitors More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public List<String> getMonitors() {
    return monitors;
  }

  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   * @return path
  **/
  @ApiModelProperty(value = "Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return readOnly
  **/
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs secretFile(String secretFile) {
    this.secretFile = secretFile;
    return this;
  }

   /**
   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return secretFile
  **/
  @ApiModelProperty(value = "Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public String getSecretFile() {
    return secretFile;
  }

  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs secretRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfsSecretRef secretRef) {
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfsSecretRef getSecretRef() {
    return secretRef;
  }

  public void setSecretRef(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfsSecretRef secretRef) {
    this.secretRef = secretRef;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it
   * @return user
  **/
  @ApiModelProperty(value = "Optional: User is the rados user name, default is admin More info: https://examples.k8s.io/volumes/cephfs/README.md#how-to-use-it")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs) o;
    return Objects.equals(this.monitors, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.monitors) &&
        Objects.equals(this.path, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.path) &&
        Objects.equals(this.readOnly, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.readOnly) &&
        Objects.equals(this.secretFile, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.secretFile) &&
        Objects.equals(this.secretRef, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.secretRef) &&
        Objects.equals(this.user, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecCephfs {\n");
    
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

