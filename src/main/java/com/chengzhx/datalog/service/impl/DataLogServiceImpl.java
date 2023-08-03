package com.chengzhx.datalog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chengzhx.datalog.domain.entity.DataLog;
import com.chengzhx.datalog.repository.DataLogMapper;
import com.chengzhx.datalog.service.IDataLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 数据库日志 服务实现类
 * </p>
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Service
public class DataLogServiceImpl extends ServiceImpl<DataLogMapper, DataLog> implements IDataLogService {

    @Resource
    private DataLogMapper gmsDataLogMapper;


    @Override
    public void addLog(DataLog dataLog) {
        gmsDataLogMapper.insert(dataLog);
    }
}
