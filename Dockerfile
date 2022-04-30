FROM openjdk:8
WORKDIR /usr/local/bin
COPY ./target/testspringboot-0.0.1-SNAPSHOT.jar helloworld.jar
ENTRYPOINT [ "java", "-jar", "helloworld.jar"]