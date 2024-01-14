package com.spring.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class Main {
	
	public static void main(String args[]) {
		System.out.println("heloo world welcome to jdbc");
		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("/Spring.concept/src/main/java/com/spring/JDBC/Spring.xml");
		
		JdbcTemplate jt = con.getBean("jdbcTemplate1" ,JdbcTemplate.class);
		
		System.out.println("jdbc effected row -> "+jt);
		
		
	}

}



