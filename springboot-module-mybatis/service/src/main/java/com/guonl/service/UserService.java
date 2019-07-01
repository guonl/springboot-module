package com.guonl.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guonl.dao.PlusUserMapper;
import com.guonl.model.PlusUser;
import com.guonl.model.PlusUserExample;
import com.guonl.model.vo.Uservo;
import com.guonl.utils.UserUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guonl
 * Date: 2019-07-01 14:04
 * Description:
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private PlusUserMapper userMapper;

    @Override
    public PageInfo queryUserByPage(Integer pn, Integer ps) {
        PlusUserExample example = new PlusUserExample();
        PlusUserExample.Criteria criteria = example.createCriteria();
        criteria.andIsDelEqualTo(Boolean.FALSE);
        PageHelper.startPage(pn,ps);
        List<PlusUser> plusUsers = userMapper.selectByExample(example);
        List<Uservo> result = new ArrayList<>();
        plusUsers.forEach(x->{
            Uservo vo = new Uservo();
            BeanUtils.copyProperties(x,vo);
            vo.setMobile(UserUtils.maskUserMobile(x.getMobile()));
            result.add(vo);
        });
        PageInfo pageInfo = new PageInfo(plusUsers);
        pageInfo.setList(result);
        return pageInfo;
    }


}
