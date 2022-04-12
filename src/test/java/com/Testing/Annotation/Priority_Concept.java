package com.Testing.Annotation;

import org.testng.annotations.Test;

import com.Adactin.pom.LoginPage;

public class Priority_Concept {
	
	   @Test(priority=-1)
	   private void username() {
		System.out.println("username");

	}
	   @Test(priority=0)
	  private void password() {
		 System.out.println("password");

	}
	   @Test(priority=1)
	   private void login() {
		System.out.println("login");

	}
	
	
	
	
	
	
	
	
	
	

}
