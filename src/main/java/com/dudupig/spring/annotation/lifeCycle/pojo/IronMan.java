package com.dudupig.spring.annotation.lifeCycle.pojo;

public class IronMan {
    public IronMan() {
        System.out.println("IroMan Construtor...................");
    }

    public void init(){
        System.out.println("I'm comming .......IronMan......init");
    }

    public void destroy(){
        System.out.println("I'm leaving .......IronMan.......destroy");
    }
}
