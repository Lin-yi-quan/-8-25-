package dao;

import java.util.List;

import model.Consumer;
import model.OrderItem;
import model.Porder;
import model.Product;

public interface PorderDao 
{
		//create  新增訂單
		void add(Porder porder); //增加訂單
		public void addPorder(List<OrderItem> items, int consumerId, int employeeId);
		
		
		//read
		
		List<Porder>readAll();  //讀取所有的訂單
		List<Porder>iReadMyPorder();  //讀取自己的訂單
		Porder readIDToUpdatePorderMessage(int id);	//讀取訂單id去更改訂單資料
		
		
		
		//update   修理訂單
		void update(Porder porder);	//幫客人修理訂單
		
		
		//delete
		
		void delete(Porder porder);	//幫客人消滅訂單
	
	
	
}
