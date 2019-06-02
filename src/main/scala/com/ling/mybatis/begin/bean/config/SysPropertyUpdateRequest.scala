package com.ling.mybatis.begin.bean.config

import com.ling.mybatis.begin.bean.common.UpdateRequestBase
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

import scala.annotation.meta.field
import scala.beans.BeanProperty

@ApiModel(description = "更新系统配置")
class SysPropertyUpdateRequest(
                                @BeanProperty
                                var seqId:Long=0
                                ,
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
      ) extends UpdateRequestBase {

}
