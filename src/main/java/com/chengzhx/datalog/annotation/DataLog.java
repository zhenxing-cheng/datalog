package com.chengzhx.datalog.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 数据日志注解
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataLog {
    /**
     * sPel表达式1
     */
    String sPel1() default "";

    /**
     * sPel表达式2
     */
    String sPel2() default "";

    /**
     * sPel表达式3
     */
    String sPel3() default "";

    /**
     * 类型
     * @return int
     */
    int type() default -1;

    /**
     * 标签
     * @return java.lang.String
     */
    String tag() default "";

    /**
     * 注释
     *
     * @return java.lang.String
     */
    String note() default "";
}
