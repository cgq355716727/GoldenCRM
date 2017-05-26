package com.yelot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kee on 17/5/14.
 */
@RestController
public class UserController {
    @RequestMapping("test")
    public String test(){
        return "hello world";
    }

    @RequestMapping("hot-restart")
    public String hotRestart(){
        return "hot restart is successfull";
    }
}
