package com.guonl.service;

import com.github.pagehelper.PageInfo;
import com.guonl.model.vo.Uservo;

import java.util.List;

/**
 * Created by guonl
 * Date: 2019-07-01 14:04
 * Description:
 */
public interface IUserService {
    PageInfo<List<Uservo>> queryUserByPage(Integer pn, Integer ps);

}
