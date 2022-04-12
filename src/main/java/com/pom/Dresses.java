package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	

	public  WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(id="list")
	private WebElement list;
	
	@FindBy(xpath="//li[@id='list']//following::a[@title='Printed Dress'][2]")
	private WebElement pdress;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addcart;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	private WebElement conshopping;



public Dresses(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		
	}



public WebElement getDress() {
	return dress;
}



public WebElement getList() {
	return list;
}



public WebElement getPdress() {
	return pdress;
}



public WebElement getAddcart() {
	return addcart;
}



public WebElement getConshopping() {
	return conshopping;
}

}
