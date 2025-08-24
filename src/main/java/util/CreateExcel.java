package util;

import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import model.Porder;

public class CreateExcel {
	static HSSFSheet sheet = null;
    HSSFWorkbook excelbook=new HSSFWorkbook();

    public void create(String FileName,String sheetName,String[] titleName)
    {
    	try {
			FileOutputStream out = new FileOutputStream(FileName);
			
			 sheet = excelbook.createSheet(sheetName);
			 HSSFRow row = sheet.createRow((short) 0);
			 for(int i=0;i<titleName.length;i++)
	         {
	           	row.createCell((short) i).setCellValue(titleName[i]);
	          }
			 excelbook.write(out);
			 out.flush();
			 out.close(); 
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
   
    
    public void insertPorderValue(Porder porder,String fileName,String sheetName)
    {
    	try {
			excelbook = new HSSFWorkbook(new FileInputStream(fileName));
			HSSFSheet sheet = excelbook.getSheet(sheetName);        
	        int count = sheet.getPhysicalNumberOfRows();  
	        
	        HSSFRow row = sheet.createRow((short) count); 
	        
	        row.createCell((short) 0).setCellValue(porder.getPorderId());       
	        row.createCell((short) 1).setCellValue(porder.getAmount());
	        row.createCell((short) 2).setCellValue(porder.getSum());
	       
	        
	        
	        FileOutputStream out;     
	        out = new FileOutputStream(fileName);
	        excelbook.write(out);
	        out.flush();
	        
	        
		} 
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    
    
    
   
    

}
