package com.yelot;

import com.yelot.entity.User;
import com.yelot.mapper.LoginMapper;
import com.yelot.mapper.UserMapper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest()
public class LoginMapperTest {

  @Autowired
  LoginMapper loginMapper;

  // 每次执行Test之前先删除表，创建表
  @Before
  public void before() throws Exception {
   // userMapper.dropTable();
   // userMapper.createTable();
  }

  @Test
  public void findByName() throws Exception {
    User user = loginMapper.selectUser("a", "123");
    System.out.println(user);
//    assertThat(userMapper.findByNameLike("jege%")).hasSize(10);
  }

}