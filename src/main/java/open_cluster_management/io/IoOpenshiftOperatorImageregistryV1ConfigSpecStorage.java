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
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure;
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs;
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc;
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3;
import open_cluster_management.io.IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift;

/**
 * storage details for configuring registry storage, e.g. S3 bucket coordinates.
 */
@ApiModel(description = "storage details for configuring registry storage, e.g. S3 bucket coordinates.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorImageregistryV1ConfigSpecStorage {
  @SerializedName("azure")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure azure = null;

  @SerializedName("emptyDir")
  private Object emptyDir = null;

  @SerializedName("gcs")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs gcs = null;

  @SerializedName("pvc")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc pvc = null;

  @SerializedName("s3")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 s3 = null;

  @SerializedName("swift")
  private IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift swift = null;

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage azure(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure getAzure() {
    return azure;
  }

  public void setAzure(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageAzure azure) {
    this.azure = azure;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage emptyDir(Object emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * emptyDir represents ephemeral storage on the pod&#39;s host node. WARNING: this storage cannot be used with more than 1 replica and is not suitable for production use. When the pod is removed from a node for any reason, the data in the emptyDir is deleted forever.
   * @return emptyDir
  **/
  @ApiModelProperty(value = "emptyDir represents ephemeral storage on the pod's host node. WARNING: this storage cannot be used with more than 1 replica and is not suitable for production use. When the pod is removed from a node for any reason, the data in the emptyDir is deleted forever.")
  public Object getEmptyDir() {
    return emptyDir;
  }

  public void setEmptyDir(Object emptyDir) {
    this.emptyDir = emptyDir;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage gcs(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs getGcs() {
    return gcs;
  }

  public void setGcs(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageGcs gcs) {
    this.gcs = gcs;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage pvc(IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc pvc) {
    this.pvc = pvc;
    return this;
  }

   /**
   * Get pvc
   * @return pvc
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc getPvc() {
    return pvc;
  }

  public void setPvc(IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc pvc) {
    this.pvc = pvc;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage s3(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 getS3() {
    return s3;
  }

  public void setS3(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageS3 s3) {
    this.s3 = s3;
  }

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorage swift(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift swift) {
    this.swift = swift;
    return this;
  }

   /**
   * Get swift
   * @return swift
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift getSwift() {
    return swift;
  }

  public void setSwift(IoOpenshiftOperatorImageregistryV1ConfigSpecStorageSwift swift) {
    this.swift = swift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorImageregistryV1ConfigSpecStorage ioOpenshiftOperatorImageregistryV1ConfigSpecStorage = (IoOpenshiftOperatorImageregistryV1ConfigSpecStorage) o;
    return Objects.equals(this.azure, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.azure) &&
        Objects.equals(this.emptyDir, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.emptyDir) &&
        Objects.equals(this.gcs, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.gcs) &&
        Objects.equals(this.pvc, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.pvc) &&
        Objects.equals(this.s3, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.s3) &&
        Objects.equals(this.swift, ioOpenshiftOperatorImageregistryV1ConfigSpecStorage.swift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure, emptyDir, gcs, pvc, s3, swift);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorImageregistryV1ConfigSpecStorage {\n");
    
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
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

