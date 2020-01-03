package com.kinbo.boot2deep.service.check;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class SonarCheckServiceImpl implements CheckService {


    @Override
    public void check() {
        System.out.println("sonar检测");
    }
}
