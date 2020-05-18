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
import open_cluster_management.io.ComCoreosOperatorsV1OperatorSourceStatusCurrentPhase;

/**
 * OperatorSourceStatus defines the observed state of OperatorSource
 */
@ApiModel(description = "OperatorSourceStatus defines the observed state of OperatorSource")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1OperatorSourceStatus {
  @SerializedName("currentPhase")
  private ComCoreosOperatorsV1OperatorSourceStatusCurrentPhase currentPhase = null;

  @SerializedName("packages")
  private String packages = null;

  public ComCoreosOperatorsV1OperatorSourceStatus currentPhase(ComCoreosOperatorsV1OperatorSourceStatusCurrentPhase currentPhase) {
    this.currentPhase = currentPhase;
    return this;
  }

   /**
   * Get currentPhase
   * @return currentPhase
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1OperatorSourceStatusCurrentPhase getCurrentPhase() {
    return currentPhase;
  }

  public void setCurrentPhase(ComCoreosOperatorsV1OperatorSourceStatusCurrentPhase currentPhase) {
    this.currentPhase = currentPhase;
  }

  public ComCoreosOperatorsV1OperatorSourceStatus packages(String packages) {
    this.packages = packages;
    return this;
  }

   /**
   * Packages is a comma separated list of package(s) each of which has been downloaded and processed by Marketplace operator from the specified endpoint.
   * @return packages
  **/
  @ApiModelProperty(value = "Packages is a comma separated list of package(s) each of which has been downloaded and processed by Marketplace operator from the specified endpoint.")
  public String getPackages() {
    return packages;
  }

  public void setPackages(String packages) {
    this.packages = packages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1OperatorSourceStatus comCoreosOperatorsV1OperatorSourceStatus = (ComCoreosOperatorsV1OperatorSourceStatus) o;
    return Objects.equals(this.currentPhase, comCoreosOperatorsV1OperatorSourceStatus.currentPhase) &&
        Objects.equals(this.packages, comCoreosOperatorsV1OperatorSourceStatus.packages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPhase, packages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1OperatorSourceStatus {\n");
    
    sb.append("    currentPhase: ").append(toIndentedString(currentPhase)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
