package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.GoodsListEntity;

import java.util.Map;

/**
 * 分类列表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
public interface GoodsListService extends IService<GoodsListEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

