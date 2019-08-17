package io.renren.form;

import io.renren.entity.FeedBackEntity;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class FeedBackFrom extends FeedBackEntity {
    @ApiModelProperty(value = "用户")
    @NotBlank(message="用户不能为空")
    private String userId;

    @ApiModelProperty(value = "反馈内容")
    @NotBlank(message="反馈内容")
    private String password;
}
