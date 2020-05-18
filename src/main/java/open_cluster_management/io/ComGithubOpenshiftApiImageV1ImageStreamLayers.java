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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1ImageBlobReferences;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1ImageLayerData;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * ImageStreamLayers describes information about the layers referenced by images in this image stream.
 */
@ApiModel(description = "ImageStreamLayers describes information about the layers referenced by images in this image stream.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1ImageStreamLayers {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("blobs")
  private Map<String, ComGithubOpenshiftApiImageV1ImageLayerData> blobs = new HashMap<>();

  @SerializedName("images")
  private Map<String, ComGithubOpenshiftApiImageV1ImageBlobReferences> images = new HashMap<>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  public ComGithubOpenshiftApiImageV1ImageStreamLayers apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers blobs(Map<String, ComGithubOpenshiftApiImageV1ImageLayerData> blobs) {
    this.blobs = blobs;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers putBlobsItem(String key, ComGithubOpenshiftApiImageV1ImageLayerData blobsItem) {
    this.blobs.put(key, blobsItem);
    return this;
  }

   /**
   * blobs is a map of blob name to metadata about the blob.
   * @return blobs
  **/
  @ApiModelProperty(required = true, value = "blobs is a map of blob name to metadata about the blob.")
  public Map<String, ComGithubOpenshiftApiImageV1ImageLayerData> getBlobs() {
    return blobs;
  }

  public void setBlobs(Map<String, ComGithubOpenshiftApiImageV1ImageLayerData> blobs) {
    this.blobs = blobs;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers images(Map<String, ComGithubOpenshiftApiImageV1ImageBlobReferences> images) {
    this.images = images;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers putImagesItem(String key, ComGithubOpenshiftApiImageV1ImageBlobReferences imagesItem) {
    this.images.put(key, imagesItem);
    return this;
  }

   /**
   * images is a map between an image name and the names of the blobs and config that comprise the image.
   * @return images
  **/
  @ApiModelProperty(required = true, value = "images is a map between an image name and the names of the blobs and config that comprise the image.")
  public Map<String, ComGithubOpenshiftApiImageV1ImageBlobReferences> getImages() {
    return images;
  }

  public void setImages(Map<String, ComGithubOpenshiftApiImageV1ImageBlobReferences> images) {
    this.images = images;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOpenshiftApiImageV1ImageStreamLayers metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1ImageStreamLayers comGithubOpenshiftApiImageV1ImageStreamLayers = (ComGithubOpenshiftApiImageV1ImageStreamLayers) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiImageV1ImageStreamLayers.apiVersion) &&
        Objects.equals(this.blobs, comGithubOpenshiftApiImageV1ImageStreamLayers.blobs) &&
        Objects.equals(this.images, comGithubOpenshiftApiImageV1ImageStreamLayers.images) &&
        Objects.equals(this.kind, comGithubOpenshiftApiImageV1ImageStreamLayers.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiImageV1ImageStreamLayers.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blobs, images, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1ImageStreamLayers {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blobs: ").append(toIndentedString(blobs)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
