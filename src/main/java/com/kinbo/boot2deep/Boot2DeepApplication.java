package com.kinbo.boot2deep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Boot2DeepApplication {



    public static void main(String[] args) {

        SpringApplication.run(Boot2DeepApplication.class, args);


    }




    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event){

        System.out.println("当前WebServer实现类为：" + event.getWebServer().getClass().getName());

    }
}
