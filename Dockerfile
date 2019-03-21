FROM adoptopenjdk/openjdk11:latest

EXPOSE 8080

COPY build/libs/offer-integration-helper-0.0.1-SNAPSHOT.jar /opt/app/offer-helper.jar
WORKDIR /opt/app/
CMD java -jar offer-helper.jar