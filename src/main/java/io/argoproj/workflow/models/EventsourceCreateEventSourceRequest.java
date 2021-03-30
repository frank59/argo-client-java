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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1EventSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EventsourceCreateEventSourceRequest
 */

public class EventsourceCreateEventSourceRequest {
  public static final String SERIALIZED_NAME_EVENT_SOURCE = "eventSource";
  @SerializedName(SERIALIZED_NAME_EVENT_SOURCE)
  private IoArgoprojEventsV1alpha1EventSource eventSource;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public EventsourceCreateEventSourceRequest eventSource(IoArgoprojEventsV1alpha1EventSource eventSource) {
    
    this.eventSource = eventSource;
    return this;
  }

   /**
   * Get eventSource
   * @return eventSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoArgoprojEventsV1alpha1EventSource getEventSource() {
    return eventSource;
  }


  public void setEventSource(IoArgoprojEventsV1alpha1EventSource eventSource) {
    this.eventSource = eventSource;
  }


  public EventsourceCreateEventSourceRequest namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsourceCreateEventSourceRequest eventsourceCreateEventSourceRequest = (EventsourceCreateEventSourceRequest) o;
    return Objects.equals(this.eventSource, eventsourceCreateEventSourceRequest.eventSource) &&
        Objects.equals(this.namespace, eventsourceCreateEventSourceRequest.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventSource, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsourceCreateEventSourceRequest {\n");
    sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

