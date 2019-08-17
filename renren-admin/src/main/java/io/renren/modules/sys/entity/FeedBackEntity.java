package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 意见反馈
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-17 19:25:04
 */
@Data
@TableName("tb_feed_back")
public class FeedBackEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 反馈内容
	 */
	private String content;
	/**
	 * 反馈时间
	 */
	private Date createTime;

}
