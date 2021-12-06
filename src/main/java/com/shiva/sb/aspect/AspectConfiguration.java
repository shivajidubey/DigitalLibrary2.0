package com.shiva.sb.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AspectConfiguration {

    /* Point Cut : Condition to Match */
    @Before(value = "execution(* com.shiva.sb.service.*.*(..))")
    public void beforeServiceMethod(JoinPoint joinPoint) {
        /* Advice : What to Do */
        log.info("Before execution :: {}", joinPoint);
    }

    @After(value = "execution(* com.shiva.sb.service.*.*(..))")
    public void afterServiceMethod(JoinPoint joinPoint) {
        /* Advice : What to Do */
        log.info("After execution :: {}", joinPoint);
    }

    @AfterReturning(value = "execution(* com.shiva.sb.controller.*.*(..))",
            returning = "result")
    public void afterControllerMethod(JoinPoint joinPoint, Object result) {
        /* Advice : What to Do */
        log.info("{} returns {}", joinPoint, result);
    }

    @Around("@annotation(com.shiva.sb.aspect.TrackTime)")
    public void trackMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time taken by {} is {}ms", joinPoint, timeTaken);
    }
}