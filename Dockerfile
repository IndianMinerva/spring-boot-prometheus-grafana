FROM openjdk:17-jdk-slim
VOLUME /opt
COPY ../target/spring-boot-prometheus-grafana.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]