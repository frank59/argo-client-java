# argo-client-java

Argo
- API version: v2.4.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.argoproj.workflow</groupId>
  <artifactId>argo-client-java</artifactId>
  <version>1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.argoproj.workflow:argo-client-java:1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/argo-client-java-1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------


## Documentation for Models

 - [ArchiveStrategy](docs/ArchiveStrategy.md)
 - [Arguments](docs/Arguments.md)
 - [Artifact](docs/Artifact.md)
 - [ArtifactLocation](docs/ArtifactLocation.md)
 - [ArtifactRepositoryRef](docs/ArtifactRepositoryRef.md)
 - [ArtifactoryArtifact](docs/ArtifactoryArtifact.md)
 - [ArtifactoryAuth](docs/ArtifactoryAuth.md)
 - [Backoff](docs/Backoff.md)
 - [ContinueOn](docs/ContinueOn.md)
 - [DAGTask](docs/DAGTask.md)
 - [DAGTemplate](docs/DAGTemplate.md)
 - [ExecutorConfig](docs/ExecutorConfig.md)
 - [GitArtifact](docs/GitArtifact.md)
 - [HDFSArtifact](docs/HDFSArtifact.md)
 - [HDFSConfig](docs/HDFSConfig.md)
 - [HDFSKrbConfig](docs/HDFSKrbConfig.md)
 - [HTTPArtifact](docs/HTTPArtifact.md)
 - [Inputs](docs/Inputs.md)
 - [ItemValue](docs/ItemValue.md)
 - [Metadata](docs/Metadata.md)
 - [NodeStatus](docs/NodeStatus.md)
 - [Outputs](docs/Outputs.md)
 - [ParallelSteps](docs/ParallelSteps.md)
 - [Parameter](docs/Parameter.md)
 - [PodGC](docs/PodGC.md)
 - [RawArtifact](docs/RawArtifact.md)
 - [ResourceTemplate](docs/ResourceTemplate.md)
 - [RetryStrategy](docs/RetryStrategy.md)
 - [S3Artifact](docs/S3Artifact.md)
 - [S3Bucket](docs/S3Bucket.md)
 - [ScriptTemplate](docs/ScriptTemplate.md)
 - [Sequence](docs/Sequence.md)
 - [SuspendTemplate](docs/SuspendTemplate.md)
 - [Template](docs/Template.md)
 - [TemplateRef](docs/TemplateRef.md)
 - [UserContainer](docs/UserContainer.md)
 - [ValueFrom](docs/ValueFrom.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowList](docs/WorkflowList.md)
 - [WorkflowSpec](docs/WorkflowSpec.md)
 - [WorkflowStatus](docs/WorkflowStatus.md)
 - [WorkflowStep](docs/WorkflowStep.md)
 - [WorkflowTemplate](docs/WorkflowTemplate.md)
 - [WorkflowTemplateList](docs/WorkflowTemplateList.md)
 - [WorkflowTemplateSpec](docs/WorkflowTemplateSpec.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


