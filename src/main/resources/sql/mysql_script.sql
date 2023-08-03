create table data_log
(
    ID            bigint auto_increment comment '主键id'
        primary key,
    TYPE          varchar(20)  default '' not null comment '操作类型',
    OPERATOR_ID   bigint unsigned default 0 not null comment '操作人id',
    OPERATOR_NAME varchar(100) default '' not null comment '操作人名称',
    CLASS_NAME    varchar(200) default '' not null comment '类名称',
    METHOD_NAME   varchar(200) default '' not null comment '方法名称',
    ENTITY_NAME   varchar(200) default '' not null comment '实体名称',
    TABLE_NAME    varchar(200) default '' not null comment '表名称',
    TABLE_ID      varchar(500) default '' not null comment '表主键值',
    OLD_DATA      mediumtext null comment '修改前数据',
    NEW_DATA      mediumtext null comment '修改后数据',
    DELETE_FLAG   int(4) null comment '删除标记',
    CREATE_BY     varchar(100) null comment '创建人',
    CREATE_TIME   datetime null comment '创建时间',
    UPDATE_BY     varchar(100) null comment '更新人',
    UPDATE_TIME   datetime null comment '更新时间'
) comment '数据库日志';