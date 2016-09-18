package com.emusicstore.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emusicstore.DAO.DAOProduct;
import com.emusicstore.DAO.ProductDAO;
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
	
	@RequestMapping("/admin")
	public String adminPage(){
		return "admin";
    }
	
	@RequestMapping("admin/productInventory")
	public String productInventory(Model model){
		List<Product>productlist = daoproduct.getAllProduct();
		model.addAttribute("productlist",productlist);
		return "productInventory";
	}
	@RequestMapping("/admin/productInventory/addProduct")
	public String addProduct(Model model){
		Product product = new Product();
		product.setProduct_Category("Instrument");
		product.setProduct_Condition("New");
		product.setProduct_Status("active");
		model.addAttribute("product",product);
		return "addProduct";	
	}
	@RequestMapping(value="/admin/productInventory/addProduct",method=RequestMethod.POST)
	public String addProductPost(@ModelAttribute("product") Product product,Model model){
		daoproduct.addProduct(product);
		List<Product>productlist=daoproduct.getAllProduct();
		model.addAttribute("productlist",productlist);
		return "productInventory";	
	}
}

