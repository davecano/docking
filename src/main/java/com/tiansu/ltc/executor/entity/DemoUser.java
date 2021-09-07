package com.tiansu.ltc.executor.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class DemoUser {


    @ApiModelProperty(notes = "id")
    private Integer id;

    @ApiModelProperty(notes = "姓名",required = true,example = "admin")
    private String name;

    @ApiModelProperty(notes = "密码",required = true,example = "123456")
    private String password;


}
