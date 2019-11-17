package io.TheDoctorOne.JDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private ApplicationContext context;

    Main () {
        context = new AnnotationConfigApplicationContext(BeanGenerator.class);
        MemberJDBC m = context.getBean(MemberJDBC.class);
        m.createTableIfNotExists();
        m.insert("Mahmut", "22", "Student");
        m.insert("Test", "12", "Kid");
        m.insert("Relatable", "3", "Beeing Cute");
        List<Member> list = m.list();
        for(Member member : list) {
            System.out.println(member.toString());
            System.out.println("=============");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}