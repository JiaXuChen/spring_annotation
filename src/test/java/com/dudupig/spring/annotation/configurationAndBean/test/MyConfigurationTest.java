package com.dudupig.spring.annotation.configurationAndBean.test;

import com.dudupig.spring.annotation.configurationAndBean.configuration.MyConfiguration;
import com.dudupig.spring.annotation.configurationAndBean.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigurationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }
}
