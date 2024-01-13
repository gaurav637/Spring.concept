package com.spring.spring_concept.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class class_main {
    public static void main(String args[]){
        System.out.println("Helooooo world");

        ApplicationContext ABcontext = new ClassPathXmlApplicationContext("file:src/main/java/com/spring/spring_concept/Reference/first.xml");
        A temp = (A) ABcontext.getBean("aref");
        System.out.println(temp.getx());
        System.out.println(temp.getobj().getY());

    }
}
