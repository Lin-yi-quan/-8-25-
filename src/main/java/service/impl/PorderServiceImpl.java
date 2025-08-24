package service.impl;

import java.util.List;

import dao.impl.PorderDaoImpl;
import model.Porder;
import model.Product;
import service.PorderService;

public class PorderServiceImpl implements PorderService{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
//====================================================
private static PorderDaoImpl porderDaoImpl=new PorderDaoImpl();
//====================================================
	@Override
	public void addPorder(Porder porder) 
	
	{
		// TODO Auto-generated method stub
		
		
		porderDaoImpl.add(porder);
	}
//====================================================
	@Override
	public void addPorder(List<Product> products, int consumerId, int employeeId)
	{
		
		
		
		
		
		
	}
	
//====================================================	
	@Override
	public List<Porder> showAllPorder() 
	{
		// TODO Auto-generated method stub
		return porderDaoImpl.readAll();
	}
//====================================================
	@Override
	public List<Porder> lookMyPorder() 
	{
		// TODO Auto-generated method stub
		return porderDaoImpl.iReadMyPorder();
	}
//====================================================
	@Override
	public boolean updatePorder(Porder porder) 
	{
		// TODO Auto-generated method stub
		Porder p=porderDaoImpl.readIDToUpdatePorderMessage(porder.getPorderId());
		
	
		
		boolean x=false;
		if(p!=null)
		{
			x=true;
			porderDaoImpl.update(porder);
			
		}
		
		
		return x;
	}
//====================================================
	@Override
	public boolean deletePorder(Porder porder)
	{
		// TODO Auto-generated method stub
		Porder p=porderDaoImpl.readIDToUpdatePorderMessage(porder.getProductId());
		boolean x=false;
		if(p!=null)
		{
			x=true;
			porderDaoImpl.delete(porder);
		}
								
		return x;
	}
//====================================================
}
