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
 * IDRange provides a min/max of an allowed range of IDs.
 */
@ApiModel(description = "IDRange provides a min/max of an allowed range of IDs.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiSecurityV1IDRange {
  @SerializedName("max")
  private Long max = null;

  @SerializedName("min")
  private Long min = null;

  public ComGithubOpenshiftApiSecurityV1IDRange max(Long max) {
    this.max = max;
    return this;
  }

   /**
   * Max is the end of the range, inclusive.
   * @return max
  **/
  @ApiModelProperty(value = "Max is the end of the range, inclusive.")
  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  public ComGithubOpenshiftApiSecurityV1IDRange min(Long min) {
    this.min = min;
    return this;
  }

   /**
   * Min is the start of the range, inclusive.
   * @return min
  **/
  @ApiModelProperty(value = "Min is the start of the range, inclusive.")
  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiSecurityV1IDRange comGithubOpenshiftApiSecurityV1IDRange = (ComGithubOpenshiftApiSecurityV1IDRange) o;
    return Objects.equals(this.max, comGithubOpenshiftApiSecurityV1IDRange.max) &&
        Objects.equals(this.min, comGithubOpenshiftApiSecurityV1IDRange.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiSecurityV1IDRange {\n");
    
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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
