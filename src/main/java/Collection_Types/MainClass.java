package Collection_Types;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String args[]){
        System.out.println("collection types -> ");

        ApplicationContext context11 = new ClassPathXmlApplicationContext("Collection_Types/Spring.xml");
        Collection_Types.Student objStudent = (Collection_Types.Student) context11.getBean("student2");
        System.out.println(objStudent);

    }
}
