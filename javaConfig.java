package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.configuration")
public class javaConfig {
	
	
	@Bean
	public Student getstudent() {
		Student s1 = new Student();
		return s1;
	}
	
}
