package com.demo.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.cts.*")
public class OrmLearn1Application {

	public static void main(String[] args) {
		SpringApplication.run(OrmLearn1Application.class, args);
	}

}
