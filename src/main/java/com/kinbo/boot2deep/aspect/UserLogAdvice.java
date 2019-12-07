package com.kinbo.boot2deep.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Component
@Aspect
public class UserLogAdvice {

    /**
     * 切到@UserLog注解
     */
    @Pointcut("@annotation(com.kinbo.boot2deep.aspect.UserLog)")
    public void userLog(){
    }

    @Before("userLog()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println(">>>do before .....");
    }


    @After("userLog()")
    public void doAfter(JoinPoint joinPoint){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        UserLog userLog = getUserLogAnnotationBetter(joinPoint);
        System.out.println(userLog.module()+ " - " + userLog.operate());
    }

    private UserLog getUserLogAnnotation(JoinPoint point){
        Class targetClass = point.getTarget().getClass();
        String targetMethodName = point.getSignature().getName();
        for (Method method : targetClass.getMethods()){
            if (method.getName().equals(targetMethodName)){
                UserLog userLog = method.getAnnotation(UserLog.class);
                return userLog;
            }
        }
        return null;
    }


    private UserLog getUserLogAnnotationBetter(JoinPoint point)  {
        Method targetMethod = ((MethodSignature) point.getSignature()).getMethod();
        return targetMethod.getAnnotation(UserLog.class);
    }

}
