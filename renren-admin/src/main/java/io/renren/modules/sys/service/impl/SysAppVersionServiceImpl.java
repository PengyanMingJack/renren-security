package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.SysAppVersionDao;
import io.renren.modules.sys.entity.SysAppVersionEntity;
import io.renren.modules.sys.service.SysAppVersionService;


@Service("sysAppVersionService")
public class SysAppVersionServiceImpl extends ServiceImpl<SysAppVersionDao, SysAppVersionEntity> implements SysAppVersionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysAppVersionEntity> page = this.page(
                new Query<SysAppVersionEntity>().getPage(params),
                new QueryWrapper<SysAppVersionEntity>()
        );

        return new PageUtils(page);
    }

}
