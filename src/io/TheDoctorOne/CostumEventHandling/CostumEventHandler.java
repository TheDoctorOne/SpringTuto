package io.TheDoctorOne.CostumEventHandling;

import org.springframework.context.ApplicationListener;

public class CostumEventHandler implements ApplicationListener<CostumEvent> {

    @Override
    public void onApplicationEvent(CostumEvent arg0) { //Method that we raise.
        System.out.println(arg0.toString());
    }
    
}