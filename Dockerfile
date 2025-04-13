# Start from a base JDK 17 image
FROM openjdk:17-jdk-slim

# Create a directory for the app
WORKDIR /app

COPY target/student-survey-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
