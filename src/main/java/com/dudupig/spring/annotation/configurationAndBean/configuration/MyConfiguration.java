package com.dudupig.spring.annotation.configurationAndBean.configuration;

import com.dudupig.spring.annotation.configurationAndBean.pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration标识的类是配置类。相当于以前的XML文件。
 * @Configuration注解在定义的时候有注解@Component，所以被 @Configuration标识的类是一个组件，包扫描的时候回自动注入到容器中。
 */
@Configuration
public class MyConfiguration {
    /**
     *  @Bean 注解相当于配置文件中的 <bean id="person" class="com.dudupig.spring.annotation.configurationAndBean.pojo.Person"/>
     *  其中方法名就是注入容器中bean的名称。返回值类型即为注入容器中的类型。
     *
     * @Bean有两个属性可以指定注入容器时候bean的名称，	@AliasFor表示这两个属性互为别名。选择其中一个即可
     *	@AliasFor("name")
     * 	String[] value() default {};
     * 	@AliasFor("value")
     * 	String[] name() default {};
     */
    @Bean
    public Person person(){
        return new Person("dudupig", 18);
    }

    @Bean
    public Person person1(){
        return new Person("dudupig", 17);
    }

    @Bean(value = "dudu")
    public Person person2(){
        return new Person("dudupig", 16);
    }
}
