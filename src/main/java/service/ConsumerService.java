package service;

import java.util.List;

import model.Consumer;

public interface ConsumerService 
{

	//create
		boolean addConsumer(Consumer consumer);//執行增加客人	
		
	//read
		Consumer login(String username,String password);//執行登入
		Consumer read(String username);//執行讀取使用者
		List<Consumer> readAllConsumer();//執行讀取所有清單
		List<Consumer>violationRecord();	//執行讀取違規清單
	//update
		boolean updateConsumer(Consumer consumer);//執行修理顧客
		
	//delete	
		
		boolean deleteConsumer(Consumer consumer);//執行消滅顧客
	
	
	
	
}
