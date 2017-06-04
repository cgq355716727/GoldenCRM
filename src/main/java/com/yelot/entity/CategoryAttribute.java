package com.yelot.entity;

/**
 * Created by kee on 17/6/1.
 */
public class CategoryAttribute {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 产品属性id
	 */
	private Long attribute_id;
	
	/**
	 * 产品类型id
	 */
	private Long category_id;
	
	/**
	 * 是否显示：0.不显示，1.显示
	 */
	private int is_alive;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAttribute_id() {
		return attribute_id;
	}
	public void setAttribute_id(Long attribute_id) {
		this.attribute_id = attribute_id;
	}
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public int getIs_alive() {
		return is_alive;
	}
	public void setIs_alive(int is_alive) {
		this.is_alive = is_alive;
	}
	
}
