package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.service.SysAppTemplateService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-11-16 14:45:19
 */
@RestController
@RequestMapping("/api")
@Api(tags = "验证")
public class SysAppTemplateController {
    @Autowired
    private SysAppTemplateService sysAppTemplateService;


    /**
     * 列表
     */
    @GetMapping("common")
    @ApiOperation(value = "app开关验证")
    public R common(@RequestParam("appId") String appId) {
        if (sysAppTemplateService.verifyApp(appId)) {
            return R.ok();
        }
        return R.error();
    }


}
