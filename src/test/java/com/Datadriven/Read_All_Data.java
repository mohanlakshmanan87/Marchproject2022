package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.IIOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import okhttp3.Call;

public class Read_All_Data {
	
	private static void alldata() throws IOException {
		
			File f= new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\table.xlsx");
			
			FileInputStream fis= new FileInputStream(f);
			
			Workbook wb= new XSSFWorkbook(fis);
			
			Sheet s= wb.getSheetAt(0);
			
			for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
				
				Row r = s.getRow(i);
				
				
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					
					
			     Cell c = r.getCell(j);
			     
			       CellType type = c.getCellType();
					
				if (type.equals(CellType.STRING)) {
				
					 String value = c.getStringCellValue();
					
					System.out.println(value);
					
				}	
				
				else if (type.equals(CellType.NUMERIC)) {
				
					double  numericvalue = c.getNumericCellValue();
					
					int v= (int) numericvalue;
					 
				
				String value = Integer.toString(v);
				
				System.out.println(value);	
					
					
				}	
					
				}
				
				
			}
			
       wb.close();
	
	}
	
      public static void main(String[] args) throws IOException {
	
	
	alldata();
	
	
	
	
	}
	
	
	
	

}
