package com.example.mapper;

import com.example.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {
    Person getPersonById(Integer pid);

    @Select("select * from person")
    List<Person> getAllPerson();
}
