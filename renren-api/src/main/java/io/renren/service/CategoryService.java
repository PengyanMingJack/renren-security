package io.renren.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 分类标题
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
public interface CategoryService extends IService<CategoryEntity> {

    List<CategoryEntity> queryPage();
}

