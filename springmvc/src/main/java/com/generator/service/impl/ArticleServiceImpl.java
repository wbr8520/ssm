package com.generator.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.generator.mapper.ArticleMapper;
import com.generator.mapper.UserMapper;
import com.generator.pojo.Article;
import com.generator.pojo.User;
import com.generator.service.ArticleService;
import org.springframework.stereotype.Service;
import util.model.ArticleModel;
import util.model.UserModel;
import util.result.Result;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 02-Darling
 * @description 针对表【article】的数据库操作Service实现
 * @createDate 2022-05-08 21:07:00
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
        implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private UserMapper userMapper;

    @Override
    public Result<?> onload(UserModel userModel) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", userModel.getUsername())
                .eq("password", userModel.getPassword()));
        List<Article> articleList = articleMapper.selectByUid(user.getUid());
        // 数据封装
        List<ArticleModel> list = new ArrayList<>();
        for (Article article : articleList) {
            list.add(new ArticleModel(article.getAid(), article.getTitle(), article.getText()));
        }
        // System.out.println(list);
        return Result.success("加载成功", list);
    }
}




