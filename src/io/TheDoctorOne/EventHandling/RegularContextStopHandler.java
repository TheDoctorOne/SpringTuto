package io.TheDoctorOne.EventHandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class RegularContextStopHandler implements ApplicationListener<ContextStoppedEvent> {

    @Override
    public void onApplicationEvent(ContextStoppedEvent arg0) {
        System.out.println("Context stopped.");
    }

}