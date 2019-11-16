package io.renren.controller;

import io.renren.common.utils.R;
import io.renren.entity.CategoryEntity;
import io.renren.service.CategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 分类标题
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@RestController
@RequestMapping("/zyf/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @ApiOperation(value = "获取分类列表")
    public R list() {
        List<CategoryEntity> list = categoryService.queryPage();
        return R.ok().put("page", list);
    }

}
