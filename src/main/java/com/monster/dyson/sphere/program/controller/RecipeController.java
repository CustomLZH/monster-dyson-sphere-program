package com.monster.dyson.sphere.program.controller;

import com.monster.commons.beans.ResponseData;
import com.monster.dyson.sphere.program.entity.dto.RecipeRequestDTO;
import com.monster.dyson.sphere.program.entity.dto.RecipeResponseDTO;
import com.monster.dyson.sphere.program.server.RecipeService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/12/31
 * @since JDK1.8
 */
@Validated
@RestController
@RequestMapping("/recipe")
public class RecipeController {

    @Resource
    private RecipeService recipeService;

    /**
     * 获取配方列表
     *
     * @return 配方列表
     */
    @PostMapping("/list")
    public ResponseData<List<RecipeResponseDTO>> getRecipeList(@RequestBody RecipeRequestDTO params) {
        return ResponseData.succeed(recipeService.getRecipeList(params));
    }


}
