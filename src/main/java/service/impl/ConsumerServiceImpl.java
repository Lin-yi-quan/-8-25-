package service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.impl.ConsumerDaoImpl;
import model.Consumer;
import model.Porder;
import service.ConsumerService;
import util.DbConnection;

public class ConsumerServiceImpl implements ConsumerService {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	private static ConsumerDaoImpl consumerDaoImpl=new ConsumerDaoImpl();
//===============================================================
	private static Connection connection=DbConnection.getDb();
//==================================================================
	@Override
	public boolean addConsumer(Consumer consumer) 
	{
		// TODO Auto-generated method stub
		
		boolean isUsernameBeenUse=false;
		Consumer c=consumerDaoImpl.read(consumer.getUsername());
		//~~~~~~~~~~~~~~~~~~
		if(c==null)
		{
			consumerDaoImpl.add(consumer);
			isUsernameBeenUse=true;
		}
		
		
		return isUsernameBeenUse;
	}
//==================================================================
	@Override
	public Consumer login(String username, String password)
	{
		// TODO Auto-generated method stub
		
		
		
		return consumerDaoImpl.read(username,password);
	}
//==================================================================
	@Override
	public Consumer read(String username)
	{
		// TODO Auto-generated method stub
		
		
		return consumerDaoImpl.read(username);
	}
//==================================================================
	@Override
	public List<Consumer> readAllConsumer() 
	{
		// TODO Auto-generated method stub
		
		return consumerDaoImpl.readALL() ;
	}
//==================================================================
	@Override
	public List<Consumer> violationRecord() 
	{
		// TODO Auto-generated method stub
		return consumerDaoImpl.readALL() ;
	}
//==================================================================
	@Override
	public boolean updateConsumer(Consumer consumer)
	{
		// TODO Auto-generated method stub
		Consumer c=consumerDaoImpl.readIDToUpdateConsumerMessage(consumer.getConsumerId());
		
	
		
		boolean x=false;
		if(c!=null)
		{
			x=true;
			consumerDaoImpl.update(consumer);
			
		}
		
		
		return x;
	}
//==================================================================
	@Override
	public boolean deleteConsumer(Consumer consumer)
	{
		// TODO Auto-generated method stub
		Consumer c=consumerDaoImpl.readIDToUpdateConsumerMessage(consumer.getConsumerId());
		boolean x=false;
		if(c!=null)
		{
			x=true;
			consumerDaoImpl.delete(consumer);
		}
		
		return x;
	}
//==================================================================

	
	
	
	
	
	
	
	
	
}
