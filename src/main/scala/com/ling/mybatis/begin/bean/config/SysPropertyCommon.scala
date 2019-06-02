package com.ling.mybatis.begin.bean.config

import io.swagger.annotations.ApiModelProperty

// linglg：此类未必使用
// linglg：因为 trait 只是定义抽象字段，必须由子类实现
// linglg：所以并不能实现“字段”混入
trait SysPropertyCommon {

    @ApiModelProperty(value = "配置组")
    var sysGroup:String

    @ApiModelProperty(value = "配置项名")
    var sysKey:String

    @ApiModelProperty(value = "配置值")
    var sysValue:String

    @ApiModelProperty(value = "备注")
    var remark:String

    @ApiModelProperty(value = "是否启用。1，启用。0，不启用")
    var enable:Int

}
