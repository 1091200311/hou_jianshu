package com.soft1611.jianshu.service.impl;

import com.soft1611.jianshu.core.AbstractService;
import com.soft1611.jianshu.dao.LikeMapper;
import com.soft1611.jianshu.model.Like;
import com.soft1611.jianshu.service.LikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by taoranran on 2018/10/25.
 */
@Service
@Transactional
public class LikeServiceImpl extends AbstractService<Like> implements LikeService {
    @Resource
    private LikeMapper likeMapper;

}
