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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon;

/**
 * ComCoreosOperatorsV1alpha1CatalogSourceSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1CatalogSourceSpec {
  @SerializedName("address")
  private String address = null;

  @SerializedName("configMap")
  private String configMap = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("icon")
  private ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon icon = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("publisher")
  private String publisher = null;

  @SerializedName("secrets")
  private List<String> secrets = null;

  @SerializedName("sourceType")
  private String sourceType = null;

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address is a host that OLM can use to connect to a pre-existing registry. Format: &lt;registry-host or ip&gt;:&lt;port&gt; Only used when SourceType &#x3D; SourceTypeGrpc. Ignored when the Image field is set.
   * @return address
  **/
  @ApiModelProperty(value = "Address is a host that OLM can use to connect to a pre-existing registry. Format: <registry-host or ip>:<port> Only used when SourceType = SourceTypeGrpc. Ignored when the Image field is set.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec configMap(String configMap) {
    this.configMap = configMap;
    return this;
  }

   /**
   * ConfigMap is the name of the ConfigMap to be used to back a configmap-server registry. Only used when SourceType &#x3D; SourceTypeConfigmap or SourceTypeInternal.
   * @return configMap
  **/
  @ApiModelProperty(value = "ConfigMap is the name of the ConfigMap to be used to back a configmap-server registry. Only used when SourceType = SourceTypeConfigmap or SourceTypeInternal.")
  public String getConfigMap() {
    return configMap;
  }

  public void setConfigMap(String configMap) {
    this.configMap = configMap;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec description(String description) {
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

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Metadata
   * @return displayName
  **/
  @ApiModelProperty(value = "Metadata")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec icon(ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon getIcon() {
    return icon;
  }

  public void setIcon(ComCoreosOperatorsV1alpha1CatalogSourceSpecIcon icon) {
    this.icon = icon;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image is an operator-registry container image to instantiate a registry-server with. Only used when SourceType &#x3D; SourceTypeGrpc. If present, the address field is ignored.
   * @return image
  **/
  @ApiModelProperty(value = "Image is an operator-registry container image to instantiate a registry-server with. Only used when SourceType = SourceTypeGrpc. If present, the address field is ignored.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @ApiModelProperty(value = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec secrets(List<String> secrets) {
    this.secrets = secrets;
    return this;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec addSecretsItem(String secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Secrets represent set of secrets that can be used to access the contents of the catalog. It is best to keep this list small, since each will need to be tried for every catalog entry.
   * @return secrets
  **/
  @ApiModelProperty(value = "Secrets represent set of secrets that can be used to access the contents of the catalog. It is best to keep this list small, since each will need to be tried for every catalog entry.")
  public List<String> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<String> secrets) {
    this.secrets = secrets;
  }

  public ComCoreosOperatorsV1alpha1CatalogSourceSpec sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * SourceType is the type of source
   * @return sourceType
  **/
  @ApiModelProperty(required = true, value = "SourceType is the type of source")
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1CatalogSourceSpec comCoreosOperatorsV1alpha1CatalogSourceSpec = (ComCoreosOperatorsV1alpha1CatalogSourceSpec) o;
    return Objects.equals(this.address, comCoreosOperatorsV1alpha1CatalogSourceSpec.address) &&
        Objects.equals(this.configMap, comCoreosOperatorsV1alpha1CatalogSourceSpec.configMap) &&
        Objects.equals(this.description, comCoreosOperatorsV1alpha1CatalogSourceSpec.description) &&
        Objects.equals(this.displayName, comCoreosOperatorsV1alpha1CatalogSourceSpec.displayName) &&
        Objects.equals(this.icon, comCoreosOperatorsV1alpha1CatalogSourceSpec.icon) &&
        Objects.equals(this.image, comCoreosOperatorsV1alpha1CatalogSourceSpec.image) &&
        Objects.equals(this.publisher, comCoreosOperatorsV1alpha1CatalogSourceSpec.publisher) &&
        Objects.equals(this.secrets, comCoreosOperatorsV1alpha1CatalogSourceSpec.secrets) &&
        Objects.equals(this.sourceType, comCoreosOperatorsV1alpha1CatalogSourceSpec.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, configMap, description, displayName, icon, image, publisher, secrets, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1CatalogSourceSpec {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

