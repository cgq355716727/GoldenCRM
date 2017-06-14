package com.yelot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yelot.Util.JWTUtils;
import com.yelot.Util.MD5Utils;
import com.yelot.Util.ResponseData;
import com.yelot.entity.User;
import com.yelot.mapper.LoginMapper;

@Service
public class LoginService {

	@Autowired
	private LoginMapper loginMapper;

	public ResponseData login(String username, String password) {
		password = MD5Utils.getMD5Code(password);

		User user = loginMapper.selectUser(username, password);
		if (null != user) {
			String sign = JWTUtils.sign(user, 1000 * 60 * 60 * 24);
			System.err.println("11");
			return new ResponseData(ResponseData.SUCCESS,
					ResponseData.SUCCESS_MESSAGE).putDataValue("token", sign)
					.putDataValue("user", user);
		} else {
			System.out.println("22");
			return new ResponseData(ResponseData.FAIL,
					ResponseData.FAIL_MESSAGE);
		}
	}

}
