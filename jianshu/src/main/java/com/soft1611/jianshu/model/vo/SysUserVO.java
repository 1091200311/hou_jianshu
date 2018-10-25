package com.soft1611.jianshu.model.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysUserVO {
    private Integer userId;
    private String nickname;
    private String avatar;
    private String description;
    private Integer likeCount;
    private Integer wordsCount;
}
