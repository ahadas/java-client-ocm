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
import open_cluster_management.io.IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion;
import open_cluster_management.io.IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames;
import open_cluster_management.io.IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion;

/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 */
@ApiModel(description = "CustomResourceDefinitionSpec describes how a user wants their resource to appear")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec {
  @SerializedName("conversion")
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion conversion = null;

  @SerializedName("group")
  private String group = null;

  @SerializedName("names")
  private IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames names = null;

  @SerializedName("preserveUnknownFields")
  private Boolean preserveUnknownFields = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("versions")
  private List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion> versions = new ArrayList<>();

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec conversion(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion conversion) {
    this.conversion = conversion;
    return this;
  }

   /**
   * conversion defines conversion settings for the CRD.
   * @return conversion
  **/
  @ApiModelProperty(value = "conversion defines conversion settings for the CRD.")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion getConversion() {
    return conversion;
  }

  public void setConversion(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceConversion conversion) {
    this.conversion = conversion;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec group(String group) {
    this.group = group;
    return this;
  }

   /**
   * group is the API group of the defined custom resource. The custom resources are served under &#x60;/apis/&lt;group&gt;/...&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;).
   * @return group
  **/
  @ApiModelProperty(required = true, value = "group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec names(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames names) {
    this.names = names;
    return this;
  }

   /**
   * names specify the resource and kind names for the custom resource.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "names specify the resource and kind names for the custom resource.")
  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames getNames() {
    return names;
  }

  public void setNames(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames names) {
    this.names = names;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec preserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
    return this;
  }

   /**
   * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting &#x60;x-preserve-unknown-fields&#x60; to true in &#x60;spec.versions[*].schema.openAPIV3Schema&#x60;. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
   * @return preserveUnknownFields
  **/
  @ApiModelProperty(value = "preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. This field is deprecated in favor of setting `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.")
  public Boolean isPreserveUnknownFields() {
    return preserveUnknownFields;
  }

  public void setPreserveUnknownFields(Boolean preserveUnknownFields) {
    this.preserveUnknownFields = preserveUnknownFields;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are &#x60;Cluster&#x60; and &#x60;Namespaced&#x60;. Default is &#x60;Namespaced&#x60;.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec versions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec addVersionsItem(IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion versionsItem) {
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \&quot;kube-like\&quot;, it will sort above non \&quot;kube-like\&quot; version strings, which are ordered lexicographically. \&quot;Kube-like\&quot; versions start with a \&quot;v\&quot;, then are followed by a number (the major version), then optionally the string \&quot;alpha\&quot; or \&quot;beta\&quot; and another number (the minor version). These are sorted first by GA &gt; beta &gt; alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
   * @return versions
  **/
  @ApiModelProperty(required = true, value = "versions is the list of all API versions of the defined custom resource. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is \"kube-like\", it will sort above non \"kube-like\" version strings, which are ordered lexicographically. \"Kube-like\" versions start with a \"v\", then are followed by a number (the major version), then optionally the string \"alpha\" or \"beta\" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.")
  public List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionVersion> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec = (IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec) o;
    return Objects.equals(this.conversion, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.conversion) &&
        Objects.equals(this.group, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.group) &&
        Objects.equals(this.names, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.names) &&
        Objects.equals(this.preserveUnknownFields, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.preserveUnknownFields) &&
        Objects.equals(this.scope, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.scope) &&
        Objects.equals(this.versions, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversion, group, names, preserveUnknownFields, scope, versions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionSpec {\n");
    
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    preserveUnknownFields: ").append(toIndentedString(preserveUnknownFields)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

