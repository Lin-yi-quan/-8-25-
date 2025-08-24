package service;

import java.util.List;


import model.Product;

public interface ProductService 
{
	
//create  執行增加商品
	boolean addProduct(Product product);//執行增加商品	
	
//read    執行讀取商品
	
	List<Product> readAllProduct();//執行購物介面顯示商品清單
	List<Product> readAllProductforAdmin();//執行管理介面顯示商品清單

	
//update
	boolean updateProduct(Product product);//執行修理商品
	
	
//delete	
	
	boolean deleteProduct(Product product);//執行消滅商品

}
