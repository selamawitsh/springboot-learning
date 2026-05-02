package com.selam.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.selam.demo.ecommerce.*.*(..))")
    public Object logEverything(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();

        System.out.println("AOP LOG: Entering " + className + "." + methodName + "()");
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // Call the actual method

        long duration = System.currentTimeMillis() - start;
        System.out.println("AOP LOG: " + className + "." + methodName + "() took " + duration + "ms\n");

        return result;
    }
}