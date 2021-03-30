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
import io.argoproj.workflow.models.IoArgoprojEventsV1alpha1TriggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SlackTrigger refers to the specification of the slack notification trigger.
 */
@ApiModel(description = "SlackTrigger refers to the specification of the slack notification trigger.")

public class IoArgoprojEventsV1alpha1SlackTrigger {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private String channel;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<IoArgoprojEventsV1alpha1TriggerParameter> parameters = null;

  public static final String SERIALIZED_NAME_SLACK_TOKEN = "slackToken";
  @SerializedName(SERIALIZED_NAME_SLACK_TOKEN)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector slackToken;


  public IoArgoprojEventsV1alpha1SlackTrigger channel(String channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannel() {
    return channel;
  }


  public void setChannel(String channel) {
    this.channel = channel;
  }


  public IoArgoprojEventsV1alpha1SlackTrigger message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public IoArgoprojEventsV1alpha1SlackTrigger parameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public IoArgoprojEventsV1alpha1SlackTrigger addParametersItem(IoArgoprojEventsV1alpha1TriggerParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<IoArgoprojEventsV1alpha1TriggerParameter>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoArgoprojEventsV1alpha1TriggerParameter> getParameters() {
    return parameters;
  }


  public void setParameters(List<IoArgoprojEventsV1alpha1TriggerParameter> parameters) {
    this.parameters = parameters;
  }


  public IoArgoprojEventsV1alpha1SlackTrigger slackToken(io.kubernetes.client.openapi.models.V1SecretKeySelector slackToken) {
    
    this.slackToken = slackToken;
    return this;
  }

   /**
   * Get slackToken
   * @return slackToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getSlackToken() {
    return slackToken;
  }


  public void setSlackToken(io.kubernetes.client.openapi.models.V1SecretKeySelector slackToken) {
    this.slackToken = slackToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoArgoprojEventsV1alpha1SlackTrigger ioArgoprojEventsV1alpha1SlackTrigger = (IoArgoprojEventsV1alpha1SlackTrigger) o;
    return Objects.equals(this.channel, ioArgoprojEventsV1alpha1SlackTrigger.channel) &&
        Objects.equals(this.message, ioArgoprojEventsV1alpha1SlackTrigger.message) &&
        Objects.equals(this.parameters, ioArgoprojEventsV1alpha1SlackTrigger.parameters) &&
        Objects.equals(this.slackToken, ioArgoprojEventsV1alpha1SlackTrigger.slackToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, message, parameters, slackToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoArgoprojEventsV1alpha1SlackTrigger {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    slackToken: ").append(toIndentedString(slackToken)).append("\n");
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

