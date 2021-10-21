package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//与配置文件绑定，配置文件的前缀是pet
@ConfigurationProperties(prefix = "pet")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pet {
    private String name;
    private Integer age;
    private List<String> list;
    private Map<String, String> map;
}
