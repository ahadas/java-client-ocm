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
import open_cluster_management.io.ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference;

/**
 * ServiceAccountRestriction matches a service account by a string match on either the service-account name or the name of the service account&#39;s namespace.
 */
@ApiModel(description = "ServiceAccountRestriction matches a service account by a string match on either the service-account name or the name of the service account's namespace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction {
  @SerializedName("namespaces")
  private List<String> namespaces = new ArrayList<>();

  @SerializedName("serviceaccounts")
  private List<ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference> serviceaccounts = new ArrayList<>();

  public ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  public ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction addNamespacesItem(String namespacesItem) {
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * Namespaces specifies a list of literal namespace names.
   * @return namespaces
  **/
  @ApiModelProperty(required = true, value = "Namespaces specifies a list of literal namespace names.")
  public List<String> getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  public ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction serviceaccounts(List<ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference> serviceaccounts) {
    this.serviceaccounts = serviceaccounts;
    return this;
  }

  public ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction addServiceaccountsItem(ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference serviceaccountsItem) {
    this.serviceaccounts.add(serviceaccountsItem);
    return this;
  }

   /**
   * ServiceAccounts specifies a list of literal service-account names.
   * @return serviceaccounts
  **/
  @ApiModelProperty(required = true, value = "ServiceAccounts specifies a list of literal service-account names.")
  public List<ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference> getServiceaccounts() {
    return serviceaccounts;
  }

  public void setServiceaccounts(List<ComGithubOpenshiftApiAuthorizationV1ServiceAccountReference> serviceaccounts) {
    this.serviceaccounts = serviceaccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction comGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction = (ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction) o;
    return Objects.equals(this.namespaces, comGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction.namespaces) &&
        Objects.equals(this.serviceaccounts, comGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction.serviceaccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, serviceaccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAuthorizationV1ServiceAccountRestriction {\n");
    
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    serviceaccounts: ").append(toIndentedString(serviceaccounts)).append("\n");
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

