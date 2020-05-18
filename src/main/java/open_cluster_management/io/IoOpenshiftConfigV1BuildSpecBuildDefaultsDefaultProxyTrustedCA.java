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
 * trustedCA is a reference to a ConfigMap containing a CA certificate bundle used for client egress HTTPS connections. The certificate bundle must be from the CA that signed the proxy&#39;s certificate and be signed for everything. The trustedCA field should only be consumed by a proxy validator. The validator is responsible for reading the certificate bundle from required key \&quot;ca-bundle.crt\&quot; and copying it to a ConfigMap named \&quot;trusted-ca-bundle\&quot; in the \&quot;openshift-config-managed\&quot; namespace. The namespace for the ConfigMap referenced by trustedCA is \&quot;openshift-config\&quot;. Here is an example ConfigMap (in yaml):   apiVersion: v1 kind: ConfigMap metadata:  name: user-ca-bundle  namespace: openshift-config  data:    ca-bundle.crt: |      -----BEGIN CERTIFICATE-----      Custom CA certificate bundle.      -----END CERTIFICATE-----
 */
@ApiModel(description = "trustedCA is a reference to a ConfigMap containing a CA certificate bundle used for client egress HTTPS connections. The certificate bundle must be from the CA that signed the proxy's certificate and be signed for everything. The trustedCA field should only be consumed by a proxy validator. The validator is responsible for reading the certificate bundle from required key \"ca-bundle.crt\" and copying it to a ConfigMap named \"trusted-ca-bundle\" in the \"openshift-config-managed\" namespace. The namespace for the ConfigMap referenced by trustedCA is \"openshift-config\". Here is an example ConfigMap (in yaml):   apiVersion: v1 kind: ConfigMap metadata:  name: user-ca-bundle  namespace: openshift-config  data:    ca-bundle.crt: |      -----BEGIN CERTIFICATE-----      Custom CA certificate bundle.      -----END CERTIFICATE-----")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA {
  @SerializedName("name")
  private String name = null;

  public IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name is the metadata.name of the referenced config map
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the metadata.name of the referenced config map")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA = (IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA) o;
    return Objects.equals(this.name, ioOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoOpenshiftConfigV1BuildSpecBuildDefaultsDefaultProxyTrustedCA {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

