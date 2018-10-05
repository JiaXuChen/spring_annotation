package com.dudupig.spring.annotation.propertyValues.pojo;

import org.springframework.beans.factory.annotation.Value;

public class Teacher {
    //使用@Value赋值；
    //1、基本数值
    //2、可以写SpEL； #{}
    //3、可以写${}；取出配置文件【properties】中的值（在运行环境变量里面的值）
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private int age;
    @Value("${job}")
    private String job;

    public Teacher() {
        System.out.println("Teacher......constructor.....run");
    }

    public Teacher(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
