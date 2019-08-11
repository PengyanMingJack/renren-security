package io.renren.modules.sys.dao;

import io.renren.modules.sys.entity.SysAppVersionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * app版本
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:09:20
 */
@Mapper
public interface SysAppVersionDao extends BaseMapper<SysAppVersionEntity> {
	
}
