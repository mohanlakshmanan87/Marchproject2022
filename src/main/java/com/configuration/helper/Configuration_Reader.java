package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
  public Configuration_Reader() throws Throwable {
	  
	  
	  File f = new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\src\\main\\java\\configuration.properties");
	  
	  FileInputStream fis = new FileInputStream(f);
	  
	  p = new Properties();
	  
	  p.load(fis);
	  
	 }
	
	 public String get_config_url() {
	
		 String value = p.getProperty("url");
		 
		 return value;
		

	} 
	
	 public String getusername() {
		  
		 String value = p.getProperty("username");
		 
		 return value;

	}
	 
	 public String getpassword() {
		  
		 String value = p.getProperty("passwd");
		 
		 return value;

	}
	 
	 
	   public  String getquantity() {
		
		 String value =  p.getProperty("3");
		   
		   return value;

	}
	 
	 

}
