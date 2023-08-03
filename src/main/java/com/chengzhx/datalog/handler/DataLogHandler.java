package com.chengzhx.datalog.handler;

import cn.hutool.core.collection.CollUtil;
import com.chengzhx.datalog.annotation.DataLog;
import com.chengzhx.datalog.domain.BaseDataLog;
import com.chengzhx.datalog.domain.LogData;
import org.springframework.stereotype.Component;

/**
 * Description: 数据日志处理
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Component
public class DataLogHandler extends BaseDataLog {

    @Override
    public void setting() {
        // 设置排除某张表、某些字段
        this.addExcludeTableName("house");
        this.addExcludeFieldName("createTime")
                .addExcludeFieldName("updateTime");
    }

    @Override
    public boolean isIgnore(DataLog dataLog) {
        // 根据注解判断是否忽略某次操作
        return false;
    }

    @Override
    public void change(DataLog dataLog, LogData data) {
        if (CollUtil.isEmpty(data.getDataChanges())) {
            return;
        }
        // 存库
        System.err.println("存库成功：" + data.getLogStr());
    }

}
