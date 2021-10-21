package com.example;


import com.example.pojo.Person;
import com.example.pojo.Pet;
import com.example.pojo.RobotDetail;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Slf4j
@SpringBootApplication
//@SpringBootTest
//@ServletComponentScan(basePackages = {"com.example.servlet"})
public class DemoApplication {
    @Autowired
    private Pet pet;

    @Autowired
    JdbcTemplate jdbcTemplate;

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

//        System.out.println(run.containsBean("zhangsan"));

//        System.out.println(ds.getClass());

    }

    @GetMapping("test")
    public String test(@RequestParam(name = "name", defaultValue = "张三") String name) {
        System.out.println(name);
        return "访问成功。";
    }

    @RequestMapping("pet")
    public Pet getPet() {
        System.out.println(pet.toString());
        return pet;
    }

    @Test
    public void test01() {
        Person person = jdbcTemplate.queryForObject("select * from person where pid=1", Person.class);
        System.out.println(person);
    }
}
