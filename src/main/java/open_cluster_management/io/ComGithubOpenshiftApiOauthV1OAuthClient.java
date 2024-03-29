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
import open_cluster_management.io.ComGithubOpenshiftApiOauthV1ScopeRestriction;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMetaV2;

/**
 * OAuthClient describes an OAuth client
 */
@ApiModel(description = "OAuthClient describes an OAuth client")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiOauthV1OAuthClient {
  @SerializedName("accessTokenInactivityTimeoutSeconds")
  private Integer accessTokenInactivityTimeoutSeconds = null;

  @SerializedName("accessTokenMaxAgeSeconds")
  private Integer accessTokenMaxAgeSeconds = null;

  @SerializedName("additionalSecrets")
  private List<String> additionalSecrets = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("grantMethod")
  private String grantMethod = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata = null;

  @SerializedName("redirectURIs")
  private List<String> redirectURIs = null;

  @SerializedName("respondWithChallenges")
  private Boolean respondWithChallenges = null;

  @SerializedName("scopeRestrictions")
  private List<ComGithubOpenshiftApiOauthV1ScopeRestriction> scopeRestrictions = null;

  @SerializedName("secret")
  private String secret = null;

  public ComGithubOpenshiftApiOauthV1OAuthClient accessTokenInactivityTimeoutSeconds(Integer accessTokenInactivityTimeoutSeconds) {
    this.accessTokenInactivityTimeoutSeconds = accessTokenInactivityTimeoutSeconds;
    return this;
  }

   /**
   * AccessTokenInactivityTimeoutSeconds overrides the default token inactivity timeout for tokens granted to this client. The value represents the maximum amount of time that can occur between consecutive uses of the token. Tokens become invalid if they are not used within this temporal window. The user will need to acquire a new token to regain access once a token times out. This value needs to be set only if the default set in configuration is not appropriate for this client. Valid values are: - 0: Tokens for this client never time out - X: Tokens time out if there is no activity for X seconds The current minimum allowed value for X is 300 (5 minutes)
   * @return accessTokenInactivityTimeoutSeconds
  **/
  @ApiModelProperty(value = "AccessTokenInactivityTimeoutSeconds overrides the default token inactivity timeout for tokens granted to this client. The value represents the maximum amount of time that can occur between consecutive uses of the token. Tokens become invalid if they are not used within this temporal window. The user will need to acquire a new token to regain access once a token times out. This value needs to be set only if the default set in configuration is not appropriate for this client. Valid values are: - 0: Tokens for this client never time out - X: Tokens time out if there is no activity for X seconds The current minimum allowed value for X is 300 (5 minutes)")
  public Integer getAccessTokenInactivityTimeoutSeconds() {
    return accessTokenInactivityTimeoutSeconds;
  }

  public void setAccessTokenInactivityTimeoutSeconds(Integer accessTokenInactivityTimeoutSeconds) {
    this.accessTokenInactivityTimeoutSeconds = accessTokenInactivityTimeoutSeconds;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient accessTokenMaxAgeSeconds(Integer accessTokenMaxAgeSeconds) {
    this.accessTokenMaxAgeSeconds = accessTokenMaxAgeSeconds;
    return this;
  }

   /**
   * AccessTokenMaxAgeSeconds overrides the default access token max age for tokens granted to this client. 0 means no expiration.
   * @return accessTokenMaxAgeSeconds
  **/
  @ApiModelProperty(value = "AccessTokenMaxAgeSeconds overrides the default access token max age for tokens granted to this client. 0 means no expiration.")
  public Integer getAccessTokenMaxAgeSeconds() {
    return accessTokenMaxAgeSeconds;
  }

  public void setAccessTokenMaxAgeSeconds(Integer accessTokenMaxAgeSeconds) {
    this.accessTokenMaxAgeSeconds = accessTokenMaxAgeSeconds;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient additionalSecrets(List<String> additionalSecrets) {
    this.additionalSecrets = additionalSecrets;
    return this;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient addAdditionalSecretsItem(String additionalSecretsItem) {
    if (this.additionalSecrets == null) {
      this.additionalSecrets = new ArrayList<>();
    }
    this.additionalSecrets.add(additionalSecretsItem);
    return this;
  }

   /**
   * AdditionalSecrets holds other secrets that may be used to identify the client.  This is useful for rotation and for service account token validation
   * @return additionalSecrets
  **/
  @ApiModelProperty(value = "AdditionalSecrets holds other secrets that may be used to identify the client.  This is useful for rotation and for service account token validation")
  public List<String> getAdditionalSecrets() {
    return additionalSecrets;
  }

  public void setAdditionalSecrets(List<String> additionalSecrets) {
    this.additionalSecrets = additionalSecrets;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient apiVersion(String apiVersion) {
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

  public ComGithubOpenshiftApiOauthV1OAuthClient grantMethod(String grantMethod) {
    this.grantMethod = grantMethod;
    return this;
  }

   /**
   * GrantMethod is a required field which determines how to handle grants for this client. Valid grant handling methods are:  - auto:   always approves grant requests, useful for trusted clients  - prompt: prompts the end user for approval of grant requests, useful for third-party clients
   * @return grantMethod
  **/
  @ApiModelProperty(value = "GrantMethod is a required field which determines how to handle grants for this client. Valid grant handling methods are:  - auto:   always approves grant requests, useful for trusted clients  - prompt: prompts the end user for approval of grant requests, useful for third-party clients")
  public String getGrantMethod() {
    return grantMethod;
  }

  public void setGrantMethod(String grantMethod) {
    this.grantMethod = grantMethod;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient kind(String kind) {
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

  public ComGithubOpenshiftApiOauthV1OAuthClient metadata(IoK8sApimachineryPkgApisMetaV1ObjectMetaV2 metadata) {
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

  public ComGithubOpenshiftApiOauthV1OAuthClient redirectURIs(List<String> redirectURIs) {
    this.redirectURIs = redirectURIs;
    return this;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient addRedirectURIsItem(String redirectURIsItem) {
    if (this.redirectURIs == null) {
      this.redirectURIs = new ArrayList<>();
    }
    this.redirectURIs.add(redirectURIsItem);
    return this;
  }

   /**
   * RedirectURIs is the valid redirection URIs associated with a client
   * @return redirectURIs
  **/
  @ApiModelProperty(value = "RedirectURIs is the valid redirection URIs associated with a client")
  public List<String> getRedirectURIs() {
    return redirectURIs;
  }

  public void setRedirectURIs(List<String> redirectURIs) {
    this.redirectURIs = redirectURIs;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient respondWithChallenges(Boolean respondWithChallenges) {
    this.respondWithChallenges = respondWithChallenges;
    return this;
  }

   /**
   * RespondWithChallenges indicates whether the client wants authentication needed responses made in the form of challenges instead of redirects
   * @return respondWithChallenges
  **/
  @ApiModelProperty(value = "RespondWithChallenges indicates whether the client wants authentication needed responses made in the form of challenges instead of redirects")
  public Boolean isRespondWithChallenges() {
    return respondWithChallenges;
  }

  public void setRespondWithChallenges(Boolean respondWithChallenges) {
    this.respondWithChallenges = respondWithChallenges;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient scopeRestrictions(List<ComGithubOpenshiftApiOauthV1ScopeRestriction> scopeRestrictions) {
    this.scopeRestrictions = scopeRestrictions;
    return this;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient addScopeRestrictionsItem(ComGithubOpenshiftApiOauthV1ScopeRestriction scopeRestrictionsItem) {
    if (this.scopeRestrictions == null) {
      this.scopeRestrictions = new ArrayList<>();
    }
    this.scopeRestrictions.add(scopeRestrictionsItem);
    return this;
  }

   /**
   * ScopeRestrictions describes which scopes this client can request.  Each requested scope is checked against each restriction.  If any restriction matches, then the scope is allowed. If no restriction matches, then the scope is denied.
   * @return scopeRestrictions
  **/
  @ApiModelProperty(value = "ScopeRestrictions describes which scopes this client can request.  Each requested scope is checked against each restriction.  If any restriction matches, then the scope is allowed. If no restriction matches, then the scope is denied.")
  public List<ComGithubOpenshiftApiOauthV1ScopeRestriction> getScopeRestrictions() {
    return scopeRestrictions;
  }

  public void setScopeRestrictions(List<ComGithubOpenshiftApiOauthV1ScopeRestriction> scopeRestrictions) {
    this.scopeRestrictions = scopeRestrictions;
  }

  public ComGithubOpenshiftApiOauthV1OAuthClient secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret is the unique secret associated with a client
   * @return secret
  **/
  @ApiModelProperty(value = "Secret is the unique secret associated with a client")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiOauthV1OAuthClient comGithubOpenshiftApiOauthV1OAuthClient = (ComGithubOpenshiftApiOauthV1OAuthClient) o;
    return Objects.equals(this.accessTokenInactivityTimeoutSeconds, comGithubOpenshiftApiOauthV1OAuthClient.accessTokenInactivityTimeoutSeconds) &&
        Objects.equals(this.accessTokenMaxAgeSeconds, comGithubOpenshiftApiOauthV1OAuthClient.accessTokenMaxAgeSeconds) &&
        Objects.equals(this.additionalSecrets, comGithubOpenshiftApiOauthV1OAuthClient.additionalSecrets) &&
        Objects.equals(this.apiVersion, comGithubOpenshiftApiOauthV1OAuthClient.apiVersion) &&
        Objects.equals(this.grantMethod, comGithubOpenshiftApiOauthV1OAuthClient.grantMethod) &&
        Objects.equals(this.kind, comGithubOpenshiftApiOauthV1OAuthClient.kind) &&
        Objects.equals(this.metadata, comGithubOpenshiftApiOauthV1OAuthClient.metadata) &&
        Objects.equals(this.redirectURIs, comGithubOpenshiftApiOauthV1OAuthClient.redirectURIs) &&
        Objects.equals(this.respondWithChallenges, comGithubOpenshiftApiOauthV1OAuthClient.respondWithChallenges) &&
        Objects.equals(this.scopeRestrictions, comGithubOpenshiftApiOauthV1OAuthClient.scopeRestrictions) &&
        Objects.equals(this.secret, comGithubOpenshiftApiOauthV1OAuthClient.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenInactivityTimeoutSeconds, accessTokenMaxAgeSeconds, additionalSecrets, apiVersion, grantMethod, kind, metadata, redirectURIs, respondWithChallenges, scopeRestrictions, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiOauthV1OAuthClient {\n");
    
    sb.append("    accessTokenInactivityTimeoutSeconds: ").append(toIndentedString(accessTokenInactivityTimeoutSeconds)).append("\n");
    sb.append("    accessTokenMaxAgeSeconds: ").append(toIndentedString(accessTokenMaxAgeSeconds)).append("\n");
    sb.append("    additionalSecrets: ").append(toIndentedString(additionalSecrets)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    grantMethod: ").append(toIndentedString(grantMethod)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    redirectURIs: ").append(toIndentedString(redirectURIs)).append("\n");
    sb.append("    respondWithChallenges: ").append(toIndentedString(respondWithChallenges)).append("\n");
    sb.append("    scopeRestrictions: ").append(toIndentedString(scopeRestrictions)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

