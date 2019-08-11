package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.SysAppVersionEntity;

import java.util.Map;

/**
 * app版本
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:09:20
 */
public interface SysAppVersionService extends IService<SysAppVersionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

