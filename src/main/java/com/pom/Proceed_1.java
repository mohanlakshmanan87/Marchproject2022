package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_1 {
	

	public  WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement p1check ;
	
	
	
	 public WebElement getPlcheck() {
		return p1check;
	}



	public Proceed_1(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}



	 
	
	
	
	
	
	
	
	

}
