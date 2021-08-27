package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor //无参构造函数
@AllArgsConstructor //全参构造函数
@Data //get、set方法
@ToString //toString方法
public class Computer {
    private String name;
    private Double price;
}
