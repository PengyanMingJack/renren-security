package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.ArticleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章管理
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 18:06:56
 */
@Mapper
public interface ArticleDao extends BaseMapper<ArticleEntity> {
	
}
