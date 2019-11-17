package io.TheDoctorOne.JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    @Autowired
    private JdbcTemplate jdbc;

    private ApplicationContext context;

    Main () {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
    }

    public static void main(String[] args) {
        new Main();
    }
}