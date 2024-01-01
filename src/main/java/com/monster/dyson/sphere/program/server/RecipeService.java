package com.monster.dyson.sphere.program.server;

import com.monster.dyson.sphere.program.entity.dto.RecipeRequestDTO;
import com.monster.dyson.sphere.program.entity.dto.RecipeResponseDTO;

import java.util.List;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/12/31
 * @since JDK1.8
 */
public interface RecipeService {

    /**
     * 获取所有配方
     *
     * @return
     */
    List<RecipeResponseDTO> getRecipeList(RecipeRequestDTO params);
}
