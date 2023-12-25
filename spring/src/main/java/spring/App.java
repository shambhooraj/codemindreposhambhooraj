package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.print("Hello ");
		ApplicationContext context= new ClassPathXmlApplicationContext("Config.xml");
        student student1=(student) context.getBean("student1");
        //System.out.println(student1);
        
	}

}
