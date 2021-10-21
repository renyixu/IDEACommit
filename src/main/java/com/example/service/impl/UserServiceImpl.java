package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.example.mapper.PersonMapper;
import com.example.mapper.UserMapper;
import com.example.pojo.Person;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Person>
        implements UserService {
}
