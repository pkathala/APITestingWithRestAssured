FROM maven:3.9.2-eclipse-temurin-11
COPY src home/apiframework/src
COPY target/surefire-reports home/apiframework/target/surefire-reports
COPY pom.xml home/apiframework/pom.xml
COPY testng.xml home/apiframework/testng.xml
WORKDIR home/apiframework
ENTRYPOINT mvn clean test