FROM openjdk:8
ADD target/DDBUpdate-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","app.jar"]
