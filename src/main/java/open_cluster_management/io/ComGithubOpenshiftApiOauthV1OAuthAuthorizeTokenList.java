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
import open_cluster_management.io.ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ListMeta;

/**
 * OAuthAuthorizeTokenList is a collection of OAuth authorization tokens
 */
@ApiModel(description = "OAuthAuthorizeTokenList is a collection of OAuth authorization tokens")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("items")
  private List<ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken> items = new ArrayList<>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;

  public ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList items(List<ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken> items) {
    this.items = items;
    return this;
  }

  public ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList addItemsItem(ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is the list of OAuth authorization tokens
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Items is the list of OAuth authorization tokens")
  public List<ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken> getItems() {
    return items;
  }

  public void setItems(List<ComGithubOpenshiftApiOauthV1OAuthAuthorizeToken> items) {
    this.items = items;
  }

  public ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList kind(String kind) {
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

  public ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
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
    ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList comGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList = (ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList.apiVersion) &&
        Objects.equals(this.items, comGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList.items) &&
        Objects.equals(this.kind, comGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, items, kind, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiOauthV1OAuthAuthorizeTokenList {\n");
    
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

