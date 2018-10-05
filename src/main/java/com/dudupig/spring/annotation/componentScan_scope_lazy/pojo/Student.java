package com.dudupig.spring.annotation.componentScan_scope_lazy.pojo;

import com.dudupig.spring.annotation.configurationAndBean.pojo.Person;

public class Student extends Person {
    private String job;

    public Student() {
        super();
    }

    public Student(String name, int age, String job) {
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
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "ages='" + super.getAge() + '\'' +
                "job='" + job + '\'' +
                '}';
    }
}
