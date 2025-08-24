package dao;

import java.util.List;

import model.Consumer;
import model.Employee;
import model.Product;

public interface ProductDao 
{
	//create  新增商品
		void add(Product product);
		
		
		
	//read   讀取商品
		Product readProductMessage(int productId);  //讀取商品訊息
		
		
		//~~~~~~~~~	
		List<Product>readAll();  //讀取商品全部清單
		Product readIDToUpdateProductMessage(int id);	//讀取產品id去更改產品資料
		
		
	//update   修理商品
		void update(Product product);	//修理商品的資料
		
		
	//delete
		
		void delete(Product product);		//消滅商品
	
	
	
	
	
	
}
