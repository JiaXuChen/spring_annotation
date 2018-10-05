package com.dudupig.spring.annotation.configurationAndBean.test;

import com.dudupig.spring.annotation.configurationAndBean.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TraditionXMLTest {

    @Test
    public void traditionXMLTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        for(String name : beanNames){
            System.out.println("tradition get bean ==> name:" + name + "==>value:" + applicationContext.getBean(name));
        }
    }

}
