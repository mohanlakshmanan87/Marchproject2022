package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBank {
	
	public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement paybank ;
	
	
	public WebElement getPaybank() {
		return paybank;
	}
	

 public PayBank(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}
	
	
}
