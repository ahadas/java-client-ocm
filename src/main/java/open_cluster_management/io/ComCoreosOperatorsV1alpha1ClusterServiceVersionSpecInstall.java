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
import open_cluster_management.io.ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpec;

/**
 * NamedInstallStrategy represents the block of an ClusterServiceVersion resource where the install strategy is specified.
 */
@ApiModel(description = "NamedInstallStrategy represents the block of an ClusterServiceVersion resource where the install strategy is specified.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall {
  @SerializedName("spec")
  private ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpec spec = null;

  @SerializedName("strategy")
  private String strategy = null;

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall spec(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @ApiModelProperty(value = "")
  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpec getSpec() {
    return spec;
  }

  public void setSpec(ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstallSpec spec) {
    this.spec = spec;
  }

  public ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall = (ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall) o;
    return Objects.equals(this.spec, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall.spec) &&
        Objects.equals(this.strategy, comCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosOperatorsV1alpha1ClusterServiceVersionSpecInstall {\n");
    
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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
