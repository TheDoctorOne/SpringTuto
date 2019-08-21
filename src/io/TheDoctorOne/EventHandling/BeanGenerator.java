package io.TheDoctorOne.EventHandling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {
    @Bean
    public Hello hello() {
        System.out.println("Creating bean..."); //We can put things here.
        return new Hello();
    }


    //Event Handlers MUST BE declared at Configuration File(Either mn XML or in Java Class)
    @Bean
    public RegularContextStartHandler regularContextStartHandler() {
        return new RegularContextStartHandler();
    }

    @Bean
    public RegularContextStopHandler regularContextStopHandler() {
        return new RegularContextStopHandler();
    }
}