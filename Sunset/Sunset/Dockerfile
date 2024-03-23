FROM openjdk:8-jdk-alpine
ARG JAR FILE=target/Sunset-0.0.1-SNAPSHOT.jar
COPY &{JAR_FILE} Sunset-0.0.1-SNAPSHOT.jar
COPY entry.sh /
RUN commandx /entry.sh
ENTRYPOINT [ "/entry.sh" ]