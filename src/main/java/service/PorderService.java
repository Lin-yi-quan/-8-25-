package service;

import java.util.List;

import model.Porder;
import model.Product;

public interface PorderService 
{
	
		//create 新增訂單
		void addPorder(Porder porder);//新增訂單
		public void addPorder(List<Product> products, int consumerId, int employeeId);
		
		
		
		//read
		List<Porder>showAllPorder();//後臺員工看所有的訂單
		List<Porder>lookMyPorder();//客人看自己的訂單
		
		
		
		//update
		boolean updatePorder(Porder porder); //修理訂單
		
		
		
		//delete
		boolean deletePorder(Porder porder);//消滅訂單
	
	
	
}
