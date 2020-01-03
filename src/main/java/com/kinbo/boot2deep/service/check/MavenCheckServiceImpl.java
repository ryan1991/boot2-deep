package com.kinbo.boot2deep.service.check;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class MavenCheckServiceImpl implements CheckService {


    @Override
    public void check() {
        System.out.println("maven检测");
    }
}
