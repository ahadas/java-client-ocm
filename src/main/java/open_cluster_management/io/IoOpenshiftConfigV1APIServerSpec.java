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
import open_cluster_management.io.IoOpenshiftConfigV1APIServerSpecClientCA;
import open_cluster_management.io.IoOpenshiftConfigV1APIServerSpecEncryption;
import open_cluster_management.io.IoOpenshiftConfigV1APIServerSpecServingCerts;
import open_cluster_management.io.IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile;

/**
 * IoOpenshiftConfigV1APIServerSpec
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1APIServerSpec {
  @SerializedName("additionalCORSAllowedOrigins")
  private List<String> additionalCORSAllowedOrigins = null;

  @SerializedName("clientCA")
  private IoOpenshiftConfigV1APIServerSpecClientCA clientCA = null;

  @SerializedName("encryption")
  private IoOpenshiftConfigV1APIServerSpecEncryption encryption = null;

  @SerializedName("servingCerts")
  private IoOpenshiftConfigV1APIServerSpecServingCerts servingCerts = null;

  @SerializedName("tlsSecurityProfile")
  private IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile tlsSecurityProfile = null;

  public IoOpenshiftConfigV1APIServerSpec additionalCORSAllowedOrigins(List<String> additionalCORSAllowedOrigins) {
    this.additionalCORSAllowedOrigins = additionalCORSAllowedOrigins;
    return this;
  }

  public IoOpenshiftConfigV1APIServerSpec addAdditionalCORSAllowedOriginsItem(String additionalCORSAllowedOriginsItem) {
    if (this.additionalCORSAllowedOrigins == null) {
      this.additionalCORSAllowedOrigins = new ArrayList<>();
    }
    this.additionalCORSAllowedOrigins.add(additionalCORSAllowedOriginsItem);
    return this;
  }

   /**
   * additionalCORSAllowedOrigins lists additional, user-defined regular expressions describing hosts for which the API server allows access using the CORS headers. This may be needed to access the API and the integrated OAuth server from JavaScript applications. The values are regular expressions that correspond to the Golang regular expression language.
   * @return additionalCORSAllowedOrigins
  **/
  @ApiModelProperty(value = "additionalCORSAllowedOrigins lists additional, user-defined regular expressions describing hosts for which the API server allows access using the CORS headers. This may be needed to access the API and the integrated OAuth server from JavaScript applications. The values are regular expressions that correspond to the Golang regular expression language.")
  public List<String> getAdditionalCORSAllowedOrigins() {
    return additionalCORSAllowedOrigins;
  }

  public void setAdditionalCORSAllowedOrigins(List<String> additionalCORSAllowedOrigins) {
    this.additionalCORSAllowedOrigins = additionalCORSAllowedOrigins;
  }

  public IoOpenshiftConfigV1APIServerSpec clientCA(IoOpenshiftConfigV1APIServerSpecClientCA clientCA) {
    this.clientCA = clientCA;
    return this;
  }

   /**
   * Get clientCA
   * @return clientCA
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1APIServerSpecClientCA getClientCA() {
    return clientCA;
  }

  public void setClientCA(IoOpenshiftConfigV1APIServerSpecClientCA clientCA) {
    this.clientCA = clientCA;
  }

  public IoOpenshiftConfigV1APIServerSpec encryption(IoOpenshiftConfigV1APIServerSpecEncryption encryption) {
    this.encryption = encryption;
    return this;
  }

   /**
   * Get encryption
   * @return encryption
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1APIServerSpecEncryption getEncryption() {
    return encryption;
  }

  public void setEncryption(IoOpenshiftConfigV1APIServerSpecEncryption encryption) {
    this.encryption = encryption;
  }

  public IoOpenshiftConfigV1APIServerSpec servingCerts(IoOpenshiftConfigV1APIServerSpecServingCerts servingCerts) {
    this.servingCerts = servingCerts;
    return this;
  }

   /**
   * Get servingCerts
   * @return servingCerts
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1APIServerSpecServingCerts getServingCerts() {
    return servingCerts;
  }

  public void setServingCerts(IoOpenshiftConfigV1APIServerSpecServingCerts servingCerts) {
    this.servingCerts = servingCerts;
  }

  public IoOpenshiftConfigV1APIServerSpec tlsSecurityProfile(IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile tlsSecurityProfile) {
    this.tlsSecurityProfile = tlsSecurityProfile;
    return this;
  }

   /**
   * Get tlsSecurityProfile
   * @return tlsSecurityProfile
  **/
  @ApiModelProperty(value = "")
  public IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile getTlsSecurityProfile() {
    return tlsSecurityProfile;
  }

  public void setTlsSecurityProfile(IoOpenshiftConfigV1APIServerSpecTlsSecurityProfile tlsSecurityProfile) {
    this.tlsSecurityProfile = tlsSecurityProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1APIServerSpec ioOpenshiftConfigV1APIServerSpec = (IoOpenshiftConfigV1APIServerSpec) o;
    return Objects.equals(this.additionalCORSAllowedOrigins, ioOpenshiftConfigV1APIServerSpec.additionalCORSAllowedOrigins) &&
        Objects.equals(this.clientCA, ioOpenshiftConfigV1APIServerSpec.clientCA) &&
        Objects.equals(this.encryption, ioOpenshiftConfigV1APIServerSpec.encryption) &&
        Objects.equals(this.servingCerts, ioOpenshiftConfigV1APIServerSpec.servingCerts) &&
        Objects.equals(this.tlsSecurityProfile, ioOpenshiftConfigV1APIServerSpec.tlsSecurityProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalCORSAllowedOrigins, clientCA, encryption, servingCerts, tlsSecurityProfile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1APIServerSpec {\n");
    
    sb.append("    additionalCORSAllowedOrigins: ").append(toIndentedString(additionalCORSAllowedOrigins)).append("\n");
    sb.append("    clientCA: ").append(toIndentedString(clientCA)).append("\n");
    sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
    sb.append("    servingCerts: ").append(toIndentedString(servingCerts)).append("\n");
    sb.append("    tlsSecurityProfile: ").append(toIndentedString(tlsSecurityProfile)).append("\n");
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

