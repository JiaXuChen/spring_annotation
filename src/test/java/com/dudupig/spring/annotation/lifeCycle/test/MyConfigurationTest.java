package com.dudupig.spring.annotation.lifeCycle.test;

import com.dudupig.spring.annotation.lifeCycle.configuration.LifeCycleConfigure;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigurationTest {
    @Test
    public void annotationSingletonTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfigure.class);
        System.out.println("applicationContext init end............");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }

    @Test
    public void annotationPrototypeTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfigure.class);
        System.out.println("applicationContext init end............");
        applicationContext.getBean("prototypeHulk");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }


    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfigure.class);
        System.out.println("applicationContext init end............");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
