package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * app版本
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:09:20
 */
@Data
@TableName("sys_app_version")
public class SysAppVersionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 版本号
	 */
	private String versionCode;
	/**
	 * 下载地址
	 */
	private String apkUrl;
	/**
	 * 版本说明
	 */
	private String content;
	/**
	 * 0 强制更新 1不强制
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;

}
