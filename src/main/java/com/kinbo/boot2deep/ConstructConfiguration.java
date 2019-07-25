package com.kinbo.boot2deep;

import com.kinbo.boot2deep.service.EchoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConstructConfiguration implements InitializingBean {
    private EchoService echoService;


    public ConstructConfiguration(EchoService echoService){

        this.echoService = echoService;


    }


    @Override
    public void afterPropertiesSet() throws Exception {
        echoService.echo("test construct inject");
    }
}
