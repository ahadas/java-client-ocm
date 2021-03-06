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
 * HelmWorkSpec is the helm work details
 */
@ApiModel(description = "HelmWorkSpec is the helm work details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec {
  @SerializedName("chartName")
  private String chartName = null;

  @SerializedName("chartURL")
  private String chartURL = null;

  @SerializedName("inSecureSkipVerify")
  private Boolean inSecureSkipVerify = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("releaseName")
  private String releaseName = null;

  @SerializedName("values")
  private byte[] values = null;

  @SerializedName("valuesURL")
  private String valuesURL = null;

  @SerializedName("version")
  private String version = null;

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec chartName(String chartName) {
    this.chartName = chartName;
    return this;
  }

   /**
   * ChartName
   * @return chartName
  **/
  @ApiModelProperty(value = "ChartName")
  public String getChartName() {
    return chartName;
  }

  public void setChartName(String chartName) {
    this.chartName = chartName;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec chartURL(String chartURL) {
    this.chartURL = chartURL;
    return this;
  }

   /**
   * Chart url
   * @return chartURL
  **/
  @ApiModelProperty(value = "Chart url")
  public String getChartURL() {
    return chartURL;
  }

  public void setChartURL(String chartURL) {
    this.chartURL = chartURL;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec inSecureSkipVerify(Boolean inSecureSkipVerify) {
    this.inSecureSkipVerify = inSecureSkipVerify;
    return this;
  }

   /**
   * InSecureSkipVerify skip verification
   * @return inSecureSkipVerify
  **/
  @ApiModelProperty(value = "InSecureSkipVerify skip verification")
  public Boolean isInSecureSkipVerify() {
    return inSecureSkipVerify;
  }

  public void setInSecureSkipVerify(Boolean inSecureSkipVerify) {
    this.inSecureSkipVerify = inSecureSkipVerify;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec releaseName(String releaseName) {
    this.releaseName = releaseName;
    return this;
  }

   /**
   * ReleaseName
   * @return releaseName
  **/
  @ApiModelProperty(value = "ReleaseName")
  public String getReleaseName() {
    return releaseName;
  }

  public void setReleaseName(String releaseName) {
    this.releaseName = releaseName;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec values(byte[] values) {
    this.values = values;
    return this;
  }

   /**
   * Values
   * @return values
  **/
  @ApiModelProperty(value = "Values")
  public byte[] getValues() {
    return values;
  }

  public void setValues(byte[] values) {
    this.values = values;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec valuesURL(String valuesURL) {
    this.valuesURL = valuesURL;
    return this;
  }

   /**
   * ValuesURL url to a file contains value
   * @return valuesURL
  **/
  @ApiModelProperty(value = "ValuesURL url to a file contains value")
  public String getValuesURL() {
    return valuesURL;
  }

  public void setValuesURL(String valuesURL) {
    this.valuesURL = valuesURL;
  }

  public ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version
   * @return version
  **/
  @ApiModelProperty(value = "Version")
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
    ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec = (ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec) o;
    return Objects.equals(this.chartName, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.chartName) &&
        Objects.equals(this.chartURL, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.chartURL) &&
        Objects.equals(this.inSecureSkipVerify, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.inSecureSkipVerify) &&
        Objects.equals(this.namespace, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.namespace) &&
        Objects.equals(this.releaseName, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.releaseName) &&
        Arrays.equals(this.values, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.values) &&
        Objects.equals(this.valuesURL, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.valuesURL) &&
        Objects.equals(this.version, comGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartName, chartURL, inSecureSkipVerify, namespace, releaseName, Arrays.hashCode(values), valuesURL, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenClusterManagementMulticloudOperatorsFoundationPkgApisMcmV1alpha1HelmWorkSpec {\n");
    
    sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
    sb.append("    chartURL: ").append(toIndentedString(chartURL)).append("\n");
    sb.append("    inSecureSkipVerify: ").append(toIndentedString(inSecureSkipVerify)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    releaseName: ").append(toIndentedString(releaseName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    valuesURL: ").append(toIndentedString(valuesURL)).append("\n");
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

