package com.kinbo.boot2deep.dao;

import com.kinbo.boot2deep.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where name=#{name}")
    User findByName(String name);

    @Insert("insert into user(name, age) values(#{name}, #{age})")
    int insertOne(String name, int age);

}
