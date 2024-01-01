package com.monster.dyson.sphere.program.server;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.monster.dyson.sphere.program.entity.InventoryPO;
import com.monster.dyson.sphere.program.entity.dto.InventoryPageRequestDto;

/**
 * 该文件描述
 *
 * @author LiuZhaoHong
 * @version 1.0
 * @date 2024/1/1
 * @since JDK1.8
 */
public interface InventoryService {
    /**
     * 分页获取基础清单
     *
     * @param params
     * @return
     */
    Page<InventoryPO> pageInventory(InventoryPageRequestDto params);
}
