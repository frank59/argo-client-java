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
import io.argoproj.workflow.models.ValueFrom;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Parameter indicate a passed string parameter to a service template with an optional default value
 */
@ApiModel(description = "Parameter indicate a passed string parameter to a service template with an optional default value")

public class Parameter {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private String _default;

  public static final String SERIALIZED_NAME_GLOBAL_NAME = "globalName";
  @SerializedName(SERIALIZED_NAME_GLOBAL_NAME)
  private String globalName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_FROM = "valueFrom";
  @SerializedName(SERIALIZED_NAME_VALUE_FROM)
  private ValueFrom valueFrom;


  public Parameter _default(String _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Default is the default value to use for an input parameter if a value was not supplied
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default is the default value to use for an input parameter if a value was not supplied")

  public String getDefault() {
    return _default;
  }


  public void setDefault(String _default) {
    this._default = _default;
  }


  public Parameter globalName(String globalName) {
    
    this.globalName = globalName;
    return this;
  }

   /**
   * GlobalName exports an output parameter to the global scope, making it available as &#39;{{outputs.parameters.XXXX}} and in workflow.status.outputs.parameters
   * @return globalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GlobalName exports an output parameter to the global scope, making it available as '{{outputs.parameters.XXXX}} and in workflow.status.outputs.parameters")

  public String getGlobalName() {
    return globalName;
  }


  public void setGlobalName(String globalName) {
    this.globalName = globalName;
  }


  public Parameter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name is the parameter name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name is the parameter name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Parameter value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value is the literal value to use for the parameter. If specified in the context of an input parameter, the value takes precedence over any passed values")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public Parameter valueFrom(ValueFrom valueFrom) {
    
    this.valueFrom = valueFrom;
    return this;
  }

   /**
   * Get valueFrom
   * @return valueFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValueFrom getValueFrom() {
    return valueFrom;
  }


  public void setValueFrom(ValueFrom valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parameter parameter = (Parameter) o;
    return Objects.equals(this._default, parameter._default) &&
        Objects.equals(this.globalName, parameter.globalName) &&
        Objects.equals(this.name, parameter.name) &&
        Objects.equals(this.value, parameter.value) &&
        Objects.equals(this.valueFrom, parameter.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, globalName, name, value, valueFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parameter {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    globalName: ").append(toIndentedString(globalName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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

