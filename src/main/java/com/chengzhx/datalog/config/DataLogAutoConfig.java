package com.chengzhx.datalog.config;

import com.chengzhx.datalog.domain.BaseDataLog;
import com.chengzhx.datalog.interceptor.DataUpdateInterceptor;
import com.chengzhx.datalog.interceptor.PerformanceInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * datalog 配置
 *
 * @author Chengzhenxing
 */
@Configuration
@ComponentScan({"com.chengzhx"})
@EnableTransactionManagement(proxyTargetClass = true)
public class DataLogAutoConfig {


    /**
     * <p>
     * SQL执行效率插件  设置 dev test 环境开启
     * </p>
     *
     * @return cn.rc100.common.data.mybatis.EplusPerformanceInterceptor
     * @author Tophua
     * @since 2020/3/11
     */
    @Bean
    @Profile({"dev", "test"})
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }

    /**
     * <p>
     * 数据更新操作处理
     * </p>
     *
     * @return com.lith.datalog.handle.DataUpdateInterceptor
     * @author Tophua
     * @since 2020/5/11
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(BaseDataLog.class)
    public DataUpdateInterceptor dataUpdateInterceptor() {
        return new DataUpdateInterceptor();
    }
}