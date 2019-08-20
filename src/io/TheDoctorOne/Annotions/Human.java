package io.TheDoctorOne.Annotions;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    @Autowired//Annotion
    private Job job;
    private String name;
    private String gender;
    private int age;
    public Human (String name, String gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = Integer.parseInt(age);
    }
    
    public void printInformation(){
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Job    : " + job.getName());
    }
}