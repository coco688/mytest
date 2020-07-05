package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @Author Lemon
 * @Date: 2020/07/03
 **/
public interface ItemsService {
    /**
     * 查询所有
     *
     * @return
     */
    List<Items> findAll();

    /**
     * 保存
     *
     * @param items
     * @return
     */
    int save(Items items);
}
