FROM openjdk:latest
COPY ./target/Groupseven-1.0-v0.2-alpha4.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Groupseven-1.0-v0.2-alpha4.jar", "db:3306"]