FROM openjdk:latest
COPY ./target/Group7.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group7.jar", "db:3306"]