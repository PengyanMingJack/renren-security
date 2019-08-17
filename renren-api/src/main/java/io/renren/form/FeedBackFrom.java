package io.renren.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class FeedBackFrom  {
    @ApiModelProperty(value = "用户")
    @NotNull(message="用户不能为空")
    private Integer userId;

    @ApiModelProperty(value = "反馈内容")
    @NotBlank(message="反馈内容")
    private String content;
}
