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
import open_cluster_management.io.IoK8sApiPolicyV1beta1IDRange;

/**
 * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
 */
@ApiModel(description = "SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions {
  @SerializedName("ranges")
  private List<IoK8sApiPolicyV1beta1IDRange> ranges = null;

  @SerializedName("rule")
  private String rule = null;

  public IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions ranges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions addRangesItem(IoK8sApiPolicyV1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @ApiModelProperty(value = "ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.")
  public List<IoK8sApiPolicyV1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
   * @return rule
  **/
  @ApiModelProperty(value = "rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.")
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions ioK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions = (IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions) o;
    return Objects.equals(this.ranges, ioK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions.ranges) &&
        Objects.equals(this.rule, ioK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1SupplementalGroupsStrategyOptions {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

