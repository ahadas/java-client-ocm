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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1SignatureCondition;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1SignatureIssuer;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1SignatureSubject;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * ImageSignature holds a signature of an image. It allows to verify image identity and possibly other claims as long as the signature is trusted. Based on this information it is possible to restrict runnable images to those matching cluster-wide policy. Mandatory fields should be parsed by clients doing image verification. The others are parsed from signature&#39;s content by the server. They serve just an informative purpose.
 */
@ApiModel(description = "ImageSignature holds a signature of an image. It allows to verify image identity and possibly other claims as long as the signature is trusted. Based on this information it is possible to restrict runnable images to those matching cluster-wide policy. Mandatory fields should be parsed by clients doing image verification. The others are parsed from signature's content by the server. They serve just an informative purpose.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1ImageSignature {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("conditions")
  private List<ComGithubOpenshiftApiImageV1SignatureCondition> conditions = null;

  @SerializedName("content")
  private byte[] content = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("imageIdentity")
  private String imageIdentity = null;

  @SerializedName("issuedBy")
  private ComGithubOpenshiftApiImageV1SignatureIssuer issuedBy = null;

  @SerializedName("issuedTo")
  private ComGithubOpenshiftApiImageV1SignatureSubject issuedTo = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("signedClaims")
  private Map<String, String> signedClaims = null;

  @SerializedName("type")
  private String type = null;

  public ComGithubOpenshiftApiImageV1ImageSignature apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature conditions(List<ComGithubOpenshiftApiImageV1SignatureCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature addConditionsItem(ComGithubOpenshiftApiImageV1SignatureCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions represent the latest available observations of a signature&#39;s current state.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions represent the latest available observations of a signature's current state.")
  public List<ComGithubOpenshiftApiImageV1SignatureCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ComGithubOpenshiftApiImageV1SignatureCondition> conditions) {
    this.conditions = conditions;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Required: An opaque binary string which is an image&#39;s signature.
   * @return content
  **/
  @ApiModelProperty(required = true, value = "Required: An opaque binary string which is an image's signature.")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature created(String created) {
    this.created = created;
    return this;
  }

   /**
   * If specified, it is the time of signature&#39;s creation.
   * @return created
  **/
  @ApiModelProperty(value = "If specified, it is the time of signature's creation.")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature imageIdentity(String imageIdentity) {
    this.imageIdentity = imageIdentity;
    return this;
  }

   /**
   * A human readable string representing image&#39;s identity. It could be a product name and version, or an image pull spec (e.g. \&quot;registry.access.redhat.com/rhel7/rhel:7.2\&quot;).
   * @return imageIdentity
  **/
  @ApiModelProperty(value = "A human readable string representing image's identity. It could be a product name and version, or an image pull spec (e.g. \"registry.access.redhat.com/rhel7/rhel:7.2\").")
  public String getImageIdentity() {
    return imageIdentity;
  }

  public void setImageIdentity(String imageIdentity) {
    this.imageIdentity = imageIdentity;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature issuedBy(ComGithubOpenshiftApiImageV1SignatureIssuer issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

   /**
   * If specified, it holds information about an issuer of signing certificate or key (a person or entity who signed the signing certificate or key).
   * @return issuedBy
  **/
  @ApiModelProperty(value = "If specified, it holds information about an issuer of signing certificate or key (a person or entity who signed the signing certificate or key).")
  public ComGithubOpenshiftApiImageV1SignatureIssuer getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(ComGithubOpenshiftApiImageV1SignatureIssuer issuedBy) {
    this.issuedBy = issuedBy;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature issuedTo(ComGithubOpenshiftApiImageV1SignatureSubject issuedTo) {
    this.issuedTo = issuedTo;
    return this;
  }

   /**
   * If specified, it holds information about a subject of signing certificate or key (a person or entity who signed the image).
   * @return issuedTo
  **/
  @ApiModelProperty(value = "If specified, it holds information about a subject of signing certificate or key (a person or entity who signed the image).")
  public ComGithubOpenshiftApiImageV1SignatureSubject getIssuedTo() {
    return issuedTo;
  }

  public void setIssuedTo(ComGithubOpenshiftApiImageV1SignatureSubject issuedTo) {
    this.issuedTo = issuedTo;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
    this.metadata = metadata;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature signedClaims(Map<String, String> signedClaims) {
    this.signedClaims = signedClaims;
    return this;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature putSignedClaimsItem(String key, String signedClaimsItem) {
    if (this.signedClaims == null) {
      this.signedClaims = new HashMap<>();
    }
    this.signedClaims.put(key, signedClaimsItem);
    return this;
  }

   /**
   * Contains claims from the signature.
   * @return signedClaims
  **/
  @ApiModelProperty(value = "Contains claims from the signature.")
  public Map<String, String> getSignedClaims() {
    return signedClaims;
  }

  public void setSignedClaims(Map<String, String> signedClaims) {
    this.signedClaims = signedClaims;
  }

  public ComGithubOpenshiftApiImageV1ImageSignature type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Required: Describes a type of stored blob.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Required: Describes a type of stored blob.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1ImageSignature comGithubOpenshiftApiImageV1ImageSignature = (ComGithubOpenshiftApiImageV1ImageSignature) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiImageV1ImageSignature.apiVersion) &&
        Objects.equals(this.conditions, comGithubOpenshiftApiImageV1ImageSignature.conditions) &&
        Arrays.equals(this.content, comGithubOpenshiftApiImageV1ImageSignature.content) &&
        Objects.equals(this.created, comGithubOpenshiftApiImageV1ImageSignature.created) &&
        Objects.equals(this.imageIdentity, comGithubOpenshiftApiImageV1ImageSignature.imageIdentity) &&
        Objects.equals(this.issuedBy, comGithubOpenshiftApiImageV1ImageSignature.issuedBy) &&
        Objects.equals(this.issuedTo, comGithubOpenshiftApiImageV1ImageSignature.issuedTo) &&
        Objects.equals(this.kind, comGithubOpenshiftApiImageV1ImageSignature.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiImageV1ImageSignature.metadata) &&
        Objects.equals(this.signedClaims, comGithubOpenshiftApiImageV1ImageSignature.signedClaims) &&
        Objects.equals(this.type, comGithubOpenshiftApiImageV1ImageSignature.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, conditions, Arrays.hashCode(content), created, imageIdentity, issuedBy, issuedTo, kind, metadata, signedClaims, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1ImageSignature {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    imageIdentity: ").append(toIndentedString(imageIdentity)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    issuedTo: ").append(toIndentedString(issuedTo)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signedClaims: ").append(toIndentedString(signedClaims)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

