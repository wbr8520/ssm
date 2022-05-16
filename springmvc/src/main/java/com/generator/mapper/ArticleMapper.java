package com.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.generator.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 02-Darling
 * @description 针对表【article】的数据库操作Mapper
 * @createDate 2022-05-08 21:07:00
 * @Entity com.generator.pojo.Article
 */
@Mapper
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    @Select(" select *from article where uid = #{sy}")
    List<Article> selectByUid(int Uid);
}




