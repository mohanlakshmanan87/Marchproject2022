package com.Runnerclass;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.March.Baseclass.Base_Class;
import com.pagemanager.AdactPage_object_manager;

public class Adactin_pageManager extends Base_Class {
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static  AdactPage_object_manager page = new  AdactPage_object_manager(driver);
	
	public static Logger log = Logger.getLogger(Adactin_pageManager.class);
	
	public static void main(String[] args) throws IOException{
		
		
		PropertyConfigurator.configure("log4j.properties");
		
	    getUrl("https://adactinhotelapp.com/");
	    
	    log.info("Url Launch");
	
	    String username = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 2, 5);
	    
	    String passwd = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 3, 5);
	    
	    String fname = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 22, 5);
	    
	    String lname = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 23, 5);
	    
	    String address = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 21, 5);
	    
	    String cvvno = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\Adactin project Test Case.xlsx", 27, 5);
		
       //username
		inputvalueelement(page.getLogin().getUsername(), username);
	
	   //password
	     inputvalueelement(page.getLogin().getPassword(), passwd);
	    
	    //login
	      clickonElement(page.getLogin().getlogin());
	      
	      log.info("Credentials Entered in Field");
	    
	   //Select location
         dropdown("byindex", page.getHotel().getLocation(), "1");
		
		//select Hotel
		dropdown("byindex", page.getHotel().getHotel(), "2");

		// selectRoom type
		dropdown("bytext", page.getHotel().getRoomtype(), "Deluxe");
		
		// No.of rooms
		dropdown("byvalue", page.getHotel().getNumberofrooms(), "5");
		
		// Checkindate
		inputvalueelement(page.getHotel().getCheckindate(), "16/02/2022");
		
       // Checkoutdate
	    inputvalueelement(page.getHotel().getCheckoutdate(), "17/02/2022");
		
		//Adults per Room
        dropdown("byvalue", page.getHotel().getAdultsperroom(), "2");			
			
		//Child per Room
        dropdown("byindex", page.getHotel().getChildperroom(), "1");			
	
	   // Search
		clickonElement(page.getHotel().getSearch());
		
		  log.info("navigate to another page");
		
		//select radiobution
		clickonElement(page.getB().getRadiobutton());
		
		// continue
	    clickonElement(page.getB().getNext());
		
        //Firstname
        inputvalueelement(page.getBook().getFname(), fname);
        
        //Lastname
        inputvalueelement(page.getBook().getLname(), lname);
        
        //Address
        inputvalueelement(page.getBook().getAddress(), address);
        
        //CreditCard number
        inputvalueelement(page.getBook().getCreditcardno(), "5436789093453690");
        
		//Credit Card Type
         dropdown("byindex", page.getBook().getCardtype(), "2");	
   
        // CC Expiry month
         dropdown("bytext", page.getBook().getMonth(), "October");
			
        // CC Expiry Year
         dropdown("bytext", page.getBook().getYear(), "2022");
	
		// Card CVV NO
        inputvalueelement(page.getBook().getCvvno(), cvvno);
        
        log.info("All Details Entered Successfully");
		
		// Booking
        clickonElement(page.getBook().getBooking());
		
		// Logout
	    clickonElement(page.getL().getLogout());
	    
	    log.info("Logout successfully");
		
	
	}
}	
	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


