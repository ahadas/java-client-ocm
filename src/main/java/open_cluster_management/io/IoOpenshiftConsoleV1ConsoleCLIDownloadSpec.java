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
import open_cluster_management.io.IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks;

/**
 * ConsoleCLIDownloadSpec is the desired cli download configuration.
 */
@ApiModel(description = "ConsoleCLIDownloadSpec is the desired cli download configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConsoleV1ConsoleCLIDownloadSpec {
  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("links")
  private List<IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks> links = new ArrayList<>();

  public IoOpenshiftConsoleV1ConsoleCLIDownloadSpec description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description is the description of the CLI download (can include markdown).
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description is the description of the CLI download (can include markdown).")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IoOpenshiftConsoleV1ConsoleCLIDownloadSpec displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * displayName is the display name of the CLI download.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "displayName is the display name of the CLI download.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public IoOpenshiftConsoleV1ConsoleCLIDownloadSpec links(List<IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks> links) {
    this.links = links;
    return this;
  }

  public IoOpenshiftConsoleV1ConsoleCLIDownloadSpec addLinksItem(IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * links is a list of objects that provide CLI download link details.
   * @return links
  **/
  @ApiModelProperty(required = true, value = "links is a list of objects that provide CLI download link details.")
  public List<IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks> getLinks() {
    return links;
  }

  public void setLinks(List<IoOpenshiftConsoleV1ConsoleCLIDownloadSpecLinks> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConsoleV1ConsoleCLIDownloadSpec ioOpenshiftConsoleV1ConsoleCLIDownloadSpec = (IoOpenshiftConsoleV1ConsoleCLIDownloadSpec) o;
    return Objects.equals(this.description, ioOpenshiftConsoleV1ConsoleCLIDownloadSpec.description) &&
        Objects.equals(this.displayName, ioOpenshiftConsoleV1ConsoleCLIDownloadSpec.displayName) &&
        Objects.equals(this.links, ioOpenshiftConsoleV1ConsoleCLIDownloadSpec.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, displayName, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConsoleV1ConsoleCLIDownloadSpec {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

