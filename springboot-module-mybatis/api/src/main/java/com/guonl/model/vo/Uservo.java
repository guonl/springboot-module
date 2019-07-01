package com.guonl.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by guonl
 * Date: 2019-07-01 14:10
 * Description:
 */
@Data
public class Uservo {

    private Integer id;

    private String username;

    private String mobile;

    private String openid;

    private String mallCode;

    private Date activeTime;

    private Integer plusLevelId;

    private String plusLevelName;

    private Integer plusStatus;

    private Integer operateStatus;

    private Date createdAt;

    private Date updatedAt;

    private Boolean isDel;
}
