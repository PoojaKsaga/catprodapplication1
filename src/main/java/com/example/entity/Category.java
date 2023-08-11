package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category {


	@Id
	private Long id;
	private String Name;
	private Long cat_id;
	
	public Long getCat_id() {
		return cat_id;
	}
	public void setCat_id(Long cat_id) {
		this.cat_id = cat_id;
	}
	@OneToMany(mappedBy = "category" ,cascade = CascadeType.ALL)
	private List<Product> productlist;
	
	
	public Category(Long id, String name, Long cat_id) {
		super();
		this.id = id;
		Name = name;
		this.cat_id = cat_id;
		
	}
	public Category() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public List<Product> getProductlist() {
		return productlist;
	}
	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", Name=" + Name + ", cat_id=" + cat_id + "]";
	}
	
	
}
