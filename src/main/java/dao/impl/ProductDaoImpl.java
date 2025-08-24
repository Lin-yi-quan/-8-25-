package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ProductDao;
import model.Employee;
import model.Product;
import util.DbConnection;

public class ProductDaoImpl implements ProductDao {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
//=================================================================
	private static Connection connection=DbConnection.getDb();	
//=================================================================

	@Override
	public void add(Product product) 
	{
		// TODO Auto-generated method stub
		String sql="insert into product(name,price,stock,google)"+"values(?,?,?,?)";
		//~~~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, product.getStock());
			preparedStatement.setString(4, product.getGoogle());
			
			preparedStatement.executeUpdate();
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//=================================================================
	@Override
	public Product readProductMessage(int productId) 
	{
		// TODO Auto-generated method stub
		
		Product product=null;
		String sql="select*from product where productId=?";
		
		//~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			//~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				product=new Product();
				product.setProductId(resultSet.getInt("productId"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getInt("price"));
			
			} 
		}	
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return product;
	}
//=================================================================
	@Override
	public List<Product> readAll() 
	{
		// TODO Auto-generated method stub
		String sql="select*from product where active = true";// 只查詢上架的商品
		
		List<Product>l=new ArrayList();
		//~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~~
			while(resultSet.next())
			{
				Product product=new Product();
				product.setProductId(resultSet.getInt("productId"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getInt("price"));
				l.add(product);
				
			}
		} 
		
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
//==================================================================
	@Override
	public Product readIDToUpdateProductMessage(int id) {
		// TODO Auto-generated method stub
		String sql="select*from product where id=?";
		Product product=null;
		//~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			//~~~~~~~~~~~~~~~~~~~~~
			if(resultSet.next())
			{
				product=new Product();
				product.setProductId(resultSet.getInt("id"));
				
			}
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
//=================================================================
	@Override
	public void update(Product product) 
	{
		// TODO Auto-generated method stub
		String sql="update product set name=?,price=?,stock=?,google=? where productId=?";
		
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setString(1, product.getName());
			preparedStatement.setInt(2, product.getPrice());
			preparedStatement.setInt(3, product.getStock());
			preparedStatement.setString(4, product.getGoogle());
			
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//=================================================================
	@Override
	public void delete(Product product) 
	{
		String sql="delete from product where id=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,product.getProductId());
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//=================================================================	
	
}
