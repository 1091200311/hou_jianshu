package com.soft1611.jianshu.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.soft1611.jianshu.core.Result;
import com.soft1611.jianshu.core.ResultGenerator;
import com.soft1611.jianshu.model.Collections;
import com.soft1611.jianshu.service.CollectionsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by taoranran on 2018/10/25.
 */
@RestController
@RequestMapping("/collections")
public class CollectionsController {
    @Resource
    private CollectionsService collectionsService;

    @PostMapping("/add")
    public Result add(@RequestBody Collections collections) {
        collectionsService.save(collections);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        collectionsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Collections collections) {
        collectionsService.update(collections);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id) {
        Collections collections = collectionsService.findById(id);
        return ResultGenerator.genSuccessResult(collections);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Collections> list = collectionsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
