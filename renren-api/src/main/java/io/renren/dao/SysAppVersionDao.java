package io.renren.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.entity.SysAppVersionEntity;
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

    SysAppVersionEntity findOneDesc();
}
