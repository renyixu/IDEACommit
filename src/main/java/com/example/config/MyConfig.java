package com.example.config;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.example.interceptor.IndexCountInterceptor;
import com.example.interceptor.LoginInterceptor;
import com.example.pojo.Car;
import com.example.pojo.Person;
import com.example.servlet.MyFilter;
import com.example.servlet.MyServlet;
import com.example.servlet.MyServletContextListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.util.Arrays;
import java.util.Collections;

@Configuration(proxyBeanMethods = true) //告诉SpringBoot这是一个配置类（相当于配置文件）
//proxyBeanMethods默认为true（Full模式），
// 表示外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象，
//SpringBoot总会检查这个组件是否在容器中存在。
//proxyBeanMethod设置为false时，为Lite模式，每次都是新创建的对象

@Import(Car.class)

//这表示当容器中有名为lisi的组件时，该类下面的所有方法的对象注入才生效
//@ConditionalOnBean(name = "lisi")
public class MyConfig implements WebMvcConfigurer {
    @Autowired
    private IndexCountInterceptor indexCountInterceptor;

    //表示容器中有名为wangwu的组件时，该方法的对象注入才生效
//    @Bean("zhangsan")
//    public Person person01() {
//        return new Person("张三", 20);
//    }
//
//    @ConditionalOnBean(name = "zhangsan")
//    @Bean("lisi")
//    public Person person02() {
//        return new Person("李四", 21);
//    }

//    @Bean
//    public WebMvcConfigurer webMvcConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void configurePathMatch(PathMatchConfigurer configurer) {
//                UrlPathHelper urlPathHelper = new UrlPathHelper();
//                //是否移除封号后面的内容，false为不移除
//                urlPathHelper.setRemoveSemicolonContent(false);
//                configurer.setUrlPathHelper(urlPathHelper);
//            }
//        };
//    }


    //把拦截器配置到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        InterceptorRegistration interceptorRegistration =
                registry.addInterceptor(new LoginInterceptor());
        //设置拦截哪些请求，不拦截哪些请求
        interceptorRegistration.addPathPatterns("/**");
        //由于拦截器在拦截时会把css、js等文件也拦截，所以需要设置成不拦截
        //默认访问路径/以及登录请求也不能拦截
        interceptorRegistration.excludePathPatterns("/", "/login", "/css/**",
                "/fonts/**", "/images/**", "/js/**");

        InterceptorRegistration interceptorRegistration1 = registry.addInterceptor(indexCountInterceptor);
        interceptorRegistration1.addPathPatterns("/**");
        interceptorRegistration1.excludePathPatterns("/", "/login", "/css/**",
                "/fonts/**", "/images/**", "/js/**");
    }

    @Bean
    public ServletRegistrationBean myServlet() {
        //直接设置urlMapping路径
        return new ServletRegistrationBean(new MyServlet(), "/myservlet");
    }

    //    @Bean
    public ServletListenerRegistrationBean myListener() {
        return new ServletListenerRegistrationBean(new MyServletContextListener());
    }

//    @Bean
//    public FilterRegistrationBean myFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
//        //设置过滤规则
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/css/*"));
//        return filterRegistrationBean;
//    }

    // 最新版
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }


}
