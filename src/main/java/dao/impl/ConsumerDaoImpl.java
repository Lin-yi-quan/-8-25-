package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ConsumerDao;
import model.Consumer;
import model.Porder;
import util.DbConnection;

public class ConsumerDaoImpl  implements ConsumerDao
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
	public void add(Consumer consumer) 
	{
		// TODO Auto-generated method stub
		String sql="insert into consumer(name,username,password,address,phone,email,nationality,gender,"
				+ "bloodType,zodiacSign,job,age,height,weight)"
				  +"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, consumer.getName());
			preparedStatement.setString(2, consumer.getUsername());
			preparedStatement.setString(3, consumer.getPassword());
			preparedStatement.setString(4, consumer.getAddress());
			preparedStatement.setString(5, consumer.getPhone());
			preparedStatement.setString(6, consumer.getEmail());
			preparedStatement.setString(7, consumer.getNationality());
			preparedStatement.setString(8, consumer.getGender());
			preparedStatement.setString(9, consumer.getBloodType());
			preparedStatement.setString(10, consumer.getZodiacSign());
			preparedStatement.setString(11, consumer.getJob());
			preparedStatement.setInt(12, consumer.getAge());
			preparedStatement.setInt(13, consumer.getHeight());
			preparedStatement.setInt(14, consumer.getWeight());
			
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
	public Consumer read(String username, String password) 
	{
		// TODO Auto-generated method stub
		Consumer consumer=null;
		String sql="select * from consumer where username=?and password=?";
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
						consumer=new Consumer();
						consumer.setConsumerId(resultSet.getInt("consumerId"));
						consumer.setName(resultSet.getString("name"));
						consumer.setUsername(resultSet.getString("username"));
						
					}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return consumer;
	}
//============================================================
	@Override
	public Consumer read(String username) 
	{
		// TODO Auto-generated method stub
		Consumer consumer=null;
		String sql="select * from consumer where username=?";
		//~~~~~~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				consumer=new Consumer();
				consumer.setConsumerId(resultSet.getInt("consumerid"));
				consumer.setName(resultSet.getString("name"));
				consumer.setUsername(resultSet.getString("username"));
				
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return consumer;
	}
//============================================================
	@Override
	public List<Consumer> readALL() 
	{
		// TODO Auto-generated method stub
		String sql="select*from consumer";
		List<Consumer>consumerList=new ArrayList();
		
		//=======================
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~
			while(resultSet.next())
			{
				Consumer consumer=new Consumer();
				consumer.setConsumerId(resultSet.getInt("consumerId"));
				consumer.setName(resultSet.getString("name"));
				
				
				
				consumerList.add(consumer);
			}
			
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		return consumerList;
	}
//============================================================
	@Override
	public List<Consumer> violationRecord() 
	{
		// TODO Auto-generated method stub
		String sql="select*from consumer";
		List<Consumer>consumerList=new ArrayList();
		
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Consumer consumer=new Consumer();
				consumer.setConsumerId(resultSet.getInt("consumerId"));
				consumer.setName(resultSet.getString("name"));
				consumer.setViolationRecord(resultSet.getString("violationRecord"));
				
				
				
				consumerList.add(consumer);
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
	public Consumer readIDToUpdateConsumerMessage(int id) {
		// TODO Auto-generated method stub
		String sql="select*from consumer where consumerId=?";
		Consumer consumer=null;
		//~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				consumer=new Consumer();
				consumer.setConsumerId(resultSet.getInt("consumerId"));
				
			}

		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return consumer;
	}

//============================================================	
	@Override
	public void update(Consumer consumer) 
	{
		// TODO Auto-generated method stub
		String sql="update consumer set name=?,username=?,password=?,address=?,phone=?,email=?,"
				+ "nationality=?,gender=?,bloodType=?,zodiacSign=?,job=?,"
				+ "age=?,height=?,weight=? where consumerId=?";
		//~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, consumer.getName());
			preparedStatement.setString(2, consumer.getUsername());
			preparedStatement.setString(3, consumer.getPassword());
			preparedStatement.setString(4, consumer.getAddress());
			preparedStatement.setString(5, consumer.getPhone());
			preparedStatement.setString(6, consumer.getEmail());
			preparedStatement.setString(7, consumer.getNationality());
			preparedStatement.setString(8, consumer.getGender());
			preparedStatement.setString(9, consumer.getBloodType());
			preparedStatement.setString(10, consumer.getZodiacSign());
			preparedStatement.setString(11, consumer.getJob());
			preparedStatement.setInt(12, consumer.getAge());
			preparedStatement.setInt(13, consumer.getHeight());
			preparedStatement.setInt(14, consumer.getWeight());
			preparedStatement.setInt(15, consumer.getConsumerId());
			
			
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
	public void delete(Consumer consumer) 
	{
		// TODO Auto-generated method stub
		String sql="delete from consumer where consumerId=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,consumer.getConsumerId());
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
