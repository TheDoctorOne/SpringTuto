package io.TheDoctorOne.CostumEventHandling;

import org.springframework.context.ApplicationEvent;

public class CostumEvent  extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public CostumEvent(Object source) { //This has to be defined.
        super(source);
    }

    public String toString() {
        return "Costum Event";
    }

}