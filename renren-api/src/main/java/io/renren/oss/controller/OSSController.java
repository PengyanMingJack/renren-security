package io.renren.oss.controller;

import io.renren.common.exception.RRException;
import io.renren.common.utils.R;
import io.renren.oss.cloud.OSSFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("oss")
public class OSSController {

    /**
     * 上传文件
     */
    @RequestMapping("/upload")
    public R upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new RRException("上传文件不能为空");
        }
        //文件后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);
        return R.ok().put("url", url);
    }
}
