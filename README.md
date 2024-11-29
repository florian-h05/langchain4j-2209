# langchain4j-2209

This repository contains code to reproduce [langchain4j/langchain4j#2209](https://github.com/langchain4j/langchain4j/issues/2209).

The issue is introduced when adding the langchain4j-document-parser-apache-tika dependency to the POM:

```xml
<dependency>
    <groupId>dev.langchain4j</groupId>
    <artifactId>langchain4j-document-parser-apache-tika</artifactId>
    <version>${langchain4j.version}</version>
</dependency>
```

## Introduction

This project uses Quarkus, the Supersonic Subatomic Java Framework.
It is build with Java 21 and Maven 3.9.0.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Reproducing the issue

The issue does not occur when running the application in dev mode:

```shell script
./mvnw compile quarkus:dev
```

When packaging the application and running it, the issue occurs:

```shell script
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

When packaging the application as an _über-jar_ and running it, the issue does not occur:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
java -jar target/*-runner.jar
```
