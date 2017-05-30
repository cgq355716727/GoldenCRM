package com.yelot.mapper;

import com.yelot.entity.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by kee on 17/5/30.
 */
@Mapper
@Repository
public interface CategoryMapper {

    @Select("select * from t_category")
    Category find(Long id);

    @Insert("insert into t_category(name,sort) values(#{name},#{sort})")
    void save(Category category);
}
