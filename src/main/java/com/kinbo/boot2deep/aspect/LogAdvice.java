package com.kinbo.boot2deep.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {



    /**
     * Pointcut定义切点
     * public修饰符的
     * 返回值任意  com.xiaoi.recommend.controller包下面的任意类的任意方法任意参数
     */
    @Pointcut("execution(public * com.kinbo.boot2deep.service.EchoService.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println(">>>do before .....");
    }


    @After("log()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println(">>>do after .....");
    }



}
