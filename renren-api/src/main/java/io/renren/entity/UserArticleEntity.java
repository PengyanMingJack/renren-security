package io.renren.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserArticleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;
    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * id
     */
    private Integer id;
    /**
     * 用户
     */
    private Integer userId;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 图片地址
     */
    private String image;

    /**
     * 是否删除
     */
    private Integer status;
    /**
     * 经纬度
     */
    private String lnglat;
    /**
     * 位置
     */
    private String location;
}
