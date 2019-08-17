package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.entity.FeedBackEntity;
import io.renren.form.FeedBackFrom;
import io.renren.service.FeedBackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
@Api(tags = "意见反馈")
public class ApiFeedBackController {

    @Autowired
    private FeedBackService feedBackService;

    @PostMapping("feedBack")
    @ApiOperation("意见反馈")
    public R feedBack(@RequestBody FeedBackFrom from) {
        ValidatorUtils.validateEntity(from);

        FeedBackEntity feedBack = new FeedBackEntity();
        feedBack.setUserId(from.getUserId());
        feedBack.setContent(from.getContent());
        feedBack.setCreateTime(new Date());
        feedBackService.save(feedBack);

        return R.ok();

    }


}
