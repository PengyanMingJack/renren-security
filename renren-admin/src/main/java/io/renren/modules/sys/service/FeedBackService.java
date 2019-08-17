package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.FeedBackEntity;

import java.util.Map;

/**
 * 意见反馈
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-17 19:25:04
 */
public interface FeedBackService extends IService<FeedBackEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

