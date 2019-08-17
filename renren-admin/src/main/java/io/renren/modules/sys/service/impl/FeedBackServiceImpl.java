package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.FeedBackDao;
import io.renren.modules.sys.entity.FeedBackEntity;
import io.renren.modules.sys.service.FeedBackService;


@Service("feedBackService")
public class FeedBackServiceImpl extends ServiceImpl<FeedBackDao, FeedBackEntity> implements FeedBackService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FeedBackEntity> page = this.page(
                new Query<FeedBackEntity>().getPage(params),
                new QueryWrapper<FeedBackEntity>()
        );

        return new PageUtils(page);
    }

}
