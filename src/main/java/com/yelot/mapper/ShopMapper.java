package com.yelot.mapper;

import com.yelot.entity.Shop;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * Created by kee on 17/5/26.
 */
@Mapper
@Repository
public interface ShopMapper {
    @Insert("save into t_shop(name,address,phone,create_at,update_at) " +
            "values(#{name},#{address},#{phone},#{create_at},#{update_at})")
    void save(Shop shop);

    @Delete("delete from t_shop where id = #{id}")
    void delete(Long id);

    @Update("update t_shop set name=#{name},address=#{address},phone=#{phone},is_alive=#{is_alive},update_at=#{update_at}" +
            " where id = #{id}")
    void update(Shop shop);

}
