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
 * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine. This depends on the Flocker control service being running
 */
@ApiModel(description = "Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker {
  @SerializedName("datasetName")
  private String datasetName = null;

  @SerializedName("datasetUUID")
  private String datasetUUID = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

   /**
   * Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
   * @return datasetName
  **/
  @ApiModelProperty(value = "Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  public String getDatasetName() {
    return datasetName;
  }

  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker datasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }

   /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
   * @return datasetUUID
  **/
  @ApiModelProperty(value = "UUID of the dataset. This is unique identifier of a Flocker dataset")
  public String getDatasetUUID() {
    return datasetUUID;
  }

  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker) o;
    return Objects.equals(this.datasetName, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker.datasetName) &&
        Objects.equals(this.datasetUUID, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpecSpecTemplateSpecFlocker {\n");
    
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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
