FROM openjdk:8-jre-alpine
ADD target/country-info-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar country-info-0.0.1-SNAPSHOT.jar