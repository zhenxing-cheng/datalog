package com.chengzhx.datalog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 忽略日志记录注解,
 * 使用该注解的表或字段将不进行修改记录
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface IgnoreDataLog {
}
