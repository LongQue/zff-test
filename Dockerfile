FROM openjdk:8-jre
ADD test-1.0-SNAPSHOT.jar app.jar
EXPOSE 8010
ENTRYPOINT ["java","-jar","/app.jar"]

