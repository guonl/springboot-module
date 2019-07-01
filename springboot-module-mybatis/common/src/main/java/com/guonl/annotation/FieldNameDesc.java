package com.guonl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by guonl
 * Date: 2019-05-14 16:47
 * Description: 这个注解用于说明字段的含义
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldNameDesc {
    String column() default "";//数据库对应的字段
    String desc() default "";//字段描述
}
