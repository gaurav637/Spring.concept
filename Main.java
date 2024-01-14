package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Doctor dc = (Doctor) con.getBean("first");
		System.out.println(dc);
		
		
		
		student sd = (student) con.getBean("second");
		System.out.println(sd); 
	}
}
