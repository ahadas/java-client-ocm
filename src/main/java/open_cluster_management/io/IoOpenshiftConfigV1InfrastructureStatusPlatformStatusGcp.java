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
 * GCP contains settings specific to the Google Cloud Platform infrastructure provider.
 */
@ApiModel(description = "GCP contains settings specific to the Google Cloud Platform infrastructure provider.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp {
  @SerializedName("projectID")
  private String projectID = null;

  @SerializedName("region")
  private String region = null;

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }

   /**
   * resourceGroupName is the Project ID for new GCP resources created for the cluster.
   * @return projectID
  **/
  @ApiModelProperty(value = "resourceGroupName is the Project ID for new GCP resources created for the cluster.")
  public String getProjectID() {
    return projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  public IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp region(String region) {
    this.region = region;
    return this;
  }

   /**
   * region holds the region for new GCP resources created for the cluster.
   * @return region
  **/
  @ApiModelProperty(value = "region holds the region for new GCP resources created for the cluster.")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp ioOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp = (IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp) o;
    return Objects.equals(this.projectID, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp.projectID) &&
        Objects.equals(this.region, ioOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectID, region);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1InfrastructureStatusPlatformStatusGcp {\n");
    
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
