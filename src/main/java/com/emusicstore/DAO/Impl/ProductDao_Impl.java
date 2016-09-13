package com.emusicstore.DAO.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emusicstore.DAO.DAOProduct;
import com.emusicstore.Model.Product;

@Repository
@Transactional
public class ProductDao_Impl implements DAOProduct {

	@Autowired
	private SessionFactory sessionFactory;

	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();

	}

	public Product getProductbyId(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		session.save(product);
		return product;
	}

	public List<Product> getAllProduct() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product");
		List<Product> productlist = query.list();
		session.flush();
		return productlist;
	}

	public void deleteProduct(int Id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getProductbyId(Id));
		session.flush();
	}

}
