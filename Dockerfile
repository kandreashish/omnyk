FROM openjdk:8-jdk-alpine
VOLUME ["/spring-boot"]
WORKDIR /spring-boot
COPY . .
CMD ["java","-jar","target/omnykV2.jar"]
