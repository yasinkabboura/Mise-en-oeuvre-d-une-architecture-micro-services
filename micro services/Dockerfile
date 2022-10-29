FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/micro-services-0.0.1-SNAPSHOT.jar /Customer-service.jar
CMD ["java","-jar","Customer-service.jar","--spring.profiles.active=prod"]
EXPOSE 8088
