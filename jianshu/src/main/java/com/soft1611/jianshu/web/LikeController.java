package com.soft1611.jianshu.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.soft1611.jianshu.core.Result;
import com.soft1611.jianshu.core.ResultGenerator;
import com.soft1611.jianshu.model.Like;
import com.soft1611.jianshu.service.LikeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by taoranran on 2018/10/25.
 */
@RestController
@RequestMapping("/like")
@CrossOrigin("http://localhost")
public class LikeController {
    @Resource
    private LikeService likeService;

    @PostMapping("/add")
    public Result add(@RequestBody Like like) {
        likeService.save(like);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        likeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Like> list = likeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
