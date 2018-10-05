package com.dudupig.spring.annotation.factoryBean.pojo;

import org.springframework.beans.factory.FactoryBean;
//创建一个Spring定义的FactoryBean
public class CarFactoryBean  implements FactoryBean {
    //返回一个BWMCar对象，这个对象会添加到容器中
    public BWMCar getObject() throws Exception {
        System.out.println("通过FactoryBean向容器中注入bean..........");
        return new BWMCar();
    }

    public Class<?> getObjectType() {
        return null;
    }

    //是单例？
    //true：这个bean是单实例，在容器中保存一份
    //false：多实例，每次获取都会创建一个新的bean；
    public boolean isSingleton() {
        return true;
    }
}
