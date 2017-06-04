package com.yelot.mapper;

import com.yelot.entity.RepareOrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kee on 17/6/5.
 */
@Mapper
@Repository
public interface RepareOrderItemMapper {

    @Select("select * from t_repare_order_item where id = #{id}")
    RepareOrderItem find(Long id);

    @Insert("insert into t_repare_order_item(repare_order_id,special_need,image_desc,comment) " +
            "values(#{repare_order_id},#{special_need},#{image_desc},#{comment})")
    void save(RepareOrderItem repareOrderItem);

//    void update(RepareOrderItem repareOrderItem);

    @Select("select * from t_repare_order_item where repare_order_id = #{repareOrderId}")
    List<RepareOrderItem> findByOrderId(Long repareOrderId);

}
