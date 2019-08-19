package com.mahmudkocas.innerBeans;

public class Parent { 

    private Child child;

    public void setChild(Child child){
        System.out.println("Child in progress...");
        this.child = child;
    }

    public void talkToChild() {
        System.out.println("Parent : Hey kid");
        child.childSpeak();
    }

}