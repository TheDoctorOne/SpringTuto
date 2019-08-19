package io.TheDoctorOne.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) ctx.getBean("helloWorld");
		obj.getMessage();
		HelloWorld obj2 = (HelloWorld) ctx.getBean("helloWorld"); //Basicly: obj2 = obj; Becuz at Beans.xml scope declared as "singleton". 
		//															If we had defined scope as "prototype", objects whould have been different. 
		obj2.getMessage();
		obj.setMessage("message");
		obj2.getMessage(); //Prints "message"
		System.out.println(obj2 == obj); //true
		/* More Inf.
		 * 
		 * More Information About Beans : https://www.tutorialspoint.com/spring/spring_bean_definition.htm
		 * 
		 */

	}

}
