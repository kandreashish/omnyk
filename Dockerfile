FROM maven:3.6.0-jdk-11-slim AS build
MAINTAINER ashish kashishcool144@gmail.com
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml install package
CMD ["java" ,"-cp", "target/*jar"]
