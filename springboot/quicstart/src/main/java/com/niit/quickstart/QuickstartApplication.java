package com.niit.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用@SpringBootApplication注解的类，是启动主类，一般放在项目顶层包下
 * 它是以下内容的综合
 * 1 @Configuration 标记一个类作为bean定义的应用程序上下文的资源
 * 2 @EnableAutoConfiguration，告诉SpringBoot开始加载基于类路径下的配置信息 beans 各种属性配置
 * 3 @Component告诉Spring寻找其它组件。配置 以及业务层类 最前面才能加载所有类
 */
@SpringBootApplication
public class QuickstartApplication {


     public static void main(String[] args) {
//         //    启动Spring Boot 并得到应用上下文对象
//         ApplicationContext ac = SpringApplication.run(QuickstartApplication.class,args);
//         System.out.println("使用Spring Boot开始注入的Hello的bean:");
//         //从容器中获得 Hello的对象 hello
//         Hello hello = (Hello) ac.getBean("hello");
//         System.out.println(hello.getHello());
//         ApplicationContext ac = SpringApplication.run(QuickstartApplication.class,args);
//         System.out.println("使用Spring Boot开始注入的Course的bean,它由Teacher和Studentden的bean装配组成：");
//         Course course= (Course) ac.getBean("course");
//         System.out.println(course.toString());
         SpringApplication.run(QuickstartApplication.class,args);
    }
}
