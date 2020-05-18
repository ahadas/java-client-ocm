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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * UserIdentityMapping maps a user to an identity
 */
@ApiModel(description = "UserIdentityMapping maps a user to an identity")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiUserV1UserIdentityMapping {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("identity")
  private IoK8sApiCoreV1ObjectReference identity = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("user")
  private IoK8sApiCoreV1ObjectReference user = null;

  public ComGithubOpenshiftApiUserV1UserIdentityMapping apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiUserV1UserIdentityMapping identity(IoK8sApiCoreV1ObjectReference identity) {
    this.identity = identity;
    return this;
  }

   /**
   * Identity is a reference to an identity
   * @return identity
  **/
  @ApiModelProperty(value = "Identity is a reference to an identity")
  public IoK8sApiCoreV1ObjectReference getIdentity() {
    return identity;
  }

  public void setIdentity(IoK8sApiCoreV1ObjectReference identity) {
    this.identity = identity;
  }

  public ComGithubOpenshiftApiUserV1UserIdentityMapping kind(String kind) {
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

  public ComGithubOpenshiftApiUserV1UserIdentityMapping metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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

  public ComGithubOpenshiftApiUserV1UserIdentityMapping user(IoK8sApiCoreV1ObjectReference user) {
    this.user = user;
    return this;
  }

   /**
   * User is a reference to a user
   * @return user
  **/
  @ApiModelProperty(value = "User is a reference to a user")
  public IoK8sApiCoreV1ObjectReference getUser() {
    return user;
  }

  public void setUser(IoK8sApiCoreV1ObjectReference user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiUserV1UserIdentityMapping comGithubOpenshiftApiUserV1UserIdentityMapping = (ComGithubOpenshiftApiUserV1UserIdentityMapping) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiUserV1UserIdentityMapping.apiVersion) &&
        Objects.equals(this.identity, comGithubOpenshiftApiUserV1UserIdentityMapping.identity) &&
        Objects.equals(this.kind, comGithubOpenshiftApiUserV1UserIdentityMapping.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiUserV1UserIdentityMapping.metadata) &&
        Objects.equals(this.user, comGithubOpenshiftApiUserV1UserIdentityMapping.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, identity, kind, metadata, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiUserV1UserIdentityMapping {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

