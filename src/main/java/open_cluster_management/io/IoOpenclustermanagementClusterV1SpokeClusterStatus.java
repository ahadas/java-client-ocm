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
import open_cluster_management.io.IoOpenclustermanagementClusterV1SpokeClusterStatusConditions;
import open_cluster_management.io.IoOpenclustermanagementClusterV1SpokeClusterStatusVersion;

/**
 * Status represents the current status of joined spoke cluster
 */
@ApiModel(description = "Status represents the current status of joined spoke cluster")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenclustermanagementClusterV1SpokeClusterStatus {
  @SerializedName("allocatable")
  private Map<String, String> allocatable = null;

  @SerializedName("capacity")
  private Map<String, String> capacity = null;

  @SerializedName("conditions")
  private List<IoOpenclustermanagementClusterV1SpokeClusterStatusConditions> conditions = null;

  @SerializedName("version")
  private IoOpenclustermanagementClusterV1SpokeClusterStatusVersion version = null;

  public IoOpenclustermanagementClusterV1SpokeClusterStatus allocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
    return this;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus putAllocatableItem(String key, String allocatableItem) {
    if (this.allocatable == null) {
      this.allocatable = new HashMap<>();
    }
    this.allocatable.put(key, allocatableItem);
    return this;
  }

   /**
   * Allocatable represents the total allocatable resources on the spoke cluster.
   * @return allocatable
  **/
  @ApiModelProperty(value = "Allocatable represents the total allocatable resources on the spoke cluster.")
  public Map<String, String> getAllocatable() {
    return allocatable;
  }

  public void setAllocatable(Map<String, String> allocatable) {
    this.allocatable = allocatable;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus capacity(Map<String, String> capacity) {
    this.capacity = capacity;
    return this;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus putCapacityItem(String key, String capacityItem) {
    if (this.capacity == null) {
      this.capacity = new HashMap<>();
    }
    this.capacity.put(key, capacityItem);
    return this;
  }

   /**
   * Capacity represents the total resource capacity from all nodeStatuses on the spoke cluster.
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity represents the total resource capacity from all nodeStatuses on the spoke cluster.")
  public Map<String, String> getCapacity() {
    return capacity;
  }

  public void setCapacity(Map<String, String> capacity) {
    this.capacity = capacity;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus conditions(List<IoOpenclustermanagementClusterV1SpokeClusterStatusConditions> conditions) {
    this.conditions = conditions;
    return this;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus addConditionsItem(IoOpenclustermanagementClusterV1SpokeClusterStatusConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions contains the different condition statuses for this spoke cluster.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions contains the different condition statuses for this spoke cluster.")
  public List<IoOpenclustermanagementClusterV1SpokeClusterStatusConditions> getConditions() {
    return conditions;
  }

  public void setConditions(List<IoOpenclustermanagementClusterV1SpokeClusterStatusConditions> conditions) {
    this.conditions = conditions;
  }

  public IoOpenclustermanagementClusterV1SpokeClusterStatus version(IoOpenclustermanagementClusterV1SpokeClusterStatusVersion version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public IoOpenclustermanagementClusterV1SpokeClusterStatusVersion getVersion() {
    return version;
  }

  public void setVersion(IoOpenclustermanagementClusterV1SpokeClusterStatusVersion version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenclustermanagementClusterV1SpokeClusterStatus ioOpenclustermanagementClusterV1SpokeClusterStatus = (IoOpenclustermanagementClusterV1SpokeClusterStatus) o;
    return Objects.equals(this.allocatable, ioOpenclustermanagementClusterV1SpokeClusterStatus.allocatable) &&
        Objects.equals(this.capacity, ioOpenclustermanagementClusterV1SpokeClusterStatus.capacity) &&
        Objects.equals(this.conditions, ioOpenclustermanagementClusterV1SpokeClusterStatus.conditions) &&
        Objects.equals(this.version, ioOpenclustermanagementClusterV1SpokeClusterStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatable, capacity, conditions, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenclustermanagementClusterV1SpokeClusterStatus {\n");
    
    sb.append("    allocatable: ").append(toIndentedString(allocatable)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

