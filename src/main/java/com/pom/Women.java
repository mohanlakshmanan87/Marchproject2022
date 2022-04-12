package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	

	public  WebDriver driver;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(id="list")
	private WebElement list;
	
	@FindBy(xpath="(//a[@title='Blouse'])[2]//preceding::a[@title='Faded Short Sleeve T-shirts'][1]")
	private WebElement fadedshorts;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	private WebElement continueshopping;

	public Women(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		
	}


	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getlist() {
		return list;
	}
	

	public WebElement getFadedshorts() {
		return fadedshorts;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	public WebElement getContinueshopping() {
		return continueshopping;
	}
	
	
	
	
	
	
	
	
	

}
