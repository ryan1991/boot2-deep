package com.kinbo.boot2deep.service;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Components implements ApplicationListener<ContextRefreshedEvent> {

    @PostConstruct
    public void init(){
        System.out.println(">>>>组件初始化");
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(">>>>容器启动");
    }
}
