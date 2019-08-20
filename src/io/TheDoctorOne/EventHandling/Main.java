package io.TheDoctorOne.EventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static ConfigurableApplicationContext context;

    public static void main(String[] args){
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
        context.start(); //Raises the start event.

        Hello hello = context.getBean(Hello.class);
        hello.print();


        context.stop(); //Raises the stop event.
    }
}