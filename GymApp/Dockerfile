FROM maven:3.9.5-openjdk-21 AS build
Copy . . 
RUN mvn clean package -DSkipTests

FROM openjdk:21-slim
COPY --from=build /target/GymApp-0.0.1-SNAPSHOT.jar.original GymApp.jar
EXPOSE 8080 
ENTRYPOINT ["java","-jar","GymApp.jar"]