package io.TheDoctorOne.JavaBasedConfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Humanoid {
    @Autowired
    private Job job;
    private String name;
    public Humanoid(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Name : " + name + "\n" + "Job : " + job.getName());
    }
}