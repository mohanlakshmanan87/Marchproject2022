package com.Testing.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Runner {
	
	@Test(retryAnalyzer = Retry_Class.class)
	  private void username() {
		  
		  String exp_username ="maddy";
		  
		  String actual_username = "maddy123";
		  
		  
		  Assert.assertEquals(actual_username, exp_username);
		  
		  

	}
	  
	  
	@Test(retryAnalyzer = Retry_Class.class)
	  private void password() {
		  
		  String exp_passwd ="maddy";
		  
		  String actual_passwd = "maddy777";
		  
		  
		  Assert.assertEquals(actual_passwd, exp_passwd);
		  
		  

	}
	  
	  
	
	
	
	
	
	
	
	
	
	

}
