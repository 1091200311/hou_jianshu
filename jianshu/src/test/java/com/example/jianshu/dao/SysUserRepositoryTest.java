package com.example.jianshu.dao;
import com.example.jianshu.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserRepositoryTest {
    @Resource
    private SysUserRepository sysUserRepository;

    @Test
    public void findSysUserByEmail() {
        SysUser sysUser = sysUserRepository.findSysUserByEmail("aaa@qq.com");
        if (sysUser != null) {
            System.out.println(sysUser);
        }
    }

}