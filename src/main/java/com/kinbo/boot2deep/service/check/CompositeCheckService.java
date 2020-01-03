package com.kinbo.boot2deep.service.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CompositeCheckService implements  ApplicationListener<ContextRefreshedEvent> {


    private List<CheckService> checkChains = new ArrayList<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        if (context.getParent() == null){
            //当前容器为根容器
            Map<String, CheckService> beans = context.getBeansOfType(CheckService.class);
            checkChains.addAll(beans.values());
            AnnotationAwareOrderComparator.sort(checkChains);
        }
    }


    public void check() {
        for (CheckService checkService :checkChains){
            checkService.check();
        }
    }
}
