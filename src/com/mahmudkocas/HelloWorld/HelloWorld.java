package com.mahmudkocas.HelloWorld;

public class HelloWorld {
	private String message;
	//private int i;
	public void setMessage(String message) {
		//Method has to have the name of the variable which comes from Bean. 
        //But it doesn't has to assign variable. 
        //Basicly it just calls the method. 
        //Anything can be done inside.
        //this.message = message;
        System.out.println("Enters.");
        
        //i = Integer.parseInt(this.message);
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("MESSAGE : " + message);
	}
}
