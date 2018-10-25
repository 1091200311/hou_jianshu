package com.soft1611.jianshu.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * 文章视图
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArticleVO {
    private Integer articleId;
    private String title;
    private String summary;
    private String thumbnail;
    private Integer comments;
    private Integer likes;
    private Timestamp writeTime;
    private Integer userId;
    private String nickname;
}
