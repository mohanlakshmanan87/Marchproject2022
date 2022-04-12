package com.Testing.Annotation;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	
	   @Test(timeOut=8000)
	   private void browser_Execution() throws InterruptedException {
		   
		   
		Thread.sleep(2000);   
		
		System.out.println("Browser Launch");
		
		Thread.sleep(1000);  
		
		System.out.println("Url Launch");
		
		Thread.sleep(2000);
		
		System.out.println("Crenditials Entered");
		
		Thread.sleep(1000);
		
		System.out.println("Next Page");
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
