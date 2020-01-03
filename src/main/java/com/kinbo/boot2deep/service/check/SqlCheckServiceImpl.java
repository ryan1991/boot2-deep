package com.kinbo.boot2deep.service.check;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class SqlCheckServiceImpl implements CheckService {


    @Override
    public void check() {
        System.out.println("sql检测");
    }
}
