package io.TheDoctorOne.Annotions;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    @Autowired//Annotion
    @Qualifier("miner") //There are 2 different object creation for job class. With this it assigns the one we specified. 
    private Job job;
    private String name;
    private String gender;
    private int age;
    public Human (String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = Integer.parseInt(age);
    }
    public String getName(){
        return name;
    }
    public Job getJob(){
        return job;
    }
    public void printInformation(){
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Job    : " + job.getName());
    }
    @PreDestroy
    public void destroy(){
        System.out.println(name + " ded.");
    }
}