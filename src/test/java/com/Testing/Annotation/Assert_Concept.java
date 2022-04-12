package com.Testing.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {
	
	
	
/*
	@Test
	private void username1() {
		

	
	String actual_Username = "Jackson";
	
	Assert.assertTrue(false);
	
	System.out.println("Assert Validation");
		
		
}
	*/
	
	@Test
	private void username1() {
		

    String actual_Username = "Jackson";
    
	String Exp_Username = "Jackson1";
	
   SoftAssert soft = new SoftAssert();
   
   soft.assertEquals(actual_Username, Exp_Username);
	
	System.out.println("Assert Validation");
		
	}	
	
	
	
	
	
}


