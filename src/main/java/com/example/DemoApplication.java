package com.example;

import com.example.config.MyConfig;
import com.example.pojo.Car;
import com.example.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {

        //获取IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        //获取容器里面的组件（对象）
//        Person bean = run.getBean(Person.class);
//        System.out.println(bean);

//        Person p1 = run.getBean("lisi", Person.class);
//        Person p2 = run.getBean("lisi", Person.class);
////        System.out.println(p1 == p2);
//
//        MyConfig myConfig = run.getBean(MyConfig.class);
//        Person p03 = myConfig.person01();
//        Person p04 = myConfig.person01();
//        System.out.println(p03 == p04);//默认是单例模式（Full模式，proxyBeanMethods默认为true）
//
//        Car car = run.getBean(Car.class);
//        System.out.println("car:" + car);

        System.out.println(run.containsBean("zhangsan"));
    }

    @GetMapping("test")
    public String test(@RequestParam(name = "name", defaultValue = "张三") String name) {
        System.out.println(name);
        return "访问成功。";
    }
}
