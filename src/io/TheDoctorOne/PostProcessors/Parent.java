package io.TheDoctorOne.PostProcessors;

public class Parent { 

    private Child child;

    public Parent(){ System.out.println("Parent spawned."); }

    public Parent(Child child){
        this.child = child;
    }

    public void setChild(Child child){
        System.out.println("Child in progress...");
        this.child = child;
    }

    public void talkToChild() {
        System.out.println("Parent : Hey kid");
        child.childSpeak();
    }

    public void destroy(){
        System.out.println("Parent ded.");
    }

}