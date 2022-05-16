package com.controller;

import com.generator.service.ArticleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.model.UserModel;
import util.result.Result;

import javax.annotation.Resource;

/**
 * @Author WangBinRen
 * @Date 2022/5/8 20:19
 */
@CrossOrigin
@RestController
@RequestMapping("/home")
public class HomeController {
    @Resource
    private ArticleService articleService;

    @PostMapping("/onloadArticle")
    public Result<?> login(String username, String password) {
        return articleService.onload(new UserModel(username, password));
    }
}
