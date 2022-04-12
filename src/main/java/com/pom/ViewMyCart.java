package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewMyCart {


	public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement viewmycart;
	
	
	
	 public WebElement getViewmycart() {
		return viewmycart;
	}



	public ViewMyCart(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}



	 
	
	
	
	
	
	
	
}
