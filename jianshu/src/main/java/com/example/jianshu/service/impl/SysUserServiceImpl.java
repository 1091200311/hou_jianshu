package com.example.jianshu.service.impl;

import com.example.jianshu.dao.SysUserRepository;
import com.example.jianshu.entity.LoginUser;
import com.example.jianshu.entity.SysUser;
import com.example.jianshu.service.SysUserService;
import com.example.jianshu.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserRepository sysUserRepositry;

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        SysUser sysUser = sysUserRepositry.findSysUserByEmail(loginUser.getEmail());
        //邮箱有效
        if (sysUser != null) {
            //判断密码是否正确
            if (loginUser.getPassword().equals(sysUser.getPassword())) {
                return new ResponseUtil(0, "login success", sysUser);
            } else {
                return new ResponseUtil(0, "password wrong");
            }
        } else {
            return new ResponseUtil(0, "email wrong");
        }
    }

    @Override
    public List<SysUser> getHotUsers() {
        return sysUserRepositry.findHotUsers();
    }
}
