package com.Testng_Practice_Project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.March.Baseclass.Base_Class;
import com.Runnerclass.Adactin_pageManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.configuration.helper.Adactin_FileRead_Manager;
import com.pagemanager.AdactPage_object_manager;
import com.pom.Signout;

public class Adactin_TestNG_Runner extends Base_Class {

public static WebDriver driver = browser_configuration("chrome");
	
	public static  AdactPage_object_manager page = new  AdactPage_object_manager(driver);
	
	//public static Logger log = Logger.getLogger(Adactin_pageManager.class);
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	public static ExtentSparkReporter spark_Reporter;
	
	
	
		
	 //  PropertyConfigurator.configure("log4j.properties");
	
	@BeforeTest
    
	 private void report_Generation() {
	
		spark_Reporter = new ExtentSparkReporter
				("C:\\Users\\Admin\\eclipse-workspace\\March2022\\App_Report\\extentreport2.xml");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_Reporter);
		

	}
	
	
	@AfterTest
	
	  private void flush() {
		
		reports.flush();

	}
	
	 @BeforeClass
		private void geturl() throws Throwable {
		
		String url = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
		
	    getUrl(url);
	    
	    System.out.println("Url Launch");
	     
	   }
	    

	    @BeforeMethod
	     
	     private void signin() throws Throwable {
	     
       //username
	    	 
	    String username = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getusername();	 
		inputvalueelement(page.getLogin().getUsername(), username);
	
	   //password
		
		 String passwd = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getpassword();
	     inputvalueelement(page.getLogin().getPassword(), passwd);
	    
	    //login
	      clickonElement(page.getLogin().getlogin());
	      
	      System.out.println("Credentials Entered in Field");
	      
	      System.out.println("Login successfully");
	      
	      
	     }
	      
	     
	       @Test
	      
	      private void HotelBooking() throws Throwable {
	    	  
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
		
		System.out.println("Navigate to another page Successfully");
		
		//select radiobution
		clickonElement(page.getB().getRadiobutton());
		
		// continue
	    clickonElement(page.getB().getNext());
		
        //Firstname
	    
	    String fname =  Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getfname();
        inputvalueelement(page.getBook().getFname(), fname);
        
        //Lastname
        
        String lname = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getlname();
        inputvalueelement(page.getBook().getLname(), lname);
        
        //Address
        
        String address = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getaddress();
        inputvalueelement(page.getBook().getAddress(), address);
        
        //CreditCard number
        
        String creditcardno= Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getcreditcardno();
        inputvalueelement(page.getBook().getCreditcardno(), creditcardno);
        
		//Credit Card Type
         dropdown("byindex", page.getBook().getCardtype(), "2");	
   
        // CC Expiry month
         dropdown("bytext", page.getBook().getMonth(), "October");
			
        // CC Expiry Year
         dropdown("bytext", page.getBook().getYear(), "2022");
	
		// Card CVV NO
         
         
	     String cvvno = Adactin_FileRead_Manager.get_Instance_FRM().get_Instance_CR().getccvno();
	     inputvalueelement(page.getBook().getCvvno(), cvvno);
        
        
		
		// Booking
        clickonElement(page.getBook().getBooking());
        
        System.out.println("All Details Entered Successfully");
        
	      }
        
        @AfterMethod
        
        private void Signout() {
		
		// Logout
	    clickonElement(page.getL().getLogout());
	    
	    System.out.println("Signout Successfully");
	    
        }
	    
	    @AfterClass
	    
	     private void quit() {
			
	    	driver.close();

		}

		}
		
	
	
	
	   
		
	
