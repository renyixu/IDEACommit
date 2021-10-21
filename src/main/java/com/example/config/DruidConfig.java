package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

@Deprecated
//@Configuration
public class DruidConfig {

//    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        //Druid内置提供一个StatFilter，用于统计监控信息
        druidDataSource.setFilters("stat,wall");
        return druidDataSource;
    }

    /**
     * 配置druid的监控页功能
     */
//    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
        return new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
    }

    /**
     * WebStatFilter用于采集web-jdbc关联监控的数据
     *
     * @return
     */
//    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
