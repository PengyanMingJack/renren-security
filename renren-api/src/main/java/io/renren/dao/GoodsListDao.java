package io.renren.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.entity.GoodsListEntity;
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
