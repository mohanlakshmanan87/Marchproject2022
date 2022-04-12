package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {


	public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout ;
	

	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout1 ;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout2 ;
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement signout3 ;
	
	public WebElement getSignout1() {
		return signout1;
	}



	public WebElement getSignout2() {
		return signout2;
	}



	public WebElement getSignout3() {
		return signout3;
	}



	
	 public WebElement getSignout() {
		return signout;
	}



	public Signout(WebDriver driver2) {

			this.driver= driver2;
			
			PageFactory.initElements(driver, this);

	}
	
	
	
	
	
}
