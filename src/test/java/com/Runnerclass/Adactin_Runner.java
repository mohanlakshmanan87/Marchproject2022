package com.Runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.March.Baseclass.Base_Class;

public class Adactin_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args){
		
		 driver = browser_configuration("chrome");

		getUrl("https://adactinhotelapp.com/");
		
       //username
		
	    WebElement username = driver.findElement(By.id("username"));
	    inputvalueelement(username, "maddymohan");
	
	  //password
	    
	    WebElement password = driver.findElement(By.id("password"));
	    inputvalueelement(password, "tendulkar@200");
	    
	 //login
	    
	    WebElement login = driver.findElement(By.id("login"));
	    clickonElement(login);
	    
	   //Select location
	    
		WebElement location = driver.findElement(By.id("location"));
		dropdown("byindex", location, "1");
		
		//select Hotel
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		dropdown("byindex", hotel, "2");

		
		// selectRoom type
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		dropdown("bytext", roomtype, "Deluxe");
		
		// No.of rooms
		
	    WebElement numberofrooms = driver.findElement(By.id("room_nos"));
	    dropdown("byvalue", numberofrooms, "5");
		
		// Checkindate
		
		WebElement checkindate = driver.findElement(By.id("datepick_in"));
		inputvalueelement(checkindate, "16/02/2022");
		

		// Checkoutdate
	    WebElement checkoutdate = driver.findElement(By.id("datepick_in"));
		inputvalueelement(checkoutdate, "17/02/2022");
		
		//Adults per Room

	    WebElement adultsperroom = driver.findElement(By.id("adult_room"));
	    dropdown("byvalue", adultsperroom, "2");			
			
		//Child per Room

	    WebElement childrenperroom = driver.findElement(By.id("child_room"));
	    dropdown("byindex", childrenperroom, "1");			
	
		
		// Search
		
		WebElement search = driver.findElement(By.id("Submit"));
		clickonElement(search);
		
		
		//select radiobution
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		clickonElement(radiobutton);
		
		// continue
		
        WebElement next = driver.findElement(By.id("continue"));
        clickonElement(next);
		
        //Firstname
        
        WebElement fname = driver.findElement(By.id("first_name"));
        inputvalueelement(fname, "Mono");
        
        //Lastname
        
        WebElement lname = driver.findElement(By.id("last_name"));
        inputvalueelement(lname, "Mohan");
        
        //Address
        
        WebElement address= driver.findElement(By.id("address"));
        inputvalueelement(address, "No.504,cross street,t.nagar,chennai600087");
        
        //CreditCard number
        
        WebElement creditcardno= driver.findElement(By.id("cc_num"));
        inputvalueelement(creditcardno, "1234554321678909");
        
		//Credit Card Type
        WebElement cardtype = driver.findElement(By.id("cc_type"));
     	dropdown("byindex", cardtype, "2");	
   
        // CC Expiry month

		WebElement month = driver.findElement(By.id("cc_exp_month"));
	    dropdown("bytext", month, "October");
			
        // CC Expiry Year

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		 dropdown("bytext", year, "2022");
	
		// Card CVV NO

	    WebElement cvvno = driver.findElement(By.xpath("(//input[@class='reg_input'])[4]"));
		inputvalueelement(cvvno, "985");
		
		// Booking

	    WebElement booking = driver.findElement(By.id("book_now"));
		clickonElement(booking);
		
		// Logout
		
		WebElement logout = driver.findElement(By.id("logout"));
		clickonElement(logout);
		
	
	}
}	
	   
		
	
	
	
	
	
	
	
	
	
	
	
	


