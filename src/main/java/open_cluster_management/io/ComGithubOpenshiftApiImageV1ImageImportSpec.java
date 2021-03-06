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
import open_cluster_management.io.ComGithubOpenshiftApiImageV1TagImportPolicy;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1TagReferencePolicy;
import open_cluster_management.io.IoK8sApiCoreV1LocalObjectReference;
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;

/**
 * ImageImportSpec describes a request to import a specific image.
 */
@ApiModel(description = "ImageImportSpec describes a request to import a specific image.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1ImageImportSpec {
  @SerializedName("from")
  private IoK8sApiCoreV1ObjectReference from = null;

  @SerializedName("importPolicy")
  private ComGithubOpenshiftApiImageV1TagImportPolicy importPolicy = null;

  @SerializedName("includeManifest")
  private Boolean includeManifest = null;

  @SerializedName("referencePolicy")
  private ComGithubOpenshiftApiImageV1TagReferencePolicy referencePolicy = null;

  @SerializedName("to")
  private IoK8sApiCoreV1LocalObjectReference to = null;

  public ComGithubOpenshiftApiImageV1ImageImportSpec from(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
    return this;
  }

   /**
   * From is the source of an image to import; only kind DockerImage is allowed
   * @return from
  **/
  @ApiModelProperty(required = true, value = "From is the source of an image to import; only kind DockerImage is allowed")
  public IoK8sApiCoreV1ObjectReference getFrom() {
    return from;
  }

  public void setFrom(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
  }

  public ComGithubOpenshiftApiImageV1ImageImportSpec importPolicy(ComGithubOpenshiftApiImageV1TagImportPolicy importPolicy) {
    this.importPolicy = importPolicy;
    return this;
  }

   /**
   * ImportPolicy is the policy controlling how the image is imported
   * @return importPolicy
  **/
  @ApiModelProperty(value = "ImportPolicy is the policy controlling how the image is imported")
  public ComGithubOpenshiftApiImageV1TagImportPolicy getImportPolicy() {
    return importPolicy;
  }

  public void setImportPolicy(ComGithubOpenshiftApiImageV1TagImportPolicy importPolicy) {
    this.importPolicy = importPolicy;
  }

  public ComGithubOpenshiftApiImageV1ImageImportSpec includeManifest(Boolean includeManifest) {
    this.includeManifest = includeManifest;
    return this;
  }

   /**
   * IncludeManifest determines if the manifest for each image is returned in the response
   * @return includeManifest
  **/
  @ApiModelProperty(value = "IncludeManifest determines if the manifest for each image is returned in the response")
  public Boolean isIncludeManifest() {
    return includeManifest;
  }

  public void setIncludeManifest(Boolean includeManifest) {
    this.includeManifest = includeManifest;
  }

  public ComGithubOpenshiftApiImageV1ImageImportSpec referencePolicy(ComGithubOpenshiftApiImageV1TagReferencePolicy referencePolicy) {
    this.referencePolicy = referencePolicy;
    return this;
  }

   /**
   * ReferencePolicy defines how other components should consume the image
   * @return referencePolicy
  **/
  @ApiModelProperty(value = "ReferencePolicy defines how other components should consume the image")
  public ComGithubOpenshiftApiImageV1TagReferencePolicy getReferencePolicy() {
    return referencePolicy;
  }

  public void setReferencePolicy(ComGithubOpenshiftApiImageV1TagReferencePolicy referencePolicy) {
    this.referencePolicy = referencePolicy;
  }

  public ComGithubOpenshiftApiImageV1ImageImportSpec to(IoK8sApiCoreV1LocalObjectReference to) {
    this.to = to;
    return this;
  }

   /**
   * To is a tag in the current image stream to assign the imported image to, if name is not specified the default tag from from.name will be used
   * @return to
  **/
  @ApiModelProperty(value = "To is a tag in the current image stream to assign the imported image to, if name is not specified the default tag from from.name will be used")
  public IoK8sApiCoreV1LocalObjectReference getTo() {
    return to;
  }

  public void setTo(IoK8sApiCoreV1LocalObjectReference to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1ImageImportSpec comGithubOpenshiftApiImageV1ImageImportSpec = (ComGithubOpenshiftApiImageV1ImageImportSpec) o;
    return Objects.equals(this.from, comGithubOpenshiftApiImageV1ImageImportSpec.from) &&
        Objects.equals(this.importPolicy, comGithubOpenshiftApiImageV1ImageImportSpec.importPolicy) &&
        Objects.equals(this.includeManifest, comGithubOpenshiftApiImageV1ImageImportSpec.includeManifest) &&
        Objects.equals(this.referencePolicy, comGithubOpenshiftApiImageV1ImageImportSpec.referencePolicy) &&
        Objects.equals(this.to, comGithubOpenshiftApiImageV1ImageImportSpec.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, importPolicy, includeManifest, referencePolicy, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1ImageImportSpec {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    importPolicy: ").append(toIndentedString(importPolicy)).append("\n");
    sb.append("    includeManifest: ").append(toIndentedString(includeManifest)).append("\n");
    sb.append("    referencePolicy: ").append(toIndentedString(referencePolicy)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

