package io.renren.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.entity.ArticleEntity;
import io.renren.entity.UserArticleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文章管理
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-11 18:06:56
 */
@Mapper
public interface ArticleDao extends BaseMapper<ArticleEntity> {

    List<UserArticleEntity> getListUserArticle();

    List<UserArticleEntity> getListByUserId(Integer userId);
}
