package io.TheDoctorOne.CostumEventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static ConfigurableApplicationContext context;

    /**
     * More Explanations and Information :
     * https://www.tutorialspoint.com/spring/custom_events_in_spring.htm
     */
    public static void main(String[] args) {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
        CostumEventPublisher cEventPublisher = context.getBean(CostumEventPublisher.class);
        cEventPublisher.publish(); //Raises the costum event.
        cEventPublisher.publish();
        cEventPublisher.publish();
    }
}