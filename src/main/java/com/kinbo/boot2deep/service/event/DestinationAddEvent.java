package com.kinbo.boot2deep.service.event;

public class DestinationAddEvent extends AbstractDestinationEvent {
    public DestinationAddEvent(String destination) {
        super(destination);
    }
}
