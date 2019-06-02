package com.ling.mybatis.begin.bean.config

import com.ling.mybatis.begin.bean.common.CreateRequestBase
import io.swagger.annotations.{ApiModel, ApiModelProperty}

import scala.annotation.meta.field
import scala.beans.BeanProperty

@ApiModel(description = "创建系统配置")
class SysPropertyCreateRequest(
                                @BeanProperty
                                @(ApiModelProperty @field)(value = "配置组")
                                var sysGroup:String=null
                                ,
                                @BeanProperty
                                @(ApiModelProperty @field)(value = "配置项名")
                                var sysKey:String=null
                                ,
                                @BeanProperty
                                @(ApiModelProperty @field)(value = "配置值")
                                var sysValue:String=null
                                ,
                                @BeanProperty
                                @(ApiModelProperty @field)(value = "备注")
                                var remark:String=null
                                ,
                                @BeanProperty
                                @(ApiModelProperty @field)(value = "是否启用。1，启用。0，不启用")
                                var enable:Int=1
      ) extends CreateRequestBase {

    // =======================
    def toSysProperty():SysProperty = {
        val sysProperty = new SysProperty()
        sysProperty.sysGroup = sysGroup
        sysProperty.sysKey = sysKey
        sysProperty.sysValue = sysValue
        sysProperty.remark = remark
        sysProperty.enable = enable
        sysProperty.createBy = createBy
        sysProperty
    }
}
