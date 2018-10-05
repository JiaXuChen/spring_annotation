package com.dudupig.spring.annotation.lifeCycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SuperMan  implements InitializingBean, DisposableBean {

    private String name;

    private String speciality;

    public SuperMan(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public SuperMan() {
        System.out.println("SuperMan  contructo...............run..........");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "SuperMan{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public void destroy() throws Exception {
        System.out.println("I'm leaving .......SuperMan....... destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("I'm comming .......SuperMan...... afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("I'm comming .......SuperMan...... @PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("I'm leaving .......SuperMan....... @PreDestroy");
    }


    private void initMethod() {
        System.out.println("I'm comming .......SuperMan...... initMethod");
    }

    private void destroyMethod() {
        System.out.println("I'm leaving .......SuperMan.......destroyMethod");
    }
}
