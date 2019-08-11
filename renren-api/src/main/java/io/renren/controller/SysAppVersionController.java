package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.entity.SysAppVersionEntity;
import io.renren.service.SysAppVersionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * app版本
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:26:02
 */
@RestController
@RequestMapping("/api")
public class SysAppVersionController {
    @Autowired
    private SysAppVersionService sysAppVersionService;

    /**
     * 查询最新版本
     */
    @GetMapping("getApp")
    @ApiOperation("获取app版本")
    public R find() {
        SysAppVersionEntity oneDesc = sysAppVersionService.findOneDesc();

        return R.ok().put("data", oneDesc);
    }


}
