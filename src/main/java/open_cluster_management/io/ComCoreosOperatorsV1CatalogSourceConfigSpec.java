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
 * CatalogSourceConfigSpec defines the desired state of CatalogSourceConfig
 */
@ApiModel(description = "CatalogSourceConfigSpec defines the desired state of CatalogSourceConfig")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1CatalogSourceConfigSpec {
  @SerializedName("csDisplayName")
  private String csDisplayName = null;

  @SerializedName("csPublisher")
  private String csPublisher = null;

  @SerializedName("packages")
  private String packages = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("targetNamespace")
  private String targetNamespace = null;

  public ComCoreosOperatorsV1CatalogSourceConfigSpec csDisplayName(String csDisplayName) {
    this.csDisplayName = csDisplayName;
    return this;
  }

   /**
   * DisplayName is passed along to the CatalogSource to be used as a pretty name.
   * @return csDisplayName
  **/
  @ApiModelProperty(value = "DisplayName is passed along to the CatalogSource to be used as a pretty name.")
  public String getCsDisplayName() {
    return csDisplayName;
  }

  public void setCsDisplayName(String csDisplayName) {
    this.csDisplayName = csDisplayName;
  }

  public ComCoreosOperatorsV1CatalogSourceConfigSpec csPublisher(String csPublisher) {
    this.csPublisher = csPublisher;
    return this;
  }

   /**
   * Publisher is passed along to the CatalogSource to be used to define what entity published the artifacts from the OperatorSource.
   * @return csPublisher
  **/
  @ApiModelProperty(value = "Publisher is passed along to the CatalogSource to be used to define what entity published the artifacts from the OperatorSource.")
  public String getCsPublisher() {
    return csPublisher;
  }

  public void setCsPublisher(String csPublisher) {
    this.csPublisher = csPublisher;
  }

  public ComCoreosOperatorsV1CatalogSourceConfigSpec packages(String packages) {
    this.packages = packages;
    return this;
  }

   /**
   * Get packages
   * @return packages
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPackages() {
    return packages;
  }

  public void setPackages(String packages) {
    this.packages = packages;
  }

  public ComCoreosOperatorsV1CatalogSourceConfigSpec source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The name of the OperatorSource that the packages originate from
   * @return source
  **/
  @ApiModelProperty(required = true, value = "The name of the OperatorSource that the packages originate from")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ComCoreosOperatorsV1CatalogSourceConfigSpec targetNamespace(String targetNamespace) {
    this.targetNamespace = targetNamespace;
    return this;
  }

   /**
   * Get targetNamespace
   * @return targetNamespace
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTargetNamespace() {
    return targetNamespace;
  }

  public void setTargetNamespace(String targetNamespace) {
    this.targetNamespace = targetNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1CatalogSourceConfigSpec comCoreosOperatorsV1CatalogSourceConfigSpec = (ComCoreosOperatorsV1CatalogSourceConfigSpec) o;
    return Objects.equals(this.csDisplayName, comCoreosOperatorsV1CatalogSourceConfigSpec.csDisplayName) &&
        Objects.equals(this.csPublisher, comCoreosOperatorsV1CatalogSourceConfigSpec.csPublisher) &&
        Objects.equals(this.packages, comCoreosOperatorsV1CatalogSourceConfigSpec.packages) &&
        Objects.equals(this.source, comCoreosOperatorsV1CatalogSourceConfigSpec.source) &&
        Objects.equals(this.targetNamespace, comCoreosOperatorsV1CatalogSourceConfigSpec.targetNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csDisplayName, csPublisher, packages, source, targetNamespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1CatalogSourceConfigSpec {\n");
    
    sb.append("    csDisplayName: ").append(toIndentedString(csDisplayName)).append("\n");
    sb.append("    csPublisher: ").append(toIndentedString(csPublisher)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    targetNamespace: ").append(toIndentedString(targetNamespace)).append("\n");
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
