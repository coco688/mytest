package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

/**
 * @Author Lemon
 * @Date: 2020/07/03
 **/

@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;


    @RequestMapping("findAll")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Items> list = itemsService.findAll();
        modelAndView.addObject("items", list);
        modelAndView.setViewName("items");
        return modelAndView;
    }

    /***
     * 增加商品
     * @return
     */
    @RequestMapping("save")
    public String save(Items items) {

        int acount = itemsService.save(items);

        System.out.println("保存成功");
        //集合列表页跳转
        return "redirect:/items/findAll";
    }
}
