# Use an official OpenJDK 17 image as the base
#FROM amazoncorretto:17.0.7-alpine
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container
COPY target/EventM-0.0.1-SNAPSHOT.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run when the container starts
CMD ["java", "-jar", "app.jar"]
