package com.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
	
    public static void main( String[] args ){
    	System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);
    }
}


//docker image build -t "helloworldboot" .

//docker run --name hellospring -p 8080:9080 helloworldboot

//docker inspect 3e9427907a11

//docker system df -v

//docker exec -ti  determined_mendel /bin/sh


//https://spring.io/guides/topicals/spring-boot-docker/
