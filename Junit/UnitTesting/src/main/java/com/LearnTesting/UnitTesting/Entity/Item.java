package com.LearnTesting.UnitTesting.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
	
	@Id
	private Integer id;
	private String name;
	private Integer qty;
	private Integer price;
	
	@Transient
	private Integer value;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Item(Integer id, String name, Integer qty, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public Item() {
		super();
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	

}
