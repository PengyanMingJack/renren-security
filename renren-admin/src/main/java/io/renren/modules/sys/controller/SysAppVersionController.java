package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.SysAppVersionEntity;
import io.renren.modules.sys.service.SysAppVersionService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;


/**
 * app版本
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:09:20
 */
@RestController
@RequestMapping("sys/sysappversion")
public class SysAppVersionController {
    @Autowired
    private SysAppVersionService sysAppVersionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:sysappversion:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = sysAppVersionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:sysappversion:info")
    public R info(@PathVariable("id") Integer id) {
        SysAppVersionEntity sysAppVersion = sysAppVersionService.getById(id);

        return R.ok().put("sysAppVersion", sysAppVersion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:sysappversion:save")
    public R save(@RequestBody SysAppVersionEntity sysAppVersion) {
        sysAppVersion.setCreateTime(new Date());
        sysAppVersionService.save(sysAppVersion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:sysappversion:update")
    public R update(@RequestBody SysAppVersionEntity sysAppVersion) {
        ValidatorUtils.validateEntity(sysAppVersion);
        sysAppVersionService.updateById(sysAppVersion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:sysappversion:delete")
    public R delete(@RequestBody Integer[] ids) {
        sysAppVersionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
