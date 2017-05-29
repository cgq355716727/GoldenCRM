package com.yelot.controller;

import com.yelot.Util.ResponseData;
import com.yelot.entity.Customer;
import com.yelot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kee on 17/5/29.
 */
@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("find")
    public Customer find(Long id){
        return customerService.find(id);
    }

    @RequestMapping("save")
    public ResponseData save(Customer customer){
        return customerService.save(customer);
    }

    @RequestMapping("update")
    public ResponseData update(Customer customer){
        return customerService.update(customer);
    }

    public ResponseData updateAlive(Integer alive,Long id){
        return customerService.updateAlive(alive,id);
    }

    @RequestMapping("find-by-page")
    public List<Customer> findByPage(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size){
        if(page <= 0){
            page = 1;
        }
        Integer start = (page - 1) * size;
        return customerService.findByPage(start,size);
    }
}
