package com.yelot;

import com.yelot.entity.Shop;
import com.yelot.mapper.ShopMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by kee on 17/5/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class ShopMapperTest {

    @Autowired
    private ShopMapper shopMapper;

    @Test
    public void save(){
        Shop shop = new Shop("上海门店","上海长寿路22号","1333333");
        shop.setCreateAt(new Date());
        shop.setUpdateAt(new Date());
        shopMapper.save(shop);
    }
}
