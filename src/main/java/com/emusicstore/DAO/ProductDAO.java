package com.emusicstore.DAO;

import java.util.ArrayList;
import java.util.List;

import com.emusicstore.Model.Product;

public class ProductDAO {

	public List<Product>getProducts(){
		Product product = new Product();
		List<Product>productList = new ArrayList<Product>();
		product.setProduct_Name("Shampoo");
		product.setProduct_Category("HairCare");
		product.setProduct_Description("Use for long hairs");
		product.setProduct_price(56);
		product.setProduct_Condition("NEW");
		product.setProduct_Status("ACTIVE");
		product.setProduct_unitInStock(11);
		product.setProduct_Manufacturer("PANTENE");
		Product product2 = new Product();
		product2.setProduct_Name("Soap");
		product2.setProduct_Category("Health");
		product2.setProduct_Description("Use for hygene");
		product2.setProduct_price(65);
		product2.setProduct_Condition("NEW");
		product2.setProduct_Status("ACTIVE");
		product2.setProduct_unitInStock(11);
		product2.setProduct_Manufacturer("DETTOL");
		Product product3 = new Product();
		product3.setProduct_Name("Pencil");
		product3.setProduct_Category("Learn");
		product3.setProduct_Description("Use to Write");
		product3.setProduct_price(78);
		product3.setProduct_Condition("NEW");
		product3.setProduct_Status("ACTIVE");
		product3.setProduct_unitInStock(11);
		product3.setProduct_Manufacturer("LINC");
		
		productList.add(product);
		productList.add(product2);
		productList.add(product3);
		return productList;
	}
}
