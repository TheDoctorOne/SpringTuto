package io.TheDoctorOne.EventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class RegularContextStartHandler implements ApplicationListener<ContextStartedEvent>  {

    @Override
    public void onApplicationEvent(ContextStartedEvent arg0) {
        System.out.println("Context started.");
    }

}