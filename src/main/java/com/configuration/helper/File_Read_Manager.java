package com.configuration.helper;

public class File_Read_Manager {
	

	 public File_Read_Manager() {
			
			 
	}
	  
 public static File_Read_Manager get_Instance_FRM() {
	 
	 File_Read_Manager helper = new File_Read_Manager();
	 
	 return helper;
	

}
	
 
  public Configuration_Reader get_Instance_CR() throws Throwable {
	  
	  Configuration_Reader reader = new Configuration_Reader();
	  
	  return reader;
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
