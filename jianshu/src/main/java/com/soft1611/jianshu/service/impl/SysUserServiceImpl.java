package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.SysUserMapper;
import com.soft1611.jianshu.model.SysUser;
import com.soft1611.jianshu.model.dto.SysUserDTO;
import com.soft1611.jianshu.model.vo.SysUserVO;
import com.soft1611.jianshu.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserVO login(SysUserDTO sysUserDTO) {
//        SysUser sysUser = new SysUser();
//        sysUser.setEmail(sysUserDTO.getEmail());
//        SysUser sysUser1 = sysUserMapper.selectOne(sysUser);
//        if(sysUser1!=null){
//            if(sysUser1.getPassword().equals(sysUserDTO.getPassword())){
//                SysUserVO sysUserVO  = new SysUserVO();
//            }
//        }
        return null;
    }
}
