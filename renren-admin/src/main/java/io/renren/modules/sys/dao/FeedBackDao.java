package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.FeedBackEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 意见反馈
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-17 19:25:04
 */
@Mapper
public interface FeedBackDao extends BaseMapper<FeedBackEntity> {
	
}
