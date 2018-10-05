package com.dudupig.spring.annotation.propertyValues.configuration;

import com.dudupig.spring.annotation.propertyValues.pojo.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//使用@PropertySource读取外部配置文件中的k/v保存到运行的环境变量中;加载完外部的配置文件以后使用${}取出配置文件的值
//相当于<context:property-placeholder location="classpath:person.properties"/>
@PropertySource({"classpath:application.properties"})
public class PropertyConfiguration {

    @Bean
    public Teacher teacher(){
        return new Teacher("teacher", 18, "Teacher");
    }
}
