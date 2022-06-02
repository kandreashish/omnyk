FROM openjdk:8-jdk-alpine
COPY /*.jar omnykV2.jar
ENTRYPOINT ["java","-jar","/omnykV2.jar"]
