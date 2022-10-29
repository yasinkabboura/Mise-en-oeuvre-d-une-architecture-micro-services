FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/micro-biling-service-0.0.1-SNAPSHOT.jar /Billing-service.jar
CMD ["java","-jar","Billing-service.jar","--spring.profiles.active=prod"]
EXPOSE 8089
