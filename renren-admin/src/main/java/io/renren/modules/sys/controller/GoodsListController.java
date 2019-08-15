package io.renren.modules.sys.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.modules.sys.entity.GoodsListEntity;
import io.renren.modules.sys.service.GoodsListService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;


/**
 * 分类列表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@RestController
@RequestMapping("sys/goodslist")
public class GoodsListController {
    @Autowired
    private GoodsListService goodsListService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:goodslist:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = goodsListService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:goodslist:info")
    public R info(@PathVariable("id") Long id) {
        GoodsListEntity goodsList = goodsListService.getById(id);

        return R.ok().put("goodsList", goodsList);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:goodslist:save")
    public R save(@RequestBody GoodsListEntity goodsList) {
        goodsList.setCreateTime(new Date());
        goodsListService.save(goodsList);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:goodslist:update")
    public R update(@RequestBody GoodsListEntity goodsList) {
        ValidatorUtils.validateEntity(goodsList);
        goodsList.setCreateTime(new Date());
        goodsListService.updateById(goodsList);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:goodslist:delete")
    public R delete(@RequestBody Long[] ids) {
        goodsListService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
