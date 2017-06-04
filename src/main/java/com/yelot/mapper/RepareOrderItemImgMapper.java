package com.yelot.mapper;

import com.yelot.entity.RepareOrderItemImage;
import org.apache.ibatis.annotations.Delete;
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
public interface RepareOrderItemImgMapper {

    @Select("select * from t_repare_order_item_img where id = #{id}")
    RepareOrderItemImage find(Long id);

    @Insert("insert into t_repare_order_item_img(img_path,repare_order_item_id,repare_order_id) values(#{img_path}," +
            "#{repare_order_item_id},#{repare_order_id})")
    void save(RepareOrderItemImage repareOrderItemImage);

    @Delete("delete from t_repare_order_item_img id = #{id}")
    void delete(Long id);

    @Select("select * from t_repare_order_item_img where repare_order_item_id = #{orderItemId}")
    List<RepareOrderItemImage> findByOrderItemId(Long orderItemId);


}
