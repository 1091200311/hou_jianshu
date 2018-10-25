package com.soft1611.jianshu.service;

import com.soft1611.jianshu.core.Service;
import com.soft1611.jianshu.model.SysUser;
import com.soft1611.jianshu.model.dto.SysUserDTO;
import com.soft1611.jianshu.model.vo.SysUserVO;


/**
 * Created by taoranran on 2018/10/25.
 */
public interface SysUserService extends Service<SysUser> {
    SysUserVO login(SysUserDTO sysUserDTO);
}
