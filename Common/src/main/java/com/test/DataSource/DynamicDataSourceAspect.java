package com.test.DataSource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Order(-1)
@Component
public class DynamicDataSourceAspect {
    private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

/*
    @Pointcut("execution(* com.test.DataSource.*.*(..))")
    public void point(){

    }

    @Before("point()")
    public void testBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url={}",request.getRequestURL());
        logger.info("method={}",request.getMethod());
        logger.info("ip={}",request.getRemoteAddr());
        logger.info("class_name={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        logger.info("args={}",joinPoint.getArgs());
    }
    @AfterReturning(returning = "object",pointcut = "point()")
    public void testAfterReturning(Object object){
        logger.info("response={}",object);
    }
*/

    @Before("@annotation(ds)")
    public void changeDataSource(JoinPoint joinPoint, TargetDataSource ds) throws Throwable {
        String dsId = ds.name();
        if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {
            logger.error("数据源[{}]不存在，使用默认数据源 > {}", ds.name(), joinPoint.getSignature());
        } else {
            logger.debug("Use DataSource : {} > {}", ds.name(), joinPoint.getSignature());
            DynamicDataSourceContextHolder.setDataSourceType(ds.name());
        }
    }

    @After("@annotation(ds)")
    public void restoreDataSource(JoinPoint joinPoint, TargetDataSource ds) {
        logger.debug("Revert DataSource : {} > {}", ds.name(), joinPoint.getSignature());
        DynamicDataSourceContextHolder.clearDataSourceType();
    }
}
