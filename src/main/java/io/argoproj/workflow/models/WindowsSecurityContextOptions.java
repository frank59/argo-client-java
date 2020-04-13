/*
 * Argo
 * Argo
 *
 * The version of the OpenAPI document: latest
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
 * WindowsSecurityContextOptions contain Windows-specific options and credentials.
 */
@ApiModel(description = "WindowsSecurityContextOptions contain Windows-specific options and credentials.")

public class WindowsSecurityContextOptions {
  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC = "gmsaCredentialSpec";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC)
  private String gmsaCredentialSpec;

  public static final String SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME = "gmsaCredentialSpecName";
  @SerializedName(SERIALIZED_NAME_GMSA_CREDENTIAL_SPEC_NAME)
  private String gmsaCredentialSpecName;

  public static final String SERIALIZED_NAME_RUN_AS_USER_NAME = "runAsUserName";
  @SerializedName(SERIALIZED_NAME_RUN_AS_USER_NAME)
  private String runAsUserName;


  public WindowsSecurityContextOptions gmsaCredentialSpec(String gmsaCredentialSpec) {
    
    this.gmsaCredentialSpec = gmsaCredentialSpec;
    return this;
  }

   /**
   * Get gmsaCredentialSpec
   * @return gmsaCredentialSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGmsaCredentialSpec() {
    return gmsaCredentialSpec;
  }


  public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
    this.gmsaCredentialSpec = gmsaCredentialSpec;
  }


  public WindowsSecurityContextOptions gmsaCredentialSpecName(String gmsaCredentialSpecName) {
    
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    return this;
  }

   /**
   * Get gmsaCredentialSpecName
   * @return gmsaCredentialSpecName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGmsaCredentialSpecName() {
    return gmsaCredentialSpecName;
  }


  public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
    this.gmsaCredentialSpecName = gmsaCredentialSpecName;
  }


  public WindowsSecurityContextOptions runAsUserName(String runAsUserName) {
    
    this.runAsUserName = runAsUserName;
    return this;
  }

   /**
   * Get runAsUserName
   * @return runAsUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunAsUserName() {
    return runAsUserName;
  }


  public void setRunAsUserName(String runAsUserName) {
    this.runAsUserName = runAsUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WindowsSecurityContextOptions windowsSecurityContextOptions = (WindowsSecurityContextOptions) o;
    return Objects.equals(this.gmsaCredentialSpec, windowsSecurityContextOptions.gmsaCredentialSpec) &&
        Objects.equals(this.gmsaCredentialSpecName, windowsSecurityContextOptions.gmsaCredentialSpecName) &&
        Objects.equals(this.runAsUserName, windowsSecurityContextOptions.runAsUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gmsaCredentialSpec, gmsaCredentialSpecName, runAsUserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WindowsSecurityContextOptions {\n");
    sb.append("    gmsaCredentialSpec: ").append(toIndentedString(gmsaCredentialSpec)).append("\n");
    sb.append("    gmsaCredentialSpecName: ").append(toIndentedString(gmsaCredentialSpecName)).append("\n");
    sb.append("    runAsUserName: ").append(toIndentedString(runAsUserName)).append("\n");
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

