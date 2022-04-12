package com.Testing.Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pom.Signout;

public class Annotations_Demo {
	
	
	@BeforeTest
	private void browser_Launch() {
	
		System.out.println("Browser launch");
		
	}
	
	
	@BeforeSuite
	private void setproperty() {
		
		System.out.println("set property");

	}
	
	
	@BeforeClass
	private void geturl() {
		
		System.out.println("Url");

	}
	
	@Test
	private void women() {
		
		System.out.println("Tshirt");

	}
	
	@BeforeMethod
	private void signin() {
		
     System.out.println("signin");

	}
	
	@Test
	private void children() {
		
		System.out.println("Shoes");

	}
	
	
	@AfterMethod
	private void Signout() {
		
		System.out.println("signout");


	}
	
	
	@AfterClass
	private void Verify_Homepage() {
		
		System.out.println("Assert");


	}
	
	@AfterTest
	private void close() {
		
		System.out.println("close");

	}
	
	@AfterSuite
	private void deleteAllCookies() {
		
		System.out.println("Delete All Cookies");

	}
	
	
	
	

}
