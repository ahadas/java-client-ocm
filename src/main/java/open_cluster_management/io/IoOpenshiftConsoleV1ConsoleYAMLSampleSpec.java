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
import open_cluster_management.io.IoOpenshiftConsoleV1ConsoleYAMLSampleSpecTargetResource;

/**
 * ConsoleYAMLSampleSpec is the desired YAML sample configuration. Samples will appear with their descriptions in a samples sidebar when creating a resources in the web console.
 */
@ApiModel(description = "ConsoleYAMLSampleSpec is the desired YAML sample configuration. Samples will appear with their descriptions in a samples sidebar when creating a resources in the web console.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConsoleV1ConsoleYAMLSampleSpec {
  @SerializedName("description")
  private String description = null;

  @SerializedName("snippet")
  private Boolean snippet = null;

  @SerializedName("targetResource")
  private IoOpenshiftConsoleV1ConsoleYAMLSampleSpecTargetResource targetResource = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("yaml")
  private String yaml = null;

  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpec description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the YAML sample.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description of the YAML sample.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpec snippet(Boolean snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * snippet indicates that the YAML sample is not the full YAML resource definition, but a fragment that can be inserted into the existing YAML document at the user&#39;s cursor.
   * @return snippet
  **/
  @ApiModelProperty(value = "snippet indicates that the YAML sample is not the full YAML resource definition, but a fragment that can be inserted into the existing YAML document at the user's cursor.")
  public Boolean isSnippet() {
    return snippet;
  }

  public void setSnippet(Boolean snippet) {
    this.snippet = snippet;
  }

  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpec targetResource(IoOpenshiftConsoleV1ConsoleYAMLSampleSpecTargetResource targetResource) {
    this.targetResource = targetResource;
    return this;
  }

   /**
   * Get targetResource
   * @return targetResource
  **/
  @ApiModelProperty(required = true, value = "")
  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpecTargetResource getTargetResource() {
    return targetResource;
  }

  public void setTargetResource(IoOpenshiftConsoleV1ConsoleYAMLSampleSpecTargetResource targetResource) {
    this.targetResource = targetResource;
  }

  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpec title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title of the YAML sample.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "title of the YAML sample.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IoOpenshiftConsoleV1ConsoleYAMLSampleSpec yaml(String yaml) {
    this.yaml = yaml;
    return this;
  }

   /**
   * yaml is the YAML sample to display.
   * @return yaml
  **/
  @ApiModelProperty(required = true, value = "yaml is the YAML sample to display.")
  public String getYaml() {
    return yaml;
  }

  public void setYaml(String yaml) {
    this.yaml = yaml;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConsoleV1ConsoleYAMLSampleSpec ioOpenshiftConsoleV1ConsoleYAMLSampleSpec = (IoOpenshiftConsoleV1ConsoleYAMLSampleSpec) o;
    return Objects.equals(this.description, ioOpenshiftConsoleV1ConsoleYAMLSampleSpec.description) &&
        Objects.equals(this.snippet, ioOpenshiftConsoleV1ConsoleYAMLSampleSpec.snippet) &&
        Objects.equals(this.targetResource, ioOpenshiftConsoleV1ConsoleYAMLSampleSpec.targetResource) &&
        Objects.equals(this.title, ioOpenshiftConsoleV1ConsoleYAMLSampleSpec.title) &&
        Objects.equals(this.yaml, ioOpenshiftConsoleV1ConsoleYAMLSampleSpec.yaml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, snippet, targetResource, title, yaml);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConsoleV1ConsoleYAMLSampleSpec {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
    sb.append("    targetResource: ").append(toIndentedString(targetResource)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    yaml: ").append(toIndentedString(yaml)).append("\n");
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
