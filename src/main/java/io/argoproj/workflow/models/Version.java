/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v2.11.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

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
 * Version
 */

public class Version {
  public static final String SERIALIZED_NAME_BUILD_DATE = "buildDate";
  @SerializedName(SERIALIZED_NAME_BUILD_DATE)
  private String buildDate;

  public static final String SERIALIZED_NAME_COMPILER = "compiler";
  @SerializedName(SERIALIZED_NAME_COMPILER)
  private String compiler;

  public static final String SERIALIZED_NAME_GIT_COMMIT = "gitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT)
  private String gitCommit;

  public static final String SERIALIZED_NAME_GIT_TAG = "gitTag";
  @SerializedName(SERIALIZED_NAME_GIT_TAG)
  private String gitTag;

  public static final String SERIALIZED_NAME_GIT_TREE_STATE = "gitTreeState";
  @SerializedName(SERIALIZED_NAME_GIT_TREE_STATE)
  private String gitTreeState;

  public static final String SERIALIZED_NAME_GO_VERSION = "goVersion";
  @SerializedName(SERIALIZED_NAME_GO_VERSION)
  private String goVersion;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public Version buildDate(String buildDate) {
    
    this.buildDate = buildDate;
    return this;
  }

   /**
   * Get buildDate
   * @return buildDate
  **/
  @ApiModelProperty(required = true, value = "")

  public String getBuildDate() {
    return buildDate;
  }


  public void setBuildDate(String buildDate) {
    this.buildDate = buildDate;
  }


  public Version compiler(String compiler) {
    
    this.compiler = compiler;
    return this;
  }

   /**
   * Get compiler
   * @return compiler
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCompiler() {
    return compiler;
  }


  public void setCompiler(String compiler) {
    this.compiler = compiler;
  }


  public Version gitCommit(String gitCommit) {
    
    this.gitCommit = gitCommit;
    return this;
  }

   /**
   * Get gitCommit
   * @return gitCommit
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGitCommit() {
    return gitCommit;
  }


  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }


  public Version gitTag(String gitTag) {
    
    this.gitTag = gitTag;
    return this;
  }

   /**
   * Get gitTag
   * @return gitTag
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGitTag() {
    return gitTag;
  }


  public void setGitTag(String gitTag) {
    this.gitTag = gitTag;
  }


  public Version gitTreeState(String gitTreeState) {
    
    this.gitTreeState = gitTreeState;
    return this;
  }

   /**
   * Get gitTreeState
   * @return gitTreeState
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGitTreeState() {
    return gitTreeState;
  }


  public void setGitTreeState(String gitTreeState) {
    this.gitTreeState = gitTreeState;
  }


  public Version goVersion(String goVersion) {
    
    this.goVersion = goVersion;
    return this;
  }

   /**
   * Get goVersion
   * @return goVersion
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGoVersion() {
    return goVersion;
  }


  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }


  public Version platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public Version version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.buildDate, version.buildDate) &&
        Objects.equals(this.compiler, version.compiler) &&
        Objects.equals(this.gitCommit, version.gitCommit) &&
        Objects.equals(this.gitTag, version.gitTag) &&
        Objects.equals(this.gitTreeState, version.gitTreeState) &&
        Objects.equals(this.goVersion, version.goVersion) &&
        Objects.equals(this.platform, version.platform) &&
        Objects.equals(this.version, version.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildDate, compiler, gitCommit, gitTag, gitTreeState, goVersion, platform, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    compiler: ").append(toIndentedString(compiler)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    gitTag: ").append(toIndentedString(gitTag)).append("\n");
    sb.append("    gitTreeState: ").append(toIndentedString(gitTreeState)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

