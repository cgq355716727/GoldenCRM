package com.yelot.mapper;

import com.yelot.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yelot on 17/5/15.
 */
@Mapper
public interface UserMapper {


    @Insert("insert into t_user(name,password,realname,phone,emp_no,create_at,update_at,shop_id) " +
            "values(#{name},#{password},#{realname},#{phone},#{empNo},#{createAt},#{updateAt},#{shop.id})")
    void insert(User user);

    @Select("select id,name,password from t_user where limit #{start},#{size}")
    List<User> findByPage(Long start,Long size);

    @Select("select id,name,password from t_user where name like #{name}")
    List<User> findByNameLike(String name);

    @Delete("delete from t_user")
    void deleteAll();

    @Delete("delete from t_user where id = #{id}")
    void delete(Long id);
}
