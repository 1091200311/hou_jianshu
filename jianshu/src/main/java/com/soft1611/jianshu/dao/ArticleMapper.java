package com.soft1611.jianshu.dao;

import com.soft1611.jianshu.core.Mapper;
import com.soft1611.jianshu.model.Article;
import com.soft1611.jianshu.model.vo.ArticleVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper extends Mapper<Article> {

    @Select("SELECT a.article_id,a.title,a.summary,a.thumbnail,a.comments,a.likes,a.write_time,u.user_id,u.nickname" +
            " FROM article a LEFT JOIN sys_user u ON a.user_id = u.user_id ")
    List<ArticleVO> getHotArticles();
}