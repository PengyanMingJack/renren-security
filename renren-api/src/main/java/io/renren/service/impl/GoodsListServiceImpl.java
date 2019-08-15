package io.renren.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.dao.GoodsListDao;
import io.renren.entity.GoodsListEntity;
import io.renren.service.GoodsListService;
import io.renren.service.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("goodsListService")
public class GoodsListServiceImpl extends ServiceImpl<GoodsListDao, GoodsListEntity> implements GoodsListService {

    @Override
    public PageUtils queryPage(Map<String, Object> params, int pid) {
        IPage<GoodsListEntity> page = this.page(
                new Query<GoodsListEntity>().getPage(params),
                new QueryWrapper<GoodsListEntity>().eq("pid", pid)
        );

        return new PageUtils(page);
    }

}
