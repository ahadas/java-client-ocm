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
import open_cluster_management.io.ComGithubOpenshiftApiImageV1TagEvent;
import open_cluster_management.io.ComGithubOpenshiftApiImageV1TagEventCondition;

/**
 * NamedTagEventList relates a tag to its image history.
 */
@ApiModel(description = "NamedTagEventList relates a tag to its image history.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiImageV1NamedTagEventList {
  @SerializedName("conditions")
  private List<ComGithubOpenshiftApiImageV1TagEventCondition> conditions = null;

  @SerializedName("items")
  private List<ComGithubOpenshiftApiImageV1TagEvent> items = new ArrayList<>();

  @SerializedName("tag")
  private String tag = null;

  public ComGithubOpenshiftApiImageV1NamedTagEventList conditions(List<ComGithubOpenshiftApiImageV1TagEventCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ComGithubOpenshiftApiImageV1NamedTagEventList addConditionsItem(ComGithubOpenshiftApiImageV1TagEventCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions is an array of conditions that apply to the tag event list.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions is an array of conditions that apply to the tag event list.")
  public List<ComGithubOpenshiftApiImageV1TagEventCondition> getConditions() {
    return conditions;
  }

  public void setConditions(List<ComGithubOpenshiftApiImageV1TagEventCondition> conditions) {
    this.conditions = conditions;
  }

  public ComGithubOpenshiftApiImageV1NamedTagEventList items(List<ComGithubOpenshiftApiImageV1TagEvent> items) {
    this.items = items;
    return this;
  }

  public ComGithubOpenshiftApiImageV1NamedTagEventList addItemsItem(ComGithubOpenshiftApiImageV1TagEvent itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Standard object&#39;s metadata.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Standard object's metadata.")
  public List<ComGithubOpenshiftApiImageV1TagEvent> getItems() {
    return items;
  }

  public void setItems(List<ComGithubOpenshiftApiImageV1TagEvent> items) {
    this.items = items;
  }

  public ComGithubOpenshiftApiImageV1NamedTagEventList tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag is the tag for which the history is recorded
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "Tag is the tag for which the history is recorded")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiImageV1NamedTagEventList comGithubOpenshiftApiImageV1NamedTagEventList = (ComGithubOpenshiftApiImageV1NamedTagEventList) o;
    return Objects.equals(this.conditions, comGithubOpenshiftApiImageV1NamedTagEventList.conditions) &&
        Objects.equals(this.items, comGithubOpenshiftApiImageV1NamedTagEventList.items) &&
        Objects.equals(this.tag, comGithubOpenshiftApiImageV1NamedTagEventList.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, items, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiImageV1NamedTagEventList {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
