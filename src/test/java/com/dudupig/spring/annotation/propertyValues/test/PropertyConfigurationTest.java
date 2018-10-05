package com.dudupig.spring.annotation.propertyValues.test;

import com.dudupig.spring.annotation.propertyValues.configuration.PropertyConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyConfigurationTest {
    @Test
    public void propertyConfigurationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }

}
