package com.TestNgproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.March.Baseclass.Base_Class;
import com.Runnerclass.Automation_PageManager;
import com.pagemanager.Page_object_Manager;

public class Testng_Runner_Manager extends Base_Class {
	
	
public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_object_Manager pom = new Page_object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_PageManager.class);
	
	public static void main(String[] args) throws IOException{
		
		PropertyConfigurator.configure("log4j.properties");

	    getUrl("http://automationpractice.com/index.php");
		
	    log.info("Url Launch");
	    
	    String username = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\automation project test case.xlsx", 23, 5);
	    
	    String passwd = particularData("C:\\Users\\Admin\\eclipse-workspace\\March2022\\Test Cases\\automation project test case.xlsx", 24, 5);
	    
	    //signin
	    
	    clickonElement(pom.getLogin().getSign1());
	    
  	   //Mailid
		inputvalueelement(pom.getLogin().getMailid1(), username);
		
		
	   //password
		inputvalueelement(pom.getLogin().getPassword1(), passwd);
		
		//signin
	    clickonElement(pom.getLogin().getlogin());
	    
	    log.info("Credentials Entered in Field");
	    
	    // Dress
	    
	    clickonElement(pom.getD().getDress());
	    
	    //Viewed by list
	    
	    clickonElement(pom.getD().getList());
	    
	    //Printed dress
	    
	    clickonElement(pom.getD().getPdress());
	    
	    //Addtocart
	    
	    clickonElement(pom.getD().getAddcart());
	    
	    //contshopping
	    
	    clickonElement(pom.getD().getConshopping());
	    
	   // signout
	     clickonElement(pom.getS1().getSignout1());
	     
	     log.info("signout sucessfully");
	    
	     
	     
	    //signin2
		 clickonElement(pom.getLogin().getSign2());
			
	  	 //Mailid
		 inputvalueelement(pom.getLogin().getMailid2(), username);
			
		 //password
		 inputvalueelement(pom.getLogin().getPassword2(), passwd);
		 
		 //login
		 
		  clickonElement(pom.getLogin().getLogin2());
		   
		  log.info("Credentials Entered in Field");
		   
		 //Tshirts
		   
		  clickonElement(pom.getTs().getTshirts());
		   
		 //Viewed by list
		    
		  clickonElement(pom.getTs().getList());
		  
		 //shaded Tshirts
		  
		  clickonElement(pom.getTs().getFts());
		  
		  //Add to cart
		  
		 clickonElement(pom.getTs().getAddtocart());  
		
		//contshopping
		clickonElement(pom.getTs().getConshop());
		
		//signout
		
		clickonElement(pom.getS1().getSignout2());
		
		  log.info("signout sucessfully");
		
		
		//sigin3
		  clickonElement(pom.getLogin().getSign3());
			
	  	 //Mailid
		  
		  inputvalueelement(pom.getLogin().getMailid3(), username);
		
		  //password
		  inputvalueelement(pom.getLogin().getPassword3(), passwd);
			
		//login
		  clickonElement(pom.getLogin().getLogin3());   
		   
		  log.info("Credentials Entered in Field");

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
	     
	     log.info("Navigate sucessfully");
	    
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
		
		
	     log.info("show my all cart sucessfully");
		
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
	     
	     log.info("order confirmed");
		
		//back to orders
		clickonElement(pom.getB().getBacktoorder());
		
		//signout
	    clickonElement(pom.getS1().getSignout());
	    
	     log.info("signout sucessfully");
		    
		    
		    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
