/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package io.renren.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 版本更新表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@ApiModel(value = "版本更新表单")
public class VersionForm {
    private String appid;
}
