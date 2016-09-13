package com.emusicstore.DAO;

import java.util.List;

import com.emusicstore.Model.Product;

public interface DAOProduct {

	void addProduct(Product product);
	Product getProductbyId(int Id);
	List<Product> getAllProduct();
	void deleteProduct(int Id);
}
