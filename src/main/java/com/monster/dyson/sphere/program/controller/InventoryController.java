package com.monster.dyson.sphere.program.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monster.commons.beans.ResponseData;
import com.monster.dyson.sphere.program.entity.InventoryPO;
import com.monster.dyson.sphere.program.entity.dto.InventoryPageRequestDto;
import com.monster.dyson.sphere.program.server.InventoryService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2024/1/1
 * @since JDK1.8
 */
@Validated
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Resource
    private InventoryService inventoryService;


    /**
     * 获取配方列表
     *
     * @return 配方列表
     */
    @PostMapping("/pageInventory")
    public ResponseData<Page<InventoryPO>> pageInventory(@RequestBody InventoryPageRequestDto params) {
        return ResponseData.succeed(inventoryService.pageInventory(params));
    }
}
