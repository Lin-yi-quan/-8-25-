package service.impl;

import java.util.List;

import dao.impl.EmployeeDaoImpl;
import dao.impl.ProductDaoImpl;
import model.Employee;
import model.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
//======================================================
	private static  ProductDaoImpl  productDaoImpl=new ProductDaoImpl();
//======================================================	

	@Override
	public boolean addProduct(Product product)
	{
		// TODO Auto-generated method stub
		boolean isproductnameBeenUse=false;
		Product e=productDaoImpl.readProductMessage(product.getProductId());
		//~~~~~~~~~~~~~~~~~~
		if(e==null)
		{
			productDaoImpl.add(product);
			isproductnameBeenUse=true;
		}
		
		
		return isproductnameBeenUse;
	}
//======================================================	
	@Override
	public List<Product> readAllProduct() 
	{
		// TODO Auto-generated method stub
		return productDaoImpl.readAll();
		
	}

//======================================================		
	@Override
	public List<Product> readAllProductforAdmin() 
	{
		// TODO Auto-generated method stub
		return productDaoImpl.readAll();
	}
//======================================================	
	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product p=productDaoImpl.readIDToUpdateProductMessage(product.getProductId());
		
	
		
		boolean x=false;
		if(p!=null)
		{
			x=true;
			productDaoImpl.update(product);
			
		}
		
		
		return x;
	}
//======================================================	
	@Override
	public boolean deleteProduct(Product product)
	{

		// TODO Auto-generated method stub
		Product p=productDaoImpl.readIDToUpdateProductMessage(product.getProductId());
		boolean x=false;
		if(p!=null)
		{
			x=true;
			productDaoImpl.delete(product);
		}
						
		return x;
	}
//======================================================	
	
}
