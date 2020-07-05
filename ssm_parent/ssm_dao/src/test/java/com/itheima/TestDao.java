package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author Lemon
 * @Date: 2020/07/03
 **/
public class TestDao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        ItemsDao itemsDao = context.getBean("itemsDao", ItemsDao.class);

        List<Items> itemsList = itemsDao.findAll();

        for (Items items : itemsList) {
            System.out.println(items);
        }

        /*  Items{id=1, name='传智播客web课程', price=1000.0, pic='null', createtime=Tue Mar 13 09:29:30 CST 2018, detail='带我走上人生巅峰'}
            Items{id=2, name='黑马之路', price=null, pic='null', createtime=Wed Mar 28 10:05:52 CST 2018, detail='插入测试'}
            Items{id=3, name='黑马之路二', price=199.0, pic='null', createtime=Wed Mar 07 10:08:04 CST 2018, detail='插入测试'}
            Items{id=7, name='插入测试', price=null, pic='null', createtime=null, detail='null'}
            Items{id=8, name='插入测试', price=null, pic='null', createtime=null, detail='null'}*/
    }
}
