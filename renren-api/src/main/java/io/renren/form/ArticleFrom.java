package io.renren.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class ArticleFrom {

    @ApiModelProperty(value = "用户id")
    @NotBlank(message = "用户不能为空")
    private Integer userId;

    @ApiModelProperty(value = "文章内容")
    private String content;


    @ApiModelProperty(value = "图片地址")
    private String image;

    @ApiModelProperty(value = "经纬度")
    private String lnglat;

    @ApiModelProperty(value = "位置")
    private String location;
}
