package com.chengzhx.datalog.handle;

import lombok.Data;

import java.util.List;

/**
 * Description: 日志数据
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Data
public class LogData {
    /**
     * 数据变化 多张表-多条数据
     */
    private List<DataChange> dataChanges;
    /**
     * 全部变化对比结果
     */
    private List<CompareResult> compareResults;
    /**
     * 全部变化记录 默认：将[{}]由{}修改为{}
     */
    private String logStr;
}
