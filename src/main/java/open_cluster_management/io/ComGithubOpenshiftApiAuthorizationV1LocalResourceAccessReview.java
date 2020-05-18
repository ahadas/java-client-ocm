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
import open_cluster_management.io.IoK8sApimachineryPkgRuntimeRawExtension;

/**
 * LocalResourceAccessReview is a means to request a list of which users and groups are authorized to perform the action specified by spec in a particular namespace
 */
@ApiModel(description = "LocalResourceAccessReview is a means to request a list of which users and groups are authorized to perform the action specified by spec in a particular namespace")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("content")
  private IoK8sApimachineryPkgRuntimeRawExtension content = null;

  @SerializedName("isNonResourceURL")
  private Boolean isNonResourceURL = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("resourceAPIGroup")
  private String resourceAPIGroup = null;

  @SerializedName("resourceAPIVersion")
  private String resourceAPIVersion = null;

  @SerializedName("resourceName")
  private String resourceName = null;

  @SerializedName("verb")
  private String verb = null;

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview content(IoK8sApimachineryPkgRuntimeRawExtension content) {
    this.content = content;
    return this;
  }

   /**
   * Content is the actual content of the request for create and update
   * @return content
  **/
  @ApiModelProperty(value = "Content is the actual content of the request for create and update")
  public IoK8sApimachineryPkgRuntimeRawExtension getContent() {
    return content;
  }

  public void setContent(IoK8sApimachineryPkgRuntimeRawExtension content) {
    this.content = content;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview isNonResourceURL(Boolean isNonResourceURL) {
    this.isNonResourceURL = isNonResourceURL;
    return this;
  }

   /**
   * IsNonResourceURL is true if this is a request for a non-resource URL (outside of the resource hierarchy)
   * @return isNonResourceURL
  **/
  @ApiModelProperty(required = true, value = "IsNonResourceURL is true if this is a request for a non-resource URL (outside of the resource hierarchy)")
  public Boolean isIsNonResourceURL() {
    return isNonResourceURL;
  }

  public void setIsNonResourceURL(Boolean isNonResourceURL) {
    this.isNonResourceURL = isNonResourceURL;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview kind(String kind) {
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

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path is the path of a non resource URL
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is the path of a non resource URL")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Resource is one of the existing resource types
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "Resource is one of the existing resource types")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview resourceAPIGroup(String resourceAPIGroup) {
    this.resourceAPIGroup = resourceAPIGroup;
    return this;
  }

   /**
   * Group is the API group of the resource Serialized as resourceAPIGroup to avoid confusion with the &#39;groups&#39; field when inlined
   * @return resourceAPIGroup
  **/
  @ApiModelProperty(required = true, value = "Group is the API group of the resource Serialized as resourceAPIGroup to avoid confusion with the 'groups' field when inlined")
  public String getResourceAPIGroup() {
    return resourceAPIGroup;
  }

  public void setResourceAPIGroup(String resourceAPIGroup) {
    this.resourceAPIGroup = resourceAPIGroup;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview resourceAPIVersion(String resourceAPIVersion) {
    this.resourceAPIVersion = resourceAPIVersion;
    return this;
  }

   /**
   * Version is the API version of the resource Serialized as resourceAPIVersion to avoid confusion with TypeMeta.apiVersion and ObjectMeta.resourceVersion when inlined
   * @return resourceAPIVersion
  **/
  @ApiModelProperty(required = true, value = "Version is the API version of the resource Serialized as resourceAPIVersion to avoid confusion with TypeMeta.apiVersion and ObjectMeta.resourceVersion when inlined")
  public String getResourceAPIVersion() {
    return resourceAPIVersion;
  }

  public void setResourceAPIVersion(String resourceAPIVersion) {
    this.resourceAPIVersion = resourceAPIVersion;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

   /**
   * ResourceName is the name of the resource being requested for a \&quot;get\&quot; or deleted for a \&quot;delete\&quot;
   * @return resourceName
  **/
  @ApiModelProperty(required = true, value = "ResourceName is the name of the resource being requested for a \"get\" or deleted for a \"delete\"")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Verb is one of: get, list, watch, create, update, delete
   * @return verb
  **/
  @ApiModelProperty(required = true, value = "Verb is one of: get, list, watch, create, update, delete")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview = (ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.apiVersion) &&
        Objects.equals(this.content, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.content) &&
        Objects.equals(this.isNonResourceURL, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.isNonResourceURL) &&
        Objects.equals(this.kind, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.kind) &&
        Objects.equals(this.namespace, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.namespace) &&
        Objects.equals(this.path, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.path) &&
        Objects.equals(this.resource, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.resource) &&
        Objects.equals(this.resourceAPIGroup, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.resourceAPIGroup) &&
        Objects.equals(this.resourceAPIVersion, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.resourceAPIVersion) &&
        Objects.equals(this.resourceName, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.resourceName) &&
        Objects.equals(this.verb, comGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview.verb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, content, isNonResourceURL, kind, namespace, path, resource, resourceAPIGroup, resourceAPIVersion, resourceName, verb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAuthorizationV1LocalResourceAccessReview {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    isNonResourceURL: ").append(toIndentedString(isNonResourceURL)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    resourceAPIGroup: ").append(toIndentedString(resourceAPIGroup)).append("\n");
    sb.append("    resourceAPIVersion: ").append(toIndentedString(resourceAPIVersion)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
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
