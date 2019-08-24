package io.renren.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.entity.ArticleEntity;
import io.renren.entity.UserArticleEntity;

import java.util.List;
import java.util.Map;

/**
 * 文章管理
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 18:06:56
 */
public interface ArticleService extends IService<ArticleEntity> {
    List<UserArticleEntity> getListUserArticle();

    PageUtils queryPage(Map<String, Object> params);
}

