package ru.ulstu.is.sbapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbappApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloUser(
			@RequestParam(value = "name", defaultValue = "my")
					String name,
			@RequestParam(value = "surname", defaultValue = "friend")
					String surname) {
		return String.format("Hello %s %s!", name, surname);
	}
}
