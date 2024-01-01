-- 修改配方表结构
alter table t_recipe
    add column i_recipe_inventory_id BIGINT comment '配方基础信息' after i_id;
alter table t_recipe
    add column i_x_axis TINYINT comment '横坐标' after i_recipe_inventory_id;
alter table t_recipe
    add column i_y_axis TINYINT comment '纵坐标' after i_x_axis;