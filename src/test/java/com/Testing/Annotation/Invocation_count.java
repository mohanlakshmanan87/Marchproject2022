package com.Testing.Annotation;

import org.testng.annotations.Test;

public class Invocation_count {
	
	
	
	@Test(priority=-1)
 private void browser_Launch(){
	
	System.out.println("Browser Launch");
	
}

	@Test(priority=0)
   private void launch_Url() {
	
	   System.out.println("Launch Url");

}
	@Test(priority=0, invocationCount = 5)
   private void refresh() {
	
	  System.out.println("Refresh"); 
	   
}
	@Test(priority=2)
   private void credentials() {
	
	   System.out.println("credentials");

}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
} 