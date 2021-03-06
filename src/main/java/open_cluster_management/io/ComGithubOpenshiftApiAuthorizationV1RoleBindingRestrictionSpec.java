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
import open_cluster_management.io.ComGithubOpenshiftApiAuthorizationV1GroupRestriction;
import open_cluster_management.io.ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction;
import open_cluster_management.io.ComGithubOpenshiftApiAuthorizationV1UserRestriction;

/**
 * RoleBindingRestrictionSpec defines a rolebinding restriction.  Exactly one field must be non-nil.
 */
@ApiModel(description = "RoleBindingRestrictionSpec defines a rolebinding restriction.  Exactly one field must be non-nil.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec {
  @SerializedName("grouprestriction")
  private ComGithubOpenshiftApiAuthorizationV1GroupRestriction grouprestriction = null;

  @SerializedName("serviceaccountrestriction")
  private ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction serviceaccountrestriction = null;

  @SerializedName("userrestriction")
  private ComGithubOpenshiftApiAuthorizationV1UserRestriction userrestriction = null;

  public ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec grouprestriction(ComGithubOpenshiftApiAuthorizationV1GroupRestriction grouprestriction) {
    this.grouprestriction = grouprestriction;
    return this;
  }

   /**
   * GroupRestriction matches against group subjects.
   * @return grouprestriction
  **/
  @ApiModelProperty(required = true, value = "GroupRestriction matches against group subjects.")
  public ComGithubOpenshiftApiAuthorizationV1GroupRestriction getGrouprestriction() {
    return grouprestriction;
  }

  public void setGrouprestriction(ComGithubOpenshiftApiAuthorizationV1GroupRestriction grouprestriction) {
    this.grouprestriction = grouprestriction;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec serviceaccountrestriction(ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction serviceaccountrestriction) {
    this.serviceaccountrestriction = serviceaccountrestriction;
    return this;
  }

   /**
   * ServiceAccountRestriction matches against service-account subjects.
   * @return serviceaccountrestriction
  **/
  @ApiModelProperty(required = true, value = "ServiceAccountRestriction matches against service-account subjects.")
  public ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction getServiceaccountrestriction() {
    return serviceaccountrestriction;
  }

  public void setServiceaccountrestriction(ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction serviceaccountrestriction) {
    this.serviceaccountrestriction = serviceaccountrestriction;
  }

  public ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec userrestriction(ComGithubOpenshiftApiAuthorizationV1UserRestriction userrestriction) {
    this.userrestriction = userrestriction;
    return this;
  }

   /**
   * UserRestriction matches against user subjects.
   * @return userrestriction
  **/
  @ApiModelProperty(required = true, value = "UserRestriction matches against user subjects.")
  public ComGithubOpenshiftApiAuthorizationV1UserRestriction getUserrestriction() {
    return userrestriction;
  }

  public void setUserrestriction(ComGithubOpenshiftApiAuthorizationV1UserRestriction userrestriction) {
    this.userrestriction = userrestriction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec comGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec = (ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec) o;
    return Objects.equals(this.grouprestriction, comGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec.grouprestriction) &&
        Objects.equals(this.serviceaccountrestriction, comGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec.serviceaccountrestriction) &&
        Objects.equals(this.userrestriction, comGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec.userrestriction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouprestriction, serviceaccountrestriction, userrestriction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAuthorizationV1RoleBindingRestrictionSpec {\n");
    
    sb.append("    grouprestriction: ").append(toIndentedString(grouprestriction)).append("\n");
    sb.append("    serviceaccountrestriction: ").append(toIndentedString(serviceaccountrestriction)).append("\n");
    sb.append("    userrestriction: ").append(toIndentedString(userrestriction)).append("\n");
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

