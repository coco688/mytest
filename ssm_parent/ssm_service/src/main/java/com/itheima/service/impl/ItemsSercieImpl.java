package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lemon
 * @Date: 2020/07/03
 **/
@Service
public class ItemsSercieImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public int save(Items items) {
        return itemsDao.save(items);
    }
}
