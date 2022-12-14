package com.example.kafka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenShiftDemoNewApplication {

	@GetMapping("/hello")
	public String hello() {
		return "hello, This is my first application deployed in openshift containers";
	}
	
	@GetMapping("/openshift")
	public String openshift() {
		return "openshift application deployed successfully";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(OpenShiftDemoNewApplication.class, args);
	}

}
