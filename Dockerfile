FROM openjdk:17-alpine
WORKDIR /app
copy ./target/dockerDemo-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java","-jar","dockerDemo-0.0.1-SNAPSHOT.jar"]
