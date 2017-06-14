package com.yelot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yelot.entity.User;

@Mapper
@Repository
public interface LoginMapper {
	
	@Select("select * from t_user where name = #{username} and password = #{password}")
	User selectUser(@Param("username") String username, @Param("password") String password);

}
