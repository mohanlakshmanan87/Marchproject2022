package com.Testng_Practice_Project;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.March.Baseclass.Base_Class;
import com.Runnerclass.Automation_PageManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pagemanager.Page_object_Manager;



   public class Annotation_Runner extends Base_Class {
	   
	public static WebDriver driver = browser_configuration("chrome");;
	
	public static Page_object_Manager pom = new Page_object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_PageManager.class);
	
	public static ExtentReports reports;
	
	public static ExtentTest test;
	
	public static ExtentSparkReporter spark_Reporter;
	
	
	@BeforeTest
	    
	 private void report_Generation() {
	
		spark_Reporter = new ExtentSparkReporter
				("C:\\Users\\Admin\\eclipse-workspace\\March2022\\App_Report\\extentreport.xml");
		
		reports = new ExtentReports();
		
		reports.attachReporter(spark_Reporter);
		

	}
	
	
	@AfterTest
	
	  private void flush() {
		
		reports.flush();

	}
	
	
	 @BeforeClass
	private void geturl() {

	    getUrl("http://automationpractice.com/index.php");
	    
	    System.out.println("Url Launch Successfully");
	    
	}
		
	@BeforeMethod
	private void signin() throws IOException{
		
	    //signin
	    
	    clickonElement(pom.getLogin().getSign1());
	    
  	   //Mailid
	    String username = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\automation project test case.xlsx", 23, 5);
	    
		inputvalueelement(pom.getLogin().getMailid1(), username);
		
		
	   //password
		String passwd = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\automation project test case.xlsx", 24, 5);
		
		inputvalueelement(pom.getLogin().getPassword1(), passwd);
		
		//signin
		
	    clickonElement(pom.getLogin().getlogin());
	    
	    System.out.println("Login Successfully");
	   
	    
	}
	    
	    // Dress
	
	@Test
	private void dress() {
	    
	    clickonElement(pom.getD().getDress());
	    
	    //Viewed by list
	    
	    clickonElement(pom.getD().getList());
	    
	    //Printed dress
	    
	    clickonElement(pom.getD().getPdress());
	    
	    //Addtocart
	    
	    clickonElement(pom.getD().getAddcart());
	    
	    //contshopping
	    
	    clickonElement(pom.getD().getConshopping());
	    
	    System.out.println("Dress purchased successfully");
	    
	}
	    
	 // signout
	    
	    @AfterMethod
		private void Signout() {
			
	    clickonElement(pom.getS1().getSignout1());
	    
	    System.out.println("signout successfully");

	     
	    }

		 //Tshirts
	    
	    @Test(priority=-1)
	    
	    private void tshirts() {
		   
		  clickonElement(pom.getTs().getTshirts());
		   
		 //Viewed by list
		    
		  clickonElement(pom.getTs().getList());
		  
		 //shaded Tshirts
		  
		  clickonElement(pom.getTs().getFts());
		  
		  //Add to cart
		  
		 clickonElement(pom.getTs().getAddtocart());  
		
		//contshopping
		clickonElement(pom.getTs().getConshop());
		
		System.out.println("Tshirt purchased successfully");
		
	    }
		
	    @Test
	    private void women() throws IOException {

		//women
		clickonElement(pom.getW().getWomen());
		
		// Viewed by List
		clickonElement(pom.getW().getlist());
		
		//fadedshorts
		clickonElement(pom.getW().getFadedshorts());
	    
	    //addtocart
	    clickonElement(pom.getW().getAddtocart());
	    
	    //continueshopping
	    clickonElement(pom.getW().getContinueshopping());
	    
	    //Naviagte back
	     driver.navigate().back();
	     
	     
        //printed summerdress
         clickonElement(pom.getS().getSummerdress());
		
	    //quantity
	    pom.getS().getQuantity().clear();
	    
	    inputvalueelement(pom.getS().getQuantity(), particularData
	    		("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\March2022\\\\Test Cases\\\\automation project test case.xlsx", 30, 5));
	   
        //size
        dropdown("byvalue", pom.getS().getSize(), "3");
        		
       
	   //color
		clickonElement(pom.getS().getColor());
		
        //add to cart
		clickonElement(pom.getS().getAddtoart());
		
	    //continueshopping 
		clickonElement(pom.getS().getContinueshopping());
		
		//viewed my cart
		clickonElement(pom.getView().getViewmycart());
		
		
		//proceed to check

		clickonElement(pom.getP1().getPlcheck());
		
		//proceed to check
	    clickonElement(pom.getP2().getP2check());
	   
	    //terms of service
	   	 clickonElement(pom.getT().getTermsofservice());
			
		//proceed to check
         clickonElement(pom.getP3().getP3check());
		
	    //paybank
         clickonElement(pom.getPay().getPaybank());
	    
	    //confirm order
	     clickonElement(pom.getC().getConfirmorder());
	     
	     System.out.println("women purchased successfully");
	     
	     clickonElement(pom.getB().getBacktoorder());
		  
		  System.out.println("Back to order successfully");
		
	     
	     
	     
	    }
	    
	    
	   
	   
		//back to orders
	    
	 /*   
	    @AfterClass
	    
	      private void backorder() {
	    	
		
	    }
	    
	    */
	    
}

	
	
	


