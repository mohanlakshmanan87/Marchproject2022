package com.Sdp;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.March.Baseclass.Base_Class;
import com.Runnerclass.Adactin_pageManager;
import com.configuration.helper.Adactin_FileRead_Manager;
import com.pagemanager.AdactPage_object_manager;

public class Adactin_SDP extends Base_Class  {
	
public static WebDriver driver = browser_configuration("chrome");
	
	public static  AdactPage_object_manager page = new  AdactPage_object_manager(driver);
	
	public static Logger log = Logger.getLogger(Adactin_pageManager.class);
	
	public static void main(String[] args) throws Throwable{
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		String url = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
		
	    getUrl(url);
	    
	    
	    log.info("Url Launch");
	
	
	     String username = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getusername();
	    
	     String passwd = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getpassword();
	    
	     String fname =  Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getfname();
	    
	     String lname = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getlname();
	    
	     String address = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getaddress();
	     
	     String creditcardno= Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getcreditcardno();
	     
	     String cvvno = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getccvno();
	     
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
		
		  log.info("naviagte to another page");
		
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
        inputvalueelement(page.getBook().getCreditcardno(), creditcardno);
        
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
	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


