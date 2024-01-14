package com.spring2.autowired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String args[]) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/spring2/autowired/autoconfig.xml");
		
		emp e1 = context.getBean("emp1",emp.class);
		System.out.println(e1);
	}

}
