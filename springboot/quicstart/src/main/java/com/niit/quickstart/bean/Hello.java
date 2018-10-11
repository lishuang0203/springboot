package com.niit.quickstart.bean;

import org.springframework.stereotype.Component;

/**
 * @author lishuang
 * 2018.9.3
 * 使用@component注解标注一个类，这个类的对象为可被Spring容器注入，是一个单例的bean
 * 注入分为构造器注入和色偷偷特热、注入
 * 依赖注入和AOP是Spring的两大特性
 */

@Component
public class Hello {
    public String getHello(){
        return "Hello Spring Boot!";
    }
}
