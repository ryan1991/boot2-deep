package com.kinbo.boot2deep.service.event;

import org.springframework.context.ApplicationEvent;

public class AbstractDestinationEvent extends ApplicationEvent {

    private String destination;

    public AbstractDestinationEvent(String destination) {
        super(AbstractDestinationEvent.class);
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }
}
