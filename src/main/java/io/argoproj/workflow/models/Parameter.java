/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: v2.6.3
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
 * Parameter
 */

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
   * Get _default
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get globalName
   * @return globalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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

