package io.renren.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.entity.ArticleEntity;
import io.renren.entity.UserEntity;
import io.renren.service.ArticleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;


/**
 * 文章管理
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 18:06:56
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 列表
     */
    @GetMapping("list")
    @ApiOperation(value = "获取列表")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = articleService.queryPage(params);
        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("info/{id}")
    public R info(@PathVariable("id") Integer id) {
        ArticleEntity article = articleService.getById(id);
        return R.ok().put("data", article);
    }

    /**
     * 保存
     */
    @RequestMapping("save")
    @ApiOperation("保存")
    public R save(@RequestBody ArticleEntity article) {
        article.setCreateTime(new Date());
        articleService.save(article);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("update")
    @ApiOperation("修改")
    public R update(@RequestBody ArticleEntity article) {
        ValidatorUtils.validateEntity(article);
        articleService.updateById(article);

        return R.ok();
    }

    /**
     * 删除
     */
    @GetMapping("delete")
    @ApiOperation("删除")
    public R delete(@RequestBody Integer[] ids) {
        articleService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
