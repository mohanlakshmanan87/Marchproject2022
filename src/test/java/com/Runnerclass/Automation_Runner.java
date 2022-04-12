package com.Runnerclass;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.March.Baseclass.Base_Class;

public class Automation_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args){

	    driver = browser_configuration("chrome");
		
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
       //Emailid
		
		WebElement mailid = driver.findElement(By.id("email"));
		inputvalueelement(mailid,"bensmith4201@gmail.com");
		
	
	   //password
		
		WebElement password = driver.findElement(By.id("passwd"));
		inputvalueelement(password, "mahi@12345");
		
		//signin
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		clickonElement(login);
		
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
		WebElement conshop = driver.findElement(By.xpath("//*[@title='Continue shopping']"));
		clickonElement(conshop);
		
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
		WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickonElement(signout);
		    
		    
		    
	}
	
}	
	        


