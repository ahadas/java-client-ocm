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
 * pvc represents configuration that uses a PersistentVolumeClaim.
 */
@ApiModel(description = "pvc represents configuration that uses a PersistentVolumeClaim.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc {
  @SerializedName("claim")
  private String claim = null;

  public IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc claim(String claim) {
    this.claim = claim;
    return this;
  }

   /**
   * claim defines the Persisent Volume Claim&#39;s name to be used.
   * @return claim
  **/
  @ApiModelProperty(value = "claim defines the Persisent Volume Claim's name to be used.")
  public String getClaim() {
    return claim;
  }

  public void setClaim(String claim) {
    this.claim = claim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc ioOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc = (IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc) o;
    return Objects.equals(this.claim, ioOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc.claim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claim);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftOperatorImageregistryV1ConfigSpecStoragePvc {\n");
    
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
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

