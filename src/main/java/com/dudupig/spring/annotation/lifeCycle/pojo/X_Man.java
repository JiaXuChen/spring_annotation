package com.dudupig.spring.annotation.lifeCycle.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class X_Man {

    public X_Man() {
        System.out.println("X_Man Construtor...................");
    }
    @PostConstruct
    public void init(){
        System.out.println("I'm comming .......X_Man......PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("I'm leaving .......X_Man.......PreDestroy");
    }



}
