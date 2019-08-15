package io.renren.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.dao.CategoryDao;
import io.renren.entity.CategoryEntity;
import io.renren.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public List<CategoryEntity> queryPage() {
        List<CategoryEntity> entityList = baseMapper.selectList(new QueryWrapper<CategoryEntity>());
        return entityList;
    }

}
