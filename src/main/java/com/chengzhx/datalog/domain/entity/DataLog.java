package com.chengzhx.datalog.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 数据库日志
 * </p>
 *
 * @author ChengZhenxing
 * @since 2023-08-01
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("data_log")
public class DataLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 操作类型
     */
    @TableField("TYPE")
    private String type;

    /**
     * 操作人id
     */
    @TableField("OPERATOR_ID")
    private Long operatorId;

    /**
     * 操作人名称
     */
    @TableField("OPERATOR_NAME")
    private String operatorName;

    /**
     * 类名称
     */
    @TableField("CLASS_NAME")
    private String className;

    /**
     * 方法名称
     */
    @TableField("METHOD_NAME")
    private String methodName;

    /**
     * 实体名称
     */
    @TableField("ENTITY_NAME")
    private String entityName;

    /**
     * 表名称
     */
    @TableField("TABLE_NAME")
    private String tableName;

    /**
     * 表主键值
     */
    @TableField("TABLE_ID")
    private String tableId;

    /**
     * 修改前数据
     */
    @TableField("OLD_DATA")
    private String oldData;

    /**
     * 修改后数据
     */
    @TableField("NEW_DATA")
    private String newData;

    /**
     * 删除标记
     */
    @TableLogic
    @TableField("DELETE_FLAG")
    private Integer deleteFlag;

    /**
     * 创建人
     */
    @TableField(value = "CREATE_BY", fill = FieldFill.INSERT)
    private String createBy;

    /**
     * 创建时间
     */
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新人
     */
    @TableField(value = "UPDATE_BY", fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
