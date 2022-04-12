package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Adactin_Configuration_Reader {
	
	
	public static Properties p;
		
		
	  public Adactin_Configuration_Reader() throws Throwable {
		  
		  
		  File f = new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\src\\main\\java\\Adactin.properties");
		  
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
		 
		 public String getfname() {
			
			 String value = p.getProperty("firstname");
			 
			 return value;

		}
		 
		 public String getlname() {
				
			 String value = p.getProperty("lastname");
			 
			 return value;

		}
		 
		 public String getaddress() {
				
			 String value = p.getProperty("address");
			 
			 return value;

		}
		 
		 public String getcreditcardno() {
				
			 String value = p.getProperty("creditcardno");
			 
			 return value;

		}
		 
		 
		 public String getccvno() {
				
			 String value = p.getProperty("cvvno");
			 
			 return value;

		}
		 

	}

