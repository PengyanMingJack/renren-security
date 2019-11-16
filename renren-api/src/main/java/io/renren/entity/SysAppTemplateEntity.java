package io.renren.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-11-16 14:45:19
 */
@Data
@TableName("sys_app_template")
public class SysAppTemplateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * app模板id
	 */
	private String templateId;
	/**
	 * 0打开 1关闭
	 */
	private Integer isOpen;
	/**
	 * 创建时间
	 */
	private Date createTime;


}
