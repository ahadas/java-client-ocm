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
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecBasicAuth;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecGithub;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecGitlab;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecGoogle;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecHtpasswd;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecKeystone;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecLdap;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecOpenID;
import open_cluster_management.io.IoOpenshiftConfigV1OAuthSpecRequestHeader;

/**
 * IdentityProvider provides identities for users authenticating using credentials
 */
@ApiModel(description = "IdentityProvider provides identities for users authenticating using credentials")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1OAuthSpecIdentityProviders {
  @SerializedName("basicAuth")
  private IoOpenshiftConfigV1OAuthSpecBasicAuth basicAuth = null;

  @SerializedName("github")
  private IoOpenshiftConfigV1OAuthSpecGithub github = null;

  @SerializedName("gitlab")
  private IoOpenshiftConfigV1OAuthSpecGitlab gitlab = null;

  @SerializedName("google")
  private IoOpenshiftConfigV1OAuthSpecGoogle google = null;

  @SerializedName("htpasswd")
  private IoOpenshiftConfigV1OAuthSpecHtpasswd htpasswd = null;

  @SerializedName("keystone")
  private IoOpenshiftConfigV1OAuthSpecKeystone keystone = null;

  @SerializedName("ldap")
  private IoOpenshiftConfigV1OAuthSpecLdap ldap = null;

  @SerializedName("mappingMethod")
  private String mappingMethod = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("openID")
  private IoOpenshiftConfigV1OAuthSpecOpenID openID = null;

  @SerializedName("requestHeader")
  private IoOpenshiftConfigV1OAuthSpecRequestHeader requestHeader = null;

  @SerializedName("type")
  private String type = null;

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders basicAuth(IoOpenshiftConfigV1OAuthSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecBasicAuth getBasicAuth() {
    return basicAuth;
  }

  public void setBasicAuth(IoOpenshiftConfigV1OAuthSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders github(IoOpenshiftConfigV1OAuthSpecGithub github) {
    this.github = github;
    return this;
  }

   /**
   * Get github
   * @return github
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecGithub getGithub() {
    return github;
  }

  public void setGithub(IoOpenshiftConfigV1OAuthSpecGithub github) {
    this.github = github;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders gitlab(IoOpenshiftConfigV1OAuthSpecGitlab gitlab) {
    this.gitlab = gitlab;
    return this;
  }

   /**
   * Get gitlab
   * @return gitlab
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecGitlab getGitlab() {
    return gitlab;
  }

  public void setGitlab(IoOpenshiftConfigV1OAuthSpecGitlab gitlab) {
    this.gitlab = gitlab;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders google(IoOpenshiftConfigV1OAuthSpecGoogle google) {
    this.google = google;
    return this;
  }

   /**
   * Get google
   * @return google
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecGoogle getGoogle() {
    return google;
  }

  public void setGoogle(IoOpenshiftConfigV1OAuthSpecGoogle google) {
    this.google = google;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders htpasswd(IoOpenshiftConfigV1OAuthSpecHtpasswd htpasswd) {
    this.htpasswd = htpasswd;
    return this;
  }

   /**
   * Get htpasswd
   * @return htpasswd
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecHtpasswd getHtpasswd() {
    return htpasswd;
  }

  public void setHtpasswd(IoOpenshiftConfigV1OAuthSpecHtpasswd htpasswd) {
    this.htpasswd = htpasswd;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders keystone(IoOpenshiftConfigV1OAuthSpecKeystone keystone) {
    this.keystone = keystone;
    return this;
  }

   /**
   * Get keystone
   * @return keystone
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecKeystone getKeystone() {
    return keystone;
  }

  public void setKeystone(IoOpenshiftConfigV1OAuthSpecKeystone keystone) {
    this.keystone = keystone;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders ldap(IoOpenshiftConfigV1OAuthSpecLdap ldap) {
    this.ldap = ldap;
    return this;
  }

   /**
   * Get ldap
   * @return ldap
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecLdap getLdap() {
    return ldap;
  }

  public void setLdap(IoOpenshiftConfigV1OAuthSpecLdap ldap) {
    this.ldap = ldap;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders mappingMethod(String mappingMethod) {
    this.mappingMethod = mappingMethod;
    return this;
  }

   /**
   * mappingMethod determines how identities from this provider are mapped to users Defaults to \&quot;claim\&quot;
   * @return mappingMethod
  **/
  @ApiModelProperty(value = "mappingMethod determines how identities from this provider are mapped to users Defaults to \"claim\"")
  public String getMappingMethod() {
    return mappingMethod;
  }

  public void setMappingMethod(String mappingMethod) {
    this.mappingMethod = mappingMethod;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is used to qualify the identities returned by this provider. - It MUST be unique and not shared by any other identity provider used - It MUST be a valid path segment: name cannot equal \&quot;.\&quot; or \&quot;..\&quot; or contain \&quot;/\&quot; or \&quot;%\&quot; or \&quot;:\&quot;   Ref: https://godoc.org/github.com/openshift/origin/pkg/user/apis/user/validation#ValidateIdentityProviderName
   * @return name
  **/
  @ApiModelProperty(value = "name is used to qualify the identities returned by this provider. - It MUST be unique and not shared by any other identity provider used - It MUST be a valid path segment: name cannot equal \".\" or \"..\" or contain \"/\" or \"%\" or \":\"   Ref: https://godoc.org/github.com/openshift/origin/pkg/user/apis/user/validation#ValidateIdentityProviderName")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders openID(IoOpenshiftConfigV1OAuthSpecOpenID openID) {
    this.openID = openID;
    return this;
  }

   /**
   * Get openID
   * @return openID
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecOpenID getOpenID() {
    return openID;
  }

  public void setOpenID(IoOpenshiftConfigV1OAuthSpecOpenID openID) {
    this.openID = openID;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders requestHeader(IoOpenshiftConfigV1OAuthSpecRequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1OAuthSpecRequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(IoOpenshiftConfigV1OAuthSpecRequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public IoOpenshiftConfigV1OAuthSpecIdentityProviders type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type identifies the identity provider type for this entry.
   * @return type
  **/
  @ApiModelProperty(value = "type identifies the identity provider type for this entry.")
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
    IoOpenshiftConfigV1OAuthSpecIdentityProviders ioOpenshiftConfigV1OAuthSpecIdentityProviders = (IoOpenshiftConfigV1OAuthSpecIdentityProviders) o;
    return Objects.equals(this.basicAuth, ioOpenshiftConfigV1OAuthSpecIdentityProviders.basicAuth) &&
        Objects.equals(this.github, ioOpenshiftConfigV1OAuthSpecIdentityProviders.github) &&
        Objects.equals(this.gitlab, ioOpenshiftConfigV1OAuthSpecIdentityProviders.gitlab) &&
        Objects.equals(this.google, ioOpenshiftConfigV1OAuthSpecIdentityProviders.google) &&
        Objects.equals(this.htpasswd, ioOpenshiftConfigV1OAuthSpecIdentityProviders.htpasswd) &&
        Objects.equals(this.keystone, ioOpenshiftConfigV1OAuthSpecIdentityProviders.keystone) &&
        Objects.equals(this.ldap, ioOpenshiftConfigV1OAuthSpecIdentityProviders.ldap) &&
        Objects.equals(this.mappingMethod, ioOpenshiftConfigV1OAuthSpecIdentityProviders.mappingMethod) &&
        Objects.equals(this.name, ioOpenshiftConfigV1OAuthSpecIdentityProviders.name) &&
        Objects.equals(this.openID, ioOpenshiftConfigV1OAuthSpecIdentityProviders.openID) &&
        Objects.equals(this.requestHeader, ioOpenshiftConfigV1OAuthSpecIdentityProviders.requestHeader) &&
        Objects.equals(this.type, ioOpenshiftConfigV1OAuthSpecIdentityProviders.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicAuth, github, gitlab, google, htpasswd, keystone, ldap, mappingMethod, name, openID, requestHeader, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1OAuthSpecIdentityProviders {\n");
    
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
    sb.append("    gitlab: ").append(toIndentedString(gitlab)).append("\n");
    sb.append("    google: ").append(toIndentedString(google)).append("\n");
    sb.append("    htpasswd: ").append(toIndentedString(htpasswd)).append("\n");
    sb.append("    keystone: ").append(toIndentedString(keystone)).append("\n");
    sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
    sb.append("    mappingMethod: ").append(toIndentedString(mappingMethod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openID: ").append(toIndentedString(openID)).append("\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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

