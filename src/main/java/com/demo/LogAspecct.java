package com.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LogAspecct {
    @Before("execution(* com.demo..*.*(..))")
    public  void log(){
        System.out.println("method log done"+ AopContext.currentProxy().getClass());
    }
    @After("execution(* com.demo..*.*(..))")
    public  void logAfter(JoinPoint point){
        System.out.println(point.getTarget().getClass()+"args:"+point.getArgs());
    }
}
