package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tool {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
//======================================================
public static void saveFile(Object object,String fileName)
{
	try 
	{
		FileOutputStream fileOutputStream=new FileOutputStream(fileName);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(object);
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
//===========================================================
public static Object readFile(String fileName)

{
	Object object=null;
	//~~~~~~~~~~~~~~~~
	try 
	{
		FileInputStream fileInputStream=new FileInputStream(fileName);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		object=objectInputStream.readObject();
	} 
	catch (FileNotFoundException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return object;
	
}


//===========================================================	
}
