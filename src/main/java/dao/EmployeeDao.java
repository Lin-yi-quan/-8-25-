package dao;

import java.util.List;

import model.Consumer;
import model.Employee;
import model.Porder;

public interface EmployeeDao 
{

	//create 雇用新員工
	void add(Employee employee);
	
	//read  查詢員工
	Employee read(String username,String password);  //讀取員工的帳號和密碼
	Employee readByUsername(String employeeName);	//讀取員工
	Employee getBenefits(String username);//讀取員工的福利
	Employee punish(String username); //讀取員工的違規紀錄
	
	List<Employee>selectAll();
	Employee readIDToUpdateEmployeeMessage(int id);	//讀取員工id去更改員工資料
	
	
	
	
	//update  修理員工
	
	void update(Employee employee);//修理員工的資料
	

	
	
	//delete  消滅員工
	
	void delete(Employee employee);	//消滅員工
}
