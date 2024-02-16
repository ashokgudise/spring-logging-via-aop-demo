package com.ashok.logging.demo.logging;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingConfig {

    @Around("@annotation(StopWatcher)")
    public Object executionStopWatch(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        final Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        log.info("{} Executed in {} ms", joinPoint.getSignature(), start-end);

        return result;
    }

}
