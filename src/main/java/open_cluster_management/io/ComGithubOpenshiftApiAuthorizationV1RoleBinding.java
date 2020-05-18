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
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * RoleBinding references a Role, but not contain it.  It can reference any Role in the same namespace or in the global namespace. It adds who information via (Users and Groups) OR Subjects and namespace information by which namespace it exists in. RoleBindings in a given namespace only have effect in that namespace (excepting the master namespace which has power in all namespaces).
 */
@ApiModel(description = "RoleBinding references a Role, but not contain it.  It can reference any Role in the same namespace or in the global namespace. It adds who information via (Users and Groups) OR Subjects and namespace information by which namespace it exists in. RoleBindings in a given namespace only have effect in that namespace (excepting the master namespace which has power in all namespaces).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAuthorizationV1RoleBinding {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("groupNames")
  private List<String> groupNames = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("roleRef")
  private IoK8sApiCoreV1ObjectReference roleRef = null;

  @SerializedName("subjects")
  private List<IoK8sApiCoreV1ObjectReference> subjects = new ArrayList<>();

  @SerializedName("userNames")
  private List<String> userNames = null;

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding groupNames(List<String> groupNames) {
    this.groupNames = groupNames;
    return this;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding addGroupNamesItem(String groupNamesItem) {
    if (this.groupNames == null) {
      this.groupNames = new ArrayList<>();
    }
    this.groupNames.add(groupNamesItem);
    return this;
  }

   /**
   * GroupNames holds all the groups directly bound to the role. This field should only be specified when supporting legacy clients and servers. See Subjects for further details.
   * @return groupNames
  **/
  @ApiModelProperty(value = "GroupNames holds all the groups directly bound to the role. This field should only be specified when supporting legacy clients and servers. See Subjects for further details.")
  public List<String> getGroupNames() {
    return groupNames;
  }

  public void setGroupNames(List<String> groupNames) {
    this.groupNames = groupNames;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding kind(String kind) {
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

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding roleRef(IoK8sApiCoreV1ObjectReference roleRef) {
    this.roleRef = roleRef;
    return this;
  }

   /**
   * RoleRef can only reference the current namespace and the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error. Since Policy is a singleton, this is sufficient knowledge to locate a role.
   * @return roleRef
  **/
  @ApiModelProperty(required = true, value = "RoleRef can only reference the current namespace and the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error. Since Policy is a singleton, this is sufficient knowledge to locate a role.")
  public IoK8sApiCoreV1ObjectReference getRoleRef() {
    return roleRef;
  }

  public void setRoleRef(IoK8sApiCoreV1ObjectReference roleRef) {
    this.roleRef = roleRef;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding subjects(List<IoK8sApiCoreV1ObjectReference> subjects) {
    this.subjects = subjects;
    return this;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding addSubjectsItem(IoK8sApiCoreV1ObjectReference subjectsItem) {
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Subjects hold object references to authorize with this rule. This field is ignored if UserNames or GroupNames are specified to support legacy clients and servers. Thus newer clients that do not need to support backwards compatibility should send only fully qualified Subjects and should omit the UserNames and GroupNames fields. Clients that need to support backwards compatibility can use this field to build the UserNames and GroupNames.
   * @return subjects
  **/
  @ApiModelProperty(required = true, value = "Subjects hold object references to authorize with this rule. This field is ignored if UserNames or GroupNames are specified to support legacy clients and servers. Thus newer clients that do not need to support backwards compatibility should send only fully qualified Subjects and should omit the UserNames and GroupNames fields. Clients that need to support backwards compatibility can use this field to build the UserNames and GroupNames.")
  public List<IoK8sApiCoreV1ObjectReference> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<IoK8sApiCoreV1ObjectReference> subjects) {
    this.subjects = subjects;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding userNames(List<String> userNames) {
    this.userNames = userNames;
    return this;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBinding addUserNamesItem(String userNamesItem) {
    if (this.userNames == null) {
      this.userNames = new ArrayList<>();
    }
    this.userNames.add(userNamesItem);
    return this;
  }

   /**
   * UserNames holds all the usernames directly bound to the role. This field should only be specified when supporting legacy clients and servers. See Subjects for further details.
   * @return userNames
  **/
  @ApiModelProperty(value = "UserNames holds all the usernames directly bound to the role. This field should only be specified when supporting legacy clients and servers. See Subjects for further details.")
  public List<String> getUserNames() {
    return userNames;
  }

  public void setUserNames(List<String> userNames) {
    this.userNames = userNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAuthorizationV1RoleBinding comGithubOpenshiftApiAuthorizationV1RoleBinding = (ComGithubOpenshiftApiAuthorizationV1RoleBinding) o;
    return Objects.equals(this.apiVersion, comGithubOpenshiftApiAuthorizationV1RoleBinding.apiVersion) &&
        Objects.equals(this.groupNames, comGithubOpenshiftApiAuthorizationV1RoleBinding.groupNames) &&
        Objects.equals(this.kind, comGithubOpenshiftApiAuthorizationV1RoleBinding.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiAuthorizationV1RoleBinding.metadata) &&
        Objects.equals(this.roleRef, comGithubOpenshiftApiAuthorizationV1RoleBinding.roleRef) &&
        Objects.equals(this.subjects, comGithubOpenshiftApiAuthorizationV1RoleBinding.subjects) &&
        Objects.equals(this.userNames, comGithubOpenshiftApiAuthorizationV1RoleBinding.userNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, groupNames, kind, metadata, roleRef, subjects, userNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAuthorizationV1RoleBinding {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    roleRef: ").append(toIndentedString(roleRef)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    userNames: ").append(toIndentedString(userNames)).append("\n");
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
