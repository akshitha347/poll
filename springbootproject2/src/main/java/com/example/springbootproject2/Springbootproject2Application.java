package com.example.springbootproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan(basePackages = "com.example")
@EntityScan(basePackages = "com.example.Model")
@EnableJpaRepositories(basePackages = "com.example.Repository")
public class Springbootproject2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootproject2Application.class, args);
	}

}
