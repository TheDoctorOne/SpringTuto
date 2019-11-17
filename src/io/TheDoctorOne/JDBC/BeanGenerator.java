package io.TheDoctorOne.JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanGenerator {

    @Bean
    public JdbcTemplate jdbc () {
        return new JdbcTemplate(new DriverManagerDataSource("jdbc:mysql://localhost:3306", "root", "test"));
    }

    @Bean
    public String name() {
        return "TheDoctorOne";
    }

    @Bean
    public String age() {
        return "22";
    }

    @Bean
    public String job() {
        return "Student";
    }

    @Bean
    public Member member() {
        return new Member();
    }

}