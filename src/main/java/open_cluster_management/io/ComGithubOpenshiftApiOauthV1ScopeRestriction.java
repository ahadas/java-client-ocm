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
import open_cluster_management.io.ComGithubOpenshiftApiOauthV1ClusterRoleScopeRestriction;

/**
 * ScopeRestriction describe one restriction on scopes.  Exactly one option must be non-nil.
 */
@ApiModel(description = "ScopeRestriction describe one restriction on scopes.  Exactly one option must be non-nil.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiOauthV1ScopeRestriction {
  @SerializedName("clusterRole")
  private ComGithubOpenshiftApiOauthV1ClusterRoleScopeRestriction clusterRole = null;

  @SerializedName("literals")
  private List<String> literals = null;

  public ComGithubOpenshiftApiOauthV1ScopeRestriction clusterRole(ComGithubOpenshiftApiOauthV1ClusterRoleScopeRestriction clusterRole) {
    this.clusterRole = clusterRole;
    return this;
  }

   /**
   * ClusterRole describes a set of restrictions for cluster role scoping.
   * @return clusterRole
  **/
  @ApiModelProperty(value = "ClusterRole describes a set of restrictions for cluster role scoping.")
  public ComGithubOpenshiftApiOauthV1ClusterRoleScopeRestriction getClusterRole() {
    return clusterRole;
  }

  public void setClusterRole(ComGithubOpenshiftApiOauthV1ClusterRoleScopeRestriction clusterRole) {
    this.clusterRole = clusterRole;
  }

  public ComGithubOpenshiftApiOauthV1ScopeRestriction literals(List<String> literals) {
    this.literals = literals;
    return this;
  }

  public ComGithubOpenshiftApiOauthV1ScopeRestriction addLiteralsItem(String literalsItem) {
    if (this.literals == null) {
      this.literals = new ArrayList<>();
    }
    this.literals.add(literalsItem);
    return this;
  }

   /**
   * ExactValues means the scope has to match a particular set of strings exactly
   * @return literals
  **/
  @ApiModelProperty(value = "ExactValues means the scope has to match a particular set of strings exactly")
  public List<String> getLiterals() {
    return literals;
  }

  public void setLiterals(List<String> literals) {
    this.literals = literals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiOauthV1ScopeRestriction comGithubOpenshiftApiOauthV1ScopeRestriction = (ComGithubOpenshiftApiOauthV1ScopeRestriction) o;
    return Objects.equals(this.clusterRole, comGithubOpenshiftApiOauthV1ScopeRestriction.clusterRole) &&
        Objects.equals(this.literals, comGithubOpenshiftApiOauthV1ScopeRestriction.literals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterRole, literals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiOauthV1ScopeRestriction {\n");
    
    sb.append("    clusterRole: ").append(toIndentedString(clusterRole)).append("\n");
    sb.append("    literals: ").append(toIndentedString(literals)).append("\n");
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

