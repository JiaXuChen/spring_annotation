package com.dudupig.spring.annotation.conditional.configuration;

import com.dudupig.spring.annotation.conditional.pojo.ITWorker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
/**
 * @Conditional({Condition}) ： 按照一定的条件进行判断，满足条件给容器中注册bean
 * 添加在类上，满足条件才会注册该类
 * 添加方法上，满足条件才会执行方法
 *
 * 如果系统是windows，给容器中注册("bill")
 * 如果是linux系统，给容器中注册("linus")
 */
@Configuration
@Conditional(WindowsCondition.class)
//@Conditional(LinuxCondition.class)
public class ConditionalConfiguration {

    @Bean
    @Conditional(LinuxCondition.class)
    public ITWorker linuxCondition(){
        System.out.println("LinuxCondition.......... .");
        return new ITWorker("linuxCondition", 20, "IT" );
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public ITWorker windowsCondition(){
        System.out.println("windowsCondition.......... .");
        return new ITWorker("windowsCondition", 20, "IT" );
    }
}
