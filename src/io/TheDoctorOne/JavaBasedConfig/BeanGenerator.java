package io.TheDoctorOne.JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator { //This class is covering the XML part itself. 

    @Bean
    public Humanoid humanoid() {
        return new Humanoid("Mahmut");
    }

    @Bean
    public Job job() {
        return new Job("Lumberjack");
    }
}