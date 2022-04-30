package com.testspringboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping("/hello/{name}")
	public String api1(@PathVariable(value = "name") String name) {
		String response = "Hello " + name + " Response received on : " + new Date();
		System.out.println(response);
		return response;

	}
	
	@RequestMapping("/test")
	public String api2() {
		System.out.println("inside test");
		return "test hello";

	}
}

// http://127.0.0.1:9080/test
