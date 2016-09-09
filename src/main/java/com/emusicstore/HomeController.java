package com.emusicstore;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emusicstore.DAO.ProductDAO;
import com.emusicstore.Model.Product;

@Controller
public class HomeController {

	private ProductDAO  productdao = new ProductDAO();

	@RequestMapping("/test")
	public String home(){
		return "home";
	}
	@RequestMapping("/productList")
	public String getProducts(Model model,Product product){
		List<Product>productlist = productdao.getProducts();
		model.addAttribute("productlist",productlist);
		return "products";
	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public String viewProduct(@PathVariable String productId,Model model ) throws IOException{
		Product product = productdao.getProductbyId(productId);
		model.addAttribute(product);
		return "viewProduct";	
	}
}
