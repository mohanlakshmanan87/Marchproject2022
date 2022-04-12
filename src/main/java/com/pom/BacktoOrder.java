package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BacktoOrder {

	
	public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backtoorder ;
	
	
	
	 public WebElement getBacktoorder() {
		return backtoorder;
	}



	public BacktoOrder(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}
	
	
	
	
	
	
	
	
	
	
}

