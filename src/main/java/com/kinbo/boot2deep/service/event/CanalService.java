package com.kinbo.boot2deep.service.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CanalService implements ApplicationListener<AbstractDestinationEvent> {


    @Override
    public void onApplicationEvent(AbstractDestinationEvent event) {
        if (event instanceof DestinationAddEvent){
            System.out.println("新增canal实例:" + event.getDestination());
        }else if (event instanceof DestinationDeleteEvent){
            System.out.println("删除canal实例:" + event.getDestination());
        }




    }
}
