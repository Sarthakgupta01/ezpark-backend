# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Add metadata
LABEL maintainer="your-email@example.com"

# Set workdir inside the container
WORKDIR /app

# Copy the JAR (replace with your actual JAR name if known)
COPY target/*.jar app.jar

# Expose port (Spring Boot default)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
