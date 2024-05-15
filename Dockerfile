FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/gestao_vagas-1.0.0.jar gestao_vagas-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "gestao_vagas-1.0.0.jar"]