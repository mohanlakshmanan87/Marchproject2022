package com.TestNgproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.March.Baseclass.Base_Class;

public class Testng_selenium extends Base_Class {

public static WebDriver driver;
	
	public static void main(String[] args){

	    driver = browser_configuration("chrome");
		
		getUrl("http://automationpractice.com/index.php");
		
		
		// signin
		
		  WebElement signin1 = driver.findElement(By.xpath("//a[@class='login']"));
		  clickonElement(signin1);
		
       //Emailid
		
		 WebElement mailid1 = driver.findElement(By.id("email"));
		 inputvalueelement(mailid1,"bensmith4201@gmail.com");
		
	
	   //password
		
		 WebElement password1 = driver.findElement(By.id("passwd"));
		 inputvalueelement(password1, "mahi@12345");
		
		//login
		
		 WebElement login1 = driver.findElement(By.id("SubmitLogin"));
		 clickonElement(login1);
		
		
		//Dress 
		
		 WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		 clickonElement(dress);
		
		// Viewed by List
		
	     driver.findElement(By.id("list")).click();
	    
	    //Printed dress
	    
	     WebElement pdress = driver.findElement(By.xpath("//li[@id='list']//following::a[@title='Printed Dress'][2]"));
	      
	     clickonElement(pdress);
	      
	      
	     //add to cart
	      
	     WebElement addcart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
	     clickonElement(addcart);
	      
	     //continueshopping
		    
	      WebElement conshopping = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		 clickonElement(conshopping);
			
		 //signout
		 WebElement signout1 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		 clickonElement(signout1);
			
			
		// signin
			
		WebElement signin2 = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement(signin2);
			
	     //Emailid
			
	    WebElement mailid2 = driver.findElement(By.id("email"));
		inputvalueelement(mailid2,"bensmith4201@gmail.com");
			
		
		//password
			
		WebElement password2 = driver.findElement(By.id("passwd"));
		inputvalueelement(password2, "mahi@12345");
			
		//login
			
		WebElement login2 = driver.findElement(By.id("SubmitLogin"));
		clickonElement(login2);
			
			
		//Tshirts
			
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickonElement(tshirts);
		
		driver.findElement(By.id("list")).click();
		
		
		//fadedTshirts
		

		WebElement fts = driver.findElement(By.xpath("//li[@id='list']//following::a[@title='Faded Short Sleeve T-shirts'][2]"));
		clickonElement(fts);
		
	    //add to cart
	      
	     WebElement addcart1 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
	     clickonElement(addcart1);
		
		 //continueshopping
	    
	     WebElement conshop = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		 clickonElement(conshop);
		
		 //signout
		 WebElement signout2 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		 clickonElement(signout2);
			
			
		// signin
			
		WebElement signin3 = driver.findElement(By.xpath("//a[@class='login']"));
		clickonElement(signin3);
			
	     //Emailid
			
	    WebElement mailid3 = driver.findElement(By.id("email"));
		inputvalueelement(mailid3,"bensmith4201@gmail.com");
			
		
		//password
			
		WebElement password3 = driver.findElement(By.id("passwd"));
		inputvalueelement(password3, "mahi@12345");
			
		//login
			
		WebElement login3 = driver.findElement(By.id("SubmitLogin"));
		clickonElement(login3);
		
		
		//women
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		clickonElement(women);
		
		// Viewed by List
		
		driver.findElement(By.id("list")).click();
		
		//fadedshorts
		
        WebElement fadedshorts = driver.findElement(By.xpath("(//a[@title='Blouse'])[2]//preceding::a[@title='Faded Short Sleeve T-shirts'][1]"));
		clickonElement(fadedshorts);
	    
	    //addtocart
	    
        WebElement addtocart = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		clickonElement(addtocart);
	    
	    //continueshopping
	    
        WebElement continueshopping = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		clickonElement(continueshopping);
	    
	    //Naviagte back
	    driver.navigate().back();
	    
        //printed summerdress
        WebElement summerdress = driver.findElement(By.xpath("(//*[@title='Printed Dress'])[6]//following::a[@title='Printed Summer Dress'][4]"));
		clickonElement(summerdress);
		
	    //quantity
	    WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        quantity.clear();
		inputvalueelement(quantity, "3");
	   
        //size
        WebElement size = driver.findElement(By.id("group_1"));
		dropdown("byvalue", size, "3");
		
		//color
		driver.findElement(By.id("color_16")).click();
		
        //add to cart
		WebElement addtocart2 = driver.findElement(By.xpath("//*[text()='Add to cart']"));
		clickonElement(addtocart2);
		
	    //continueshopping 
		WebElement conshop2 = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		clickonElement(conshop2);
		
		//viewed my cart
		WebElement allcart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		clickonElement(allcart);
		
		//proceed to check
	    WebElement p1check = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickonElement(p1check);
		
		//proceed to check
	    WebElement p2check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonElement(p2check);
	    
	    //terms of service
	    WebElement termsofservice = driver.findElement(By.id("cgv"));
	    clickonElement(termsofservice);
			
		//proceed to check
        WebElement p3check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    clickonElement(p3check);
		
	    //paybank
        WebElement paybybank = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		clickonElement(paybybank);
	    
	    //confirm order
	    WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickonElement(confirmorder);
		
		//back to orders
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		//signout
		WebElement signout3 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickonElement(signout3);
		
		
		
		
		
		
		
		
		
		    
		    
		    
	}
	
}	
	        



