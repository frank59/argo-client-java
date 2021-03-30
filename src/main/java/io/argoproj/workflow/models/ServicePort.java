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
 * ServicePort contains information on service&#39;s port.
 */
@ApiModel(description = "ServicePort contains information on service's port.")

public class ServicePort {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NODE_PORT = "nodePort";
  @SerializedName(SERIALIZED_NAME_NODE_PORT)
  private Integer nodePort;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private String protocol;

  public static final String SERIALIZED_NAME_TARGET_PORT = "targetPort";
  @SerializedName(SERIALIZED_NAME_TARGET_PORT)
  private String targetPort;


  public ServicePort name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the &#39;name&#39; field in the EndpointPort. Optional if only one ServicePort is defined on this service.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. When considering the endpoints for a Service, this must match the 'name' field in the EndpointPort. Optional if only one ServicePort is defined on this service.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServicePort nodePort(Integer nodePort) {
    
    this.nodePort = nodePort;
    return this;
  }

   /**
   * The port on each node on which this service is exposed when type&#x3D;NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   * @return nodePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport")

  public Integer getNodePort() {
    return nodePort;
  }


  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }


  public ServicePort port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port that will be exposed by this service.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "The port that will be exposed by this service.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public ServicePort protocol(String protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * The IP protocol for this port. Supports \&quot;TCP\&quot;, \&quot;UDP\&quot;, and \&quot;SCTP\&quot;. Default is TCP.
   * @return protocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IP protocol for this port. Supports \"TCP\", \"UDP\", and \"SCTP\". Default is TCP.")

  public String getProtocol() {
    return protocol;
  }


  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  public ServicePort targetPort(String targetPort) {
    
    this.targetPort = targetPort;
    return this;
  }

   /**
   * Get targetPort
   * @return targetPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetPort() {
    return targetPort;
  }


  public void setTargetPort(String targetPort) {
    this.targetPort = targetPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePort servicePort = (ServicePort) o;
    return Objects.equals(this.name, servicePort.name) &&
        Objects.equals(this.nodePort, servicePort.nodePort) &&
        Objects.equals(this.port, servicePort.port) &&
        Objects.equals(this.protocol, servicePort.protocol) &&
        Objects.equals(this.targetPort, servicePort.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodePort, port, protocol, targetPort);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePort {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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

