package com.monster.dyson.sphere.program.entity.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/12/31
 * @since JDK1.8
 */
@Data
public class RecipeRequestDTO {

    /**
     * 版本
     */
    @NotNull(message = "版本不能为空")
    private Integer versions;

}
