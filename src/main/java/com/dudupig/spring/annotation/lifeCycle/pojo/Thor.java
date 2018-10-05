package com.dudupig.spring.annotation.lifeCycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Thor implements InitializingBean, DisposableBean {

    public Thor() {
        System.out.println("Thor Construtor...................");
    }

    public void init(){
        System.out.println("I'm comming .......Thor......init");
    }

    public void destroy(){
        System.out.println("I'm leaving .......Thor.......destroy");
    }

    public void afterPropertiesSet() throws Exception {
        init();
    }
}
