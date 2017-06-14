package com.yelot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yelot.Util.ResponseData;
import com.yelot.service.LoginService;

/**
 * @author xyzloveabc
 * @2017年6月10日
 */
@RestController
@RequestMapping("/Login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public ResponseData login(String username, String password) {
		return loginService.login(username, password);
	}

}
