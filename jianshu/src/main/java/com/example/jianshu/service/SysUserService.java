package com.example.jianshu.service;

import com.example.jianshu.entity.LoginUser;
import com.example.jianshu.entity.SysUser;
import com.example.jianshu.utils.ResponseUtil;

import java.util.List;

public interface SysUserService {
    ResponseUtil userLogin(LoginUser loginUser);

    List<SysUser> getHotUsers();
}
