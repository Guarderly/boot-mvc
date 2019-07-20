package com.ly.demo.aspect.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;



@Documented //文档生成时，该注解将被包含在javadoc中，可去掉
@Target(ElementType.TYPE)//目标是类 
@Retention(RetentionPolicy.RUNTIME) //注解会在class中存在，运行时可通过反射获取  
@Inherited
public @interface ICutClass {
	String group() default "";

}
