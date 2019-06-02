package com.ling.mybatis.begin.bean.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "请求参数基类")
public abstract class DglgRequestBase {
    @ApiModelProperty(value = "令牌")
    public String alt;
}
