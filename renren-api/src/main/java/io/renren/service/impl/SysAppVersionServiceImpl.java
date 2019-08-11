package io.renren.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.dao.SysAppVersionDao;
import io.renren.entity.SysAppVersionEntity;
import io.renren.service.SysAppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("sysAppVersionService")
public class SysAppVersionServiceImpl extends ServiceImpl<SysAppVersionDao, SysAppVersionEntity> implements SysAppVersionService {

    @Autowired
    SysAppVersionDao sysAppVersionDao;


    @Override
    public SysAppVersionEntity findOneDesc() {
        return sysAppVersionDao.findOneDesc();
    }
}
