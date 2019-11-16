package io.TheDoctorOne.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleInit implements DisposableBean, InitializingBean { //Interfaces for initializer and destroy method.

    private String message;

    public void setMessage(String message){ 
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }

    @Override
    public void afterPropertiesSet() throws Exception { //Calls this method after properties set, Java way
        System.out.println("INIT JAVA");
    }
    @Override
    public void destroy() { //Calls this method when closing software. Java way, garbage collector
        System.out.println("DESTROY JAVA");
    }

    public void destroyXML() { //Calls this method when closing software. XML way, defined at Beans.xml , garbage collector
        System.out.println("DESTROY XML");
    }
    public void init(){ //XML Way of afterPropertiesSet(), which we define at Beans.xml
        System.out.println("INIT XML");
    }
    
}