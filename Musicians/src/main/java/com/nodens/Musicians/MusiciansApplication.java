package com.nodens.Musicians;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories("com.nodens.Musicians.Repositories")
@SpringBootApplication
public class MusiciansApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusiciansApplication.class, args);
	}

}
