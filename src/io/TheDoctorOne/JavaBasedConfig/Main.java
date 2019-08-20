package io.TheDoctorOne.JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static ApplicationContext context;

    /**
     * More Information & More Explanation about Java Configuration
     * https://www.tutorialspoint.com/spring/spring_java_based_configuration.htm
     */
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
        Humanoid human = context.getBean(Humanoid.class);
        human.print();
    }
}