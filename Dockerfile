FROM openjdk:8-jdk-alpine
COPY target/*.jar omnykV2.jar
ENTRYPOINT ["java","-jar","/omnykV2.jar"]
