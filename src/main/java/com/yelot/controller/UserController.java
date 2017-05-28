package com.yelot.controller;

import com.yelot.Util.ResponseData;
import com.yelot.entity.User;
import com.yelot.enums.AliveStatus;
import com.yelot.mapper.UserMapper;
import com.yelot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yelot on 17/5/14.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String test(){
        return "hello world";
    }

    @RequestMapping("find")
    public User find(Long id){
        return userService.find(id);
    }

    @RequestMapping("save")
    public ResponseData save(User user){
        userService.save(user);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
    }

    @RequestMapping("delete")
    public ResponseData delete(Long id){
        userService.updateAlive(AliveStatus.DEAD.getCode(),id);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);

    }

    @RequestMapping("find-by-page")
    public List<User> findByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        if(page <= 0){
            page = 1;
        }
        Integer start = (page - 1) * size;
        return userService.findByPage(start,size);
    }

    @RequestMapping("find-by-name")
    public List<User> findByNameLike(String name){
        return userService.findByNameLike(name);
    }


}
