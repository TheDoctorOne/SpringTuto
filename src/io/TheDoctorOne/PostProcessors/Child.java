package io.TheDoctorOne.PostProcessors;

public class Child { 

    public Child(){
        System.out.println("Child born.");
    }

    public void init(){ //Initializing method that defined at XML
        System.out.println("Child growing up.");
    }

    public void childSpeak(){
        System.out.println("Child : Humanity sucks.");
    }

}