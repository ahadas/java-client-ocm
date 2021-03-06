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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs;
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector;

/**
 * ClusterServiceVersionSpec declarations tell OLM how to install an operator that can manage apps for a given version.
 */
@ApiModel(description = "ClusterServiceVersionSpec declarations tell OLM how to install an operator that can manage apps for a given version.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec {
  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("apiservicedefinitions")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions apiservicedefinitions = null;

  @SerializedName("customresourcedefinitions")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions customresourcedefinitions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("icon")
  private List<ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon> icon = null;

  @SerializedName("install")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall install = null;

  @SerializedName("installModes")
  private List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes> installModes = null;

  @SerializedName("keywords")
  private List<String> keywords = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("links")
  private List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks> links = null;

  @SerializedName("maintainers")
  private List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers> maintainers = null;

  @SerializedName("maturity")
  private String maturity = null;

  @SerializedName("minKubeVersion")
  private String minKubeVersion = null;

  @SerializedName("nativeAPIs")
  private List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs> nativeAPIs = null;

  @SerializedName("provider")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks provider = null;

  @SerializedName("replaces")
  private String replaces = null;

  @SerializedName("selector")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector selector = null;

  @SerializedName("version")
  private String version = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.
   * @return annotations
  **/
  @ApiModelProperty(value = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata.")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec apiservicedefinitions(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions apiservicedefinitions) {
    this.apiservicedefinitions = apiservicedefinitions;
    return this;
  }

   /**
   * Get apiservicedefinitions
   * @return apiservicedefinitions
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions getApiservicedefinitions() {
    return apiservicedefinitions;
  }

  public void setApiservicedefinitions(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecApiservicedefinitions apiservicedefinitions) {
    this.apiservicedefinitions = apiservicedefinitions;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec customresourcedefinitions(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions customresourcedefinitions) {
    this.customresourcedefinitions = customresourcedefinitions;
    return this;
  }

   /**
   * Get customresourcedefinitions
   * @return customresourcedefinitions
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions getCustomresourcedefinitions() {
    return customresourcedefinitions;
  }

  public void setCustomresourcedefinitions(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecCustomresourcedefinitions customresourcedefinitions) {
    this.customresourcedefinitions = customresourcedefinitions;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec icon(List<ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon> icon) {
    this.icon = icon;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addIconItem(ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon iconItem) {
    if (this.icon == null) {
      this.icon = new ArrayList<>();
    }
    this.icon.add(iconItem);
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public List<ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon> getIcon() {
    return icon;
  }

  public void setIcon(List<ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon> icon) {
    this.icon = icon;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec install(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall install) {
    this.install = install;
    return this;
  }

   /**
   * Get install
   * @return install
  **/
  @ApiModelProperty(required = true, value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall getInstall() {
    return install;
  }

  public void setInstall(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall install) {
    this.install = install;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec installModes(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes> installModes) {
    this.installModes = installModes;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addInstallModesItem(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes installModesItem) {
    if (this.installModes == null) {
      this.installModes = new ArrayList<>();
    }
    this.installModes.add(installModesItem);
    return this;
  }

   /**
   * InstallModes specify supported installation types
   * @return installModes
  **/
  @ApiModelProperty(value = "InstallModes specify supported installation types")
  public List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes> getInstallModes() {
    return installModes;
  }

  public void setInstallModes(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallModes> installModes) {
    this.installModes = installModes;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(value = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects.
   * @return labels
  **/
  @ApiModelProperty(value = "Map of string keys and values that can be used to organize and categorize (scope and select) objects.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec links(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks> links) {
    this.links = links;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addLinksItem(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks> getLinks() {
    return links;
  }

  public void setLinks(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks> links) {
    this.links = links;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec maintainers(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers> maintainers) {
    this.maintainers = maintainers;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addMaintainersItem(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers maintainersItem) {
    if (this.maintainers == null) {
      this.maintainers = new ArrayList<>();
    }
    this.maintainers.add(maintainersItem);
    return this;
  }

   /**
   * Get maintainers
   * @return maintainers
  **/
  @ApiModelProperty(value = "")
  public List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers> getMaintainers() {
    return maintainers;
  }

  public void setMaintainers(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecMaintainers> maintainers) {
    this.maintainers = maintainers;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec maturity(String maturity) {
    this.maturity = maturity;
    return this;
  }

   /**
   * Get maturity
   * @return maturity
  **/
  @ApiModelProperty(value = "")
  public String getMaturity() {
    return maturity;
  }

  public void setMaturity(String maturity) {
    this.maturity = maturity;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec minKubeVersion(String minKubeVersion) {
    this.minKubeVersion = minKubeVersion;
    return this;
  }

   /**
   * Get minKubeVersion
   * @return minKubeVersion
  **/
  @ApiModelProperty(value = "")
  public String getMinKubeVersion() {
    return minKubeVersion;
  }

  public void setMinKubeVersion(String minKubeVersion) {
    this.minKubeVersion = minKubeVersion;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec nativeAPIs(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs> nativeAPIs) {
    this.nativeAPIs = nativeAPIs;
    return this;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec addNativeAPIsItem(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs nativeAPIsItem) {
    if (this.nativeAPIs == null) {
      this.nativeAPIs = new ArrayList<>();
    }
    this.nativeAPIs.add(nativeAPIsItem);
    return this;
  }

   /**
   * Get nativeAPIs
   * @return nativeAPIs
  **/
  @ApiModelProperty(value = "")
  public List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs> getNativeAPIs() {
    return nativeAPIs;
  }

  public void setNativeAPIs(List<ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecNativeAPIs> nativeAPIs) {
    this.nativeAPIs = nativeAPIs;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec provider(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks getProvider() {
    return provider;
  }

  public void setProvider(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecLinks provider) {
    this.provider = provider;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec replaces(String replaces) {
    this.replaces = replaces;
    return this;
  }

   /**
   * The name of a CSV this one replaces. Should match the &#x60;metadata.Name&#x60; field of the old CSV.
   * @return replaces
  **/
  @ApiModelProperty(value = "The name of a CSV this one replaces. Should match the `metadata.Name` field of the old CSV.")
  public String getReplaces() {
    return replaces;
  }

  public void setReplaces(String replaces) {
    this.replaces = replaces;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec selector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector getSelector() {
    return selector;
  }

  public void setSelector(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecSelector selector) {
    this.selector = selector;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * OperatorVersion is a wrapper around semver.Version which supports correct marshaling to YAML and JSON.
   * @return version
  **/
  @ApiModelProperty(value = "OperatorVersion is a wrapper around semver.Version which supports correct marshaling to YAML and JSON.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec comCoreosOperatorsV1alpha1ClusterServiceVersionSpec = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec) o;
    return Objects.equals(this.annotations, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.annotations) &&
        Objects.equals(this.apiservicedefinitions, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.apiservicedefinitions) &&
        Objects.equals(this.customresourcedefinitions, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.customresourcedefinitions) &&
        Objects.equals(this.description, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.description) &&
        Objects.equals(this.displayName, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.displayName) &&
        Objects.equals(this.icon, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.icon) &&
        Objects.equals(this.install, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.install) &&
        Objects.equals(this.installModes, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.installModes) &&
        Objects.equals(this.keywords, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.keywords) &&
        Objects.equals(this.labels, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.labels) &&
        Objects.equals(this.links, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.links) &&
        Objects.equals(this.maintainers, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.maintainers) &&
        Objects.equals(this.maturity, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.maturity) &&
        Objects.equals(this.minKubeVersion, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.minKubeVersion) &&
        Objects.equals(this.nativeAPIs, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.nativeAPIs) &&
        Objects.equals(this.provider, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.provider) &&
        Objects.equals(this.replaces, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.replaces) &&
        Objects.equals(this.selector, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.selector) &&
        Objects.equals(this.version, comCoreosOperatorsV1alpha1ClusterServiceVersionSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, apiservicedefinitions, customresourcedefinitions, description, displayName, icon, install, installModes, keywords, labels, links, maintainers, maturity, minKubeVersion, nativeAPIs, provider, replaces, selector, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpec {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    apiservicedefinitions: ").append(toIndentedString(apiservicedefinitions)).append("\n");
    sb.append("    customresourcedefinitions: ").append(toIndentedString(customresourcedefinitions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    install: ").append(toIndentedString(install)).append("\n");
    sb.append("    installModes: ").append(toIndentedString(installModes)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
    sb.append("    maturity: ").append(toIndentedString(maturity)).append("\n");
    sb.append("    minKubeVersion: ").append(toIndentedString(minKubeVersion)).append("\n");
    sb.append("    nativeAPIs: ").append(toIndentedString(nativeAPIs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    replaces: ").append(toIndentedString(replaces)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

