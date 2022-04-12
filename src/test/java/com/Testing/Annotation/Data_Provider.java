package com.Testing.Annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Data_Provider {
	
	
	 @Test(dataProvider = "test_Data")
	 private void adactin_Runner(String username, int password) {
		 
          System.out.println("username:"+ username);
		  
		  System.out.println("password:"+password);
		 
		

	}
	    @DataProvider
	    private Object[][] test_Data() {
	    	
	    	return new Object[][] {
		
	    	
	    		{ "madddy",100},
	    		{"madhavan",200},
	    		{"mohan",300}
	    		

		};
	
	
	    }
	    
}   
	    
	
	
	
	
	
	


