package com.monster.dyson.sphere.program.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 基础清单
 *
 * @author SystemGenerator
 */
@Data
@TableName("t_inventory")
public class InventoryPO implements Serializable {
    /**
     * 编号
     */
    @TableId(value = "i_id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 清单名称 清单名称
     */
    @TableField(value = "s_inventory_name")
    private String inventoryName;

    /**
     * 清单类型 清单类型：1物品、2建筑
     */
    @TableField(value = "i_inventory_type")
    private Integer inventoryType;

    /**
     * 是否为制造建筑 0否、1是
     */
    @TableField(value = "i_make")
    private Integer make;

    /**
     * 制造速度
     */
    @TableField(value = "i_speed")
    private BigDecimal speed;

    /**
     * 图标 类型暂定
     */
    @TableField(value = "s_icon")
    private String icon;

}

