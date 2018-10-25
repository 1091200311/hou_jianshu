package com.soft1611.jianshu.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Like {
    @Id
    @Column(name = "like_id")
    private Integer likeId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "article_id")
    private Integer articleId;

    /**
     * @return like_id
     */
    public Integer getLikeId() {
        return likeId;
    }

    /**
     * @param likeId
     */
    public void setLikeId(Integer likeId) {
        this.likeId = likeId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }
}