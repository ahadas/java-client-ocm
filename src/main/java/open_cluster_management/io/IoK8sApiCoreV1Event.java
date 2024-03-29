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
import open_cluster_management.io.IoK8sApiCoreV1EventSeries;
import open_cluster_management.io.IoK8sApiCoreV1EventSource;
import open_cluster_management.io.IoK8sApiCoreV1ObjectReference;
import open_cluster_management.io.IoK8sApimachineryPkgApisMetaV1ObjectMeta;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@ApiModel(description = "Event is a report of an event somewhere in the cluster.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiCoreV1Event {
  @SerializedName("action")
  private String action = null;

  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("eventTime")
  private String eventTime = null;

  @SerializedName("firstTimestamp")
  private String firstTimestamp = null;

  @SerializedName("involvedObject")
  private IoK8sApiCoreV1ObjectReference involvedObject = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("lastTimestamp")
  private String lastTimestamp = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("metadata")
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("related")
  private IoK8sApiCoreV1ObjectReference related = null;

  @SerializedName("reportingComponent")
  private String reportingComponent = null;

  @SerializedName("reportingInstance")
  private String reportingInstance = null;

  @SerializedName("series")
  private IoK8sApiCoreV1EventSeries series = null;

  @SerializedName("source")
  private IoK8sApiCoreV1EventSource source = null;

  @SerializedName("type")
  private String type = null;

  public IoK8sApiCoreV1Event action(String action) {
    this.action = action;
    return this;
  }

   /**
   * What action was taken/failed regarding to the Regarding object.
   * @return action
  **/
  @ApiModelProperty(value = "What action was taken/failed regarding to the Regarding object.")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public IoK8sApiCoreV1Event apiVersion(String apiVersion) {
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

  public IoK8sApiCoreV1Event count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of times this event has occurred.
   * @return count
  **/
  @ApiModelProperty(value = "The number of times this event has occurred.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public IoK8sApiCoreV1Event eventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time when this Event was first observed.
   * @return eventTime
  **/
  @ApiModelProperty(value = "Time when this Event was first observed.")
  public String getEventTime() {
    return eventTime;
  }

  public void setEventTime(String eventTime) {
    this.eventTime = eventTime;
  }

  public IoK8sApiCoreV1Event firstTimestamp(String firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
    return this;
  }

   /**
   * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
   * @return firstTimestamp
  **/
  @ApiModelProperty(value = "The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)")
  public String getFirstTimestamp() {
    return firstTimestamp;
  }

  public void setFirstTimestamp(String firstTimestamp) {
    this.firstTimestamp = firstTimestamp;
  }

  public IoK8sApiCoreV1Event involvedObject(IoK8sApiCoreV1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
    return this;
  }

   /**
   * The object that this event is about.
   * @return involvedObject
  **/
  @ApiModelProperty(required = true, value = "The object that this event is about.")
  public IoK8sApiCoreV1ObjectReference getInvolvedObject() {
    return involvedObject;
  }

  public void setInvolvedObject(IoK8sApiCoreV1ObjectReference involvedObject) {
    this.involvedObject = involvedObject;
  }

  public IoK8sApiCoreV1Event kind(String kind) {
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

  public IoK8sApiCoreV1Event lastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
    return this;
  }

   /**
   * The time at which the most recent occurrence of this event was recorded.
   * @return lastTimestamp
  **/
  @ApiModelProperty(value = "The time at which the most recent occurrence of this event was recorded.")
  public String getLastTimestamp() {
    return lastTimestamp;
  }

  public void setLastTimestamp(String lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }

  public IoK8sApiCoreV1Event message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable description of the status of this operation.
   * @return message
  **/
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IoK8sApiCoreV1Event metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(required = true, value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sApiCoreV1Event reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * This should be a short, machine understandable string that gives the reason for the transition into the object&#39;s current status.
   * @return reason
  **/
  @ApiModelProperty(value = "This should be a short, machine understandable string that gives the reason for the transition into the object's current status.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IoK8sApiCoreV1Event related(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
    return this;
  }

   /**
   * Optional secondary object for more complex actions.
   * @return related
  **/
  @ApiModelProperty(value = "Optional secondary object for more complex actions.")
  public IoK8sApiCoreV1ObjectReference getRelated() {
    return related;
  }

  public void setRelated(IoK8sApiCoreV1ObjectReference related) {
    this.related = related;
  }

  public IoK8sApiCoreV1Event reportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
    return this;
  }

   /**
   * Name of the controller that emitted this Event, e.g. &#x60;kubernetes.io/kubelet&#x60;.
   * @return reportingComponent
  **/
  @ApiModelProperty(value = "Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.")
  public String getReportingComponent() {
    return reportingComponent;
  }

  public void setReportingComponent(String reportingComponent) {
    this.reportingComponent = reportingComponent;
  }

  public IoK8sApiCoreV1Event reportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
    return this;
  }

   /**
   * ID of the controller instance, e.g. &#x60;kubelet-xyzf&#x60;.
   * @return reportingInstance
  **/
  @ApiModelProperty(value = "ID of the controller instance, e.g. `kubelet-xyzf`.")
  public String getReportingInstance() {
    return reportingInstance;
  }

  public void setReportingInstance(String reportingInstance) {
    this.reportingInstance = reportingInstance;
  }

  public IoK8sApiCoreV1Event series(IoK8sApiCoreV1EventSeries series) {
    this.series = series;
    return this;
  }

   /**
   * Data about the Event series this event represents or nil if it&#39;s a singleton Event.
   * @return series
  **/
  @ApiModelProperty(value = "Data about the Event series this event represents or nil if it's a singleton Event.")
  public IoK8sApiCoreV1EventSeries getSeries() {
    return series;
  }

  public void setSeries(IoK8sApiCoreV1EventSeries series) {
    this.series = series;
  }

  public IoK8sApiCoreV1Event source(IoK8sApiCoreV1EventSource source) {
    this.source = source;
    return this;
  }

   /**
   * The component reporting this event. Should be a short machine understandable string.
   * @return source
  **/
  @ApiModelProperty(value = "The component reporting this event. Should be a short machine understandable string.")
  public IoK8sApiCoreV1EventSource getSource() {
    return source;
  }

  public void setSource(IoK8sApiCoreV1EventSource source) {
    this.source = source;
  }

  public IoK8sApiCoreV1Event type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of this event (Normal, Warning), new types could be added in the future
   * @return type
  **/
  @ApiModelProperty(value = "Type of this event (Normal, Warning), new types could be added in the future")
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
    IoK8sApiCoreV1Event ioK8sApiCoreV1Event = (IoK8sApiCoreV1Event) o;
    return Objects.equals(this.action, ioK8sApiCoreV1Event.action) &&
        Objects.equals(this.apiVersion, ioK8sApiCoreV1Event.apiVersion) &&
        Objects.equals(this.count, ioK8sApiCoreV1Event.count) &&
        Objects.equals(this.eventTime, ioK8sApiCoreV1Event.eventTime) &&
        Objects.equals(this.firstTimestamp, ioK8sApiCoreV1Event.firstTimestamp) &&
        Objects.equals(this.involvedObject, ioK8sApiCoreV1Event.involvedObject) &&
        Objects.equals(this.kind, ioK8sApiCoreV1Event.kind) &&
        Objects.equals(this.lastTimestamp, ioK8sApiCoreV1Event.lastTimestamp) &&
        Objects.equals(this.message, ioK8sApiCoreV1Event.message) &&
        Objects.equals(this.metadata, ioK8sApiCoreV1Event.metadata) &&
        Objects.equals(this.reason, ioK8sApiCoreV1Event.reason) &&
        Objects.equals(this.related, ioK8sApiCoreV1Event.related) &&
        Objects.equals(this.reportingComponent, ioK8sApiCoreV1Event.reportingComponent) &&
        Objects.equals(this.reportingInstance, ioK8sApiCoreV1Event.reportingInstance) &&
        Objects.equals(this.series, ioK8sApiCoreV1Event.series) &&
        Objects.equals(this.source, ioK8sApiCoreV1Event.source) &&
        Objects.equals(this.type, ioK8sApiCoreV1Event.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, apiVersion, count, eventTime, firstTimestamp, involvedObject, kind, lastTimestamp, message, metadata, reason, related, reportingComponent, reportingInstance, series, source, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Event {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    firstTimestamp: ").append(toIndentedString(firstTimestamp)).append("\n");
    sb.append("    involvedObject: ").append(toIndentedString(involvedObject)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    reportingComponent: ").append(toIndentedString(reportingComponent)).append("\n");
    sb.append("    reportingInstance: ").append(toIndentedString(reportingInstance)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

