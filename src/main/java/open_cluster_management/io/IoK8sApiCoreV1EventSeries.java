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

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@ApiModel(description = "EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1EventSeries {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("lastObservedTime")
  private String lastObservedTime = null;

  @SerializedName("state")
  private String state = null;

  public IoK8sApiCoreV1EventSeries count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of occurrences in this series up to the last heartbeat time
   * @return count
  **/
  @ApiModelProperty(value = "Number of occurrences in this series up to the last heartbeat time")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IoK8sApiCoreV1EventSeries lastObservedTime(String lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
    return this;
  }

   /**
   * Time of the last occurrence observed
   * @return lastObservedTime
  **/
  @ApiModelProperty(value = "Time of the last occurrence observed")
  public String getLastObservedTime() {
    return lastObservedTime;
  }

  public void setLastObservedTime(String lastObservedTime) {
    this.lastObservedTime = lastObservedTime;
  }

  public IoK8sApiCoreV1EventSeries state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
   * @return state
  **/
  @ApiModelProperty(value = "State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EventSeries ioK8sApiCoreV1EventSeries = (IoK8sApiCoreV1EventSeries) o;
    return Objects.equals(this.count, ioK8sApiCoreV1EventSeries.count) &&
        Objects.equals(this.lastObservedTime, ioK8sApiCoreV1EventSeries.lastObservedTime) &&
        Objects.equals(this.state, ioK8sApiCoreV1EventSeries.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, lastObservedTime, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EventSeries {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    lastObservedTime: ").append(toIndentedString(lastObservedTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

