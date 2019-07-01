package com.guonl.utils;

import com.guonl.common.SnowFlake;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * Created by guonl
 * Date: 2019-06-21 16:00
 * Description: 用户工具类
 */
public class UserUtils {

    /**
     * 生成uuid
     * @return
     */
    public static synchronized String getUUID(){
        return UUID.randomUUID().toString();
    }


    /**
     * 生成雪花id
     * @return
     */
    public static Long getSnowId(){
        SnowFlake snowFlake = new SnowFlake(1, 1);
        return snowFlake.nextId();
    }

    /**
     * 获取分享url
     * @param id
     * @return
     */
    public static String getShareUrl(Long id){

        return String.valueOf(id);
    }

    /**
     * 用户手机号掩码
     * @param mobile
     * @return
     */
    public static String maskUserMobile(String mobile){
        if(StringUtils.isNotBlank(mobile)){
            mobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
        return mobile;
    }

    public static void main(String[] args) {
        String s = maskUserMobile("18221825926");
        System.out.println(s);
    }



}
