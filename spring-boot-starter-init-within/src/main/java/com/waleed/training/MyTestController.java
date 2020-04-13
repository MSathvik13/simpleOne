package com.waleed.training;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pro")
public class MyTestController {

	@RequestMapping("/test")
	String getMessage() {
		return "Hey there, we are running Spring boot now...";
	}
	
	@RequestMapping("/process")
	String processData() {
		return "Processing Data, please check back later";
	}
	
}
