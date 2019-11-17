package io.TheDoctorOne.JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanGenerator {

    @Bean
    public JdbcTemplate jdbc () {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/");
        ds.setUsername("root");
        ds.setPassword("test");
        return new JdbcTemplate();
    }

    @Bean
    public MemberJDBC memberJDBC() {
        return new MemberJDBC();
    }

}