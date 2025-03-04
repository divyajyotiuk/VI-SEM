package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student() {
		return new Student(getAddress());
	}
	
	@Bean 
	public Address getAddress()
	{
		return new Address();
	}
}
