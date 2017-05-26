package com.yelot.controller;

import com.yelot.Util.ResponseData;
import com.yelot.entity.User;
import com.yelot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yelot on 17/5/14.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("test")
    public String test(){
        return "hello world";
    }

    @RequestMapping("hot-restart")
    public String hotRestart(){
        return "hot restart is successfull";
    }

    @RequestMapping("save-user")
    public ResponseData save(User user){
        userMapper.insert(user);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
    }

    @RequestMapping("delete-user")
    public ResponseData delete(Long id){
        userMapper.delete(id);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);

    }


}
