package com.spring.spring_concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        System.out.println("hello world");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Doctor doctor1 = context.getBean(Doctor.class);
        doctor1.city();

    }
}
