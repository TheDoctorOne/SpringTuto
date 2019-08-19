package io.TheDoctorOne.PostProcessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static AbstractApplicationContext ctx;
    public static void main(String[] args) {
        ctx = new ClassPathXmlApplicationContext("Beans.xml");
        ctx.registerShutdownHook();
        Parent parent = (Parent) ctx.getBean("parentpp");
        parent.talkToChild();
    }

}