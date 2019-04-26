FROM maven:3.6.1-jdk-8-alpine AS build
RUN mkdir -p /opt/app
COPY ./ /opt/app
RUN mvn -f /opt/app/pom.xml clean package

FROM openjdk:8u201-jdk-alpine3.9
RUN mkdir -p /opt/app
COPY --from=build /opt/app/target/app.jar /opt/app/app.jar
ENTRYPOINT java -jar /opt/app/app.jar
EXPOSE 8080