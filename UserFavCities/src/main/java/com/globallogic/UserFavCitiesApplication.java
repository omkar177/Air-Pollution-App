package com.globallogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.globallogic.*")
public class UserFavCitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFavCitiesApplication.class, args);
	}

}
