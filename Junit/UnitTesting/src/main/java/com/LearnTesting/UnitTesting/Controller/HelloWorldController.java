package com.LearnTesting.UnitTesting.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String helloWorld()
	{
		return "Hello World";
	}

}
