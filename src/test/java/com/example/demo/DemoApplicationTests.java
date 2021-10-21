package com.example.demo;

import com.example.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@Slf4j
@SpringBootTest
class DemoApplicationTests {
    //JdbcTemplate对象是容器中本身就有的，所以可以直接获取
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject(
                "select count(*) from person", Long.class);
        log.info("记录总数是:" + aLong);
        System.out.println(dataSource.getClass());
    }

    @Test
    public void redisTest() {
        ValueOperations<String, String> ope = redisTemplate.opsForValue();
        ope.set("name", "许仁益");
        System.out.println(ope.get("name"));
    }
}
