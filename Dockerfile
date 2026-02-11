FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src
RUN ./gradlew build -x test
EXPOSE 8080
CMD ["java", "-jar", "build/libs/search-service-1.0.0.jar"]


# Security Fix by BuildGuard
USER nonroot


# Security Fix by BuildGuard
USER nonroot


# Security Fix by BuildGuard
USER nonroot
