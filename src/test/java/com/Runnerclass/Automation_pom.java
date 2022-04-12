package com.Runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.March.Baseclass.Base_Class;
import com.pom.BacktoOrder;
import com.pom.ConfirmOrder;
import com.pom.Login_Page;
import com.pom.PayBank;
import com.pom.Proceed_1;
import com.pom.Proceed_2;
import com.pom.Proceed_3;
import com.pom.Signout;
import com.pom.SummerDress;
import com.pom.Terms;
import com.pom.ViewMyCart;
import com.pom.Women;

public class Automation_pom  extends Base_Class {

public static WebDriver driver = browser_configuration("chrome");

public static Login_Page login= new Login_Page(driver);

public static Women  w = new Women(driver);

public static SummerDress  s = new SummerDress(driver);

public static ViewMyCart view = new ViewMyCart(driver);

public static Proceed_1 p1= new Proceed_1(driver);

public static Proceed_2 p2= new Proceed_2(driver);

public static Terms t = new Terms(driver);

public static Proceed_3 p3= new Proceed_3(driver);

public static PayBank pay = new PayBank(driver);

public static ConfirmOrder c = new ConfirmOrder(driver);

public static BacktoOrder b = new BacktoOrder(driver);

public static Signout s1 = new Signout(driver);

	public static void main(String[] args){
		
		
	   getUrl("http://automationpractice.com/index.php");
	   
	   clickonElement(login.getSign1());
		
  	   //Mailid
		inputvalueelement(login.getMailid(), "bensmith4201@gmail.com");
		
	   //password
		inputvalueelement(login.getPassword(), "mahi@12345");
		
		//Login
	    clickonElement(login.getlogin());
		
		//women
		clickonElement(w.getWomen());
		
		// Viewed by List
		clickonElement(w.getlist());
		
		//fadedshorts
		clickonElement(w.getFadedshorts());
	    
	    //addtocart
	    clickonElement(w.getAddtocart());
	    
	    //continueshopping
	    clickonElement(w.getContinueshopping());
	    
	    //Naviagte back
	     driver.navigate().back();
	    
        //printed summerdress
         clickonElement(s.getSummerdress());
		
	    //quantity
	    s.getQuantity().clear();
	    inputvalueelement(s.getQuantity(), "3");
	   
        //size
       dropdown("byvalue", s.getSize(), "3");
       
	   //color
		clickonElement(s.getColor());
		
        //add to cart
		clickonElement(s.getAddtoart());
		
	    //continueshopping 
		clickonElement(s.getContinueshopping());
		
		//viewed my cart
		clickonElement(view.getViewmycart());
		
		//proceed to check

		clickonElement(p1.getPlcheck());
		
		//proceed to check
	    clickonElement(p2.getP2check());
	   
	    //terms of service
	   	 clickonElement(t.getTermsofservice());
			
		//proceed to check
         clickonElement(p3.getP3check());
		
	    //paybank
         clickonElement(pay.getPaybank());
	    
	    //confirm order
	     clickonElement(c.getConfirmorder());
		
		//back to orders
		clickonElement(b.getBacktoorder());
		
		//signout
	    clickonElement(s1.getSignout());
		    
		    
		    
	}
	
}	
	        
