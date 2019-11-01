/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.oss.cloud;

import com.aliyun.oss.OSSClient;
import io.renren.common.exception.RRException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * 阿里云存储
 *
 * @author Mark sunlightcs@gmail.com
 */
public class AliyunCloudStorageService extends CloudStorageService {

    //阿里云绑定的域名
    private String aliyunDomain = "http://zyf-p.oss-cn-shenzhen.aliyuncs.com";
    private String aliyunPrefix;
    //阿里云EndPoint不能为空
    private String aliyunEndPoint = "oss-cn-shenzhen.aliyuncs.com";
    //阿里云AccessKeyId不能为空
    private String aliyunAccessKeyId = "LTAIR52FNGiDnd1Z";
    //阿里云AccessKeySecret不能为空
    private String aliyunAccessKeySecret = "Y9lKdk3gyjErBDh1xDcU8uVZMAgdJ7";
    //阿里云BucketName不能为空
    private String aliyunBucketName = "zyf-p";
    private OSSClient client;


    public AliyunCloudStorageService() {
        //初始化
        init();
    }


    private void init() {
        client = new OSSClient(aliyunEndPoint, aliyunAccessKeyId,
                aliyunAccessKeySecret);
    }

    @Override
    public String upload(byte[] data, String path) {
        return upload(new ByteArrayInputStream(data), path);
    }

    @Override
    public String upload(InputStream inputStream, String path) {
        try {
            client.putObject(aliyunBucketName, path, inputStream);
        } catch (Exception e) {
            throw new RRException("上传文件失败，请检查配置信息", e);
        }

        return aliyunDomain + "/" + path;
    }

    @Override
    public String uploadSuffix(byte[] data, String suffix) {
        return upload(data, getPath(aliyunPrefix, suffix));
    }

    @Override
    public String uploadSuffix(InputStream inputStream, String suffix) {
        return upload(inputStream, getPath(aliyunPrefix, suffix));
    }
}
