package service;

import java.util.List;

import model.Employee;

public interface EmployeeService 
{

	//create
			boolean addEmployee(Employee employee);//執行增加員工	
			
	//read
			Employee login(String username,String password);//執行登入
			Employee read(String EmployeeName);//執行讀取員工
			List<Employee> readAllConsumer();//執行讀取所有清單
			
			
	//update
			boolean updateEmployee(Employee employee);//執行修理顧客
			
			
	//delete	
			
			boolean deleteEmployee(Employee employee);//執行消滅顧客
	
	
	
}
