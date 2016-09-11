package com.emusicstore.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emusicstore.DAO.DAOProduct;
import com.emusicstore.Model.Product;

@Controller
public class HomeController {

	@Autowired
	private DAOProduct daoproduct;

	@RequestMapping("/test")
	public String home(){
		return "home";
	}
	@RequestMapping("/productList")
	public String getProducts(Model model,Product product){
		List<Product>productlist = daoproduct.getAllProduct();
		model.addAttribute("productlist",productlist);
		return "products";
	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId,Model model) throws IOException{
		Product product = daoproduct.getProductbyId(productId);
		model.addAttribute(product);
		return "viewProduct";	
	}
}
