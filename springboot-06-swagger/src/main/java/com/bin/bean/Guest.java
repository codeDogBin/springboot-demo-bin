package com.bin.bean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类 代表嘉宾
 * @ApiModel("嘉宾") 声明实例
 *
 * @ApiModelProperty("名字") 声明属性
 */
@Data @AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {
    @ApiModelProperty("名字")
    private String name;
    @ApiModelProperty("角色")
    private String role;
}
