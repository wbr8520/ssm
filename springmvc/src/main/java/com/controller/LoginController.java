package com.controller;

import com.generator.pojo.User;
import com.generator.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.model.UserModel;
import util.result.Result;

import javax.annotation.Resource;

/**
 * @Author WangBinRen
 * @Date 2022/5/8 20:18
 */
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    public Result<?> login(String username, String password) {
        return userService.login(new UserModel(username, password));
    }

    @GetMapping("/register")
    public Result<?> register(String username, String password, String nickname, String sex, int age) {
        return userService.register(new User(username, password, nickname, sex, age));
    }

}
