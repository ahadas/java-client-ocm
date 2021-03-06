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
import open_cluster_management.io.IoOpenshiftTunedV1TunedSpecMatch;

/**
 * Selection logic for a single tuned profile.
 */
@ApiModel(description = "Selection logic for a single tuned profile.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftTunedV1TunedSpecRecommend {
  @SerializedName("match")
  private List<IoOpenshiftTunedV1TunedSpecMatch> match = null;

  @SerializedName("priority")
  private Long priority = null;

  @SerializedName("profile")
  private String profile = null;

  public IoOpenshiftTunedV1TunedSpecRecommend match(List<IoOpenshiftTunedV1TunedSpecMatch> match) {
    this.match = match;
    return this;
  }

  public IoOpenshiftTunedV1TunedSpecRecommend addMatchItem(IoOpenshiftTunedV1TunedSpecMatch matchItem) {
    if (this.match == null) {
      this.match = new ArrayList<>();
    }
    this.match.add(matchItem);
    return this;
  }

   /**
   * Rules governing application of a tuned profile connected by logical OR operator.
   * @return match
  **/
  @ApiModelProperty(value = "Rules governing application of a tuned profile connected by logical OR operator.")
  public List<IoOpenshiftTunedV1TunedSpecMatch> getMatch() {
    return match;
  }

  public void setMatch(List<IoOpenshiftTunedV1TunedSpecMatch> match) {
    this.match = match;
  }

  public IoOpenshiftTunedV1TunedSpecRecommend priority(Long priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Tuned profile priority. Highest priority is 0.
   * minimum: 0
   * @return priority
  **/
  @ApiModelProperty(required = true, value = "Tuned profile priority. Highest priority is 0.")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public IoOpenshiftTunedV1TunedSpecRecommend profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Name of the tuned profile to recommend.
   * @return profile
  **/
  @ApiModelProperty(required = true, value = "Name of the tuned profile to recommend.")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftTunedV1TunedSpecRecommend ioOpenshiftTunedV1TunedSpecRecommend = (IoOpenshiftTunedV1TunedSpecRecommend) o;
    return Objects.equals(this.match, ioOpenshiftTunedV1TunedSpecRecommend.match) &&
        Objects.equals(this.priority, ioOpenshiftTunedV1TunedSpecRecommend.priority) &&
        Objects.equals(this.profile, ioOpenshiftTunedV1TunedSpecRecommend.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(match, priority, profile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftTunedV1TunedSpecRecommend {\n");
    
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

