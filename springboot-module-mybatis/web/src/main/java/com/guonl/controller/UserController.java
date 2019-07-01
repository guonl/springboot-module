package com.guonl.controller;

import com.github.pagehelper.PageInfo;
import com.guonl.model.vo.Uservo;
import com.guonl.service.IUserService;
import com.guonl.vo.FrontResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guonl
 * Date: 2019-07-01 13:58
 * Description: 用户api
 */
@Api(value = "user-controller", description = "用户接口")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "查询用户列表-分页")
    @RequestMapping(value = "/queryUserByPage", method = RequestMethod.POST)
    public FrontResult<PageInfo> queryUserByPage(@ApiParam(name = "pn", value = "当前第几页", required = true)
                                     @RequestParam(name = "pn", required = true, defaultValue = "1") Integer pn,
                                     @ApiParam(name = "ps", value = "每页的大小", required = true)
                                     @RequestParam(name = "ps", required = true, defaultValue = "20") Integer ps) {

        if (pn == null || ps == null) {
            return FrontResult.error(-1, "分页参数不能为空");
        }
        PageInfo<List<Uservo>> pageInfo = userService.queryUserByPage(pn, ps);
        return FrontResult.success(pageInfo);
    }

}
