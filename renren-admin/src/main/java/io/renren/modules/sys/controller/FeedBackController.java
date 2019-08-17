package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.FeedBackEntity;
import io.renren.modules.sys.service.FeedBackService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 意见反馈
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-17 19:25:04
 */
@RestController
@RequestMapping("sys/feedback")
public class FeedBackController {
    @Autowired
    private FeedBackService feedBackService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:feedback:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = feedBackService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:feedback:info")
    public R info(@PathVariable("id") Integer id){
        FeedBackEntity feedBack = feedBackService.getById(id);

        return R.ok().put("feedBack", feedBack);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:feedback:save")
    public R save(@RequestBody FeedBackEntity feedBack){
        feedBackService.save(feedBack);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:feedback:update")
    public R update(@RequestBody FeedBackEntity feedBack){
        ValidatorUtils.validateEntity(feedBack);
        feedBackService.updateById(feedBack);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:feedback:delete")
    public R delete(@RequestBody Integer[] ids){
        feedBackService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
