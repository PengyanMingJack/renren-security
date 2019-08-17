package io.renren.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.dao.FeedBackDao;
import io.renren.entity.FeedBackEntity;
import io.renren.service.FeedBackService;
import org.springframework.stereotype.Service;

@Service("feedBackService")
public class FeedBackServiceImpl extends ServiceImpl<FeedBackDao, FeedBackEntity> implements FeedBackService {

}
