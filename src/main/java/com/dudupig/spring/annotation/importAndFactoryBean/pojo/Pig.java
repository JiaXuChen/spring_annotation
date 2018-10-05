package com.dudupig.spring.annotation.importAndFactoryBean.pojo;

import org.springframework.context.ApplicationContext;

public class Pig {
    private String name;
    //    public Pig(){
    //
    //    }

    /**
     * 如果只有一个构造函数，切构造函数的参数在容器中唯一，在创建该对象的时候会自动从容器中找到该对象
     * 传递进入构造器，进行初始化操作。比如这里面我创建了唯一的Cat，并且Pig中创建唯一构造器，接受一个
     * Cat类型的参数。使用@Import创建对象，并没有传递参数，依旧可以创建成功。此时如果加了Pig的无常构造
     * 创建的时候会调用无参构造器。
     * @param cat
     */
    public Pig(Cat cat, ApplicationContext applicationContext) {
        System.out.println(applicationContext.getBean("cat"));
        this.name = cat.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }
}
