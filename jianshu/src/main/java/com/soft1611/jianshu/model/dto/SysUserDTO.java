package com.soft1611.jianshu.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysUserDTO {
    private String email;
    private String password;
}
