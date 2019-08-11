package io.renren.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.entity.SysAppVersionEntity;

/**
 * app版本
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 16:26:02
 */
public interface SysAppVersionService extends IService<SysAppVersionEntity> {

    SysAppVersionEntity findOneDesc();
}

