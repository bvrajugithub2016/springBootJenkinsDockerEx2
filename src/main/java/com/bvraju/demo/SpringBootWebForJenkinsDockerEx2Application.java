package com.bvraju.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootWebForJenkinsDockerEx2Application {

	@GetMapping("/hello")
	public String welcome() {
		return "Hai Raju, welcome to Spring Boot RESTFul API Web Application - for Jenkins Docker Integration";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebForJenkinsDockerEx2Application.class, args);
	}

}
