package ConstructionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class temp {
    public static void main(String args[]){
        System.out.println("hello world");
        ApplicationContext con = new ClassPathXmlApplicationContext("file:src/main/java/ConstructionInjection/second.xml");
        person p1 = (person) con.getBean("hello");
    }
}
