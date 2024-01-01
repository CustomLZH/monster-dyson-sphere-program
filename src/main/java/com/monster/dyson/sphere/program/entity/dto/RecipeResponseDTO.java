package com.monster.dyson.sphere.program.entity.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/12/31
 * @since JDK1.8
 */
@Data
public class RecipeResponseDTO {

    /**
     * 编号
     */
    private Long id;

    /**
     * 制造清单 必须为制造建筑
     */
    private Long inventoryId;

    /**
     * 配方名称
     */
    private String recipeName;

    /**
     * 模式 0通用、1生存模式、2战斗模式
     */
    private Integer model;

    /**
     * 效率 1普通、2高效
     */
    private Integer efficiency;

    /**
     * 单位时间 单位：秒
     */
    private BigDecimal unitTime;

    /**
     * 版本枚举
     */
    private Integer versions;

}
