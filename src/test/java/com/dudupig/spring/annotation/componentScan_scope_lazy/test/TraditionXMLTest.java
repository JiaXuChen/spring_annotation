package com.dudupig.spring.annotation.componentScan_scope_lazy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TraditionXMLTest {

    @Test
    public void traditionXMLTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context-componentScan.xml");
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        for(String name : beanNames){
            System.out.println("tradition get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }

}
