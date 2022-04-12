package com.RestAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class Json_Validation {
	
	
	 @Test
	  public void jsonvalidation() throws IOException, ParseException {
	
        File f = new File("C:\\Users\\Admin\\eclipse-workspace\\March2022\\src\\test\\java\\com\\RestAPI\\payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(reader);
		 
		JSONObject jsonobj = (JSONObject) obj;
		
		Object object = jsonobj.get("Name");
		
		Object object1 = jsonobj.get("Role");
		  
		String value = object.toString();
		
		String value1 = object1.toString();
		
		System.out.println("Name :" +" "+value);
		
		System.out.println("Role :" +" "+value1);
	
	
	
	

}

}	