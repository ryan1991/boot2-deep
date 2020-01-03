package com.kinbo.boot2deep.service.event;

public class DestinationDeleteEvent extends AbstractDestinationEvent {
    public DestinationDeleteEvent(String destination) {
        super(destination);
    }
}
