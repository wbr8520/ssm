package com.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.generator.mapper.UserMapper;
import com.generator.pojo.User;
import com.generator.service.UserService;
import org.springframework.stereotype.Service;
import util.model.UserModel;
import util.result.Result;

import javax.annotation.Resource;

/**
 * @author 02-Darling
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2022-05-08 20:22:22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result<?> login(UserModel userModel) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", userModel.getUsername())
                .eq("password", userModel.getPassword()));
        if (user != null) return Result.success("登录成功", userModel);
        return Result.error("用户名或密码不正确");
    }

    @Override
    public Result<?> register(User user) {
        User hasUser = userMapper.selectOne(new QueryWrapper<User>().eq("username", user.getUsername()));
        if (hasUser == null) {
            userMapper.register(user);
            return Result.success("注册成功", user);
        }
        return Result.error("用户已存在");
    }
}




