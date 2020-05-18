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
 * IoOpenshiftNetworkV1EgressNetworkPolicySpecTo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftNetworkV1EgressNetworkPolicySpecTo {
  @SerializedName("cidrSelector")
  private String cidrSelector = null;

  @SerializedName("dnsName")
  private String dnsName = null;

  public IoOpenshiftNetworkV1EgressNetworkPolicySpecTo cidrSelector(String cidrSelector) {
    this.cidrSelector = cidrSelector;
    return this;
  }

   /**
   * Get cidrSelector
   * @return cidrSelector
  **/
  @ApiModelProperty(value = "")
  public String getCidrSelector() {
    return cidrSelector;
  }

  public void setCidrSelector(String cidrSelector) {
    this.cidrSelector = cidrSelector;
  }

  public IoOpenshiftNetworkV1EgressNetworkPolicySpecTo dnsName(String dnsName) {
    this.dnsName = dnsName;
    return this;
  }

   /**
   * Get dnsName
   * @return dnsName
  **/
  @ApiModelProperty(value = "")
  public String getDnsName() {
    return dnsName;
  }

  public void setDnsName(String dnsName) {
    this.dnsName = dnsName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftNetworkV1EgressNetworkPolicySpecTo ioOpenshiftNetworkV1EgressNetworkPolicySpecTo = (IoOpenshiftNetworkV1EgressNetworkPolicySpecTo) o;
    return Objects.equals(this.cidrSelector, ioOpenshiftNetworkV1EgressNetworkPolicySpecTo.cidrSelector) &&
        Objects.equals(this.dnsName, ioOpenshiftNetworkV1EgressNetworkPolicySpecTo.dnsName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidrSelector, dnsName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftNetworkV1EgressNetworkPolicySpecTo {\n");
    
    sb.append("    cidrSelector: ").append(toIndentedString(cidrSelector)).append("\n");
    sb.append("    dnsName: ").append(toIndentedString(dnsName)).append("\n");
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

