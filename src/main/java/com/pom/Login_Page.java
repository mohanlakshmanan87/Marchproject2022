package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public  WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign1;
	
	@FindBy(id="email")
	private WebElement mailid;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement login;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign2;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getSign1() {
		return sign1;
	}


	public WebElement getSign2() {
		return sign2;
	}


	public WebElement getMailid1() {
		return mailid1;
	}


	public WebElement getPassword1() {
		return password1;
	}


	public WebElement getLogin1() {
		return login1;
	}


	public WebElement getSign3() {
		return sign3;
	}


	public WebElement getMailid2() {
		return mailid2;
	}


	public WebElement getPassword2() {
		return password2;
	}


	public WebElement getLogin2() {
		return login2;
	}


	public WebElement getMailid3() {
		return mailid3;
	}


	public WebElement getPassword3() {
		return password3;
	}


	public WebElement getLogin3() {
		return login3;
	}


	@FindBy(id="email")
	private WebElement mailid1;
	
	@FindBy(id="passwd")
	private WebElement password1;
	
	@FindBy(id="SubmitLogin")
	private WebElement login1;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign3;
	
	@FindBy(id="email")
	private WebElement mailid2;
	
	@FindBy(id="passwd")
	private WebElement password2;
	
	@FindBy(id="SubmitLogin")
	private WebElement login2;
	
	@FindBy(id="email")
	private WebElement mailid3;
	
	@FindBy(id="passwd")
	private WebElement password3;
	
	@FindBy(id="SubmitLogin")
	private WebElement login3;

	public Login_Page(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		
	}
	
	
   public WebElement getMailid() {
	return mailid;
}


   public WebElement getPassword() {
	return password;
}


   public WebElement getlogin() {
	   
	     return login;
	
}
	
	
	

}
