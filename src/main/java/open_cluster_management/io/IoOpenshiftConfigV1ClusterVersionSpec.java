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
import open_cluster_management.io.IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate;
import open_cluster_management.io.IoOpenshiftConfigV1ClusterVersionSpecOverrides;

/**
 * spec is the desired state of the cluster version - the operator will work to ensure that the desired version is applied to the cluster.
 */
@ApiModel(description = "spec is the desired state of the cluster version - the operator will work to ensure that the desired version is applied to the cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1ClusterVersionSpec {
  @SerializedName("channel")
  private String channel = null;

  @SerializedName("clusterID")
  private String clusterID = null;

  @SerializedName("desiredUpdate")
  private IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate desiredUpdate = null;

  @SerializedName("overrides")
  private List<IoOpenshiftConfigV1ClusterVersionSpecOverrides> overrides = null;

  @SerializedName("upstream")
  private String upstream = null;

  public IoOpenshiftConfigV1ClusterVersionSpec channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * channel is an identifier for explicitly requesting that a non-default set of updates be applied to this cluster. The default channel will be contain stable updates that are appropriate for production clusters.
   * @return channel
  **/
  @ApiModelProperty(value = "channel is an identifier for explicitly requesting that a non-default set of updates be applied to this cluster. The default channel will be contain stable updates that are appropriate for production clusters.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public IoOpenshiftConfigV1ClusterVersionSpec clusterID(String clusterID) {
    this.clusterID = clusterID;
    return this;
  }

   /**
   * clusterID uniquely identifies this cluster. This is expected to be an RFC4122 UUID value (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx in hexadecimal values). This is a required field.
   * @return clusterID
  **/
  @ApiModelProperty(required = true, value = "clusterID uniquely identifies this cluster. This is expected to be an RFC4122 UUID value (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx in hexadecimal values). This is a required field.")
  public String getClusterID() {
    return clusterID;
  }

  public void setClusterID(String clusterID) {
    this.clusterID = clusterID;
  }

  public IoOpenshiftConfigV1ClusterVersionSpec desiredUpdate(IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate desiredUpdate) {
    this.desiredUpdate = desiredUpdate;
    return this;
  }

   /**
   * Get desiredUpdate
   * @return desiredUpdate
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate getDesiredUpdate() {
    return desiredUpdate;
  }

  public void setDesiredUpdate(IoOpenshiftConfigV1ClusterVersionSpecDesiredUpdate desiredUpdate) {
    this.desiredUpdate = desiredUpdate;
  }

  public IoOpenshiftConfigV1ClusterVersionSpec overrides(List<IoOpenshiftConfigV1ClusterVersionSpecOverrides> overrides) {
    this.overrides = overrides;
    return this;
  }

  public IoOpenshiftConfigV1ClusterVersionSpec addOverridesItem(IoOpenshiftConfigV1ClusterVersionSpecOverrides overridesItem) {
    if (this.overrides == null) {
      this.overrides = new ArrayList<>();
    }
    this.overrides.add(overridesItem);
    return this;
  }

   /**
   * overrides is list of overides for components that are managed by cluster version operator. Marking a component unmanaged will prevent the operator from creating or updating the object.
   * @return overrides
  **/
  @ApiModelProperty(value = "overrides is list of overides for components that are managed by cluster version operator. Marking a component unmanaged will prevent the operator from creating or updating the object.")
  public List<IoOpenshiftConfigV1ClusterVersionSpecOverrides> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<IoOpenshiftConfigV1ClusterVersionSpecOverrides> overrides) {
    this.overrides = overrides;
  }

  public IoOpenshiftConfigV1ClusterVersionSpec upstream(String upstream) {
    this.upstream = upstream;
    return this;
  }

   /**
   * upstream may be used to specify the preferred update server. By default it will use the appropriate update server for the cluster and region.
   * @return upstream
  **/
  @ApiModelProperty(value = "upstream may be used to specify the preferred update server. By default it will use the appropriate update server for the cluster and region.")
  public String getUpstream() {
    return upstream;
  }

  public void setUpstream(String upstream) {
    this.upstream = upstream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1ClusterVersionSpec ioOpenshiftConfigV1ClusterVersionSpec = (IoOpenshiftConfigV1ClusterVersionSpec) o;
    return Objects.equals(this.channel, ioOpenshiftConfigV1ClusterVersionSpec.channel) &&
        Objects.equals(this.clusterID, ioOpenshiftConfigV1ClusterVersionSpec.clusterID) &&
        Objects.equals(this.desiredUpdate, ioOpenshiftConfigV1ClusterVersionSpec.desiredUpdate) &&
        Objects.equals(this.overrides, ioOpenshiftConfigV1ClusterVersionSpec.overrides) &&
        Objects.equals(this.upstream, ioOpenshiftConfigV1ClusterVersionSpec.upstream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, clusterID, desiredUpdate, overrides, upstream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1ClusterVersionSpec {\n");
    
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
    sb.append("    desiredUpdate: ").append(toIndentedString(desiredUpdate)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    upstream: ").append(toIndentedString(upstream)).append("\n");
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
