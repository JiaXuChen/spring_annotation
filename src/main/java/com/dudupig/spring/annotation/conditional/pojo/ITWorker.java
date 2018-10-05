package com.dudupig.spring.annotation.conditional.pojo;

import com.dudupig.spring.annotation.configurationAndBean.pojo.Person;

public class ITWorker  extends Person {

    private String job;

    public ITWorker() {
    }

    public ITWorker(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "ITWorker{" +
                "name='" + super.getName() + '\'' +
                "age='" + super.getAge() + '\'' +
                "job='" + job + '\'' +
                '}';
    }
}
