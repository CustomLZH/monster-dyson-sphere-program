package com.monster.dyson.sphere.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 配方明细
 *
 * @author SystemGenerator
 */
@Data
@TableName("t_recipe_info")
public class RecipeInfoPO implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "i_id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 配方id
     */
    @TableField(value = "i_recipe_id")
    private Long recipeId;

    /**
     * 基础清单id
     */
    @TableField(value = "i_inventory_id")
    private Long inventoryId;

    /**
     * 配方类型 1输出、2输入
     */
    @TableField(value = "i_recipe")
    private Integer recipe;

    /**
     * 比例
     */
    @TableField(value = "i_ratio")
    private BigDecimal ratio;

}

