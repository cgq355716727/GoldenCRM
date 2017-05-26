package com.yelot.mapper;

import com.yelot.entity.Shop;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by kee on 17/5/26.
 */
@Mapper
public interface ShopMapper {
    @Insert("insert into t_shop(name,address,phone,create_at,update_at) " +
            "values(#{name},#{address},#{phone},#{createAt},#{updateAt})")
    public void save(Shop shop);

    @Delete("delete from t_shop where id = #{id}")
    public void delete(Long id);
}
