package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.form.FeedBackFrom;
import io.renren.service.FeedBackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(tags = "意见反馈")
public class ApiFeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @PostMapping("feedBack")
    @ApiOperation("意见反馈")
    public R feedBack(@RequestBody FeedBackFrom from) {
        feedBackService.save(from);

        return R.ok();

    }


}
