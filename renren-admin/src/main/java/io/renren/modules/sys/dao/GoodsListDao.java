package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.GoodsListEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类列表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@Mapper
public interface GoodsListDao extends BaseMapper<GoodsListEntity> {
	
}
