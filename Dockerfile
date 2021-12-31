
FROM openjdk:11

EXPOSE 8080

ADD target/springJenkinsApplication-0.0.1-SNAPSHOT.jar springJenkinsApplication-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar", "/springJenkinsApplication-0.0.1-SNAPSHOT.jar"]
