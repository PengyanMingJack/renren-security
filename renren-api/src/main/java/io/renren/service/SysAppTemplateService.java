package io.renren.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.entity.SysAppTemplateEntity;

/**
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-11-16 14:45:19
 */
public interface SysAppTemplateService extends IService<SysAppTemplateEntity> {

    boolean verifyApp(String templateId);

}

