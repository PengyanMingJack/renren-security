package io.renren.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.common.validator.ValidatorUtils;
import io.renren.entity.ArticleEntity;
import io.renren.entity.UserArticleEntity;
import io.renren.entity.UserEntity;
import io.renren.form.ArticleFrom;
import io.renren.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * 文章
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 18:06:56
 */
@RestController
@RequestMapping("/article")
@Api(tags="文章")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 列表
     */
    @GetMapping("list")
    @ApiOperation(value = "获取列表")
    public R list() {
        List<UserArticleEntity> listUserArticle = articleService.getListUserArticle();

        return R.ok().put("list", listUserArticle);
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
     * 发布
     */
    @PostMapping("save")
    @ApiOperation("发布")
    public R save(@RequestBody ArticleFrom from) {
        ArticleEntity article = new ArticleEntity();
        article.setUserId(from.getUserId());
        article.setContent(from.getContent());
        article.setLnglat(from.getLnglat());
        article.setImage(from.getImage());
        article.setCreateTime(new Date());
        articleService.save(article);
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
