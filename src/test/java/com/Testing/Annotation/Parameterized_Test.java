package com.Testing.Annotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	  @Test
	  @Parameters({"username","password"})
	  private void credentails(String username, int password) {
		  
		  System.out.println("username:"+ username);
		  
		  System.out.println("password:"+password);
		
		  
		  
		  

	}
	
	  //Optional Parameterized for case sensitive
	
	  @Test
	  @Parameters({"username","password"})
	  private void credentail(@Optional("Maddy")String username, int password) {
		  
		  System.out.println("username:"+ username);
		  
		  System.out.println("password:"+password);
		
		  
		  
		  

	}
	
	
	
	
	
	
	
	
	
	

}
