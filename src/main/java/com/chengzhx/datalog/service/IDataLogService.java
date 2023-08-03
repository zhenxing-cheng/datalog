package com.chengzhx.datalog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengzhx.datalog.domain.entity.DataLog;

/**
 * <p>
 * 数据库日志 服务类
 * </p>
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
public interface IDataLogService extends IService<DataLog> {

    void addLog(DataLog gmsDataLog);
}
