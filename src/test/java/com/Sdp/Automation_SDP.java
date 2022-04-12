package com.Sdp;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.March.Baseclass.Base_Class;
import com.Runnerclass.Automation_PageManager;
import com.configuration.helper.File_Read_Manager;
import com.pagemanager.Page_object_Manager;

public class Automation_SDP extends Base_Class {
	
public static WebDriver driver = browser_configuration("chrome");
	
	public static Page_object_Manager pom = new Page_object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Automation_PageManager.class);
	
	public static void main(String[] args) throws Throwable{
		
		PropertyConfigurator.configure("log4j.properties");

	
		String url = File_Read_Manager.get_Instance_FRM().get_Instance_CR().get_config_url();
		
		getUrl(url);
		
		log.info("Url Launch");
	    

	     String username = File_Read_Manager.get_Instance_FRM().get_Instance_CR().getusername();
	    
	     String passwd = File_Read_Manager.get_Instance_FRM().get_Instance_CR().getpassword();
	    
	    
  	   //Mailid
		inputvalueelement(pom.getLogin().getMailid(), username);
		
	   //password
		inputvalueelement(pom.getLogin().getPassword(), passwd);
		
		//signin
	    clickonElement(pom.getLogin().getlogin());
	    
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
	    
	    inputvalueelement(pom.getS().getQuantity(),"3");
	   
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


