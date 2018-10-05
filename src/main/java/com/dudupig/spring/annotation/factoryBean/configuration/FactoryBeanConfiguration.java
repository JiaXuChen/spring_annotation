package com.dudupig.spring.annotation.factoryBean.configuration;

import com.dudupig.spring.annotation.factoryBean.pojo.CarFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfiguration {

    @Bean
    public CarFactoryBean BWMCar(){
      return  new CarFactoryBean();
    }
}
