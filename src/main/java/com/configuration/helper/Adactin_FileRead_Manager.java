package com.configuration.helper;

public class Adactin_FileRead_Manager {
	
	  public Adactin_FileRead_Manager() {
	
	}
			
		 
	 
	 	  
	  public static Adactin_FileRead_Manager get_Instance_FRM() {
	 	 
		  Adactin_FileRead_Manager helper = new Adactin_FileRead_Manager();
	 	 
	 	 return helper;
	 	

	 }
	 	
	  
	   public Adactin_Configuration_Reader get_Instance_CR() throws Throwable {
	 	  
		   Adactin_Configuration_Reader reader = new Adactin_Configuration_Reader();
	 	  
	 	  return reader;
	 	

	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
