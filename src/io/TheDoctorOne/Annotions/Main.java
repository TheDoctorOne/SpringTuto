package io.TheDoctorOne.Annotions;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static AbstractApplicationContext ctx;
    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("Annotions.xml");
        ctx.registerShutdownHook();
        Human human = (Human) ctx.getBean("mahmut");
        human.printInformation();
    }
}