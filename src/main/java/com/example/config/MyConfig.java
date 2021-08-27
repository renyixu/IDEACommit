package com.example.config;


import com.example.pojo.Car;
import com.example.pojo.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false) //告诉SpringBoot这是一个配置类（相当于配置文件）
//proxyBeanMethods默认为true（Full模式），
// 表示外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象，
//SpringBoot总会检查这个组件是否在容器中存在。
//proxyBeanMethod设置为false时，为Lite模式，每次都是新创建的对象

@Import(Car.class)

//这表示当容器中有名为lisi的组件时，该类下面的所有方法的对象注入才生效
//@ConditionalOnBean(name = "lisi")
public class MyConfig {

    //表示容器中有名为wangwu的组件时，该方法的对象注入才生效
    @Bean("zhangsan")
    public Person person01() {
        return new Person("张三", 20);
    }

    @ConditionalOnBean(name = "zhangsan")
    @Bean("lisi")
    public Person person02() {
        return new Person("李四", 21);
    }
}
