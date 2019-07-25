package com.kinbo.boot2deep.service;

import org.springframework.stereotype.Service;

@Service
public class EchoServiceImpl implements EchoService{

    @Override
    public String echo(String message) {
        System.out.println("message:"+message);
        return message;
    }
}
