package com.soft1611.jianshu.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Collections {
    @Id
    @Column(name = "collection_id")
    private Integer collectionId;

    @Column(name = "article_count")
    private Integer articleCount;

    @Column(name = "collection_name")
    private String collectionName;

    @Column(name = "collection_url")
    private String collectionUrl;

    @Column(name = "fans_count")
    private Integer fansCount;

    private String summary;

    /**
     * @return collection_id
     */
    public Integer getCollectionId() {
        return collectionId;
    }

    /**
     * @param collectionId
     */
    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * @return article_count
     */
    public Integer getArticleCount() {
        return articleCount;
    }

    /**
     * @param articleCount
     */
    public void setArticleCount(Integer articleCount) {
        this.articleCount = articleCount;
    }

    /**
     * @return collection_name
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * @param collectionName
     */
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * @return collection_url
     */
    public String getCollectionUrl() {
        return collectionUrl;
    }

    /**
     * @param collectionUrl
     */
    public void setCollectionUrl(String collectionUrl) {
        this.collectionUrl = collectionUrl;
    }

    /**
     * @return fans_count
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * @param fansCount
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}