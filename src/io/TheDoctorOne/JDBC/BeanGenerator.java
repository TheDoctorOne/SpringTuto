package io.TheDoctorOne.JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanGenerator {

    @Bean
    public JdbcTemplate jdbc() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        try {
            ds.setDriverClassName(Class.forName("com.mysql.jdbc.Driver").getName());
            ds.setUrl("jdbc:mysql://localhost:3306/test");
            ds.setUsername("root");
            ds.setPassword("");
            return new JdbcTemplate(ds);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            return null;
        }
    }

    @Bean
    public MemberJDBC memberJDBC() {
        return new MemberJDBC();
    }

}