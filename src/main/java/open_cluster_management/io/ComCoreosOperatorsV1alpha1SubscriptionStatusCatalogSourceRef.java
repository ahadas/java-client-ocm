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
 * CatalogSourceRef is a reference to a CatalogSource.
 */
@ApiModel(description = "CatalogSourceRef is a reference to a CatalogSource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("fieldPath")
  private String fieldPath = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("resourceVersion")
  private String resourceVersion = null;

  @SerializedName("uid")
  private String uid = null;

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @ApiModelProperty(value = "API version of the referent.")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \&quot;spec.containers{name}\&quot; (where \&quot;name\&quot; refers to the name of the container that triggered the event) or if no container name is specified \&quot;spec.containers[2]\&quot; (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. TODO: this design is not final and this field is subject to change in the future.
   * @return fieldPath
  **/
  @ApiModelProperty(value = "If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \"spec.containers{name}\" (where \"name\" refers to the name of the container that triggered the event) or if no container name is specified \"spec.containers[2]\" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. TODO: this design is not final and this field is subject to change in the future.")
  public String getFieldPath() {
    return fieldPath;
  }

  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @ApiModelProperty(value = "Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency")
  public String getResourceVersion() {
    return resourceVersion;
  }

  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  public ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
   * @return uid
  **/
  @ApiModelProperty(value = "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef = (ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef) o;
    return Objects.equals(this.apiVersion, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.apiVersion) &&
        Objects.equals(this.fieldPath, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.fieldPath) &&
        Objects.equals(this.kind, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.kind) &&
        Objects.equals(this.name, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.name) &&
        Objects.equals(this.namespace, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.namespace) &&
        Objects.equals(this.resourceVersion, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.resourceVersion) &&
        Objects.equals(this.uid, comCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath, kind, name, namespace, resourceVersion, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1SubscriptionStatusCatalogSourceRef {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

