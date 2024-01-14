package com.spring.annotation;


import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String args[]) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring/annotation/autoconfigAnnotation.xml");
		
		emp e1 = context.getBean("emp1",emp.class);
		System.out.println(e1);
	}

}
