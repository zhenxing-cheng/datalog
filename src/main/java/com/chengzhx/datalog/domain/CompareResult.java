package com.chengzhx.datalog.domain;

import lombok.Data;

/**
 * Description: 数据对比结果
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Data
public class CompareResult {
    /**
     * 主键id值
     */
    private Long id;
    /**
     * 字段名
     */
    private String fieldName;
    /**
     * 字段注释
     */
    private String fieldComment;
    /**
     * 字段旧值
     */
    private Object oldValue;
    /**
     * 字段新值
     */
    private Object newValue;
}
