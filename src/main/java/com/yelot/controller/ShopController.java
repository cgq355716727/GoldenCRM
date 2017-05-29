package com.yelot.controller;

import com.yelot.Util.ResponseData;
import com.yelot.entity.Shop;
import com.yelot.entity.User;
import com.yelot.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kee on 17/5/29.
 */
@RestController
@RequestMapping("shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @RequestMapping("find")
    public Shop find(Long id) {
        return shopService.find(id);
    }

    @RequestMapping("find-by-name")
    public Shop findByName(String name) {
        return shopService.findByName(name);
    }

    @RequestMapping("save")
    public ResponseData save(Shop shop) {
        return shopService.save(shop);
    }

    @RequestMapping("update")
    public ResponseData update(Shop shop) {
        return shopService.update(shop);
    }

    @RequestMapping("update-alive")
    public ResponseData updateAlive(Integer alive, Long id) {
        return shopService.updateAlive(alive, id);
    }

    @RequestMapping("find-by-page")
    public List<Shop> findByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        if (page <= 0) {
            page = 1;
        }
        Integer start = (page - 1) * size;
        return shopService.findByPage(start, size);
    }


}
