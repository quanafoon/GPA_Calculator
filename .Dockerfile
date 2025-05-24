FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

# Run the built JAR file
CMD ["java", "-jar", "target/gpa_calculator-0.0.1-SNAPSHOT.jar"]