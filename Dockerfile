# Use OpenJDK as the base image
FROM openjdk:21-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the jar file from target folder to /app folder inside the container
COPY target/me.jar /app/app.jar

# Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8081

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]