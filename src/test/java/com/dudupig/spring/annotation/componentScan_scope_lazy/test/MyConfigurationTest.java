package com.dudupig.spring.annotation.componentScan_scope_lazy.test;

import com.dudupig.spring.annotation.componentScan_scope_lazy.configuration.ComponentScanConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigurationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }

    /**
     * spring默认注入的时候是单实例的对象
     */
    @Test
    public void annotationScopeTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        System.out.println("容器初始化完成...............");
        //多实例
        Object prototypeStudent1 = applicationContext.getBean("student1");
        Object prototypeStudent2 = applicationContext.getBean("student1");
        System.out.println(prototypeStudent1 == prototypeStudent2);
        //单例
        Object singletonStudent1 = applicationContext.getBean("student2");
        Object singletonStudent2 = applicationContext.getBean("student2");
        System.out.println(singletonStudent1 == singletonStudent2);
        //单例
        Object lazyStudent1 = applicationContext.getBean("student3");
        Object sazyStudent2 = applicationContext.getBean("student3");
        System.out.println(lazyStudent1 == sazyStudent2);

    }
}
