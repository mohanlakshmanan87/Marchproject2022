package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_RowData {
	
	
	private static void particularrowdata() throws  IOException {
		
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\table.xlsx");        
        
		FileInputStream fis= new FileInputStream(f);                                                       
		                                                                                                   
		Workbook wb= new XSSFWorkbook(fis);                                                                
		                                                                                                   
		Sheet s= wb.getSheetAt(0);    
		
		 Row r = s.getRow(3);
		 

		                                                                                                   
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {  
			
			Cell c = r.getCell(i);
			
		     CellType type = c.getCellType();                 
             
		     if (type.equals(CellType.STRING)) {                 
		                                                         
		     	 String value = c.getStringCellValue();         
		     	                                                
		     	System.out.println(value);                      
		     	                                                
		     }	                                                
		                                                         
		     else if (type.equals(CellType.NUMERIC)) {           
		                                                         
		     	double  numericvalue = c.getNumericCellValue(); 
		     	                                                
		     	int v = (int) numericvalue;                      
		     	                                                
		                                                         
		     String value = Integer.toString(v);                 
		                                                         
		     System.out.println(value);	                        
		     	                                             
 }	                                                      
             
}                                                         
             
wb.close();                                                        
             
}                                                                     
             
public static void main(String[] args) throws IOException {         
             	                                                                       
		particularrowdata();                                                                                               
		
		
		

	
	
	
	
	
	
}
	
}