package com.Testing.Annotation;

import org.testng.annotations.Test;

public class Expeted_Exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	 private void calculator() {
	
		 int a =20;
		 
		 System.out.println(a/2);
		 
		 System.out.println("Display tht output");
		 

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
