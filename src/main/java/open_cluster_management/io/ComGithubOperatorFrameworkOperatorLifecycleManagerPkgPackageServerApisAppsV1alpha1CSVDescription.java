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
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIServiceDefinitions;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CustomResourceDefinitions;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1AppLink;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon;

/**
 * CSVDescription defines a description of a CSV
 */
@ApiModel(description = "CSVDescription defines a description of a CSV")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription {
  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("apiservicedefinitions")
  private ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIServiceDefinitions apiservicedefinitions = null;

  @SerializedName("customresourcedefinitions")
  private ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CustomResourceDefinitions customresourcedefinitions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("icon")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon> icon = null;

  @SerializedName("installModes")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode> installModes = null;

  @SerializedName("provider")
  private ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1AppLink provider = null;

  @SerializedName("version")
  private String version = null;

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription apiservicedefinitions(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIServiceDefinitions apiservicedefinitions) {
    this.apiservicedefinitions = apiservicedefinitions;
    return this;
  }

   /**
   * Get apiservicedefinitions
   * @return apiservicedefinitions
  **/
  @ApiModelProperty(value = "")
  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIServiceDefinitions getApiservicedefinitions() {
    return apiservicedefinitions;
  }

  public void setApiservicedefinitions(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIServiceDefinitions apiservicedefinitions) {
    this.apiservicedefinitions = apiservicedefinitions;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription customresourcedefinitions(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CustomResourceDefinitions customresourcedefinitions) {
    this.customresourcedefinitions = customresourcedefinitions;
    return this;
  }

   /**
   * Get customresourcedefinitions
   * @return customresourcedefinitions
  **/
  @ApiModelProperty(value = "")
  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CustomResourceDefinitions getCustomresourcedefinitions() {
    return customresourcedefinitions;
  }

  public void setCustomresourcedefinitions(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CustomResourceDefinitions customresourcedefinitions) {
    this.customresourcedefinitions = customresourcedefinitions;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription description(String description) {
    this.description = description;
    return this;
  }

   /**
   * LongDescription is the CSV&#39;s description
   * @return description
  **/
  @ApiModelProperty(value = "LongDescription is the CSV's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * DisplayName is the CSV&#39;s display name
   * @return displayName
  **/
  @ApiModelProperty(value = "DisplayName is the CSV's display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription icon(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon> icon) {
    this.icon = icon;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription addIconItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon iconItem) {
    if (this.icon == null) {
      this.icon = new ArrayList<>();
    }
    this.icon.add(iconItem);
    return this;
  }

   /**
   * Icon is the CSV&#39;s base64 encoded icon
   * @return icon
  **/
  @ApiModelProperty(value = "Icon is the CSV's base64 encoded icon")
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon> getIcon() {
    return icon;
  }

  public void setIcon(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1Icon> icon) {
    this.icon = icon;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription installModes(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode> installModes) {
    this.installModes = installModes;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription addInstallModesItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode installModesItem) {
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
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode> getInstallModes() {
    return installModes;
  }

  public void setInstallModes(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1InstallMode> installModes) {
    this.installModes = installModes;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription provider(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1AppLink provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Provider is the CSV&#39;s provider
   * @return provider
  **/
  @ApiModelProperty(value = "Provider is the CSV's provider")
  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1AppLink getProvider() {
    return provider;
  }

  public void setProvider(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1AppLink provider) {
    this.provider = provider;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version is the CSV&#39;s semantic version
   * @return version
  **/
  @ApiModelProperty(value = "Version is the CSV's semantic version")
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
    ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription = (ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription) o;
    return Objects.equals(this.annotations, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.annotations) &&
        Objects.equals(this.apiservicedefinitions, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.apiservicedefinitions) &&
        Objects.equals(this.customresourcedefinitions, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.customresourcedefinitions) &&
        Objects.equals(this.description, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.description) &&
        Objects.equals(this.displayName, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.displayName) &&
        Objects.equals(this.icon, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.icon) &&
        Objects.equals(this.installModes, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.installModes) &&
        Objects.equals(this.provider, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.provider) &&
        Objects.equals(this.version, comGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, apiservicedefinitions, customresourcedefinitions, description, displayName, icon, installModes, provider, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgPackageServerApisAppsV1alpha1CSVDescription {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    apiservicedefinitions: ").append(toIndentedString(apiservicedefinitions)).append("\n");
    sb.append("    customresourcedefinitions: ").append(toIndentedString(customresourcedefinitions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    installModes: ").append(toIndentedString(installModes)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

