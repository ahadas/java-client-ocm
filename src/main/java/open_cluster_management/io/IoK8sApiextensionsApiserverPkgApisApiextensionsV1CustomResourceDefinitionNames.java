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
 * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
 */
@ApiModel(description = "CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames {
  @SerializedName("categories")
  private List<String> categories = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("listKind")
  private String listKind = null;

  @SerializedName("plural")
  private String plural = null;

  @SerializedName("shortNames")
  private List<String> shortNames = null;

  @SerializedName("singular")
  private String singular = null;

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * categories is a list of grouped resources this custom resource belongs to (e.g. &#39;all&#39;). This is published in API discovery documents, and used by clients to support invocations like &#x60;kubectl get all&#x60;.
   * @return categories
  **/
  @ApiModelProperty(value = "categories is a list of grouped resources this custom resource belongs to (e.g. 'all'). This is published in API discovery documents, and used by clients to support invocations like `kubectl get all`.")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the &#x60;kind&#x60; attribute in API calls.
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom resource instances will use this value as the `kind` attribute in API calls.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames listKind(String listKind) {
    this.listKind = listKind;
    return this;
  }

   /**
   * listKind is the serialized kind of the list for this resource. Defaults to \&quot;&#x60;kind&#x60;List\&quot;.
   * @return listKind
  **/
  @ApiModelProperty(value = "listKind is the serialized kind of the list for this resource. Defaults to \"`kind`List\".")
  public String getListKind() {
    return listKind;
  }

  public void setListKind(String listKind) {
    this.listKind = listKind;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames plural(String plural) {
    this.plural = plural;
    return this;
  }

   /**
   * plural is the plural name of the resource to serve. The custom resources are served under &#x60;/apis/&lt;group&gt;/&lt;version&gt;/.../&lt;plural&gt;&#x60;. Must match the name of the CustomResourceDefinition (in the form &#x60;&lt;names.plural&gt;.&lt;group&gt;&#x60;). Must be all lowercase.
   * @return plural
  **/
  @ApiModelProperty(required = true, value = "plural is the plural name of the resource to serve. The custom resources are served under `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`). Must be all lowercase.")
  public String getPlural() {
    return plural;
  }

  public void setPlural(String plural) {
    this.plural = plural;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames shortNames(List<String> shortNames) {
    this.shortNames = shortNames;
    return this;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames addShortNamesItem(String shortNamesItem) {
    if (this.shortNames == null) {
      this.shortNames = new ArrayList<>();
    }
    this.shortNames.add(shortNamesItem);
    return this;
  }

   /**
   * shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like &#x60;kubectl get &lt;shortname&gt;&#x60;. It must be all lowercase.
   * @return shortNames
  **/
  @ApiModelProperty(value = "shortNames are short names for the resource, exposed in API discovery documents, and used by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.")
  public List<String> getShortNames() {
    return shortNames;
  }

  public void setShortNames(List<String> shortNames) {
    this.shortNames = shortNames;
  }

  public IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames singular(String singular) {
    this.singular = singular;
    return this;
  }

   /**
   * singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased &#x60;kind&#x60;.
   * @return singular
  **/
  @ApiModelProperty(value = "singular is the singular name of the resource. It must be all lowercase. Defaults to lowercased `kind`.")
  public String getSingular() {
    return singular;
  }

  public void setSingular(String singular) {
    this.singular = singular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames = (IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames) o;
    return Objects.equals(this.categories, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.categories) &&
        Objects.equals(this.kind, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.kind) &&
        Objects.equals(this.listKind, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.listKind) &&
        Objects.equals(this.plural, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.plural) &&
        Objects.equals(this.shortNames, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.shortNames) &&
        Objects.equals(this.singular, ioK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames.singular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, kind, listKind, plural, shortNames, singular);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiextensionsApiserverPkgApisApiextensionsV1CustomResourceDefinitionNames {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    listKind: ").append(toIndentedString(listKind)).append("\n");
    sb.append("    plural: ").append(toIndentedString(plural)).append("\n");
    sb.append("    shortNames: ").append(toIndentedString(shortNames)).append("\n");
    sb.append("    singular: ").append(toIndentedString(singular)).append("\n");
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

