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
import io.argoproj.workflow.models.ArtifactoryArtifact;
import io.argoproj.workflow.models.GCSArtifact;
import io.argoproj.workflow.models.GitArtifact;
import io.argoproj.workflow.models.HDFSArtifact;
import io.argoproj.workflow.models.HTTPArtifact;
import io.argoproj.workflow.models.OSSArtifact;
import io.argoproj.workflow.models.RawArtifact;
import io.argoproj.workflow.models.S3Artifact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.
 */
@ApiModel(description = "ArtifactLocation describes a location for a single or multiple artifacts. It is used as single artifact in the context of inputs/outputs (e.g. outputs.artifacts.artname). It is also used to describe the location of multiple artifacts such as the archive location of a single workflow step, which the executor will use as a default location to store its files.")

public class ArtifactLocation {
  public static final String SERIALIZED_NAME_ARCHIVE_LOGS = "archiveLogs";
  @SerializedName(SERIALIZED_NAME_ARCHIVE_LOGS)
  private Boolean archiveLogs;

  public static final String SERIALIZED_NAME_ARTIFACTORY = "artifactory";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY)
  private ArtifactoryArtifact artifactory;

  public static final String SERIALIZED_NAME_GCS = "gcs";
  @SerializedName(SERIALIZED_NAME_GCS)
  private GCSArtifact gcs;

  public static final String SERIALIZED_NAME_GIT = "git";
  @SerializedName(SERIALIZED_NAME_GIT)
  private GitArtifact git;

  public static final String SERIALIZED_NAME_HDFS = "hdfs";
  @SerializedName(SERIALIZED_NAME_HDFS)
  private HDFSArtifact hdfs;

  public static final String SERIALIZED_NAME_HTTP = "http";
  @SerializedName(SERIALIZED_NAME_HTTP)
  private HTTPArtifact http;

  public static final String SERIALIZED_NAME_OSS = "oss";
  @SerializedName(SERIALIZED_NAME_OSS)
  private OSSArtifact oss;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private RawArtifact raw;

  public static final String SERIALIZED_NAME_S3 = "s3";
  @SerializedName(SERIALIZED_NAME_S3)
  private S3Artifact s3;


  public ArtifactLocation archiveLogs(Boolean archiveLogs) {
    
    this.archiveLogs = archiveLogs;
    return this;
  }

   /**
   * ArchiveLogs indicates if the container logs should be archived
   * @return archiveLogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArchiveLogs indicates if the container logs should be archived")

  public Boolean getArchiveLogs() {
    return archiveLogs;
  }


  public void setArchiveLogs(Boolean archiveLogs) {
    this.archiveLogs = archiveLogs;
  }


  public ArtifactLocation artifactory(ArtifactoryArtifact artifactory) {
    
    this.artifactory = artifactory;
    return this;
  }

   /**
   * Get artifactory
   * @return artifactory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryArtifact getArtifactory() {
    return artifactory;
  }


  public void setArtifactory(ArtifactoryArtifact artifactory) {
    this.artifactory = artifactory;
  }


  public ArtifactLocation gcs(GCSArtifact gcs) {
    
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCSArtifact getGcs() {
    return gcs;
  }


  public void setGcs(GCSArtifact gcs) {
    this.gcs = gcs;
  }


  public ArtifactLocation git(GitArtifact git) {
    
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GitArtifact getGit() {
    return git;
  }


  public void setGit(GitArtifact git) {
    this.git = git;
  }


  public ArtifactLocation hdfs(HDFSArtifact hdfs) {
    
    this.hdfs = hdfs;
    return this;
  }

   /**
   * Get hdfs
   * @return hdfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HDFSArtifact getHdfs() {
    return hdfs;
  }


  public void setHdfs(HDFSArtifact hdfs) {
    this.hdfs = hdfs;
  }


  public ArtifactLocation http(HTTPArtifact http) {
    
    this.http = http;
    return this;
  }

   /**
   * Get http
   * @return http
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HTTPArtifact getHttp() {
    return http;
  }


  public void setHttp(HTTPArtifact http) {
    this.http = http;
  }


  public ArtifactLocation oss(OSSArtifact oss) {
    
    this.oss = oss;
    return this;
  }

   /**
   * Get oss
   * @return oss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OSSArtifact getOss() {
    return oss;
  }


  public void setOss(OSSArtifact oss) {
    this.oss = oss;
  }


  public ArtifactLocation raw(RawArtifact raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RawArtifact getRaw() {
    return raw;
  }


  public void setRaw(RawArtifact raw) {
    this.raw = raw;
  }


  public ArtifactLocation s3(S3Artifact s3) {
    
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public S3Artifact getS3() {
    return s3;
  }


  public void setS3(S3Artifact s3) {
    this.s3 = s3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactLocation artifactLocation = (ArtifactLocation) o;
    return Objects.equals(this.archiveLogs, artifactLocation.archiveLogs) &&
        Objects.equals(this.artifactory, artifactLocation.artifactory) &&
        Objects.equals(this.gcs, artifactLocation.gcs) &&
        Objects.equals(this.git, artifactLocation.git) &&
        Objects.equals(this.hdfs, artifactLocation.hdfs) &&
        Objects.equals(this.http, artifactLocation.http) &&
        Objects.equals(this.oss, artifactLocation.oss) &&
        Objects.equals(this.raw, artifactLocation.raw) &&
        Objects.equals(this.s3, artifactLocation.s3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveLogs, artifactory, gcs, git, hdfs, http, oss, raw, s3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactLocation {\n");
    sb.append("    archiveLogs: ").append(toIndentedString(archiveLogs)).append("\n");
    sb.append("    artifactory: ").append(toIndentedString(artifactory)).append("\n");
    sb.append("    gcs: ").append(toIndentedString(gcs)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    hdfs: ").append(toIndentedString(hdfs)).append("\n");
    sb.append("    http: ").append(toIndentedString(http)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
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

