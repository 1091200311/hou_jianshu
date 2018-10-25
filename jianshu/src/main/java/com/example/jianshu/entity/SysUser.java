package com.example.jianshu.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@Builder
public class SysUser {
    @Id
    @GeneratedValue
    private Integer userId;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String nickname;
    private String avatar;
    private String description;
    private Integer wordsCount;
    private Integer likeCount;

}
