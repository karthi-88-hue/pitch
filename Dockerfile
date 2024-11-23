FROM eclipse-temurin:17
COPY target/perth.jar starc.jar
CMD ["java", "-jar", "starc.jar"]
