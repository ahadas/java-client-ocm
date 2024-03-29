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

/**
 * A BuildPostCommitSpec holds a build post commit hook specification. The hook executes a command in a temporary container running the build output image, immediately after the last layer of the image is committed and before the image is pushed to a registry. The command is executed with the current working directory ($PWD) set to the image&#39;s WORKDIR.  The build will be marked as failed if the hook execution fails. It will fail if the script or command return a non-zero exit code, or if there is any other error related to starting the temporary container.  There are five different ways to configure the hook. As an example, all forms below are equivalent and will execute &#x60;rake test --verbose&#x60;.  1. Shell script:         \&quot;postCommit\&quot;: {          \&quot;script\&quot;: \&quot;rake test --verbose\&quot;,        }      The above is a convenient form which is equivalent to:         \&quot;postCommit\&quot;: {          \&quot;command\&quot;: [\&quot;/bin/sh\&quot;, \&quot;-ic\&quot;],          \&quot;args\&quot;:    [\&quot;rake test --verbose\&quot;]        }  2. A command as the image entrypoint:         \&quot;postCommit\&quot;: {          \&quot;commit\&quot;: [\&quot;rake\&quot;, \&quot;test\&quot;, \&quot;--verbose\&quot;]        }      Command overrides the image entrypoint in the exec form, as documented in     Docker: https://docs.docker.com/engine/reference/builder/#entrypoint.  3. Pass arguments to the default entrypoint:         \&quot;postCommit\&quot;: {         \&quot;args\&quot;: [\&quot;rake\&quot;, \&quot;test\&quot;, \&quot;--verbose\&quot;]        }      This form is only useful if the image entrypoint can handle arguments.  4. Shell script with arguments:         \&quot;postCommit\&quot;: {          \&quot;script\&quot;: \&quot;rake test $1\&quot;,          \&quot;args\&quot;:   [\&quot;--verbose\&quot;]        }      This form is useful if you need to pass arguments that would otherwise be     hard to quote properly in the shell script. In the script, $0 will be     \&quot;/bin/sh\&quot; and $1, $2, etc, are the positional arguments from Args.  5. Command with arguments:         \&quot;postCommit\&quot;: {          \&quot;command\&quot;: [\&quot;rake\&quot;, \&quot;test\&quot;],          \&quot;args\&quot;:    [\&quot;--verbose\&quot;]        }      This form is equivalent to appending the arguments to the Command slice.  It is invalid to provide both Script and Command simultaneously. If none of the fields are specified, the hook is not executed.
 */
@ApiModel(description = "A BuildPostCommitSpec holds a build post commit hook specification. The hook executes a command in a temporary container running the build output image, immediately after the last layer of the image is committed and before the image is pushed to a registry. The command is executed with the current working directory ($PWD) set to the image's WORKDIR.  The build will be marked as failed if the hook execution fails. It will fail if the script or command return a non-zero exit code, or if there is any other error related to starting the temporary container.  There are five different ways to configure the hook. As an example, all forms below are equivalent and will execute `rake test --verbose`.  1. Shell script:         \"postCommit\": {          \"script\": \"rake test --verbose\",        }      The above is a convenient form which is equivalent to:         \"postCommit\": {          \"command\": [\"/bin/sh\", \"-ic\"],          \"args\":    [\"rake test --verbose\"]        }  2. A command as the image entrypoint:         \"postCommit\": {          \"commit\": [\"rake\", \"test\", \"--verbose\"]        }      Command overrides the image entrypoint in the exec form, as documented in     Docker: https://docs.docker.com/engine/reference/builder/#entrypoint.  3. Pass arguments to the default entrypoint:         \"postCommit\": {         \"args\": [\"rake\", \"test\", \"--verbose\"]        }      This form is only useful if the image entrypoint can handle arguments.  4. Shell script with arguments:         \"postCommit\": {          \"script\": \"rake test $1\",          \"args\":   [\"--verbose\"]        }      This form is useful if you need to pass arguments that would otherwise be     hard to quote properly in the shell script. In the script, $0 will be     \"/bin/sh\" and $1, $2, etc, are the positional arguments from Args.  5. Command with arguments:         \"postCommit\": {          \"command\": [\"rake\", \"test\"],          \"args\":    [\"--verbose\"]        }      This form is equivalent to appending the arguments to the Command slice.  It is invalid to provide both Script and Command simultaneously. If none of the fields are specified, the hook is not executed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-18T17:27:50.678+03:00")
public class ComGithubOpenshiftApiBuildV1BuildPostCommitSpec {
  @SerializedName("args")
  private List<String> args = null;

  @SerializedName("command")
  private List<String> command = null;

  @SerializedName("script")
  private String script = null;

  public ComGithubOpenshiftApiBuildV1BuildPostCommitSpec args(List<String> args) {
    this.args = args;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildPostCommitSpec addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * args is a list of arguments that are provided to either Command, Script or the container image&#39;s default entrypoint. The arguments are placed immediately after the command to be run.
   * @return args
  **/
  @ApiModelProperty(value = "args is a list of arguments that are provided to either Command, Script or the container image's default entrypoint. The arguments are placed immediately after the command to be run.")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public ComGithubOpenshiftApiBuildV1BuildPostCommitSpec command(List<String> command) {
    this.command = command;
    return this;
  }

  public ComGithubOpenshiftApiBuildV1BuildPostCommitSpec addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * command is the command to run. It may not be specified with Script. This might be needed if the image doesn&#39;t have &#x60;/bin/sh&#x60;, or if you do not want to use a shell. In all other cases, using Script might be more convenient.
   * @return command
  **/
  @ApiModelProperty(value = "command is the command to run. It may not be specified with Script. This might be needed if the image doesn't have `/bin/sh`, or if you do not want to use a shell. In all other cases, using Script might be more convenient.")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public ComGithubOpenshiftApiBuildV1BuildPostCommitSpec script(String script) {
    this.script = script;
    return this;
  }

   /**
   * script is a shell script to be run with &#x60;/bin/sh -ic&#x60;. It may not be specified with Command. Use Script when a shell script is appropriate to execute the post build hook, for example for running unit tests with &#x60;rake test&#x60;. If you need control over the image entrypoint, or if the image does not have &#x60;/bin/sh&#x60;, use Command and/or Args. The &#x60;-i&#x60; flag is needed to support CentOS and RHEL images that use Software Collections (SCL), in order to have the appropriate collections enabled in the shell. E.g., in the Ruby image, this is necessary to make &#x60;ruby&#x60;, &#x60;bundle&#x60; and other binaries available in the PATH.
   * @return script
  **/
  @ApiModelProperty(value = "script is a shell script to be run with `/bin/sh -ic`. It may not be specified with Command. Use Script when a shell script is appropriate to execute the post build hook, for example for running unit tests with `rake test`. If you need control over the image entrypoint, or if the image does not have `/bin/sh`, use Command and/or Args. The `-i` flag is needed to support CentOS and RHEL images that use Software Collections (SCL), in order to have the appropriate collections enabled in the shell. E.g., in the Ruby image, this is necessary to make `ruby`, `bundle` and other binaries available in the PATH.")
  public String getScript() {
    return script;
  }

  public void setScript(String script) {
    this.script = script;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubOpenshiftApiBuildV1BuildPostCommitSpec comGithubOpenshiftApiBuildV1BuildPostCommitSpec = (ComGithubOpenshiftApiBuildV1BuildPostCommitSpec) o;
    return Objects.equals(this.args, comGithubOpenshiftApiBuildV1BuildPostCommitSpec.args) &&
        Objects.equals(this.command, comGithubOpenshiftApiBuildV1BuildPostCommitSpec.command) &&
        Objects.equals(this.script, comGithubOpenshiftApiBuildV1BuildPostCommitSpec.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, script);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubOpenshiftApiBuildV1BuildPostCommitSpec {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

