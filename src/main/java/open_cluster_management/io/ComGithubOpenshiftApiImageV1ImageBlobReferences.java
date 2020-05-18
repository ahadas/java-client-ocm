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

/**
 * ImageBlobReferences describes the blob references within an image.
 */
@ApiModel(description = "ImageBlobReferences describes the blob references within an image.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1ImageBlobReferences {
  @SerializedName("config")
  private String config = null;

  @SerializedName("imageMissing")
  private Boolean imageMissing = null;

  @SerializedName("layers")
  private List<String> layers = null;

  public ComGithubOpenshiftApiImageV1ImageBlobReferences config(String config) {
    this.config = config;
    return this;
  }

   /**
   * config, if set, is the blob that contains the image config. Some images do not have separate config blobs and this field will be set to nil if so.
   * @return config
  **/
  @ApiModelProperty(value = "config, if set, is the blob that contains the image config. Some images do not have separate config blobs and this field will be set to nil if so.")
  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public ComGithubOpenshiftApiImageV1ImageBlobReferences imageMissing(Boolean imageMissing) {
    this.imageMissing = imageMissing;
    return this;
  }

   /**
   * imageMissing is true if the image is referenced by the image stream but the image object has been deleted from the API by an administrator. When this field is set, layers and config fields may be empty and callers that depend on the image metadata should consider the image to be unavailable for download or viewing.
   * @return imageMissing
  **/
  @ApiModelProperty(value = "imageMissing is true if the image is referenced by the image stream but the image object has been deleted from the API by an administrator. When this field is set, layers and config fields may be empty and callers that depend on the image metadata should consider the image to be unavailable for download or viewing.")
  public Boolean isImageMissing() {
    return imageMissing;
  }

  public void setImageMissing(Boolean imageMissing) {
    this.imageMissing = imageMissing;
  }

  public ComGithubOpenshiftApiImageV1ImageBlobReferences layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageBlobReferences addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * layers is the list of blobs that compose this image, from base layer to top layer. All layers referenced by this array will be defined in the blobs map. Some images may have zero layers.
   * @return layers
  **/
  @ApiModelProperty(value = "layers is the list of blobs that compose this image, from base layer to top layer. All layers referenced by this array will be defined in the blobs map. Some images may have zero layers.")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1ImageBlobReferences comGithubOpenshiftApiImageV1ImageBlobReferences = (ComGithubOpenshiftApiImageV1ImageBlobReferences) o;
    return Objects.equals(this.config, comGithubOpenshiftApiImageV1ImageBlobReferences.config) &&
        Objects.equals(this.imageMissing, comGithubOpenshiftApiImageV1ImageBlobReferences.imageMissing) &&
        Objects.equals(this.layers, comGithubOpenshiftApiImageV1ImageBlobReferences.layers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, imageMissing, layers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1ImageBlobReferences {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    imageMissing: ").append(toIndentedString(imageMissing)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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

