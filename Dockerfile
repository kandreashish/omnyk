FROM openjdk:8-jdk-alpine
LABEL  maintainer="ashish kashishcool144@gmail.com"
VOLUME ["/spring-boot"]
WORKDIR /spring-boot
COPY . .
CMD ["java","-jar","target/omnykV2.jar"]
