FROM openjdk:latest
COPY ./target/Groupseven-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Groupseven-1.0-SNAPSHOT-jar-with-dependencies.jar"]