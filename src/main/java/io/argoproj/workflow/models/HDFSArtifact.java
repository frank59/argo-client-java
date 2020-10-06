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
import java.util.ArrayList;
import java.util.List;

/**
 * HDFSArtifact is the location of an HDFS artifact
 */
@ApiModel(description = "HDFSArtifact is the location of an HDFS artifact")

public class HDFSArtifact {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_FORCE = "force";
  @SerializedName(SERIALIZED_NAME_FORCE)
  private Boolean force;

  public static final String SERIALIZED_NAME_HDFS_USER = "hdfsUser";
  @SerializedName(SERIALIZED_NAME_HDFS_USER)
  private String hdfsUser;

  public static final String SERIALIZED_NAME_KRB_C_CACHE_SECRET = "krbCCacheSecret";
  @SerializedName(SERIALIZED_NAME_KRB_C_CACHE_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret;

  public static final String SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP = "krbConfigConfigMap";
  @SerializedName(SERIALIZED_NAME_KRB_CONFIG_CONFIG_MAP)
  private io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap;

  public static final String SERIALIZED_NAME_KRB_KEYTAB_SECRET = "krbKeytabSecret";
  @SerializedName(SERIALIZED_NAME_KRB_KEYTAB_SECRET)
  private io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret;

  public static final String SERIALIZED_NAME_KRB_REALM = "krbRealm";
  @SerializedName(SERIALIZED_NAME_KRB_REALM)
  private String krbRealm;

  public static final String SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME = "krbServicePrincipalName";
  @SerializedName(SERIALIZED_NAME_KRB_SERVICE_PRINCIPAL_NAME)
  private String krbServicePrincipalName;

  public static final String SERIALIZED_NAME_KRB_USERNAME = "krbUsername";
  @SerializedName(SERIALIZED_NAME_KRB_USERNAME)
  private String krbUsername;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public HDFSArtifact addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public HDFSArtifact addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Addresses is accessible addresses of HDFS name nodes
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "Addresses is accessible addresses of HDFS name nodes")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public HDFSArtifact force(Boolean force) {
    
    this.force = force;
    return this;
  }

   /**
   * Force copies a file forcibly even if it exists (default: false)
   * @return force
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Force copies a file forcibly even if it exists (default: false)")

  public Boolean getForce() {
    return force;
  }


  public void setForce(Boolean force) {
    this.force = force;
  }


  public HDFSArtifact hdfsUser(String hdfsUser) {
    
    this.hdfsUser = hdfsUser;
    return this;
  }

   /**
   * HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.
   * @return hdfsUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HDFSUser is the user to access HDFS file system. It is ignored if either ccache or keytab is used.")

  public String getHdfsUser() {
    return hdfsUser;
  }


  public void setHdfsUser(String hdfsUser) {
    this.hdfsUser = hdfsUser;
  }


  public HDFSArtifact krbCCacheSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret) {
    
    this.krbCCacheSecret = krbCCacheSecret;
    return this;
  }

   /**
   * Get krbCCacheSecret
   * @return krbCCacheSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getKrbCCacheSecret() {
    return krbCCacheSecret;
  }


  public void setKrbCCacheSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbCCacheSecret) {
    this.krbCCacheSecret = krbCCacheSecret;
  }


  public HDFSArtifact krbConfigConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap) {
    
    this.krbConfigConfigMap = krbConfigConfigMap;
    return this;
  }

   /**
   * Get krbConfigConfigMap
   * @return krbConfigConfigMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1ConfigMapKeySelector getKrbConfigConfigMap() {
    return krbConfigConfigMap;
  }


  public void setKrbConfigConfigMap(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector krbConfigConfigMap) {
    this.krbConfigConfigMap = krbConfigConfigMap;
  }


  public HDFSArtifact krbKeytabSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret) {
    
    this.krbKeytabSecret = krbKeytabSecret;
    return this;
  }

   /**
   * Get krbKeytabSecret
   * @return krbKeytabSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.openapi.models.V1SecretKeySelector getKrbKeytabSecret() {
    return krbKeytabSecret;
  }


  public void setKrbKeytabSecret(io.kubernetes.client.openapi.models.V1SecretKeySelector krbKeytabSecret) {
    this.krbKeytabSecret = krbKeytabSecret;
  }


  public HDFSArtifact krbRealm(String krbRealm) {
    
    this.krbRealm = krbRealm;
    return this;
  }

   /**
   * KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.
   * @return krbRealm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbRealm is the Kerberos realm used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbRealm() {
    return krbRealm;
  }


  public void setKrbRealm(String krbRealm) {
    this.krbRealm = krbRealm;
  }


  public HDFSArtifact krbServicePrincipalName(String krbServicePrincipalName) {
    
    this.krbServicePrincipalName = krbServicePrincipalName;
    return this;
  }

   /**
   * KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.
   * @return krbServicePrincipalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbServicePrincipalName is the principal name of Kerberos service It must be set if either ccache or keytab is used.")

  public String getKrbServicePrincipalName() {
    return krbServicePrincipalName;
  }


  public void setKrbServicePrincipalName(String krbServicePrincipalName) {
    this.krbServicePrincipalName = krbServicePrincipalName;
  }


  public HDFSArtifact krbUsername(String krbUsername) {
    
    this.krbUsername = krbUsername;
    return this;
  }

   /**
   * KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.
   * @return krbUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "KrbUsername is the Kerberos username used with Kerberos keytab It must be set if keytab is used.")

  public String getKrbUsername() {
    return krbUsername;
  }


  public void setKrbUsername(String krbUsername) {
    this.krbUsername = krbUsername;
  }


  public HDFSArtifact path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is a file path in HDFS
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path is a file path in HDFS")

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
    HDFSArtifact hdFSArtifact = (HDFSArtifact) o;
    return Objects.equals(this.addresses, hdFSArtifact.addresses) &&
        Objects.equals(this.force, hdFSArtifact.force) &&
        Objects.equals(this.hdfsUser, hdFSArtifact.hdfsUser) &&
        Objects.equals(this.krbCCacheSecret, hdFSArtifact.krbCCacheSecret) &&
        Objects.equals(this.krbConfigConfigMap, hdFSArtifact.krbConfigConfigMap) &&
        Objects.equals(this.krbKeytabSecret, hdFSArtifact.krbKeytabSecret) &&
        Objects.equals(this.krbRealm, hdFSArtifact.krbRealm) &&
        Objects.equals(this.krbServicePrincipalName, hdFSArtifact.krbServicePrincipalName) &&
        Objects.equals(this.krbUsername, hdFSArtifact.krbUsername) &&
        Objects.equals(this.path, hdFSArtifact.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, force, hdfsUser, krbCCacheSecret, krbConfigConfigMap, krbKeytabSecret, krbRealm, krbServicePrincipalName, krbUsername, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HDFSArtifact {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
    sb.append("    hdfsUser: ").append(toIndentedString(hdfsUser)).append("\n");
    sb.append("    krbCCacheSecret: ").append(toIndentedString(krbCCacheSecret)).append("\n");
    sb.append("    krbConfigConfigMap: ").append(toIndentedString(krbConfigConfigMap)).append("\n");
    sb.append("    krbKeytabSecret: ").append(toIndentedString(krbKeytabSecret)).append("\n");
    sb.append("    krbRealm: ").append(toIndentedString(krbRealm)).append("\n");
    sb.append("    krbServicePrincipalName: ").append(toIndentedString(krbServicePrincipalName)).append("\n");
    sb.append("    krbUsername: ").append(toIndentedString(krbUsername)).append("\n");
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

