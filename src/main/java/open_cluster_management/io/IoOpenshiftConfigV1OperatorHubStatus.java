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
import open_cluster_management.io.IoOpenshiftConfigV1OperatorHubStatusSources;

/**
 * OperatorHubStatus defines the observed state of OperatorHub. The current state of the default hub sources will always be reflected here.
 */
@ApiModel(description = "OperatorHubStatus defines the observed state of OperatorHub. The current state of the default hub sources will always be reflected here.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1OperatorHubStatus {
  @SerializedName("sources")
  private List<IoOpenshiftConfigV1OperatorHubStatusSources> sources = null;

  public IoOpenshiftConfigV1OperatorHubStatus sources(List<IoOpenshiftConfigV1OperatorHubStatusSources> sources) {
    this.sources = sources;
    return this;
  }

  public IoOpenshiftConfigV1OperatorHubStatus addSourcesItem(IoOpenshiftConfigV1OperatorHubStatusSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * sources encapsulates the result of applying the configuration for each hub source
   * @return sources
  **/
  @ApiModelProperty(value = "sources encapsulates the result of applying the configuration for each hub source")
  public List<IoOpenshiftConfigV1OperatorHubStatusSources> getSources() {
    return sources;
  }

  public void setSources(List<IoOpenshiftConfigV1OperatorHubStatusSources> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1OperatorHubStatus ioOpenshiftConfigV1OperatorHubStatus = (IoOpenshiftConfigV1OperatorHubStatus) o;
    return Objects.equals(this.sources, ioOpenshiftConfigV1OperatorHubStatus.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1OperatorHubStatus {\n");
    
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

