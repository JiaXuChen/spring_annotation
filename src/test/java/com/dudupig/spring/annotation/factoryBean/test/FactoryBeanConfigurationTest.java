package com.dudupig.spring.annotation.factoryBean.test;

import com.dudupig.spring.annotation.factoryBean.configuration.FactoryBeanConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanConfigurationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
        System.out.println("&BWMCar" + applicationContext.getBean("&BWMCar"));
    }
}
