package com.Testing.Annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Test {
	
    
	@Test
	 private void mobile() {
     System.out.println("mobile");

	}
	
	@Test(dependsOnMethods = "mobile")
	 private void offer() {
	 System.out.println("offer");

	}
	
	
	@Test(priority=-2)
	private void watch() {
	System.out.println("watch");
	

	}
	
	
	
	
	
	
	

}







