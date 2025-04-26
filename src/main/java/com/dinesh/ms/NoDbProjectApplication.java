package com.dinesh.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class NoDbProjectApplication {
	
	@GetMapping("/m1")
	public String m1() {
		return "Hey iam M1, welcome to Nodb spting boot project deployed in Azeure app service";
	}
	@GetMapping("/m2")
	public String m2() {
		return "Hey iam M2, welcome to Nodb spting boot project deployed in Azeure app service";
	}
	public static void main(String[] args) {
		SpringApplication.run(NoDbProjectApplication.class, args);
	}

}
