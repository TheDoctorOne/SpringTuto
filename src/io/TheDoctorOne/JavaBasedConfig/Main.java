package io.TheDoctorOne.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
        Humanoid human = context.getBean(Humanoid.class);
        human.print();
    }
}