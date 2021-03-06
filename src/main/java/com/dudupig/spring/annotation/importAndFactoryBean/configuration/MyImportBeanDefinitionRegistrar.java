package com.dudupig.spring.annotation.importAndFactoryBean.configuration;

import com.dudupig.spring.annotation.importAndFactoryBean.pojo.Animal;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * AnnotationMetadata：当前类的注解信息
 * BeanDefinitionRegistry:BeanDefinition注册类；
 * 		把所有需要添加到容器中的bean；调用
 * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean definition = registry.containsBeanDefinition("com.dudupig.spring.annotation.importAndFactoryBean.pojo.Bird");
        boolean definition2 = registry.containsBeanDefinition("com.dudupig.spring.annotation.importAndFactoryBean.pojo.Pig");
       // boolean definition2 = registry.containsBeanDefinition("com.dudupig.spring.annotation.importAndFactoryBean.pojo.Cat");
        if(definition && definition2){
            //指定Bean定义信息；（Bean的类型，Bean。。。）
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Animal.class);
            //注册一个Bean，指定bean名
            registry.registerBeanDefinition("animal", beanDefinition);
        }
    }
}
