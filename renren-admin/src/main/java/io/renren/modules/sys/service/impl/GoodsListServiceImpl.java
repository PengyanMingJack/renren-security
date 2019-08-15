package io.renren.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.sys.dao.GoodsListDao;
import io.renren.modules.sys.entity.GoodsListEntity;
import io.renren.modules.sys.service.GoodsListService;


@Service("goodsListService")
public class GoodsListServiceImpl extends ServiceImpl<GoodsListDao, GoodsListEntity> implements GoodsListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GoodsListEntity> page = this.page(
                new Query<GoodsListEntity>().getPage(params),
                new QueryWrapper<GoodsListEntity>()
        );

        return new PageUtils(page);
    }

}
