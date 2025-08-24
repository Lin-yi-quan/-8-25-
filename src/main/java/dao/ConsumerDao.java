package dao;

import java.util.List;

import model.Consumer;
import model.Porder;

public interface ConsumerDao 
{

	//create  新增會員
	void add(Consumer consumer);
	
	
	
	//read
	Consumer read(String username,String password);  //讀取帳號和密碼
	Consumer read(String username);	//讀取使用者
	Consumer readIDToUpdateConsumerMessage(int id);	//讀取id
	
	
	
	
	//~~~~~~~~~	
	List<Consumer>readALL();  //讀取全部清單
	List<Consumer>violationRecord();	//讀取違規清單
	
	
	//update   修理客人
	void update(Consumer consumer);	//修理顧客的資料
	
	
	//delete
	
	void delete(Consumer consumer);		//消滅顧客
}
