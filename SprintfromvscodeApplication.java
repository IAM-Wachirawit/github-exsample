package com.example.sprintfromvscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SprintfromvscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintfromvscodeApplication.class, args);
	}
	@GetMapping("/")
	@ResponseBody
	public String home(){
		return "Hello Home Page";
	}
}
