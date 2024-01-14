package com.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String args[]) {
		System.out.println("hello world welcome to java configuration file used object without new keyword and spring xml configuration");
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		
		Student st1 = (Student) context.getBean("getstudent",Student.class);
		System.out.println(st1);
	}
}
