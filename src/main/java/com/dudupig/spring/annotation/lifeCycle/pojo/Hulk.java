package com.dudupig.spring.annotation.lifeCycle.pojo;

public class Hulk {
    public Hulk() {
        System.out.println("Hulk Construtor...................");
    }

    public void init(){
        System.out.println("I'm comming .......Hulk......init");
    }

    public void destroy(){
        System.out.println("I'm leaving .......Hulk.......destroy");
    }
}
