package com.dudupig.spring.annotation.importAndFactoryBean.test;

import com.dudupig.spring.annotation.importAndFactoryBean.configuration.ImportConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigurationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }
}
