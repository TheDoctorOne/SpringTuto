package io.TheDoctorOne.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private ApplicationContext context;

    Main () {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
    }

    public static void main(String[] args) {
        new Main();
    }
}