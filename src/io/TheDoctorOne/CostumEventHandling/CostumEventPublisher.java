package io.TheDoctorOne.CostumEventHandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CostumEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {//Event definition.
        publisher = arg0;
    }
    
    public void publish(){ //Event creation
        CostumEvent costumEvent = new CostumEvent(this);
        publisher.publishEvent(costumEvent);
    }

}