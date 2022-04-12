package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms {
	

	public  WebDriver driver;
	
	@FindBy(id="cgv")
	private WebElement termsofservice ;
	
	
	
	 public WebElement getTermsofservice() {
		return termsofservice;
	}



	public Terms(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	
	
	

}
