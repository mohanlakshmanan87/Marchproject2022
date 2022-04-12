package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirts {
	

	public  WebDriver driver;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirts;
	
	@FindBy(id="list")
	private WebElement list;
	
	@FindBy(xpath="//li[@id='list']//following::a[@title='Faded Short Sleeve T-shirts'][2]")
	private WebElement fts;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	private WebElement conshop;
	

public Tshirts(WebDriver driver2) {
	
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		
	}


public WebElement getTshirts() {
	return tshirts;
}


public void setTshirts(WebElement tshirts) {
	this.tshirts = tshirts;
}


public WebElement getList() {
	return list;
}


public void setList(WebElement list) {
	this.list = list;
}


public WebElement getFts() {
	return fts;
}


public void setFts(WebElement fts) {
	this.fts = fts;
}


public WebElement getAddtocart() {
	return addtocart;
}


public void setAddtocart(WebElement addtocart) {
	this.addtocart = addtocart;
}


public WebElement getConshop() {
	return conshop;
}


public void setConshop(WebElement conshop) {
	this.conshop = conshop;
}


public WebDriver getDriver() {
	return driver;
}


	
	
	

}
