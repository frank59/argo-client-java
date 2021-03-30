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
 * IoArgoprojEventsV1alpha1LogTrigger
 */

public class IoArgoprojEventsV1alpha1LogTrigger {
  public static final String SERIALIZED_NAME_INTERVAL_SECONDS = "intervalSeconds";
  @SerializedName(SERIALIZED_NAME_INTERVAL_SECONDS)
  private String intervalSeconds;


  public IoArgoprojEventsV1alpha1LogTrigger intervalSeconds(String intervalSeconds) {
    
    this.intervalSeconds = intervalSeconds;
    return this;
  }

   /**
   * Get intervalSeconds
   * @return intervalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIntervalSeconds() {
    return intervalSeconds;
  }


  public void setIntervalSeconds(String intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1LogTrigger ioArgoprojEventsV1alpha1LogTrigger = (IoArgoprojEventsV1alpha1LogTrigger) o;
    return Objects.equals(this.intervalSeconds, ioArgoprojEventsV1alpha1LogTrigger.intervalSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intervalSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1LogTrigger {\n");
    sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
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

