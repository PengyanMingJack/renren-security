package io.renren.controller;

import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;
import io.renren.entity.GoodsListEntity;
import io.renren.service.GoodsListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * 分类列表
 *
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2019-08-15 22:01:11
 */
@RestController
@RequestMapping("/goodslist")
public class GoodsListController {
    @Autowired
    private GoodsListService goodsListService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(String curPage, String limit, int pid) {
        Map<String, Object> params = new HashMap<>();
        params.put("curPage", curPage);
        params.put("limit", limit);
        PageUtils page = goodsListService.queryPage(params, pid);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info")
    public R info(@RequestParam Long id) {
        GoodsListEntity goodsList = goodsListService.getById(id);
        return R.ok().put("data", goodsList);
    }

    /**
     * 点赞
     */
    @RequestMapping("/praise")
    public R praise(@RequestParam Long id, Long userId) {
        GoodsListEntity goodsList = goodsListService.getById(id);
        goodsList.setLikeNum(goodsList.getLikeNum() + 1);
        goodsListService.updateById(goodsList);
        return R.ok().put("data", goodsList);
    }

    /**
     * 浏览
     */
    @RequestMapping("/look")
    public R look(@RequestParam Long id) {
        GoodsListEntity goodsList = goodsListService.getById(id);
        goodsList.setReadNum(goodsList.getReadNum() + 1);
        goodsListService.updateById(goodsList);
        return R.ok().put("data", goodsList);
    }
}
