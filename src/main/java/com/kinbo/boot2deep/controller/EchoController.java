package com.kinbo.boot2deep.controller;

import com.kinbo.boot2deep.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EchoController {


    @Autowired
    private EchoService echoService;


    @RequestMapping("/echo/{message}")
    public String echo(@PathVariable String message){

        return echoService.echo(message);
    }

    @RequestMapping("/echoParam")
    public String echoParam(String message){

        return echoService.echo(message);
    }

}
