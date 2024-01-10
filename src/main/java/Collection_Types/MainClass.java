package Collection_Types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String args[]){
        System.out.println("hello world in main class");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student objStudent = (Student) context.getBean("student1");
        System.out.println(objStudent);


    }
}
