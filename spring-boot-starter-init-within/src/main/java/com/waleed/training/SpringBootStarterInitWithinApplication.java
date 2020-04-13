package com.waleed.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class SpringBootStarterInitWithinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterInitWithinApplication.class, args);
	}
	
	
	@RequestMapping("/process")
	String doSoemthing() {
		return "Just anouther request mapping method...";
	}

}
