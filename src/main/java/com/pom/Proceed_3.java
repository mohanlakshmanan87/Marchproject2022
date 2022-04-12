package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_3 {


	public  WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement p3check ;
	
	
	
	 public WebElement getP3check() {
		return p3check;
	}



	public Proceed_3(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}

}