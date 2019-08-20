package io.TheDoctorOne.Annotions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext ctx;
    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("Annotions.xml");
        Human human = (Human) ctx.getBean("mahmut");
        human.printInformation();
    }
}