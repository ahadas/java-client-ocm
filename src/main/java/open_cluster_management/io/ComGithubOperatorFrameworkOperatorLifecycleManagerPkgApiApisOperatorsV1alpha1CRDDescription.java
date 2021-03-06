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
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor;
import open_cluster_management.io.ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor;

/**
 * CRDDescription provides details to OLM about the CRDs
 */
@ApiModel(description = "CRDDescription provides details to OLM about the CRDs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription {
  @SerializedName("actionDescriptors")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor> actionDescriptors = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("resources")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference> resources = null;

  @SerializedName("specDescriptors")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor> specDescriptors = null;

  @SerializedName("statusDescriptors")
  private List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor> statusDescriptors = null;

  @SerializedName("version")
  private String version = null;

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription actionDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor> actionDescriptors) {
    this.actionDescriptors = actionDescriptors;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription addActionDescriptorsItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor actionDescriptorsItem) {
    if (this.actionDescriptors == null) {
      this.actionDescriptors = new ArrayList<>();
    }
    this.actionDescriptors.add(actionDescriptorsItem);
    return this;
  }

   /**
   * Get actionDescriptors
   * @return actionDescriptors
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor> getActionDescriptors() {
    return actionDescriptors;
  }

  public void setActionDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1ActionDescriptor> actionDescriptors) {
    this.actionDescriptors = actionDescriptors;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription description(String description) {
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

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription resources(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference> resources) {
    this.resources = resources;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription addResourcesItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference> getResources() {
    return resources;
  }

  public void setResources(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1APIResourceReference> resources) {
    this.resources = resources;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription specDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor> specDescriptors) {
    this.specDescriptors = specDescriptors;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription addSpecDescriptorsItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor specDescriptorsItem) {
    if (this.specDescriptors == null) {
      this.specDescriptors = new ArrayList<>();
    }
    this.specDescriptors.add(specDescriptorsItem);
    return this;
  }

   /**
   * Get specDescriptors
   * @return specDescriptors
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor> getSpecDescriptors() {
    return specDescriptors;
  }

  public void setSpecDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1SpecDescriptor> specDescriptors) {
    this.specDescriptors = specDescriptors;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription statusDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor> statusDescriptors) {
    this.statusDescriptors = statusDescriptors;
    return this;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription addStatusDescriptorsItem(ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor statusDescriptorsItem) {
    if (this.statusDescriptors == null) {
      this.statusDescriptors = new ArrayList<>();
    }
    this.statusDescriptors.add(statusDescriptorsItem);
    return this;
  }

   /**
   * Get statusDescriptors
   * @return statusDescriptors
  **/
  @ApiModelProperty(value = "")
  public List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor> getStatusDescriptors() {
    return statusDescriptors;
  }

  public void setStatusDescriptors(List<ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1StatusDescriptor> statusDescriptors) {
    this.statusDescriptors = statusDescriptors;
  }

  public ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")
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
    ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription = (ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription) o;
    return Objects.equals(this.actionDescriptors, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.actionDescriptors) &&
        Objects.equals(this.description, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.description) &&
        Objects.equals(this.displayName, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.displayName) &&
        Objects.equals(this.kind, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.kind) &&
        Objects.equals(this.name, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.name) &&
        Objects.equals(this.resources, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.resources) &&
        Objects.equals(this.specDescriptors, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.specDescriptors) &&
        Objects.equals(this.statusDescriptors, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.statusDescriptors) &&
        Objects.equals(this.version, comGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDescriptors, description, displayName, kind, name, resources, specDescriptors, statusDescriptors, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOperatorFrameworkOperatorLifecycleManagerPkgApiApisOperatorsV1alpha1CRDDescription {\n");
    
    sb.append("    actionDescriptors: ").append(toIndentedString(actionDescriptors)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    specDescriptors: ").append(toIndentedString(specDescriptors)).append("\n");
    sb.append("    statusDescriptors: ").append(toIndentedString(statusDescriptors)).append("\n");
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

