package com.monster.dyson.sphere.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 配方表
 *
 * @author SystemGenerator
 */
@Data
@TableName("t_recipe")
public class RecipePO implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "i_id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 制造清单 必须为制造建筑
     */
    @TableField(value = "i_inventory_id")
    private Long inventoryId;

    /**
     * 配方名称
     */
    @TableField(value = "s_recipe_name")
    private String recipeName;

    /**
     * 模式 0通用、1生存模式、2战斗模式
     */
    @TableField(value = "i_model")
    private Integer model;

    /**
     * 效率 1普通、2高效
     */
    @TableField(value = "i_efficiency")
    private Integer efficiency;

    /**
     * 单位时间 单位：秒
     */
    @TableField(value = "i_unit_time")
    private BigDecimal unitTime;

    /**
     * 版本枚举
     */
    @TableField(value = "i_versions")
    private Integer versions;

}

