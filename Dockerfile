FROM openjdk:latest
COPY ./target/Groupseven-1.0-v0.2-alpha3-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Groupseven-1.0-v0.2-alpha3-jar-with-dependencies.jar"]