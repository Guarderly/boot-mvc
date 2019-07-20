package com.ly.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {
    @Pointcut("@annotation(com.ly.demo.aspect.annotation.ICutInterface)")
	public void linkMethod() {
		
	}
    
    
    //切父类方法1-通过方法，失效，跑不进来
    @Around("linkMethod()")//
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        System.out.println("cut:"+time);

        return result;
    }
    //切父类方法2-通过注解，失效，跑不进来
    @Around("@annotation(com.ly.demo.aspect.annotation.ICutInterface)")//
    public Object aroundI(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        System.out.println("cut:"+time);

        return result;
    }
    
    //方法3-直接切类，类的切面可以被继承,注意：这里切的是运行时的对象方法
    @Around("@within(com.ly.demo.aspect.annotation.ICutClass)")
	public Object aroundClass(ProceedingJoinPoint point) throws Throwable {
    	long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;

        //保存日志
        System.out.println("cut:"+time);

        return result;
	}
    
}
