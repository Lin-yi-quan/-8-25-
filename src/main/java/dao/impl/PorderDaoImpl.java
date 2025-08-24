package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PorderDao;
import dao.ProductDao;
import model.Employee;
import model.OrderItem;
import model.Porder;
import model.Product;
import util.DbConnection;

public class PorderDaoImpl implements PorderDao{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
//============================================================	
		private static Connection connection=DbConnection.getDb();	
//======================================================
		@Override
		public void add(Porder porder) {
		    String sql = "insert into porder(amount, sum, consumerId, employeeId, productId)"
		        + " values (?, ?, ?, ?, ?)";
		    try {
		        PreparedStatement preparedStatement = connection.prepareStatement(sql);
		        preparedStatement.setInt(1, porder.getAmount());
		        preparedStatement.setInt(2, porder.getSum());
		        preparedStatement.setInt(3, porder.getConsumerId());
		        preparedStatement.setInt(4, porder.getEmployeeId());
		        preparedStatement.setInt(5, porder.getProductId()); // 補上 productId
		        preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
	//======================================================
	@Override
	public void addPorder(List<OrderItem> items, int consumerId, int employeeId) {
	    for (OrderItem item : items) {
	        Product product = item.getProduct();
	        int qty = item.getQuantity();
	        int subTotal = product.getPrice() * qty;

	        Porder porder = new Porder(
	            qty,            // amount
	            subTotal,       // sum
	            consumerId,     // consumerId
	            employeeId,     // employeeId
	            product.getProductId() // productId
	        );
	        this.add(porder); // 呼叫 DaoImpl 的單筆方法
	    }
	}
	
	
//======================================================
	@Override
	public List<Porder> readAll() 
	{
		// TODO Auto-generated method stub
		String sql="select*from porder ";
		List<Porder>porderlist=new ArrayList();
		//~~~~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Porder porder=new Porder();
				porder.setPorderId(resultSet.getInt("porderId"));
				porder.setAmount(resultSet.getInt("amount"));
				porder.setSum(resultSet.getInt("sum"));
				porder.setConsumerId(resultSet.getInt("consumerId"));
				porder.setEmployeeId(resultSet.getInt("employeeId"));
				porder.setProductId(resultSet.getInt("productId"));
				
				porderlist.add(porder);
				
			}
			
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return porderlist;
	}
//======================================================
	@Override
	public List<Porder> iReadMyPorder() 
	{
		// TODO Auto-generated method stub
		String sql="select*from porder ";
		List<Porder>porderlist=new ArrayList();
		//~~~~~~~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next())
			{
				Porder porder=new Porder();
				porder.setPorderId(resultSet.getInt("porderId"));
				porder.setAmount(resultSet.getInt("amount"));
				porder.setSum(resultSet.getInt("sum"));
				porder.setConsumerId(resultSet.getInt("consumerId"));
				porder.setEmployeeId(resultSet.getInt("employeeId"));
				porder.setProductId(resultSet.getInt("productId"));
				
				porderlist.add(porder);
				
			}
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return porderlist;
	}
	
//======================================================
	@Override
	public Porder readIDToUpdatePorderMessage(int id) 
	{
		// TODO Auto-generated method stub
		String sql="select*from porder where id=?";
		Porder porder=null;
		//~~~~~~~~~~~~
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet=preparedStatement.executeQuery();
			
				if(resultSet.next())
				{
					porder=new Porder();
					porder.setPorderId(resultSet.getInt("porderId"));
					
				}
				
				
		} 
		
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return porder;
	
	}
	
	
//======================================================
	@Override
	public void update(Porder porder) 
	{
		// TODO Auto-generated method stub
		String sql="update porder set amount=?,sum=?,consumerId=?,employeeId=? productId=? where id=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, porder.getAmount());
			preparedStatement.setInt(2, porder.getSum());
			preparedStatement.setInt(3, porder.getConsumerId());
			preparedStatement.setInt(4, porder.getEmployeeId());
			preparedStatement.setInt(4, porder.getProductId());
			
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//======================================================
	@Override
	public void delete(Porder porder) 
	{
		String sql="delete from porder where id=?";
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,porder.getPorderId());
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//======================================================
	
}
