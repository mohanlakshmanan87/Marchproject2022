package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.binary.XSSFBCommentsTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	private static void paricular_Cell_Data() throws IOException {
		
		
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\table.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
		Workbook wb= new XSSFWorkbook(fis);
		
		Sheet s= wb.getSheetAt(0);
		
		 Row r = s.getRow(3);
		 
		 Cell c = r.getCell(2);
		 
		 CellType type = c.getCellType();
		 
		 if (type.equals(CellType.STRING)) {
			 
			   String cellValue = c.getStringCellValue();
			   
			   System.out.println(cellValue);
			
		}
		
		 else if (type.equals(CellType.NUMERIC)) {
			 
			 
			 double cellvalue = c.getNumericCellValue();
			 
			 int value = (int) cellvalue;
			 
			 System.out.println("Weight is" +" " +value);
			
		}
		 
		 wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
	paricular_Cell_Data();
		
	}

}
	
		 
		 
		 
		 
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


