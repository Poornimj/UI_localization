FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/UI_Localization-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-version"]