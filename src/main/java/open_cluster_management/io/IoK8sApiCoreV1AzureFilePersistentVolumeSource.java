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
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1AzureFilePersistentVolumeSource {
  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("secretName")
  private String secretName = null;

  @SerializedName("secretNamespace")
  private String secretNamespace = null;

  @SerializedName("shareName")
  private String shareName = null;

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

   /**
   * the name of secret that contains Azure Storage Account Name and Key
   * @return secretName
  **/
  @ApiModelProperty(required = true, value = "the name of secret that contains Azure Storage Account Name and Key")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource secretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
    return this;
  }

   /**
   * the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod
   * @return secretNamespace
  **/
  @ApiModelProperty(value = "the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod")
  public String getSecretNamespace() {
    return secretNamespace;
  }

  public void setSecretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
  }

  public IoK8sApiCoreV1AzureFilePersistentVolumeSource shareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

   /**
   * Share Name
   * @return shareName
  **/
  @ApiModelProperty(required = true, value = "Share Name")
  public String getShareName() {
    return shareName;
  }

  public void setShareName(String shareName) {
    this.shareName = shareName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1AzureFilePersistentVolumeSource ioK8sApiCoreV1AzureFilePersistentVolumeSource = (IoK8sApiCoreV1AzureFilePersistentVolumeSource) o;
    return Objects.equals(this.readOnly, ioK8sApiCoreV1AzureFilePersistentVolumeSource.readOnly) &&
        Objects.equals(this.secretName, ioK8sApiCoreV1AzureFilePersistentVolumeSource.secretName) &&
        Objects.equals(this.secretNamespace, ioK8sApiCoreV1AzureFilePersistentVolumeSource.secretNamespace) &&
        Objects.equals(this.shareName, ioK8sApiCoreV1AzureFilePersistentVolumeSource.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, secretNamespace, shareName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureFilePersistentVolumeSource {\n");
    
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretNamespace: ").append(toIndentedString(secretNamespace)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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
