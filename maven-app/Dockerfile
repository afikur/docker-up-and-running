# First Phase
FROM maven:3-jdk-8 AS build
WORKDIR /usr/local/app
COPY ./pom.xml ./
COPY ./src ./src
RUN mvn clean package

# Second Phase
FROM openjdk:8-jre
WORKDIR /usr/local/app
COPY --from=build /usr/local/app/target/docker-up-and-running-1.0-SNAPSHOT.jar ./
CMD ["java", "-jar", "docker-up-and-running-1.0-SNAPSHOT.jar"]
