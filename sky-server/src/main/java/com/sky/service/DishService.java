package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;


public interface DishService {
    /**
     * 新增菜品接口
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQury(DishPageQueryDTO dishPageQueryDTO);
}
