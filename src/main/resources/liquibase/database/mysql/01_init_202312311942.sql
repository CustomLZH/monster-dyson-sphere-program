-- 创建配方表、配方明细表、基础清单表
create table t_recipe
(
    i_id           BIGINT not null primary key comment '编号',
    i_inventory_id BIGINT comment '制造清单 必须为制造建筑',
    s_recipe_name  VARCHAR(128) comment '配方名称',
    i_model        TINYINT comment '模式 0通用、1生存模式、2战斗模式',
    i_efficiency   TINYINT comment '效率 1普通、2高效',
    i_unit_time    DECIMAL(8, 2) comment '单位时间 单位：秒',
    i_versions     TINYINT comment '版本枚举'
) comment '配方表';
create table t_recipe_info
(
    i_id           BIGINT not null primary key comment '编号',
    i_recipe_id    BIGINT comment '配方id',
    i_inventory_id BIGINT comment '基础清单id',
    i_recipe       TINYINT comment '配方类型 1输出、2输入',
    i_ratio        DECIMAL(8, 2) comment '比例'
) comment '配方明细';
create table t_inventory
(
    i_id             BIGINT not null primary key comment '编号',
    s_inventory_name VARCHAR(128) comment '清单名称 清单名称',
    i_inventory_type TINYINT comment '清单类型 清单类型：1物品、2建筑',
    i_make           TINYINT comment '是否为制造建筑 0否、1是',
    i_speed          DECIMAL(8, 2) comment '制造速度',
    s_icon           VARCHAR(512) comment '图标 类型暂定'
) comment '基础清单';