package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_2 {
	
	
	public  WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement p2check ;
	
	
	
	 public WebElement getP2check() {
		return p2check;
	}



	public Proceed_2(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}



	
	
	
	
	
	
	
	
	

}
