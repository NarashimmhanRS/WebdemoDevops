package com.example.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
      return String.format("<h1>Hello There. welcome to my project Success!!!</h1>");
    }

}
