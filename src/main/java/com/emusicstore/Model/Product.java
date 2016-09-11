package com.emusicstore.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_Id;
	private String product_Name;
	private String product_Category;
	private String product_Description;
	private double product_price;
	private String product_Condition;
	private String product_Status;
	private int product_unitInStock;
	private String product_Manufacturer;
	
	
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Category() {
		return product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	public String getProduct_Condition() {
		return product_Condition;
	}
	public void setProduct_Condition(String product_Condition) {
		this.product_Condition = product_Condition;
	}
	public String getProduct_Status() {
		return product_Status;
	}
	public void setProduct_Status(String product_Status) {
		this.product_Status = product_Status;
	}
	public int getProduct_unitInStock() {
		return product_unitInStock;
	}
	public void setProduct_unitInStock(int product_unitInStock) {
		this.product_unitInStock = product_unitInStock;
	}
	public String getProduct_Manufacturer() {
		return product_Manufacturer;
	}
	public void setProduct_Manufacturer(String product_Manufacturer) {
		this.product_Manufacturer = product_Manufacturer;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
