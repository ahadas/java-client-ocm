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
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1BinaryBuildSource;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1ConfigMapBuildSource;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1GitBuildSource;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1ImageSource;
import open_cluster_management.io.ComGithubOpenshiftApiBuildV1SecretBuildSource;
import open_cluster_management.io.IoK8sApiCoreV1LocalObjectReference;

/**
 * BuildSource is the SCM used for the build.
 */
@ApiModel(description = "BuildSource is the SCM used for the build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BuildSource {
  @SerializedName("binary")
  private ComGithubOpenshiftApiBuildV1BinaryBuildSource binary = null;

  @SerializedName("configMaps")
  private List<ComGithubOpenshiftApiBuildV1ConfigMapBuildSource> configMaps = null;

  @SerializedName("contextDir")
  private String contextDir = null;

  @SerializedName("dockerfile")
  private String dockerfile = null;

  @SerializedName("git")
  private ComGithubOpenshiftApiBuildV1GitBuildSource git = null;

  @SerializedName("images")
  private List<ComGithubOpenshiftApiBuildV1ImageSource> images = null;

  @SerializedName("secrets")
  private List<ComGithubOpenshiftApiBuildV1SecretBuildSource> secrets = null;

  @SerializedName("sourceSecret")
  private IoK8sApiCoreV1LocalObjectReference sourceSecret = null;

  @SerializedName("type")
  private String type = null;

  public ComGithubOpenshiftApiBuildV1BuildSource binary(ComGithubOpenshiftApiBuildV1BinaryBuildSource binary) {
    this.binary = binary;
    return this;
  }

   /**
   * binary builds accept a binary as their input. The binary is generally assumed to be a tar, gzipped tar, or zip file depending on the strategy. For container image builds, this is the build context and an optional Dockerfile may be specified to override any Dockerfile in the build context. For Source builds, this is assumed to be an archive as described above. For Source and container image builds, if binary.asFile is set the build will receive a directory with a single file. contextDir may be used when an archive is provided. Custom builds will receive this binary as input on STDIN.
   * @return binary
  **/
  @ApiModelProperty(value = "binary builds accept a binary as their input. The binary is generally assumed to be a tar, gzipped tar, or zip file depending on the strategy. For container image builds, this is the build context and an optional Dockerfile may be specified to override any Dockerfile in the build context. For Source builds, this is assumed to be an archive as described above. For Source and container image builds, if binary.asFile is set the build will receive a directory with a single file. contextDir may be used when an archive is provided. Custom builds will receive this binary as input on STDIN.")
  public ComGithubOpenshiftApiBuildV1BinaryBuildSource getBinary() {
    return binary;
  }

  public void setBinary(ComGithubOpenshiftApiBuildV1BinaryBuildSource binary) {
    this.binary = binary;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource configMaps(List<ComGithubOpenshiftApiBuildV1ConfigMapBuildSource> configMaps) {
    this.configMaps = configMaps;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource addConfigMapsItem(ComGithubOpenshiftApiBuildV1ConfigMapBuildSource configMapsItem) {
    if (this.configMaps == null) {
      this.configMaps = new ArrayList<>();
    }
    this.configMaps.add(configMapsItem);
    return this;
  }

   /**
   * configMaps represents a list of configMaps and their destinations that will be used for the build.
   * @return configMaps
  **/
  @ApiModelProperty(value = "configMaps represents a list of configMaps and their destinations that will be used for the build.")
  public List<ComGithubOpenshiftApiBuildV1ConfigMapBuildSource> getConfigMaps() {
    return configMaps;
  }

  public void setConfigMaps(List<ComGithubOpenshiftApiBuildV1ConfigMapBuildSource> configMaps) {
    this.configMaps = configMaps;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource contextDir(String contextDir) {
    this.contextDir = contextDir;
    return this;
  }

   /**
   * contextDir specifies the sub-directory where the source code for the application exists. This allows to have buildable sources in directory other than root of repository.
   * @return contextDir
  **/
  @ApiModelProperty(value = "contextDir specifies the sub-directory where the source code for the application exists. This allows to have buildable sources in directory other than root of repository.")
  public String getContextDir() {
    return contextDir;
  }

  public void setContextDir(String contextDir) {
    this.contextDir = contextDir;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource dockerfile(String dockerfile) {
    this.dockerfile = dockerfile;
    return this;
  }

   /**
   * dockerfile is the raw contents of a Dockerfile which should be built. When this option is specified, the FROM may be modified based on your strategy base image and additional ENV stanzas from your strategy environment will be added after the FROM, but before the rest of your Dockerfile stanzas. The Dockerfile source type may be used with other options like git - in those cases the Git repo will have any innate Dockerfile replaced in the context dir.
   * @return dockerfile
  **/
  @ApiModelProperty(value = "dockerfile is the raw contents of a Dockerfile which should be built. When this option is specified, the FROM may be modified based on your strategy base image and additional ENV stanzas from your strategy environment will be added after the FROM, but before the rest of your Dockerfile stanzas. The Dockerfile source type may be used with other options like git - in those cases the Git repo will have any innate Dockerfile replaced in the context dir.")
  public String getDockerfile() {
    return dockerfile;
  }

  public void setDockerfile(String dockerfile) {
    this.dockerfile = dockerfile;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource git(ComGithubOpenshiftApiBuildV1GitBuildSource git) {
    this.git = git;
    return this;
  }

   /**
   * git contains optional information about git build source
   * @return git
  **/
  @ApiModelProperty(value = "git contains optional information about git build source")
  public ComGithubOpenshiftApiBuildV1GitBuildSource getGit() {
    return git;
  }

  public void setGit(ComGithubOpenshiftApiBuildV1GitBuildSource git) {
    this.git = git;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource images(List<ComGithubOpenshiftApiBuildV1ImageSource> images) {
    this.images = images;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource addImagesItem(ComGithubOpenshiftApiBuildV1ImageSource imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * images describes a set of images to be used to provide source for the build
   * @return images
  **/
  @ApiModelProperty(value = "images describes a set of images to be used to provide source for the build")
  public List<ComGithubOpenshiftApiBuildV1ImageSource> getImages() {
    return images;
  }

  public void setImages(List<ComGithubOpenshiftApiBuildV1ImageSource> images) {
    this.images = images;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource secrets(List<ComGithubOpenshiftApiBuildV1SecretBuildSource> secrets) {
    this.secrets = secrets;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource addSecretsItem(ComGithubOpenshiftApiBuildV1SecretBuildSource secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * secrets represents a list of secrets and their destinations that will be used only for the build.
   * @return secrets
  **/
  @ApiModelProperty(value = "secrets represents a list of secrets and their destinations that will be used only for the build.")
  public List<ComGithubOpenshiftApiBuildV1SecretBuildSource> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<ComGithubOpenshiftApiBuildV1SecretBuildSource> secrets) {
    this.secrets = secrets;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource sourceSecret(IoK8sApiCoreV1LocalObjectReference sourceSecret) {
    this.sourceSecret = sourceSecret;
    return this;
  }

   /**
   * sourceSecret is the name of a Secret that would be used for setting up the authentication for cloning private repository. The secret contains valid credentials for remote repository, where the data&#39;s key represent the authentication method to be used and value is the base64 encoded credentials. Supported auth methods are: ssh-privatekey.
   * @return sourceSecret
  **/
  @ApiModelProperty(value = "sourceSecret is the name of a Secret that would be used for setting up the authentication for cloning private repository. The secret contains valid credentials for remote repository, where the data's key represent the authentication method to be used and value is the base64 encoded credentials. Supported auth methods are: ssh-privatekey.")
  public IoK8sApiCoreV1LocalObjectReference getSourceSecret() {
    return sourceSecret;
  }

  public void setSourceSecret(IoK8sApiCoreV1LocalObjectReference sourceSecret) {
    this.sourceSecret = sourceSecret;
  }

  public ComGithubOpenshiftApiBuildV1BuildSource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of build input to accept
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type of build input to accept")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BuildSource comGithubOpenshiftApiBuildV1BuildSource = (ComGithubOpenshiftApiBuildV1BuildSource) o;
    return Objects.equals(this.binary, comGithubOpenshiftApiBuildV1BuildSource.binary) &&
        Objects.equals(this.configMaps, comGithubOpenshiftApiBuildV1BuildSource.configMaps) &&
        Objects.equals(this.contextDir, comGithubOpenshiftApiBuildV1BuildSource.contextDir) &&
        Objects.equals(this.dockerfile, comGithubOpenshiftApiBuildV1BuildSource.dockerfile) &&
        Objects.equals(this.git, comGithubOpenshiftApiBuildV1BuildSource.git) &&
        Objects.equals(this.images, comGithubOpenshiftApiBuildV1BuildSource.images) &&
        Objects.equals(this.secrets, comGithubOpenshiftApiBuildV1BuildSource.secrets) &&
        Objects.equals(this.sourceSecret, comGithubOpenshiftApiBuildV1BuildSource.sourceSecret) &&
        Objects.equals(this.type, comGithubOpenshiftApiBuildV1BuildSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binary, configMaps, contextDir, dockerfile, git, images, secrets, sourceSecret, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BuildSource {\n");
    
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    configMaps: ").append(toIndentedString(configMaps)).append("\n");
    sb.append("    contextDir: ").append(toIndentedString(contextDir)).append("\n");
    sb.append("    dockerfile: ").append(toIndentedString(dockerfile)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    sourceSecret: ").append(toIndentedString(sourceSecret)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

