#FROM openjdk:8-jre
#
#ADD target/test-1.0-SNAPSHOT.jar app.jar
#
#EXPOSE 8010
#
#ENTRYPOINT ["java","-jar","/app.jar"]

FROM hub.c.163.com/library/tomcat:latest

MAINTAINER zff

COPY target/test-1.0-SNAPSHOT.jar /usr/local/tomcat/webapps
