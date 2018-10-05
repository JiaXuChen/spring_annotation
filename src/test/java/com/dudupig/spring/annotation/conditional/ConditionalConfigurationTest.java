package com.dudupig.spring.annotation.conditional;

import com.dudupig.spring.annotation.conditional.configuration.ConditionalConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class ConditionalConfigurationTest {
    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalConfiguration.class);
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        Environment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("os.name"));
        for (String name : beanNames) {
            System.out.println("annotation get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }

}
