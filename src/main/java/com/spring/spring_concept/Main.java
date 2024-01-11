package com.spring.spring_concept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        System.out.println("hello world");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st =(Student) context.getBean("student1");
        System.out.println(st);

        System.out.println("employee class -> ");

        ApplicationContext contextEmp = new ClassPathXmlApplicationContext("config.xml");
        Employee classEmp = (Employee) contextEmp.getBean("emp");

        System.out.println(classEmp);
        System.out.println("customer class -> ");

        ApplicationContext customerCon = new ClassPathXmlApplicationContext("config.xml");
        customer cut = (customer) customerCon.getBean("customer_id");
        System.out.println(cut);

        System.out.println("college class -> ");

        ApplicationContext contextCollege = new ClassPathXmlApplicationContext("config.xml");
        college obj = (college) contextCollege.getBean("college1");
        System.out.println(obj);



    }
}

//  /Users/sudhanshubhardwaj/Desktop/Spring Framework/Spring.concept/src/main/resources/spring.xml
