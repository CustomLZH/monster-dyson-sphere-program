package com.monster.dyson.sphere.program.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.commons.beans.SpringPlusBeanUtils;
import com.monster.dyson.sphere.program.entity.RecipePO;
import com.monster.dyson.sphere.program.entity.dto.RecipeRequestDTO;
import com.monster.dyson.sphere.program.entity.dto.RecipeResponseDTO;
import com.monster.dyson.sphere.program.mapper.RecipeMapper;
import com.monster.dyson.sphere.program.server.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2023/12/31
 * @since JDK1.8
 */
@Service
public class RecipeServiceImpl extends ServiceImpl<RecipeMapper, RecipePO> implements RecipeService {


    @Override
    public List<RecipeResponseDTO> getRecipeList(RecipeRequestDTO params) {
        LambdaQueryWrapper<RecipePO> lambdaQuery = Wrappers.lambdaQuery();
        lambdaQuery.eq(RecipePO::getVersions, params.getVersions());
        List<RecipePO> recipeList = baseMapper.selectList(lambdaQuery);
        return SpringPlusBeanUtils.copyProperties(recipeList, RecipeResponseDTO::new);
    }
}
