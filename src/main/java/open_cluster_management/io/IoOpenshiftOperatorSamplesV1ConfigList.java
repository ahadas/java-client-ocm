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
import open_cluster_management.io.ComAcmSearchV1alpha1SearchServiceListMetadata;
import open_cluster_management.io.IoOpenshiftOperatorSamplesV1Config;

/**
 * ConfigList is a list of Config
 */
@ApiModel(description = "ConfigList is a list of Config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorSamplesV1ConfigList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<IoOpenshiftOperatorSamplesV1Config> items = new ArrayList<>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private ComAcmSearchV1alpha1SearchServiceListMetadata metadata = null;

  public IoOpenshiftOperatorSamplesV1ConfigList apiVersion(String apiVersion) {
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

  public IoOpenshiftOperatorSamplesV1ConfigList items(List<IoOpenshiftOperatorSamplesV1Config> items) {
    this.items = items;
    return this;
  }

  public IoOpenshiftOperatorSamplesV1ConfigList addItemsItem(IoOpenshiftOperatorSamplesV1Config itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of configs. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of configs. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md")
  public List<IoOpenshiftOperatorSamplesV1Config> getItems() {
    return items;
  }

  public void setItems(List<IoOpenshiftOperatorSamplesV1Config> items) {
    this.items = items;
  }

  public IoOpenshiftOperatorSamplesV1ConfigList kind(String kind) {
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

  public IoOpenshiftOperatorSamplesV1ConfigList metadata(ComAcmSearchV1alpha1SearchServiceListMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public ComAcmSearchV1alpha1SearchServiceListMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ComAcmSearchV1alpha1SearchServiceListMetadata metadata) {
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
    IoOpenshiftOperatorSamplesV1ConfigList ioOpenshiftOperatorSamplesV1ConfigList = (IoOpenshiftOperatorSamplesV1ConfigList) o;
    return Objects.equals(this.apiVersion, ioOpenshiftOperatorSamplesV1ConfigList.apiVersion) &&
        Objects.equals(this.items, ioOpenshiftOperatorSamplesV1ConfigList.items) &&
        Objects.equals(this.kind, ioOpenshiftOperatorSamplesV1ConfigList.kind) &&
        Objects.equals(this.metadata, ioOpenshiftOperatorSamplesV1ConfigList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorSamplesV1ConfigList {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

