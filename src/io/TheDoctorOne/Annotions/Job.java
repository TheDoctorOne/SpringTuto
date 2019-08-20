package io.TheDoctorOne.Annotions;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@Lazy
public class Job {
    private String name;
    @Autowired
    private Human human;

    public Job(String name){
        this.name = name;
    }

    @PostConstruct
    public void init(){
        if(human.getJob() instanceof Job)
            System.out.println(human.getName() + " working... as " + human.getJob().getName());
    }

	public String getName() {
		return name;
	}

}