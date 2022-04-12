package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\Desktop\\table.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		    Workbook wb = new XSSFWorkbook();
		    
		    wb.createSheet("DATA").createRow(0).createCell(0).setCellValue("Department");
		    
		    wb.getSheet("DATA").getRow(0).createCell(1).setCellValue("Subject");
		    
		    wb.getSheet("DATA").createRow(1).createCell(0).setCellValue("I.T");
		    
		    wb.getSheet("DATA").getRow(1).createCell(1).setCellValue("Java");
		    
		    FileOutputStream fos = new FileOutputStream(f);
		    
		    wb.write(fos);
		    
		    wb.close();
		
		
		System.out.println("Write Successfully");
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
