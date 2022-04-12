package com.TestNgproject;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

import com.March.Baseclass.Base_Class;
import com.pom.BacktoOrder;
	import com.pom.ConfirmOrder;
    import com.pom.Dresses;
    import com.pom.Login_Page;
	import com.pom.PayBank;
	import com.pom.Proceed_1;
	import com.pom.Proceed_2;
	import com.pom.Proceed_3;
	import com.pom.Signout;
	import com.pom.SummerDress;
	import com.pom.Terms;
    import com.pom.Tshirts;
    import com.pom.ViewMyCart;
	import com.pom.Women;

	public class  TestNg_Pom_Runner  extends Base_Class {

	public static WebDriver driver = browser_configuration("chrome");

	public static Login_Page login= new Login_Page(driver);
	
	public static Dresses d = new Dresses(driver);
	
	public static Tshirts ts = new Tshirts(driver);

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
		    
		    //signin1
		    clickonElement(login.getSign1());
			
	  	   //Mailid
			inputvalueelement(login.getMailid1(), "bensmith4201@gmail.com");
			
		   //password
			inputvalueelement(login.getPassword1(), "mahi@12345");
			
			//login
		    clickonElement(login.getLogin1());
		    
		    // Dress
		    
		    clickonElement(d.getDress());
		    
		    //Viewed by list
		    
		    clickonElement(d.getList());
		    
		    //Printed dress
		    
		    clickonElement(d.getPdress());
		    
		    //Addtocart
		    
		    clickonElement(d.getAddcart());
		    
		    //contshopping
		    
		    clickonElement(d.getConshopping());
		    
		   // signout
		     clickonElement(s1.getSignout1());
		     
		     
		    //signin2
			 clickonElement(login.getSign2());
				
		  	 //Mailid
			 inputvalueelement(login.getMailid2(), "bensmith4201@gmail.com");
				
			  //password
			 inputvalueelement(login.getPassword2(), "mahi@12345");
			 
			 //login
			 
			   clickonElement(login.getLogin2());
			   
			 //Tshirts
			   
			  clickonElement(ts.getTshirts());
			   
			 //Viewed by list
			    
			  clickonElement(ts.getList());
			  
			//shaded Tshirts
			  
			 clickonElement(ts.getFts());
			  
			  //Add to cart
			  
			clickonElement(ts.getAddtocart());  
			
			//contshopping
			clickonElement(ts.getConshop());
			
			//signout
			
			clickonElement(s1.getSignout2());
			
			
			//sigin3
			  clickonElement(login.getSign3());
				
		  	 //Mailid
			  inputvalueelement(login.getMailid3(), "bensmith4201@gmail.com");
				
			  //password
			 inputvalueelement(login.getPassword3(), "mahi@12345");
				
			//login
			   clickonElement(login.getLogin3());
		    
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
