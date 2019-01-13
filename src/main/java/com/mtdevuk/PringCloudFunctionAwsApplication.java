package com.mtdevuk;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PringCloudFunctionAwsApplication {
	
	@Bean
	public Function<String, String> uppercase() {
		return (String request) -> request.toUpperCase();
	}

	@Bean
	public Function<String, String> lowercase() {
		return (String request) -> request.toLowerCase();
	}

	public static void main(String[] args) {
		SpringApplication.run(PringCloudFunctionAwsApplication.class, args);
	}

}

