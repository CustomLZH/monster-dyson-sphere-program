package com.monster.dyson.sphere.program.entity.dto;

import lombok.Data;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2024/1/1
 * @since JDK1.8
 */
@Data
public class InventoryPageRequestDto {

    private Integer pageNum = 1;

    private Integer pageSize = 20;


}
