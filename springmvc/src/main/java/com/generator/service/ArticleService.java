package com.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.generator.pojo.Article;
import util.model.UserModel;
import util.result.Result;

/**
 * @author 02-Darling
 * @description 针对表【article】的数据库操作Service
 * @createDate 2022-05-08 21:07:00
 */
public interface ArticleService extends IService<Article> {
    Result<?> onload(UserModel userModel);
}
