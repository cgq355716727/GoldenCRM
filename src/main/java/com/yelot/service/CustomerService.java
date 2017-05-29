package com.yelot.service;

import com.yelot.Util.ResponseData;
import com.yelot.entity.Customer;
import com.yelot.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kee on 17/5/28.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Customer find(Long id) {
        return customerMapper.find(id);
    }

    public ResponseData save(Customer customer) {
        String  phone = customer.getPhone();
        Customer temp = customerMapper.findByPhone(phone);
        if(temp == null){
            customerMapper.save(customer);
            return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
        }
        return new ResponseData(ResponseData.FAIL,ResponseData.FAIL_MESSAGE);
    }


    public List<Customer> findByPage(Integer start, Integer size) {
        return customerMapper.findByPage(start,size);
    }

    public ResponseData update(Customer customer) {
        customerMapper.update(customer);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
    }

    public ResponseData updateAlive(Integer alive, Long id) {
        customerMapper.updateAlive(alive,id);
        return new ResponseData(ResponseData.SUCCESS,ResponseData.SUCCESS_MESSAGE);
    }
}
