package com.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.generator.pojo.User;
import util.model.UserModel;
import util.result.Result;

/**
 * @author 02-Darling
 * @description 针对表【user】的数据库操作Service
 * @createDate 2022-05-08 20:22:22
 */
public interface UserService extends IService<User> {
    Result<?> login(UserModel userModel);

    Result<?> register(User user);
}