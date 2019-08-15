package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 分类标题
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@Data
@TableName("tb_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 分类id
	 */
	private Integer sortId;
	/**
	 * 分类标题
	 */
	private String sortTitle;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 是否删除
	 */
	private Integer idDeleted;

}
