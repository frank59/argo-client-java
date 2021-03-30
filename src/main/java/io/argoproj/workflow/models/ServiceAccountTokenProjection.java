/*
 * Argo Server API
 * You can get examples of requests and responses by using the CLI with `--gloglevel=9`, e.g. `argo list --gloglevel=9`
 *
 * The version of the OpenAPI document: v3.0.0
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
 * ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).
 */
@ApiModel(description = "ServiceAccountTokenProjection represents a projected service account token volume. This projection can be used to insert a service account token into the pods runtime filesystem for use against APIs (Kubernetes API Server or otherwise).")

public class ServiceAccountTokenProjection {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private String audience;

  public static final String SERIALIZED_NAME_EXPIRATION_SECONDS = "expirationSeconds";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_SECONDS)
  private Integer expirationSeconds;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public ServiceAccountTokenProjection audience(String audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.
   * @return audience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Audience is the intended audience of the token. A recipient of a token must identify itself with an identifier specified in the audience of the token, and otherwise should reject the token. The audience defaults to the identifier of the apiserver.")

  public String getAudience() {
    return audience;
  }


  public void setAudience(String audience) {
    this.audience = audience;
  }


  public ServiceAccountTokenProjection expirationSeconds(Integer expirationSeconds) {
    
    this.expirationSeconds = expirationSeconds;
    return this;
  }

   /**
   * ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.
   * @return expirationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExpirationSeconds is the requested duration of validity of the service account token. As the token approaches expiration, the kubelet volume plugin will proactively rotate the service account token. The kubelet will start trying to rotate the token if the token is older than 80 percent of its time to live or if the token is older than 24 hours.Defaults to 1 hour and must be at least 10 minutes.")

  public Integer getExpirationSeconds() {
    return expirationSeconds;
  }


  public void setExpirationSeconds(Integer expirationSeconds) {
    this.expirationSeconds = expirationSeconds;
  }


  public ServiceAccountTokenProjection path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the path relative to the mount point of the file to project the token into.
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is the path relative to the mount point of the file to project the token into.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAccountTokenProjection serviceAccountTokenProjection = (ServiceAccountTokenProjection) o;
    return Objects.equals(this.audience, serviceAccountTokenProjection.audience) &&
        Objects.equals(this.expirationSeconds, serviceAccountTokenProjection.expirationSeconds) &&
        Objects.equals(this.path, serviceAccountTokenProjection.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, expirationSeconds, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAccountTokenProjection {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    expirationSeconds: ").append(toIndentedString(expirationSeconds)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

