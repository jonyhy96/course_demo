FROM registry.docker-cn.com/library/java:openjdk-8-jre-alpine
MAINTAINER haoyun
COPY ./target/sprintboot_demo-0.0.1-SNAPSHOT.jar /app.jar 
ENTRYPOINT [ "java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "/app.jar" ]
EXPOSE 8089 
