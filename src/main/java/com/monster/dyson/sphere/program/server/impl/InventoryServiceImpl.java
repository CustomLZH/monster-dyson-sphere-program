package com.monster.dyson.sphere.program.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.monster.dyson.sphere.program.entity.InventoryPO;
import com.monster.dyson.sphere.program.entity.dto.InventoryPageRequestDto;
import com.monster.dyson.sphere.program.mapper.InventoryMapper;
import com.monster.dyson.sphere.program.server.InventoryService;
import org.springframework.stereotype.Service;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2024/1/1
 * @since JDK1.8
 */
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, InventoryPO> implements InventoryService {


    @Override
    public Page<InventoryPO> pageInventory(InventoryPageRequestDto params) {
        LambdaQueryWrapper<InventoryPO> lambdaQuery = Wrappers.lambdaQuery();
        Page<InventoryPO> inventoryPage = baseMapper.selectPage(new Page<>(params.getPageNum(), params.getPageSize()), lambdaQuery);

        return inventoryPage;
    }
}
