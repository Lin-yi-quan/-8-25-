package service.impl;

import java.util.List;

import dao.impl.ConsumerDaoImpl;
import dao.impl.EmployeeDaoImpl;
import model.Consumer;
import model.Employee;
import service.ConsumerService;
import service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	private static  EmployeeDaoImpl  employeeDaoImpl=new EmployeeDaoImpl();
//=========================================================
	@Override
	public boolean addEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		boolean isemployeenameBeenUse=false;
		Employee e=employeeDaoImpl.readByUsername(employee.getUsername());
		//~~~~~~~~~~~~~~~~~~
		if(e==null)
		{
			employeeDaoImpl.add(employee);
			isemployeenameBeenUse=true;
		}
		
		
		return isemployeenameBeenUse;
	}
//=========================================================
	@Override
	public Employee login(String username, String password) 
	{
		// TODO Auto-generated method stub
		return employeeDaoImpl.read(username,password);
	}
//=========================================================
	@Override
	public Employee read(String username) 
	{
		// TODO Auto-generated method stub
		return employeeDaoImpl.readByUsername(username);
	}
//=========================================================
	@Override
	public List<Employee> readAllConsumer() 
	{
		// TODO Auto-generated method stub
		
		
		return employeeDaoImpl.selectAll();
	}
//=========================================================
	
//=========================================================
	@Override
	public boolean updateEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		Employee e=employeeDaoImpl.readIDToUpdateEmployeeMessage(employee.getEmployeeId());
		
	
		
		boolean x=false;
		if(e!=null)
		{
			x=true;
			employeeDaoImpl.update(employee);
			
		}
		
		
		return x;
	}
//=========================================================
	@Override
	public boolean deleteEmployee(Employee employee) 
	{
		// TODO Auto-generated method stub
		Employee e=employeeDaoImpl.readIDToUpdateEmployeeMessage(employee.getEmployeeId());
		boolean x=false;
		if(e!=null)
		{
			x=true;
			employeeDaoImpl.delete(employee);
		}
				
		return x;
	}
//=========================================================
}
