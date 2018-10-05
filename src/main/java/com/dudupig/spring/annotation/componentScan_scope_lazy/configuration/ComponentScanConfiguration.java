package com.dudupig.spring.annotation.componentScan_scope_lazy.configuration;

import com.dudupig.spring.annotation.componentScan_scope_lazy.pojo.Student;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
/**
 * @ComponentScan 包扫描，相当于xml中的<context:component-scan base-package="com.dudupig.spring.web"/>
 *  过滤规则
 *     ComponentScan.Filter[] includeFilters() default {};只包含那些,useDefaultFilters要设置成false才能用
 *
 *     ComponentScan.Filter[] excludeFilters() default {};排除那些
 *
 *     boolean useDefaultFilters() default true;
 */
@ComponentScan(value = "com.dudupig.spring.web", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class})
        //@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})//自定义过滤规则
})
//@ComponentScan("com.dudupig.spring")
public class ComponentScanConfiguration {

    //默认是单实例的
    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST  request
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION	 sesssion
     * @return\
     * @Scope:调整作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 					每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 			以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     *

     */
    @Scope("prototype")//相当于xml中的<bean id="person" class="com.dudupig.spring.annotation.componentScan_scope_lazy.pojo.Student" scope="prototype">
    @Bean
    public Student student1(){
        System.out.println("prototype类型向容器中注入student对象..........");
        return new Student("dudupig", 7, "is a prototype");
    }

    @Bean
    public Student student2(){
        System.out.println("singleton类型向容器中注入student对象..........");
        return new Student("dudupig", 7, "is a singleton");
    }

    /**
     *  懒加载：
     * 		单实例bean：默认在容器启动的时候创建对象；
     * 		懒加载：容器启动不创建对象。第一次使用(获取)Bean创建对象，并初始化；
     *
     */
    @Lazy
    @Bean
    public Student student3(){
        System.out.println("singleton&Lazy类型向容器中注入student对象..........");
        return new Student("dudupig", 7, "is a singleton");
    }

}
