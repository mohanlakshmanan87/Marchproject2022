package com.RestAPI;



import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.March.Baseclass.Base_Class;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Data_Validation extends Base_Class{
	
	@Test
	  public  void data_validation() throws IOException {
		
String Expectcode = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\PostMan_API\\Adactin_API.xlsx", 4, 3);
		
	  RestAssured.baseURI = "https://reqres.in/";
	  
	  RequestSpecification request = RestAssured.given();
	  
	  Response response = request.get("api/users/2");
	  
	  String string = response.asString();
	  
	  System.out.println(string);
	  
	   
	  int actualcode = response.getStatusCode();
	  
	  Assert.assertEquals(Expectcode,actualcode);
	  
	  System.out.println("Data Validation");
	     
		
		
		
		
		

	
	
	
	
	
	
	
}

}
