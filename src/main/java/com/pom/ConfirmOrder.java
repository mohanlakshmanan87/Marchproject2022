package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder {
	
	public  WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmorder ;
	
	
	
	 public WebElement getConfirmorder() {
		return confirmorder;
	}



	public ConfirmOrder(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	
	
	
	

}
