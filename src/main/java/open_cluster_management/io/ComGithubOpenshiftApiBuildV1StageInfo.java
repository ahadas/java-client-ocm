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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1StepInfo;

/**
 * StageInfo contains details about a build stage.
 */
@ApiModel(description = "StageInfo contains details about a build stage.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1StageInfo {
  @SerializedName("durationMilliseconds")
  private Long durationMilliseconds = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("startTime")
  private String startTime = null;

  @SerializedName("steps")
  private List<ComGithubOpenshiftApiBuildV1StepInfo> steps = null;

  public ComGithubOpenshiftApiBuildV1StageInfo durationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
    return this;
  }

   /**
   * durationMilliseconds identifies how long the stage took to complete in milliseconds. Note: the duration of a stage can exceed the sum of the duration of the steps within the stage as not all actions are accounted for in explicit build steps.
   * @return durationMilliseconds
  **/
  @ApiModelProperty(value = "durationMilliseconds identifies how long the stage took to complete in milliseconds. Note: the duration of a stage can exceed the sum of the duration of the steps within the stage as not all actions are accounted for in explicit build steps.")
  public Long getDurationMilliseconds() {
    return durationMilliseconds;
  }

  public void setDurationMilliseconds(Long durationMilliseconds) {
    this.durationMilliseconds = durationMilliseconds;
  }

  public ComGithubOpenshiftApiBuildV1StageInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is a unique identifier for each build stage that occurs.
   * @return name
  **/
  @ApiModelProperty(value = "name is a unique identifier for each build stage that occurs.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ComGithubOpenshiftApiBuildV1StageInfo startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * startTime is a timestamp representing the server time when this Stage started. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(value = "startTime is a timestamp representing the server time when this Stage started. It is represented in RFC3339 form and is in UTC.")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public ComGithubOpenshiftApiBuildV1StageInfo steps(List<ComGithubOpenshiftApiBuildV1StepInfo> steps) {
    this.steps = steps;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1StageInfo addStepsItem(ComGithubOpenshiftApiBuildV1StepInfo stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * steps contains details about each step that occurs during a build stage including start time and duration in milliseconds.
   * @return steps
  **/
  @ApiModelProperty(value = "steps contains details about each step that occurs during a build stage including start time and duration in milliseconds.")
  public List<ComGithubOpenshiftApiBuildV1StepInfo> getSteps() {
    return steps;
  }

  public void setSteps(List<ComGithubOpenshiftApiBuildV1StepInfo> steps) {
    this.steps = steps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1StageInfo comGithubOpenshiftApiBuildV1StageInfo = (ComGithubOpenshiftApiBuildV1StageInfo) o;
    return Objects.equals(this.durationMilliseconds, comGithubOpenshiftApiBuildV1StageInfo.durationMilliseconds) &&
        Objects.equals(this.name, comGithubOpenshiftApiBuildV1StageInfo.name) &&
        Objects.equals(this.startTime, comGithubOpenshiftApiBuildV1StageInfo.startTime) &&
        Objects.equals(this.steps, comGithubOpenshiftApiBuildV1StageInfo.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(durationMilliseconds, name, startTime, steps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1StageInfo {\n");
    
    sb.append("    durationMilliseconds: ").append(toIndentedString(durationMilliseconds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

