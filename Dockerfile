# Multi-stage Dockerfile for Spring Boot app
# Build stage: use Maven to build the fat jar
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /workspace/app
COPY pom.xml .
COPY src src
RUN --mount=type=cache,target=/root/.m2 mvn -B -e -DskipTests package

# Run stage: use a slim JRE image
FROM eclipse-temurin:17-jre-jammy
ARG JAR_FILE=target/*.jar
COPY --from=build /workspace/app/target/*.jar /app/app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/app/app.jar"]

