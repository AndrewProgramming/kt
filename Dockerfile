FROM openjdk:8-jdk-alpine

RUN mkdir /app1

COPY ./target/*.jar /app1

WORKDIR /app1

ENTRYPOINT java -jar sample-1.0-SNAPSHOT-jar-with-dependencies.jar