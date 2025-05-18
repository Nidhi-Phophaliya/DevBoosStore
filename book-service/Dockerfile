# Start from a lightweight Java runtime
FROM eclipse-temurin:17-jdk-jammy

# Set app directory
WORKDIR /app

# Copy the jar file (adjust the name if needed)
COPY target/book-service-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
