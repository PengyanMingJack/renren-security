package io.renren.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.dao.SysAppTemplateDao;
import io.renren.entity.SysAppTemplateEntity;
import io.renren.service.SysAppTemplateService;
import org.springframework.stereotype.Service;


@Service("sysAppTemplateService")
public class SysAppTemplateServiceImpl extends ServiceImpl<SysAppTemplateDao, SysAppTemplateEntity> implements SysAppTemplateService {


    @Override
    public boolean verifyApp(String templateId) {
        SysAppTemplateEntity templateEntity = baseMapper.selectOne(new QueryWrapper<SysAppTemplateEntity>()
                .lambda().eq(SysAppTemplateEntity::getTemplateId, templateId));
        if(templateEntity==null){
            return false;
        }
        if (templateEntity.getIsOpen() == 1) {
           return false;
        }

        return true;
    }
}
