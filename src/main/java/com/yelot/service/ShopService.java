package com.yelot.service;

import com.yelot.Util.ResponseData;
import com.yelot.entity.Shop;
import com.yelot.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by kee on 17/5/28.
 */
@Service
public class ShopService {

    @Autowired
    private ShopMapper shopMapper;

    public Shop find(Long id) {
        return shopMapper.find(id);
    }

    /**
     * 新建门店
     * 业务逻辑：先判断名称是否存在，存在则提示用户
     * @param shop
     * @return
     */
    public ResponseData save(Shop shop) {
        ResponseData responseData;
        String name = shop.getName();
        Shop tempShop = shopMapper.findByName(name);
        if(tempShop == null){//查询不到重复名称，则新建
            shop.setCreate_at(new Date());
            shop.setUpdate_at(new Date());
            shopMapper.save(shop);
            responseData = new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
        }else {
            responseData = new ResponseData(ResponseData.FAIL,ResponseData.FAIL_MESSAGE);
        }

        return responseData;
    }

    public Shop findByName(String name){
        return shopMapper.findByName(name);
    }


    /**
     * 编辑门店信息
     * 业务逻辑：名称不能是已存在的名称,自身名称除外
     * @param shop
     * @return
     */
    public ResponseData update(Shop shop) {
        String name = shop.getName();
        Shop tempShop = shopMapper.findByNameAndId(name,shop.getId());
        if(tempShop == null) {//查询不到重复名称，则修改
            shop.setUpdate_at(new Date());
            shopMapper.update(shop);
            return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
        }
        return new ResponseData(ResponseData.FAIL,ResponseData.FAIL_MESSAGE);

    }

    public ResponseData updateAlive(Integer alive, Long id) {
        shopMapper.updateAlive(alive,id);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
    }

    public List<Shop> findByPage(Integer start, Integer size) {
        return shopMapper.findByPage(start,size);
    }
}
