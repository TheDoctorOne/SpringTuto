package com.mahmudkocas.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) ctx.getBean("helloWorld");
		obj.getMessage();

	}

}
