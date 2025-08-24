package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;
import model.Consumer;
import model.Employee;
import model.Porder;
import util.DbConnection;

public class EmployeeDaoImpl implements EmployeeDao 
{
//============================================================
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
//============================================================	
	private static Connection connection=DbConnection.getDb();	
//============================================================
	@Override
	public void add(Employee employee) 
	{
		// TODO Auto-generated method stub
		String sql="insert into employee(employeeName,username,password,address,phone,email,nationality,gender,"
				+ "bloodType,zodiacSign,education,certifications,portfolio,experience)"
				  +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getUsername());
			preparedStatement.setString(3, employee.getPassword());
			preparedStatement.setString(4, employee.getAddress());
			preparedStatement.setString(5, employee.getPhone());
			preparedStatement.setString(6, employee.getEmail());
			preparedStatement.setString(7, employee.getNationality());
			preparedStatement.setString(8, employee.getGender());
			preparedStatement.setString(9, employee.getBloodType());
			preparedStatement.setString(10, employee.getZodiacSign());
			preparedStatement.setString(11, employee.getEducation());
			preparedStatement.setString(12, employee.getCertifications());
			preparedStatement.setString(13, employee.getPortfolio());
			preparedStatement.setString(14, employee.getExperience());
			
			preparedStatement.executeUpdate();
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//============================================================
	@Override
	public Employee read(String username, String password)
	{
		// TODO Auto-generated method stub
		Employee employee=null;
		String sql="select * from employee where username=?and password=?";
		//~~~~~~~~~~~~~~~~~~~~
		try
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
					//~~~~~~~~~~~~~~
					if(resultSet.next())
					{
						employee=new Employee();
						employee.setEmployeeId(resultSet.getInt("employeeId"));
						employee.setEmployeeName(resultSet.getString("employeeName"));
						employee.setUsername(resultSet.getString("username"));
						
					}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return employee;
	}
//============================================================
	@Override
	public Employee readByUsername(String employeeName) 
	{
		// TODO Auto-generated method stub
		Employee employee=null;
		String sql="select * from employee where username=?";
		//~~~~~~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, employeeName);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				employee=new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeid"));
				employee.setEmployeeName(resultSet.getString("employeename"));
				employee.setUsername(resultSet.getString("username"));
				
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return employee;
	}
//============================================================
	@Override
	public Employee getBenefits(String username)
	{
		// TODO Auto-generated method stub
		Employee employee=null;
		String sql="select*from employee where username=?";
		
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~
			if(resultSet.next())
			{
				 employee = new Employee();
				 employee.setBenefits(resultSet.getString("benefits")); // 這裡是福利
		         employee.setPaidLeave(resultSet.getInt("paidLeave"));
		         employee.setSalary(resultSet.getInt("salary"));
		         employee.setPension(resultSet.getInt("pension"));
			}
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}
//============================================================
	@Override
	public Employee punish(String username)
	{
		// TODO Auto-generated method stub
		Employee employee=null;
		String sql="select violationRecord from employee where username=?";
		//~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~
			if(resultSet.next())
			{
				employee = new Employee();
				employee.setViolationRecord(resultSet.getString("violationRecord"));
				
			}
			
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
//============================================================
	@Override
	public List<Employee> selectAll() 
	{
		// TODO Auto-generated method stub
		String sql="select*from employee ";// 查詢清單上的員工
		List<Employee>e=new ArrayList();
		//~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			//~~~~~~~~~~~~~~~~~~~~~
			while(resultSet.next())
			{
				Employee employee=new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeId"));
				employee.setEmployeeName(resultSet.getString("employeeName"));
				
				e.add(employee);
				
			}
		} 
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return e;
	}
//============================================================
	@Override
	public Employee readIDToUpdateEmployeeMessage(int id) {
		// TODO Auto-generated method stub
		String sql="select*from employee where employeeId=?";
		Employee employee=null;
		//~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				
				employee=new Employee();
				employee.setEmployeeId(resultSet.getInt("employeeId"));
				
			}
				
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}
	
//============================================================

	

//============================================================
	@Override
	public void update(Employee employee) 
	{
		// TODO Auto-generated method stub
		String sql="update employee set employeeName=?,username=?,password=?,address=?,phone=?,email=?,nationality=?,gender=?,"
				+"bloodType=?,zodiacSign=?,education=?,certifications=?,portfolio=?,experience=? where employeeId=?";
		//~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, employee.getEmployeeName());
			preparedStatement.setString(2, employee.getUsername());
			preparedStatement.setString(3, employee.getPassword());
			preparedStatement.setString(4, employee.getAddress());
			preparedStatement.setString(5, employee.getPhone());
			preparedStatement.setString(6, employee.getEmail());
			preparedStatement.setString(7, employee.getNationality());
			preparedStatement.setString(8, employee.getGender());
			preparedStatement.setString(9, employee.getBloodType());
			preparedStatement.setString(10, employee.getZodiacSign());
			preparedStatement.setString(11, employee.getEducation());
			preparedStatement.setString(12, employee.getCertifications());
			preparedStatement.setString(13, employee.getPortfolio());
			preparedStatement.setString(14, employee.getExperience());
			preparedStatement.setInt(15, employee.getEmployeeId());
			
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//============================================================
	
	@Override
	public void delete(Employee employee) {
		String sql="delete from employee where employeeId=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,employee.getEmployeeId());
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
