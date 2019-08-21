package io.TheDoctorOne.CostumEventHandling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {
    @Bean
    public CostumEventHandler cEvent () {
        return new CostumEventHandler();
    }
    @Bean
    public CostumEventPublisher costumEventPublisher() {
        return new CostumEventPublisher();
    }
}