package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类标题
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
