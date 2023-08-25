package com.et101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Et101Application {

	public static void main(String[] args) {
		SpringApplication.run(Et101Application.class, args);
	}

}
