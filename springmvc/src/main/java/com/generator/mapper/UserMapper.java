package com.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.generator.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 02-Darling
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-05-08 20:22:22
 * @Entity com.generator.pojo.User
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    @Insert("insert into user(username, password, nickname, sex, age)values (#{username}, #{password}, #{nickname}, " + "#{sex}, #{age})")
    void register(User user);
}



