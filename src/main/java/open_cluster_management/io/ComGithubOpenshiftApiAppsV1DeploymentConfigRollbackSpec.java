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

/**
 * DeploymentConfigRollbackSpec represents the options for rollback generation.
 */
@ApiModel(description = "DeploymentConfigRollbackSpec represents the options for rollback generation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec {
  @SerializedName("from")
  private IoK8sApiCoreV1ObjectReference from = null;

  @SerializedName("includeReplicationMeta")
  private Boolean includeReplicationMeta = null;

  @SerializedName("includeStrategy")
  private Boolean includeStrategy = null;

  @SerializedName("includeTemplate")
  private Boolean includeTemplate = null;

  @SerializedName("includeTriggers")
  private Boolean includeTriggers = null;

  @SerializedName("revision")
  private Long revision = null;

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec from(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
    return this;
  }

   /**
   * From points to a ReplicationController which is a deployment.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "From points to a ReplicationController which is a deployment.")
  public IoK8sApiCoreV1ObjectReference getFrom() {
    return from;
  }

  public void setFrom(IoK8sApiCoreV1ObjectReference from) {
    this.from = from;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec includeReplicationMeta(Boolean includeReplicationMeta) {
    this.includeReplicationMeta = includeReplicationMeta;
    return this;
  }

   /**
   * IncludeReplicationMeta specifies whether to include the replica count and selector.
   * @return includeReplicationMeta
  **/
  @ApiModelProperty(required = true, value = "IncludeReplicationMeta specifies whether to include the replica count and selector.")
  public Boolean isIncludeReplicationMeta() {
    return includeReplicationMeta;
  }

  public void setIncludeReplicationMeta(Boolean includeReplicationMeta) {
    this.includeReplicationMeta = includeReplicationMeta;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec includeStrategy(Boolean includeStrategy) {
    this.includeStrategy = includeStrategy;
    return this;
  }

   /**
   * IncludeStrategy specifies whether to include the deployment Strategy.
   * @return includeStrategy
  **/
  @ApiModelProperty(required = true, value = "IncludeStrategy specifies whether to include the deployment Strategy.")
  public Boolean isIncludeStrategy() {
    return includeStrategy;
  }

  public void setIncludeStrategy(Boolean includeStrategy) {
    this.includeStrategy = includeStrategy;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec includeTemplate(Boolean includeTemplate) {
    this.includeTemplate = includeTemplate;
    return this;
  }

   /**
   * IncludeTemplate specifies whether to include the PodTemplateSpec.
   * @return includeTemplate
  **/
  @ApiModelProperty(required = true, value = "IncludeTemplate specifies whether to include the PodTemplateSpec.")
  public Boolean isIncludeTemplate() {
    return includeTemplate;
  }

  public void setIncludeTemplate(Boolean includeTemplate) {
    this.includeTemplate = includeTemplate;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec includeTriggers(Boolean includeTriggers) {
    this.includeTriggers = includeTriggers;
    return this;
  }

   /**
   * IncludeTriggers specifies whether to include config Triggers.
   * @return includeTriggers
  **/
  @ApiModelProperty(required = true, value = "IncludeTriggers specifies whether to include config Triggers.")
  public Boolean isIncludeTriggers() {
    return includeTriggers;
  }

  public void setIncludeTriggers(Boolean includeTriggers) {
    this.includeTriggers = includeTriggers;
  }

  public ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec revision(Long revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Revision to rollback to. If set to 0, rollback to the last revision.
   * @return revision
  **/
  @ApiModelProperty(value = "Revision to rollback to. If set to 0, rollback to the last revision.")
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec = (ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec) o;
    return Objects.equals(this.from, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.from) &&
        Objects.equals(this.includeReplicationMeta, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.includeReplicationMeta) &&
        Objects.equals(this.includeStrategy, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.includeStrategy) &&
        Objects.equals(this.includeTemplate, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.includeTemplate) &&
        Objects.equals(this.includeTriggers, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.includeTriggers) &&
        Objects.equals(this.revision, comGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, includeReplicationMeta, includeStrategy, includeTemplate, includeTriggers, revision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiAppsV1DeploymentConfigRollbackSpec {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    includeReplicationMeta: ").append(toIndentedString(includeReplicationMeta)).append("\n");
    sb.append("    includeStrategy: ").append(toIndentedString(includeStrategy)).append("\n");
    sb.append("    includeTemplate: ").append(toIndentedString(includeTemplate)).append("\n");
    sb.append("    includeTriggers: ").append(toIndentedString(includeTriggers)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

