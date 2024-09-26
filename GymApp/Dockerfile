# Stage 1: Build stage
FROM maven:3.9.5-eclipse-temurin-21 AS build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM eclipse-temurin:21-jdk
COPY --from=build /target/GymApp-0.0.1-SNAPSHOT.jar GymApp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "GymApp.jar"]
