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
import open_cluster_management.io.ComIbmMcmPolicyV1alpha1Policy;

/**
 * PolicyList is a list of Policy
 */
@ApiModel(description = "PolicyList is a list of Policy")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComIbmMcmPolicyV1alpha1PolicyList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ComIbmMcmPolicyV1alpha1Policy> items = new ArrayList<>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private ComAcmSearchV1alpha1SearchServiceListMetadata metadata = null;

  public ComIbmMcmPolicyV1alpha1PolicyList apiVersion(String apiVersion) {
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

  public ComIbmMcmPolicyV1alpha1PolicyList items(List<ComIbmMcmPolicyV1alpha1Policy> items) {
    this.items = items;
    return this;
  }

  public ComIbmMcmPolicyV1alpha1PolicyList addItemsItem(ComIbmMcmPolicyV1alpha1Policy itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of policies. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md
   * @return items
  **/
  @ApiModelProperty(required = true, value = "List of policies. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md")
  public List<ComIbmMcmPolicyV1alpha1Policy> getItems() {
    return items;
  }

  public void setItems(List<ComIbmMcmPolicyV1alpha1Policy> items) {
    this.items = items;
  }

  public ComIbmMcmPolicyV1alpha1PolicyList kind(String kind) {
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

  public ComIbmMcmPolicyV1alpha1PolicyList metadata(ComAcmSearchV1alpha1SearchServiceListMetadata metadata) {
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
    ComIbmMcmPolicyV1alpha1PolicyList comIbmMcmPolicyV1alpha1PolicyList = (ComIbmMcmPolicyV1alpha1PolicyList) o;
    return Objects.equals(this.apiVersion, comIbmMcmPolicyV1alpha1PolicyList.apiVersion) &&
        Objects.equals(this.items, comIbmMcmPolicyV1alpha1PolicyList.items) &&
        Objects.equals(this.kind, comIbmMcmPolicyV1alpha1PolicyList.kind) &&
        Objects.equals(this.metadata, comIbmMcmPolicyV1alpha1PolicyList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComIbmMcmPolicyV1alpha1PolicyList {\n");
    
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
