package io.renren.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.dao.ArticleDao;
import io.renren.entity.ArticleEntity;
import io.renren.entity.UserArticleEntity;
import io.renren.service.ArticleService;
import io.renren.service.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, ArticleEntity> implements ArticleService {
    @Override
    public  List<UserArticleEntity> getListUserArticle() {

        return baseMapper.getListUserArticle();
    }

    @Override
    public List<UserArticleEntity> getListArticleByUserId(Integer userId) {

        return baseMapper.getListByUserId(userId);
    }


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ArticleEntity> page;
        page = this.page(
                new Query<ArticleEntity>().getPage(params),
                new QueryWrapper<ArticleEntity>()
        );
        return new PageUtils(page);
    }

}
