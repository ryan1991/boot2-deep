package com.kinbo.boot2deep.controller;

import com.kinbo.boot2deep.service.EchoService;
import com.kinbo.boot2deep.service.check.CompositeCheckService;
import com.kinbo.boot2deep.service.event.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EchoController {


    @Autowired
    private EchoService echoService;

    @Autowired
    private CompositeCheckService checkService;

    @Autowired
    private ConfigService configService;

    @RequestMapping("/echo/{message}")
    public String echo(@PathVariable String message) {
        try {

            Thread.sleep(50000L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        return echoService.echo(message);
    }

    @RequestMapping("/echoParam")
    public String echoParam(String message){

        return echoService.echo(message);
    }

    @RequestMapping("/check")
    public String check(){
        checkService.check();
        return "success";
    }

    @RequestMapping("/configChange")
    public void configChange(){
        configService.subscribeChange();
    }
}
